public class Node {

    public Node(Person p1, Relationship re, Person p2) {
        this.p1 = p1;
        this.re = re;
        this.p2 = p2;

    }

    public Node(Person p1){
        this.p1 = p1;
    }

    Person p1;
    Relationship re;
    Person p2;

    public String toString() {

        return String.format("<%s %s %s>", p1, re, p2);
    }


}
