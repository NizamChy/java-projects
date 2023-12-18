/*
Bismillahir Rahmanir Rahim
 */
package beginnerjava;

import java.util.Scanner;

public class DecimalToBinary2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int decimal;
        System.out.println("Enter a decimal number to convert into binary : ");
        decimal = input.nextInt();
        int binary[] = new int[40];
        int index =0;
        
        while(decimal > 0){
            binary[index++] = decimal % 2;
            decimal = decimal / 2;
            
        }
        for(int i = index-1; i >= 0; i--){
            System.out.print(binary[i]);
        }
        System.out.println();
    }
    
}
