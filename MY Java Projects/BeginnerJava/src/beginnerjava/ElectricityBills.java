package beginnerjava;

import java.util.Scanner;

public class ElectricityBills {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double units, tk, next, tk0, tk1, tk2, ctk, dtk, etk, ftk, ftk2, unts, unt;
        String name;

        System.out.print("Enter name : ");
        name = input.nextLine();
        System.out.print("Enter units : ");
        units = input.nextDouble();
       
        if (units >= 1 && units <= 100) {
            tk = units * 1.75;
            if (tk < 100) {
                System.out.println(name + " Cost : 100 Tk");
            } else if (tk > 1000) {
                ctk = tk + (tk * 0.15);
                System.out.println(name + " Cost : " + ctk + " Tk");
            } else {
                System.out.println(name + " Cost : " + tk + " Tk");
            }
        } else if (units >= 100 && units <= 300) {
            tk0 = 100 * 1.75;
            next = units - 100;
            unts = next * 2.25;
            ftk = tk0 + unts;
            if (ftk > 1000) {
                dtk = ftk + (ftk * 0.15);
                System.out.println(name + " Cost : " + dtk + " Tk");
            } else {
                System.out.println(name + " Cost : " + ftk + " Tk");
            }
        } else if (units > 300) {
            tk1 = 100 * 1.75;
            tk2 = 200 * 2.25;
            next = units - 300;
            unt = next * 3.50;
            ftk2 = tk1 + tk2 + unt;
            if (ftk2 > 1000) {
                etk = ftk2 + (ftk2 * 0.15);
                System.out.println(name + " Cost : " + etk + " Tk");
            } else {
                System.out.println(name + " Cost : " + ftk2 + " Tk");
            }
        }

    }

}
