
package beginnerjava;

import java.util.Scanner;

public class InchToCm {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double inch, cm;
        System.out.print("Enter inch : ");
        inch = input.nextDouble();
        cm = 2.54 * inch;
        System.out.println("Cm = "+cm);
        
        
    }
    
}
