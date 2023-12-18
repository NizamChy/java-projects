/* Bismillahir Rahmanir Rahim */
package labsix;

/**
 *
 * @author Nizam
 */
public class MethodOverriding {

    public static void main(String[] args) {

        // method overriding = Declaring a method in sub class,
        // which is already present in parent class.
        // done so that a child class can give its own implementation
        Animal animal = new Animal();
        Dog dog = new Dog();

        dog.speak();

    }

    public static class Animal {

        void speak() {
            System.out.println("The animal speaks");
        }
    }

    public static class Dog extends Animal {

        @Override
        void speak() {
            System.out.println("The dog goes *bark*");
        }
    }

}
