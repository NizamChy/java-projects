/* Bismillahir Rahmanir Rahim */
package labsix;

/**
 *
 * @author Nizam
 */
abstract class Vehicle {

    abstract void bike();

    void car() {
        System.out.println("Car is running");
    }

}

class Honda extends Vehicle {

    @Override
    void bike() {
        System.out.println("Bike is running");

    }

}

public class AbstractClass {

    public static void main(String[] args) {

        Honda obj = new Honda();
        obj.bike();
        obj.car();

    }
}
