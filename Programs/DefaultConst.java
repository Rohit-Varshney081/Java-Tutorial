class A {
    int x;

    // default constructor
    A() {
        x = 2;
        System.out.println("Hello Object 1");
    }

    void display() {
        System.out.println("Value of x=" + x);
    }
}

public class DefaultConst {
    public static void main(String[] args) {
        A a1 = new A();
        A a2 = new A();
        a1.display();
        a2.display();

    }

}
