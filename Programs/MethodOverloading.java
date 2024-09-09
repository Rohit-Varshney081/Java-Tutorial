class Overload {
    void add(int a, int b) {
        System.out.println("Number Addition " + (a + b));
    }

    void add(double a, double b) {
        System.err.println("Floating Point Addtion " + (a + b));
    }

    void add(String a, String b) {
        System.out.println("String Addtion " + (a + b));
    }
}

class MethodOverloading {
    public static void main(String[] args) {
        Overload ovd = new Overload();
        ovd.add(5, 10);
        ovd.add(20.5, 65.768);
        ovd.add("Rohit", "Varshney");
    }
}