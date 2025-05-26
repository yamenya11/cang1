import Ast.AngularASTBuilder;
import Ast.Node;
import SymbolTable.SymbolTable;
import antlr.gen.AngularLexer;
import antlr.gen.AngularParser;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import seminticerror.ClassSymbolTable;
import seminticerror.ErrorHandler;

import java.io.IOException;




/**
 *
 */
public class Main {
    private Main() {
    }

    public static void main(String[] args) {


    // String filePath = "C:\\Users\\Yamen\\IdeaProjects\\Finalangular\\src\\app\\product\\product.component.ts";
   // String filePath =  "C:\\Users\\Yamen\\IdeaProjects\\Finalangular\\src\\app\\product\\product.service.ts";
        // String filePath =  "C:\\Users\\Yamen\\IdeaProjects\\Finalangular\\src\\antlr\\sample.angular";
String filePath="C:\\Users\\Yamen\\IdeaProjects\\Finalangular\\src\\app\\product\\test11.txt";
  // String filePath="C:\\Users\\Yamen\\IdeaProjects\\Finalangular\\src\\app\\product\\test33.txt";
      //String filePath="C:\\Users\\Yamen\\IdeaProjects\\Finalangular\\src\\antlr\\test.angular";
      //  String filePath =  "C:\\Users\\Yamen\\IdeaProjects\\Finalangular\\src\\antlr\\test.angular";

    // String filePath="C:\\Users\\Yamen\\IdeaProjects\\Finalangular\\src\\antlr\\product-display.component.txt";
        try {
            CharStream source = CharStreams.fromFileName(filePath);
            AngularLexer lexer = new AngularLexer(source);
            AngularParser parser = new AngularParser(new CommonTokenStream(lexer));
            SymbolTable symbolTable = new SymbolTable();
            ClassSymbolTable classSymbolTable = new ClassSymbolTable();
            ErrorHandler errorHandler = new ErrorHandler();
            AngularASTBuilder builder = new AngularASTBuilder(symbolTable, classSymbolTable, errorHandler);            Node ast = builder.visit(parser.program());

            System.out.println("AST Constructed Successfully:");
            System.out.println(ast);



           System.out.println("\nSymbol Table:");
           symbolTable.printSymbols();

            if (errorHandler.hasErrors()) {
                errorHandler.writeErrorsToFile("C:\\Users\\Yamen\\IdeaProjects\\Finalangular\\src\\app\\product\\semantic_errors.txt");
                System.out.println("Semantic errors saved to semantic_errors.txt");
            } else {
                System.out.println("No semantic errors found.");
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }    }



