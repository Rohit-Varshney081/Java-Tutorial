class Employee {
    private String name;
    private int salary;
    private String course;

    public void input(String n, int s, String c) {
        name = n;
        salary = s;
        course = c;

    }

    void show() {
        System.out.println(name + " " + salary + " " + course);
    }
}

public class Abstraction {
    public static void main(String[] args) {
        Employee e1 = new Employee();
        Employee e2 = new Employee();
        e1.input("Rohit", 1000000, "JAVA");
        e2.input("Aditya", 1000000, "Python");
        e2.show();
        e1.show();
    }

}
