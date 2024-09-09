//// Concrete Class ////
public class AbstractClass extends Bike {
    void run() {
        System.out.println("running Safely");

    }

    public static void main(String args[]) {
        Bike obj = new AbstractClass();
        obj.run();
    }

}

//// Abstract Class ////
abstract class Bike {
    abstract void run();
}
