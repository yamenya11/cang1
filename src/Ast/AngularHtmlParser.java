package Ast;

import SymbolTable.SymbolTable;
import org.antlr.v4.runtime.*;
import antlr.gen.*; // تأكد من وجود ملفات ANTLR الخاصة بك

public class AngularHtmlParser {
    public Node parseHtmlTemplate(String htmlContent) {
        try {
            CharStream inputStream = CharStreams.fromString(htmlContent);
            AngularLexer lexer = new AngularLexer(inputStream);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            AngularParser parser = new AngularParser(tokens);
            SymbolTable symbolTable = new SymbolTable();
            // تحليل محتوى HTML باستخدام القواعد
            return (Node) new AngularASTBuilder(symbolTable).visit(parser.htmlContent());
        } catch (Exception e) {
            System.err.println("Error parsing HTML content: " + e.getMessage());
            return null;
        }
    }
}
