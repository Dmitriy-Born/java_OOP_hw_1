public enum Relationship {
    parent {
        public Relationship getInversionRel(){
            return children;
        }
    },
    children {
        public Relationship getInversionRel(){
            return parent;
        }
    },
    relative { // родственник
        public Relationship getInversionRel(){
            return relative;
        }

    },

    granddaughter { ////////// ??????????????
        public Relationship getInversionRel(){
            return grandmother;
        }
    },

    grandmother {
        public Relationship getInversionRel() {
            return granddaughter;
        }
    };

    public abstract Relationship getInversionRel();
}
