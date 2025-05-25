    package SymbolTable;

    public class SymbolEntry {
        private String name;
        private SymbolType type;
        private String value;
        private String scope;



        public SymbolEntry(String name, SymbolType type, String value ,String scope) {
            this.name = name;
            this.type = type;
            this.value = value;
            this.scope = scope;

        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }




        public SymbolType getType() {
            return type;
        }

        public void setType(SymbolType type) {
            this.type = type;
        }

        public String getValue() {
            return value;
        }

        public void setValue(String value) {
            this.value = value;
        }
        public String getScope() {
            return scope;
        }

        public void setScope(String scope) {
            this.scope = scope;
        }
        @Override
        public String toString() {
            return "SymbolEntry{name='" + name + "', type=" + type + ", value='" + value+ "', scope='" + scope  +"'}";
        }

    }
