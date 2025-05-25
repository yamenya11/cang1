import Ast.AngularASTBuilder;
import Ast.Node;
import SymbolTable.SymbolTable;
import antlr.gen.AngularLexer;
import antlr.gen.AngularParser;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

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

            AngularASTBuilder builder = new AngularASTBuilder(symbolTable);
            Node ast = builder.visit(parser.program());

            System.out.println("AST Constructed Successfully:");
            System.out.println(ast);



           System.out.println("\nSymbol Table:");
           symbolTable.printSymbols();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }    }



