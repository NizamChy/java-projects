package beginnerjava;

import java.util.Scanner;

public class CapitalSmall {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        char ch;
        System.out.print("Enter any latter : ");
        ch = input.next().charAt(0);
        if (ch >= 'a' && ch <= 'z') {
            System.out.println("Small.");
        }
        else if (ch >= 'A' && ch <= 'Z') {
            System.out.println("Capital.");
        }
        else {
            System.out.println("Not a latter!");
        }

    }

}
