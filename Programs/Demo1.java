class B extends mypack.Package1 {
    int y = 50;

    void showB() {
        System.out.println(y);
        System.out.println(x);
        System.out.println(z); // No compile time error for protected bcz used via inheritance
        // System.out.println(m); // Compile time error bcz m is default member
    }
}

public class Demo1 {
    public static void main(String[] args) {
        B b = new B();
        b.showB();
        b.show();
    }
}
