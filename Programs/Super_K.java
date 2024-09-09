class A {
    int x = 2;

    public void print() {
        System.out.println("I am super class");
    }
}

class B extends A {
    int x = 6;

    public void show() {
        super.print();
        System.out.println(super.x);
    }

    public void print() {
        System.out.println("Sub class");
    }
}

public class Super_K {
    public static void main(String[] args) {
        B b = new B();
        b.show();
        b.print();
        System.out.println(b.x);
    }

}
