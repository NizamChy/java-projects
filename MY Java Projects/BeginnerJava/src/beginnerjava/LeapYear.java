package beginnerjava;

import java.util.Scanner;

public class LeapYear {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int year;
        System.out.print("Enter any year to check leap year or not: ");
        year = input.nextInt();
        if (year % 4 == 0 && year % 100 != 0) {
            System.out.println(year + " is leap year!");
        } else if (year % 400 == 0) {
            System.out.println(year + " is leap year!");
        } else {
            System.out.println(year + " is not a leap year.");
        }

    }

}
