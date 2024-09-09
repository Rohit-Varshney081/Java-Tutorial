class A {
    int x = 10;

    public void show() {
        System.err.println("Hello A");
    }

    public void print() {
        System.out.println("Hye A");

    }
}

class B extends A {
    public void show() {
        System.out.println("Hello B");
    }

    public void display() {
        System.out.println("Hye B");
    }
}

public class MethodOverriding {
    public static void main(String[] args) {
        B b1 = new B();
        b1.show();
        b1.print();
        b1.display();

    }
}
