
package beginnerjava;

import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a,b,c,d;
        System.out.print("Enter four values : ");
        a = input.nextInt();
        b = input.nextInt();
        c = input.nextInt();
        d = input.nextInt();
        if(a>b && a>c && a>d){
            System.out.println("Max value : "+a);
        }
        
        else if(b>a && b>c && b>d){
            System.out.println("Max value : "+b);
        }
        else if(c>a && c>b && c>d){
            System.out.println("Max value : "+c);
        }
        else if(d>a && d>b && d>c){
            System.out.println("Max value : "+d);
        }
        else
            System.out.println("Enter different integer values!");
        
    }
}
