package beginnerjava;

import java.util.Scanner;

public class TriangleArea {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double a, b, c, Perimeter, s, area;
        System.out.print("The three values are : ");
        a = input.nextDouble();
        b = input.nextDouble();
        c = input.nextDouble();

        Perimeter = a + b + c;
        s = (a + b + c) / 2; // Perimeter/2
        area = Math.sqrt(s * (s - a) * (s - b) * (s - c));

        System.out.println("The Perimeter of Traiangle = " + Perimeter);
        System.out.println("The Semi Perimeter of Traiangle = " + s);
        System.out.println("The Area of triangle = " + area);
    }

}
