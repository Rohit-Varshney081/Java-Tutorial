class A {
    int x = 2;

    void showA() {
        System.out.println("Hello A");
        System.out.println(x);
    }
}

class B extends A {
    int y = 4;

    void showB() {
        System.out.println("Hello B");
        showA();
        // System.out.println(x);
    }
}

class Single_Inh {
    public static void main(String[] args) {
        A a1 = new A();
        a1.showA();
        System.out.println(a1.x);
        B b1 = new B();
        b1.showB();
        System.out.println(b1.y);
        b1.showA();
        System.out.println(b1.x);
    }

}