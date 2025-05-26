package seminticerror;

import org.antlr.v4.runtime.Token;

import org.antlr.v4.runtime.Token;
import java.util.ArrayList;
import java.util.List;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class ErrorHandler {
    private final List<String> semanticErrors = new ArrayList<>();

    public void reportSemanticError(String message, Token token) {
        String error = "Semantic Error at line " + token.getLine() + ", column " + token.getCharPositionInLine() + ": " + message;
        semanticErrors.add(error);
        System.err.println(error);
    }

    public List<String> getSemanticErrors() {
        return semanticErrors;
    }

    public boolean hasErrors() {
        return !semanticErrors.isEmpty();
    }

    public void writeErrorsToFile(String filePath) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            for (String error : semanticErrors) {
                writer.write(error);
                writer.newLine();
            }
        } catch (IOException e) {
            System.err.println("Failed to write semantic errors to file: " + e.getMessage());
        }
    }
}
