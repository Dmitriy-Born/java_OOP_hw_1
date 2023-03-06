public class View {
    GeoTree gTree;

    public View (GeoTree geoTree){
        this.gTree = geoTree;
    }


    public void childrenView (Person person){
        System.out.printf("%s - это дети (или ребенок) пользователя %s", new Reserch(gTree).spendChildren(person,Relationship.parent), person.getFullName());
        System.out.println();
    }

    public void relativeView (Person person){
        System.out.printf("Пользователь %s является родственником пользователя %s", new Reserch(gTree).spendChildren(person,Relationship.relative), person.getFullName());
        System.out.println();
    }
}

