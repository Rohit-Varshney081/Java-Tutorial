public class StaticMTD {
    public static void main(String[] args) {
        Demo.print();
    }
}

class Demo {
    int i = 10;

    public static void print() {
        System.out.println("value of i is " + i);
        // Cannot make a static reference to the non-static field i
    }
}
