public class Person {
    private String fullName;
    private int age;


    public Person(String fullName) {

        this.fullName = fullName;
    }

    public Person (String fullName, int age){
        this.fullName = fullName;
        this.age = age;
    }


    public String getFullName() {
        return fullName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


}
