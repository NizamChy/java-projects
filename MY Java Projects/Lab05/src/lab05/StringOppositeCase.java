/*
Bismillahir Rahmanir Rahim
 */
package lab05;

import java.util.Scanner;

/**
 *
 * @author Nizam
 */
public class StringOppositeCase {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String name;
        System.out.println("Enter a string to change upper or lower case : ");
        
        name = input.nextLine();
        name = name.toUpperCase();
        System.out.println("Upper Case : "+name);
        
        name = name.toLowerCase();
        System.out.println("Lower Case : "+name);
        
    }
    
}
