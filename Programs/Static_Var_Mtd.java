class Employee {
    private String name;
    private int salary;
    static private String course;

    public void input(String n, int s) {
        name = n;
        salary = s;
    }

    public void show() {
        System.out.println(name + " " + salary + " " + course);
    }

    public static void cinput(String c) {
        course = c;
    }
}

public class Static_Var_Mtd {
    public static void main(String[] args) {

        Employee.cinput("JAVA");
        Employee e1 = new Employee();
        Employee e2 = new Employee();
        // e1.cinput("Python");
        e1.input("ABC", 100000);
        e2.input("MNO", 100000);
        e1.show();
        e2.show();
    }
}
