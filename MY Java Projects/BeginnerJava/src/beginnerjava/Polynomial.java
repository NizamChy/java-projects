package beginnerjava;

import java.util.Scanner;

public class Polynomial {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double x, y, m;
        System.out.print("Enter a value : ");
        x = input.nextDouble();
        m = (x - 1) / x;
        y = m + (m * m) / 2 + (m * m * m) / 3 + (m * m * m * m) / 4;
        System.out.println("The value of Polynomial : " + y);

    }

}
