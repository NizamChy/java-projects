
package beginnerjava;

import java.util.Scanner;


public class AreaCircum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double radius, area,circum;
        System.out.print("Enter Radius : ");
        radius = input.nextDouble();
        
        area = 3.1416*radius*radius;
        circum = 2*3.1416*radius;
        System.out.println("Area : "+area);
        System.out.println("Circumference : "+circum);
        
        

        
        
    }
    
}
