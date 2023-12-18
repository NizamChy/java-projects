package beginnerjava;

import java.util.Scanner;

public class GradePoint {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int marks;
        System.out.print("Enter the marks : ");

        marks = input.nextInt();

        if (marks >= 80 && marks <= 100) {
            System.out.println("Grade : A");
        } else if (marks >= 65 && marks <= 79) {
            System.out.println("Grade : B");
        } else if (marks >= 50 && marks <= 64) {
            System.out.println("Grade : C");
        } else if (marks >= 40 && marks <= 49) {
            System.out.println("Grade : D");
        } else if (marks >= 00 && marks <= 39) {
            System.out.println("Grade : F");
        } else {
            System.out.println("Enter a valid number!");
        }

    }
}
