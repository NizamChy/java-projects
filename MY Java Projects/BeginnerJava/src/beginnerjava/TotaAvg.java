package beginnerjava;

import java.util.Scanner;

public class TotaAvg {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double x, y, z, total, avg;
        System.out.print("Enter Three Number : ");
        x = input.nextDouble();
        y = input.nextDouble();
        z = input.nextDouble();
        total = x + y + z;
        avg = total / 3;
        System.out.println("Total : " + total);
        System.out.println("Total : " + avg);

    }

}
