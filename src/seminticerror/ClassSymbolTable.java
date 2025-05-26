package seminticerror;

import SymbolTable.SymbolEntry;

import java.util.HashMap;
import java.util.Map;

public class ClassSymbolTable {
    private Map<String, SymbolEntry> classSymbols = new HashMap<>();

    public boolean symbolExists(String name) {
        return classSymbols.containsKey(name);
    }
    public void addSymbol(SymbolEntry entry) {
        classSymbols.put(entry.getName(), entry);
    }
    public SymbolEntry getSymbol(String name) {
        return classSymbols.get(name);
    }
}
