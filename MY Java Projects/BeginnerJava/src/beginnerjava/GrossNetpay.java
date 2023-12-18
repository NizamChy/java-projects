package beginnerjava;

import java.util.Scanner;

public class GrossNetpay {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double gross, net, hours, rate, tax;
        System.out.print("Enter Hours and Rate : ");
        hours = input.nextDouble();
        rate = input.nextDouble();
        gross = hours * rate;
        if (gross > 5000) {
            gross = hours * rate;
            tax = gross * 0.05;
            net = gross - tax;
            System.out.println("Gross Pay = "+gross+"\nNet Pay = "+net);
        } else if (gross <= 5000) {
            gross = hours * rate;
            System.out.println("Gross Pay = "+gross+ "\nNet Pay = "+gross);
        }

    }

}
