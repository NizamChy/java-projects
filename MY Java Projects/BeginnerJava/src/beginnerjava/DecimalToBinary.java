package beginnerjava;

import java.util.Scanner;

public class DecimalToBinary {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int decimal;
        System.out.print("Enter a decimal number to convert into binary : ");
        decimal = input.nextInt();

        String binary = Integer.toBinaryString(decimal);
        System.out.println("Binary number of  "+decimal+" is "+binary);
    }
}
