import mypack.Package1;

class B {
    int y = 6;

    void showB() {
        System.out.println(y);
    }
}

public class Demo {
    public static void main(String[] args) {
        Package1 p = new Package1();
        // mypack.Package1 p = new mypack.Package1(); ???? if we donot import package
        // then we can do like this also.
        p.show();
        System.out.println(p.x);
        // System.out.println(p.z); ?? compile time error bcz z is protected
        // System.out.println(p.m); ?? compile time error bcz m is default
        B b = new B();
        b.showB();
    }
}
