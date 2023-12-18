
package beginnerjava;

import java.util.Scanner;


public class TemperatureDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double cels,faren;
        
        System.out.print("Enter Celsius = ");
        cels = input.nextDouble();
        
        faren = 1.8 * cels + 32;
        System.out.println("Farenheit = "+faren);
        
        
    }
}
