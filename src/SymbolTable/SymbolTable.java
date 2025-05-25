package SymbolTable;

import java.util.*;

public class SymbolTable {
    private Map<String, SymbolEntry> symbols = new HashMap<>();
    private String currentScope = "global";

    public void addSymbol(SymbolEntry entry) {
        symbols.put(entry.getName(), entry);
    }

    public SymbolEntry getSymbol(String name) {
        return symbols.get(name);
    }

    public String getCurrentScope() {
        return currentScope;
    }

    public void setCurrentScope(String scope) {
        this.currentScope = scope;
    }

    public Collection<SymbolEntry> getAllSymbols() {
        return symbols.values();
    }

    public void printSymbols() {
        System.out.println("Symbol Table:");
        for (SymbolEntry entry : symbols.values()) {
            System.out.println(entry);
        }
    }
}