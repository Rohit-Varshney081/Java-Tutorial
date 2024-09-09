interface printable {
    void print();
}

interface Drawable {
    void draw();
}

class Rect implements Drawable {
    public void draw() {
        System.out.println("Drawing Rectangle");
    };
}

class Circle implements Drawable {
    public void draw() {
        System.out.println("Drawing Circle");
    };
}

public class InterfaceClass implements printable {
    public void print() {
        System.out.println("Hello");
    }

    public static void main(String[] args) {
        printable obj = new InterfaceClass();
        obj.print();

        Drawable d = new Circle();
        d.draw();
    }

}
