/*
Bismillahir Rahmanir Rahim
 */
package lab05;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Nizam
 */
public class Anagram {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str1, str2;
        System.out.println("Enter two string to check angram string : ");
        str1 = input.nextLine();
        str2 = input.nextLine();

        String s1 = str1.replaceAll("\\s", "");
        String s2 = str2.replaceAll("\\s", "");

        boolean status = true;
        if (s1.length() != s2.length()) {
            status = false;
        } else {
            char[] arrayS1 = s1.toLowerCase().toCharArray();
            char[] arrayS2 = s2.toLowerCase().toCharArray();
            Arrays.sort(arrayS1);
            Arrays.sort(arrayS2);
            status = Arrays.equals(arrayS1, arrayS2);
        }
        if (status) {
            System.out.println(str1 + " and " + str2 + " are anagrams.");
        } else {
            System.out.println(str1 + " and " + str2 + " are not anagrams!");
        }
    }
}
