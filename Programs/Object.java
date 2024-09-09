class Employee {
    String name;
    int salary;
    String course;

    void input(String n, int s, String c) {
        name = n;
        salary = s;
        course = c;
    }

    void show() {
        System.out.println(name + " " + salary + " " + course);
    }
}

class Object {
    public static void main(String[] args) {
        Employee e1 = new Employee();
        Employee e2 = new Employee();
        e1.name = "Rohit";
        e1.salary = 1000000;
        e1.course = "JAVA";
        e2.input("Aman", 200000, "Python");
        System.out.println(e1.name + " " + e1.salary + " " + e1.course);
        e2.show();
    }
}