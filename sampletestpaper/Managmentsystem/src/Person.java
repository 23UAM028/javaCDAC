public class Person {
    private String name;
    private MyDat dob;

    public Person(String name, MyDat dob) {
        this.name = name;
        this.dob = dob;
    }

    public String getName() {
        return name;
    }

    public MyDat getDob() {
        return dob;
    }

    public String toString() {
        return "Name: " + name + ", DOB: " + dob;
    }
}
