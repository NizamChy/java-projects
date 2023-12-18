package beginnerjava;

import java.util.Scanner;


public class FarentoCels {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double cels,faren;
        
        System.out.print("Enter Farenheit = ");
        faren = input.nextDouble();
        
        cels = ((double)5/9) * (faren - 32);
        System.out.println("Celsius = "+cels);
        
        
    }
}
