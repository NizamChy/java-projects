/* Bismillahir Rahmanir Rahim */
package labseven;

import java.util.Scanner;

/**
 *
 * @author Nizam
 */
public class CreateException {

    public static void main(String args[]) {
        //exception = an event that occurs during the execution of a program that, disrupts the normal flow of instruction
        //  ex. ArithmeticExeption, ArrayIndexOutOfBoundsException,FileNotFoundException

        //user defined exceptions = custom exceptions 
        //ex.DuplicateEmail, InvalidCreditException, AgeException
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age = scan.nextInt();

        try {
            checkAge(age);
        } catch (Exception e) {
            System.out.println("A problem occured: " + e);
        }
    }

    static void checkAge(int age) throws AgeException {

        if (age < 18) {
            throw new AgeException("\n" + "You must be 18+ to sign up");
        } else {
            System.out.println("You are now signed up!");
        }
    }

}

class AgeException extends Exception {

    AgeException(String message) {
        super(message);
    }

}
