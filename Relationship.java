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

    };
    public abstract Relationship getInversionRel();
}
