/* Bismillahir Rahmanir Rahim */
package labsix;

/**
 *
 * @author Nizam
 */
public class SingleInheritance {

    public static void main(String[] args) {

        //inheritance = the process where one class acquires , 
        //                         the attributes and methods of another.
        Car car = new Car();

        car.go();

        Bicycle bike = new Bicycle();

        bike.stop();

        System.out.println(car.speed);
        System.out.println(bike.speed);

        System.out.println(car.doors);
        System.out.println(bike.pedals);

    }

    public static class Vehicle {

        double speed;

        void go() {
            System.out.println("This vehicles is moving");
        }

        void stop() {
            System.out.println("This vehicles is stopped");
        }
    }

    public static class Car extends Vehicle {

        int wheels = 4;
        int doors = 4;
    }

    public static class Bicycle extends Vehicle {

        int wheels = 2;
        int pedals = 2;
    }

}
