import java.util.ArrayList;

public class Reserch implements TestConsole{
    ArrayList<String> result = new ArrayList<>();
    ArrayList<Node> tree;


    public Reserch(GeoTree geoTree) {
        tree = geoTree.getTree();
    }

    public ArrayList<String> spendRelationship(Person p, Relationship re) {
        for (Node t : tree) {
            if (t.p1.getFullName() == p.getFullName() && t.re == re) {
                result.add(t.p2.getFullName());
            }
        }
        return result;
    }


    @Override
    public void printConsole(Person person) {
        System.out.println(result);
    }
}
