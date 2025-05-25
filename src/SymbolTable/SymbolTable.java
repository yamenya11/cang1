package SymbolTable;

import java.util.*;

public class SymbolTable {
    private Map<String, List<SymbolEntry>> table = new HashMap<>();
    private Deque<String> scopeStack = new ArrayDeque<>();

    public SymbolTable() {
        scopeStack.push("global"); // بداية السكوب بـ "global"
    }

    // الدخول إلى scope جديد
    public void enterScope(String scopeName) {
        scopeStack.push(scopeName);
    }

    // الخروج من السكوب الحالي
    public void exitScope() {
        if (!scopeStack.isEmpty()) {
            scopeStack.pop();
        }
    }

    // الحصول على السكوب الحالي
    public String getCurrentScope() {
        return scopeStack.peek();
    }

    // إضافة رمز جديد
    public void addSymbol(SymbolEntry entry) {
        table.computeIfAbsent(entry.getName(), k -> new ArrayList<>()).add(entry);
    }

    // التحقق من وجود رمز في السكوب الحالي أو الأعلى
    public boolean symbolExists(String name) {
        if (!table.containsKey(name)) return false;
        for (SymbolEntry entry : table.get(name)) {
            if (scopeStack.contains(entry.getScope())) {
                return true;
            }
        }
        return false;
    }

    // جلب رمز حسب الاسم ضمن السكوبات الحالية
    public SymbolEntry getSymbol(String name) {
        if (!table.containsKey(name)) return null;
        for (SymbolEntry entry : table.get(name)) {
            if (scopeStack.contains(entry.getScope())) {
                return entry;
            }
        }
        return null;
    }

    // طباعة كل الرموز في الجدول
    public void printSymbols() {
        for (List<SymbolEntry> entries : table.values()) {
            for (SymbolEntry symbol : entries) {
                System.out.println(symbol);
            }
        }
    }
}