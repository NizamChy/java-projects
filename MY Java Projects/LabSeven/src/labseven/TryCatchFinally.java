/* Bismillahir Rahmanir Rahim */
package labseven;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Nizam
 */
public class TryCatchFinally {

    public static void main(String[] args) {

        //exception = an event that occurs during the execution of a program that,
        //                     disrupts the normal flow of instruction
        try {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Enter a whole number to devide: ");
            int x = scanner.nextInt();

            System.out.println("Enter a whole number to devide by: ");
            int y = scanner.nextInt();

            int z = x / y;

            System.out.println("result: " + z);
        } catch (ArithmeticException e) {
            System.out.println("You can't divide by zero! IDIOT!");
        } catch (InputMismatchException e) {
            System.out.println("PLEASE ENTER A NUMBER!!!");
        } catch (Exception e) {
            System.out.println("Something went wrong");
        }
        finally {
            System.out.println("You are not BAD :D ");
        }

    }

}
