import java.util.ArrayList;

public class GeoTree implements Geo{
    private ArrayList<Node> tree = new ArrayList<>();

    public ArrayList<Node> getTree() {

        return tree;
    }

    public void appendParrentChildren(Person parent, Person children) {
        tree.add(new Node(parent, Relationship.parent, children));
        tree.add(new Node(children, Relationship.children, parent));
    }

    public void appendRelative (Person parent1, Person parent2){
        tree.add(new Node(parent1, Relationship.relative, parent2));
    }

    @Override
    public void appendConnection(Person p1, Person p2, Relationship re) {
        tree.add(new Node(p1, re, p2));
        tree.add(new Node(p2, re.getInversionRel(), p1));
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



//    public void appendConnection(Person p1, Person p2, Relationship re){
//        tree.add(new Node(p1, re, p2));
//        tree.add(new Node(p2, re.getInversionRel(), p1));
//    }

}
