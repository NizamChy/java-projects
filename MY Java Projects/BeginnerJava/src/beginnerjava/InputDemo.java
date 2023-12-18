
package beginnerjava;
import java.util.Scanner;

public class InputDemo {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int number;
        String name;
        double num1;
        
        System.out.print("Enter your name : ");
        name = input.nextLine(); 
        System.out.print("Enter any double value : ");
        num1 = input.nextDouble();
        System.out.print("Enter your ID number :C");
        number = input.nextInt();

        System.out.println("Welcome : "+name);
        System.out.println("CGPA = "+num1);
        System.out.println("ID :C"+number);
    }
    
}
