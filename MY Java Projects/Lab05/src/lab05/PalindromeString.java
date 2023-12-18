/*
Bismillahir Rahmanir Rahim
 */
package lab05;

import java.util.Scanner;

/**
 *
 * @author Nizam
 */
public class PalindromeString {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s, a = "";
        System.out.println("Enter any string / number  to check palindrome or not : ");
        s = input.nextLine();
        int n = s.length();
        for (int i = n - 1; i >= 0; i--) {
            a = a + s.charAt(i);
        }
        if (s.equals(a)) {
            System.out.println("The string / number is palindrome.");
        } else {
            System.out.println("The string / number is not palindrome.");
        }

    }
}
