import java.util.ArrayList;
import java.util.List;

public class GeoTree implements Geo, TestConsole, TestConsoleWithout, AllInArray {
    private ArrayList<Node> tree = new ArrayList<>();
    public ArrayList<Person> tree2 = new ArrayList<>();


    public ArrayList<Node> getTree() {

        return tree;
    }

    @Override
    public void appendConnection(Person p1, Person p2, Relationship re) {
        tree.add(new Node(p1, re, p2));
        tree.add(new Node(p2, re.getInversionRel(), p1));
    }

    public void appendConnection(Person p){
        tree2.add(p);
    }

    @Override
    public ArrayList<String> allRel(Person person) {
        ArrayList<String> result = new ArrayList<>();
        result.add("Все отношения " + person.getFullName());
        for (Node t : tree) {
            if (t.p1.equals(person)) {
                result.add(t.re + ": " + t.p2.getFullName());
            }
        }
        return result;
    }

    @Override
    public void printConsole(Person person) {
        System.out.println(allRel(person));
    }

    @Override
    public void printConsoleWithout() {
        System.out.println(all());
    }

    @Override
    public ArrayList<String> all() { ////////////////////////////
        ArrayList<String> result = new ArrayList<>();
        for (Person p : tree2){
            result.add(p.getFullName() +" - "+ p.getAge());
        }
        return result;
    }

}
