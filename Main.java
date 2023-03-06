public class Main {
    public static void main(String[] args) {
        Person irina = new Person("Ирина");
        Person vasya = new Person("Вася");
        Person masha = new Person("Маша");
        Person jane = new Person("Женя");
        Person ivan = new Person("Ваня");

        GeoTree gt = new GeoTree();

        gt.appendParrentChildren(irina, vasya);
        gt.appendParrentChildren(irina, masha);
        gt.appendParrentChildren(vasya, jane);
        gt.appendParrentChildren(vasya, ivan);

        gt.appendRelative(vasya, masha);
        gt.appendRelative(jane, ivan);


        new View(gt).childrenView(irina);
        new View(gt).relativeView(vasya);

    }

}
