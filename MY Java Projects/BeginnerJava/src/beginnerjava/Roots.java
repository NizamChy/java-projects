package beginnerjava;

import java.util.Scanner;

public class Roots {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double a, b, c, y, x1, x2;
        System.out.print("Enter Three Values : ");
        a = input.nextDouble();
        b = input.nextDouble();
        c = input.nextDouble();

        y = ((b * b) - (4 * a * c));
        x1 = (((-b + Math.sqrt(y))) / (2 * a));
        x2 = (((-b - Math.sqrt(y))) / (2 * a));
        System.out.println("Root 1 : " + x1);
        System.out.println("Root 2 : " + x2);
    }

}
