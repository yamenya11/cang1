package Ast;

import Ast.application.*;
import Ast.calls.*;
import Ast.components.ComponentNode;
import Ast.declarations.ClassDeclarationNode;

import Ast.expressions.ExpressionNode;
import Ast.html.*;
import Ast.metadata.*;
import Ast.metadata.TemplateUrlNode;
import Ast.methods.ConstructorNode;
import Ast.methods.ParameterNode;
import Ast.property.EmptyArrayNode;
import Ast.property.RegularPropertyNode;
import SymbolTable.*;
import antlr.gen.AngularParser;
import Ast.statements.*;
import antlr.gen.*;
import seminticerror.ClassSymbolTable;
import seminticerror.ErrorHandler;

import java.util.*;
//import org.antlr.runtime.tree.ParseTree;

public class AngularASTBuilder extends AngularParserBaseVisitor<Node> {
    private final SymbolTable symbolTable;
    public AngularASTBuilder(SymbolTable symbolTable, ClassSymbolTable classSymbolTable, ErrorHandler errorHandler) {
        this.symbolTable = symbolTable;
        this.classSymbolTable = classSymbolTable;
        this.errorHandler = errorHandler;
    }
    private final ClassSymbolTable classSymbolTable ;
    private final ErrorHandler errorHandler;
    /*@Override
    public Node visitApplication(AngularParser.ApplicationContext ctx) {
        List<Node> applicationNodes = new ArrayList<>();
        for (var importCtx : ctx.importStatement()) {
            applicationNodes.add(visit(importCtx));
        }

        for (var componentCtx : ctx.component()) {
            applicationNodes.add(visit(componentCtx));
        }

        for (var classDeclCtx : ctx.classDeclaration()) {
            applicationNodes.add(visit(classDeclCtx));
        }

        for (var injectableCtx : ctx.injectable()) {
            applicationNodes.add(visit(injectableCtx));
        }

        for (var statementCtx : ctx.statement()) {
            applicationNodes.add(visit(statementCtx));
        }


        return new ApplicationNode(applicationNodes);
    }*/

    @Override
    public Node visitProgram(AngularParser.ProgramContext ctx) {
        List<Node> applicationNodes = new ArrayList<>();
      for (var app:ctx.application()){
          applicationNodes.add(visit(app));
      }
        return new ApplicationNode(applicationNodes);

    }

    @Override
    public Node visitIMPORTLABEL(AngularParser.IMPORTLABELContext ctx) {
        List<String> importedList = new ArrayList<>();
        for (var key : ctx.importStatement().keyimport()) {
            importedList.add(key.getText().trim());
        }
        String imported = String.join(", ", importedList);

        String rawSource = ctx.importStatement().STRING().getText();
        String source = rawSource.substring(1, rawSource.length() - 1);

        String scope = symbolTable.getCurrentScope();
        symbolTable.addSymbol(new SymbolEntry(imported, SymbolType.IMPORT, source, scope));
List<KeyImportNode>app=new ArrayList<>();
      for (var v :ctx.importStatement().keyimport()){
       app.add((KeyImportNode) visit(v));
     }
        ImportStatementNode importStatementNode = new ImportStatementNode(imported, source, imported,app);
        return importStatementNode;
    }

    @Override
    public Node visitCOMPONENTLABEL(AngularParser.COMPONENTLABELContext ctx) {
        String componentName = ctx.component().getText().toString();

        List<MetadataEntryNode> meta = new ArrayList<>();

        if (ctx.component().metadata() != null && !ctx.component().metadata().isEmpty()) {
            for (var entryCtx : ctx.component().metadata().metadataEntry()) {
                MetadataEntryNode entryNode = (MetadataEntryNode) visit(entryCtx); // visit each metadata entry
                meta.add(entryNode);
            }
        }
        return new ComponentNode(componentName, meta);
    }



    @Override
    public Node visitCLASSLABEL(AngularParser.CLASSLABELContext ctx) {
        String className = ctx.classDeclaration().IDENTIFIER().getText();
        ClassBodyNode classBodyNode = new ClassBodyNode();
        for (var child : ctx.children) {
            Node element = child.accept(this);
            if (element != null) {
                classBodyNode.addClassElement(element);
            }
        }
        if (classSymbolTable.symbolExists(className)) {
            errorHandler.reportSemanticError("Duplicate class definition: " + className, ctx.start);
            return null;
        }

        classSymbolTable.addSymbol(new SymbolEntry(className, SymbolType.CLASS, null, symbolTable.getCurrentScope()));
        return classBodyNode;
    }

    @Override
    public Node visitINJECTABLELABEL(AngularParser.INJECTABLELABELContext ctx) {
        String injectableName = ctx.injectable().getText();
        symbolTable.addSymbol(new SymbolEntry(injectableName, SymbolType.INJECTABLE, null, symbolTable.getCurrentScope()));
        return new InjectableLabelNode(injectableName) ;       }

//  @Override
//    public Node visitImportStatement(AngularParser.ImportStatementContext ctx) {
//        String imported = ctx.IDENTIFIER().getText();
//        String source = ctx.STRING().getText();
//        String key=ctx.keyimport().get(0).getText();
//        String scope = symbolTable.getCurrentScope();
//        symbolTable.addSymbol(new SymbolEntry(imported, SymbolType.IMPORT, key,scope));
//        ImportStatementNode importStatementNode = new ImportStatementNode(imported, source,key);
//        return importStatementNode;
//    }


    @Override
    public Node visitComponent(AngularParser.ComponentContext ctx) {
        String componentName = ctx.COMPONENT().getText();

        AngularParser.MetadataContext mctx = ctx.metadata();

        List<MetadataEntryNode> metadataEntries = new ArrayList<>();
        for (var entCtx : ctx.metadata().metadataEntry()) {
            metadataEntries.add((MetadataEntryNode) visit(entCtx));
        }
        symbolTable.addSymbol(new SymbolEntry(componentName, SymbolType.COMPONENT, null, symbolTable.getCurrentScope()));
        return new ComponentNode(componentName, metadataEntries);    }

    @Override
    public Node visitMetadata(AngularParser.MetadataContext ctx) {
        List<MetadataEntryNode> entry = new ArrayList<>();
        for (var ent : ctx.metadataEntry()) {
            entry.add((MetadataEntryNode) visit(ent));
        }
        return new MetadataNode(entry);
        }

    @Override
    public Node visitBasicMetadata(AngularParser.BasicMetadataContext ctx) {
        String key = ctx.IDENTIFIER().getText();
        String value = ctx.STRING().getText().replaceAll("^\"|\"$", "");
        String scope = symbolTable.getCurrentScope();
        symbolTable.addSymbol(new SymbolEntry(key, SymbolType.METADATA, value, scope));

        return new BasicMetadataNode(key, value);
    }



    @Override
    public Node visitHtmlMetadata(AngularParser.HtmlMetadataContext ctx) {
        String key = ctx.IDENTIFIER().getText();
        List<HtmlElementNode> htmlChildren = new ArrayList<>();
        for (var htmlElemCtx : ctx.htmlElement()) {
            htmlChildren.add((HtmlElementNode) visit(htmlElemCtx));
        }
        String scope = symbolTable.getCurrentScope();
        symbolTable.addSymbol(new SymbolEntry(key, SymbolType.METADATA, "", scope));

        return new HtmlMetadataNode(key, htmlChildren);
    }




    @Override
    public Node visitClassDeclaration(AngularParser.ClassDeclarationContext ctx) {
        String className = ctx.IDENTIFIER().getText();

        String superClass = null;
        if (ctx.classInheritance() != null) {
            if (ctx.classInheritance().IDENTIFIER() != null && !ctx.classInheritance().IDENTIFIER().isEmpty()) {
                superClass = ctx.classInheritance().IDENTIFIER(0).getText();
            }
        }

        List<Node> classBodyElements = new ArrayList<>();
        if (ctx.classBody() != null) {
            for (var memberCtx : ctx.classBody().children) {
                Node node = (Node) visit(memberCtx);
                if (node != null) {
                    classBodyElements.add(node);
                }
            }
        }
        String currentScope = symbolTable.getCurrentScope();
        symbolTable.addSymbol(new SymbolEntry(className, SymbolType.CLASS, null, currentScope));

        return new ClassDeclarationNode(className, superClass, classBodyElements);
    }

    @Override
    public Node visitSelector(AngularParser.SelectorContext ctx) {
        String key = ctx.SELECTOR().getText();
        String value = ctx.STRING().getText().replaceAll("^\"|\"$", "");
        String scope = symbolTable.getCurrentScope();
        symbolTable.addSymbol(new SymbolEntry(key, SymbolType.METADATA, value, scope));
        return new SelectorNode(key, value);
    }

    @Override
    public Node visitTemplateurl(AngularParser.TemplateurlContext ctx) {
        String key = ctx.TEMPLATEURL().getText();
        String value = ctx.STRING().getText().replaceAll("^\"|\"$", "");
        String scope = symbolTable.getCurrentScope();
        symbolTable.addSymbol(new SymbolEntry(key, SymbolType.METADATA, value, scope));
        return new TemplateUrlNode(key, value);
    }

// @Override
//    public Node visitClassBodyLabel(AngularParser.ClassBodyLabelContext ctx) {
//        List<Node> classElements = new ArrayList<>();
//        ClassBodyNode clss = new ClassBodyNode();
//        for (var property : ctx.propertyDeclaration()) {
//            classElements.add(visit(property));
//        }
//        for (var method : ctx.methodDeclaration()) {
//            classElements.add(visit(method));
//        }
//        for (var constructor : ctx.constructor()) {
//            classElements.add(visit(constructor));
//        }
//        for (var statement : ctx.statement()) {
//            classElements.add(visit(statement));
//        }
//        for (var decorator : ctx.decorator()) {
//            classElements.add(visit(decorator));
//        }
//        for (var ngOnInit : ctx.ngOnInit()) {
//            classElements.add(visit(ngOnInit));
//        }
//        for (var selectProduct : ctx.selectProduct()) {
//            classElements.add(visit(selectProduct));
//        }
//        for (var onbutton : ctx.onbutton()) {
//            classElements.add(visit(onbutton));
//        }
//
//
//        for (var product : ctx.products()) {
//            classElements.add(visit(product));
//        }
//        for (var lambda : ctx.lambdaExpression()) {
//            classElements.add(visit(lambda));
//        }
//        clss.setClassElements(classElements);
//        return clss;
//    }



    @Override
    public Node visitProducts(AngularParser.ProductsContext ctx) {
        String id=ctx.IDENTIFIER().getText();
        ElementListNode elements = (ElementListNode) visit(ctx.elementList());
        symbolTable.addSymbol(new SymbolEntry(id, SymbolType.FUNCTION, null, symbolTable.getCurrentScope()));

        return new  ProductsNode(id,elements);    }

    @Override
    public Node visitInjectable(AngularParser.InjectableContext ctx) {
        return super.visitInjectable(ctx);
    }

    @Override
    public Node visitElementList(AngularParser.ElementListContext ctx) {
        List<ElementNode> elements = new ArrayList<>();

        for (AngularParser.ElementContext elementCtx : ctx.element()) {
            elements.add((ElementNode) visit(elementCtx));
        }
        return new ElementListNode(elements);    }


    @Override
    public Node visitElement(AngularParser.ElementContext ctx) {
        List<PairNode> pairs = new ArrayList<>();

        for (AngularParser.PairContext pairCtx : ctx.pair()) {
            pairs.add((PairNode) visit(pairCtx));
        }

        return new ElementNode(pairs);    }


    @Override
    public Node visitPair(AngularParser.PairContext ctx) {
        String key=ctx.basevalue().getText();
        String value=ctx.value().getText();
        symbolTable.addSymbol(new SymbolEntry(key, SymbolType.PARAMETER, value, symbolTable.getCurrentScope()));

        return new PairNode(key,value);

    }



    @Override
    public Node visitConstructor(AngularParser.ConstructorContext ctx) {
        String constructorName = ctx.CONSTRUCTOR().getText();

        List<Node> parameters = new ArrayList<>();
        if (ctx.parameter() != null) {
            for (var parameterCtx : ctx.parameter()) {
                // Parse each parameter
                String modifier = parameterCtx.modifiers().getText(); // مثال: private
                String name = parameterCtx.IDENTIFIER().getText();
                String type = parameterCtx.value().getText();
                parameters.add(new ParameterNode(name, type, modifier));
            }
        }

        List<Node> statements = new ArrayList<>();
        if (ctx.statement() != null) {
            for (var statementCtx : ctx.statement()) {
                statements.add(new StatementNode(new Node() {
                    @Override
                    public String toString() {
                        return statementCtx.getText();
                    }

                    @Override
                    public void accept(Node visitor) {
                        visitor.accept(this);
                    }
                }));
            }
        }

        symbolTable.addSymbol(new SymbolEntry(
                constructorName,
                SymbolType.CONSTRUCTOR,
                "CONSTRUCTER",
                symbolTable.getCurrentScope()
        ));

        return new ConstructorNode(constructorName, parameters, statements);   }


    @Override
    public Node visitParameter(AngularParser.ParameterContext ctx) {
        String modifier = null;
        if (ctx.modifiers() != null) {
            modifier = ctx.modifiers().getText();
        }
        String name = ctx.IDENTIFIER().getText();
        String type = ctx.value().getText();
        ParameterNode parameterNode = new ParameterNode(name, type, modifier);
        return parameterNode;     }




    @Override
    public Node visitSELECTPRODUCTLABEL(AngularParser.SELECTPRODUCTLABELContext ctx) {
        String name=ctx.SELECTPRODUCT().getText();
        List<ParameterNode> parameters = new ArrayList<>();
        for (var paramCtx : ctx.parameter()) {
            ParameterNode paramNode = (ParameterNode) visit(paramCtx);
            parameters.add(paramNode);
        }

        boolean isVoid = ctx.VOID() != null;

        List<StatementNode> statements = new ArrayList<>();
        if (ctx.statement() != null) {
            for (var statement : ctx.statement()) {
                StatementNode stm =(StatementNode) visit(statement) ;
                statements.add( stm);
            }
        }
        symbolTable.addSymbol(new SymbolEntry(name, SymbolType.FUNCTION, null, symbolTable.getCurrentScope()));

        SelectedProductNode node = new SelectedProductNode(name, parameters, statements);
        node.setVoid(isVoid);

        return node;    }



    @Override
    public Node visitPROPIRTYLABEL(AngularParser.PROPIRTYLABELContext ctx) {
        List<Node> applicationNodes = new ArrayList<>();

        for (var child : ctx.children) {
            Node node = visit(child);
            if (node != null) {
                applicationNodes.add(node);
            }
        }


        return new ApplicationNode(applicationNodes);
    }

    @Override
    public Node visitRegularProperty(AngularParser.RegularPropertyContext ctx) {
        String name = ctx.IDENTIFIER().getText();
        String type = ctx.value().getText();

        ExpressionNode initializer = ctx.expression() != null ? (ExpressionNode) visit(ctx.expression()) : null;

        return new RegularPropertyNode(name, type, initializer);    }

    @Override
    public Node visitLetDeclaration(AngularParser.LetDeclarationContext ctx) {
        String name = ctx.IDENTIFIER().getText();
        String type = ctx.value(0).getText();
        String value = ctx.value(1).getText();

        return new LetVariableDeclarationNode(name, type, value);    }

    @Override
    public Node visitEmptyArrayDeclaration(AngularParser.EmptyArrayDeclarationContext ctx) {
        String name = ctx.IDENTIFIER().getText();
        String type = ctx.value().getText();

        return new EmptyArrayNode(name, type);    }


    @Override
    public Node visitHtmlElement(AngularParser.HtmlElementContext ctx) {
        String tagName = ctx.opentag().IDENTIFIER().getText();
        HtmlElementNode elementNode = new HtmlElementNode(tagName, null); // value=null مؤقتًا
        if (ctx.opentag().IDENTIFIER() != null) {
            for (AngularParser.HtmlAttributeContext attrCtx : ctx.htmlAttribute()) {
                HtmlAttributeNode attr = (HtmlAttributeNode) visit(attrCtx);
                elementNode.addAttribute(attr);

                String attrName = attr.getName();
                String attrValue = attr.getValue();

                if ("*ngIf".equals(attrName)) {
                    elementNode.setNgIfExpression(attrValue);
                } else if ("*ngFor".equals(attrName)) {
                    elementNode.setNgForExpression(attrValue);
                } else if (attrName.startsWith("(") && attrName.endsWith(")")) {
                    String eventName = attrName.substring(1, attrName.length() - 1);
                    elementNode.addEventBinding(eventName, attrValue);
                }
            }
        }

        if (ctx.htmlContent() != null) {
            for (AngularParser.HtmlContentContext contentCtx : ctx.htmlContent()) {
                Node child = visit(contentCtx);
                if (child != null) {
                    elementNode.addChild(child);
                }
            }
        }

        return elementNode;
    }




    @Override
    public Node visitAngularButton(AngularParser.AngularButtonContext ctx) {
        return super.visitAngularButton(ctx);
    }

    @Override
    public Node visitSelfClosingElement(AngularParser.SelfClosingElementContext ctx) {
        return super.visitSelfClosingElement(ctx);
    }

    @Override
    public Node visitOpentag(AngularParser.OpentagContext ctx) {
        return super.visitOpentag(ctx);
    }

    public Node visitHtmlAttribute(AngularParser.HtmlAttributeContext ctx) {
        String name = null;
        String value = null;

        if (ctx.IDENTIFIER() != null && ctx.STRING() != null) {
            name = ctx.IDENTIFIER().getText();
            value = ctx.STRING().getText().replaceAll("\"", "");
        }

        else if (ctx.IDENTIFIER() != null) {
            name = ctx.IDENTIFIER().getText();
            value = "";
        }

        else if (ctx.ngIf() != null) {
            name = "*ngIf";
            value = ctx.ngIf().getText();
        }

        else if (ctx.ngfor() != null) {
            name = "*ngFor";
            value = ctx.ngfor().getText();
        }

        else if (ctx.eventBinding() != null) {
            name = ctx.eventBinding().IDENTIFIER().getText();
            value = ctx.eventBinding().IDENTIFIER().getText().replaceAll("\"", ""); // التعبير الخاص بـ event
        }

        else if (ctx.angularButton() != null) {
            name = "angularButton";
            value = ctx.angularButton().getText();
        }

        if (name == null || value == null) {
            throw new RuntimeException("Invalid htmlAttribute context");
        }

        return new HtmlAttributeNode(name, value);
    }


    @Override
    public Node visitClosetag(AngularParser.ClosetagContext ctx) {
        return super.visitClosetag(ctx);
    }

    @Override
    public Node visitNgIf(AngularParser.NgIfContext ctx) {
        return super.visitNgIf(ctx);
    }

    @Override
    public Node visitNgfor(AngularParser.NgforContext ctx) {
        return super.visitNgfor(ctx);
    }

    @Override
    public Node visitHtmlContent(AngularParser.HtmlContentContext ctx) {
        return super.visitHtmlContent(ctx);
    }
}
