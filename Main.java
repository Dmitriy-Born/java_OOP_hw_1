import java.lang.reflect.Array;
import java.util.Collections;

public class Main{
    public static void main(String[] args) {
        Person irina = new Person("Ирина");
        Person vasya = new Person("Вася");
        Person masha = new Person("Маша");
        Person jane = new Person("Женя");
        Person ivan = new Person("Ваня");

        Person alex = new Person("Алексей", 30);
        Person dmit = new Person("Дмитрий", 34);
        Person nastya = new Person("Анастасия", 27);


        GeoTree gt = new GeoTree();
        GeoTree gt2 = new GeoTree();

        gt2.appendConnection(alex);
        gt2.appendConnection(dmit);
        gt2.appendConnection(nastya);

        System.out.println("До сортировки: ");
        gt2.printConsoleWithout();

        Collections.sort(gt2.tree2, new PersonAgeComparator());

        System.out.println("После сортировки: ");
        gt2.printConsoleWithout();

        System.out.println();

        gt.appendConnection(irina, vasya, Relationship.parent);
        gt.appendConnection(irina, masha, Relationship.parent);
        gt.appendConnection(vasya, jane, Relationship.parent);
        gt.appendConnection(vasya, ivan, Relationship.parent);

        gt.appendConnection(masha, jane, Relationship.grandmother);

        gt.appendConnection(vasya, masha, Relationship.relative);
        gt.appendConnection(jane, ivan, Relationship.relative);

        gt.printConsole(irina);
        gt.printConsole(vasya);
        gt.printConsole(masha);
        gt.printConsole(jane);

        System.out.println();

        Reserch reserch = new Reserch(gt);
        reserch.spendRelationship(vasya, Relationship.children);

        System.out.printf("Дети у %s: ", vasya.getFullName());
        reserch.printConsole(vasya);

        Reserch reserchNew = new Reserch(gt);
        reserchNew.spendRelationship(irina, Relationship.parent);
        System.out.printf("Родители у %s: ", irina.getFullName());
        reserchNew.printConsole(irina);

    }

}
