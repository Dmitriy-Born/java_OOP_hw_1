import java.util.ArrayList;

public interface Geo {

    void appendConnection(Person p1, Person p2, Relationship re);
    ArrayList<String> allRel (Person person);
}
