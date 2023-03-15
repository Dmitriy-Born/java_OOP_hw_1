public class Main{
    public static void main(String[] args) {
        Person irina = new Person("Ирина");
        Person vasya = new Person("Вася");
        Person masha = new Person("Маша");
        Person jane = new Person("Женя");
        Person ivan = new Person("Ваня");

        GeoTree gt = new GeoTree();

        gt.appendConnection(irina, vasya, Relationship.parent);
        gt.appendConnection(irina, masha, Relationship.parent);
        gt.appendConnection(vasya, jane, Relationship.parent);
        gt.appendConnection(vasya, ivan, Relationship.parent);

        gt.appendConnection(vasya, masha, Relationship.relative);
        gt.appendConnection(jane, ivan, Relationship.relative);

        System.out.println(gt.allRel(irina));
        System.out.println(gt.allRel(vasya));
    }

}
