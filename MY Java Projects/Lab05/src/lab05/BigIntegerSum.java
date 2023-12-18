/*
Bismillahir Rahmanir Rahim
 */
package lab05;
import java.util.*;
/**
 * 5.Calculate the sum of 2 big integers (string).
 * @author Nizam
 */
public class BigIntegerSum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        String str1 ;
        System.out.println("Enter first Big Integer : ");
        str1 = input.nextLine();
        
        String str2 ;
        System.out.println("Enter second Big Integer : ");
        str2 = input.nextLine();

        
        if(str1.length() > str2.length()){
            String t = str1;
            str1 = str2;
            str2 = t;
        }
        //Take an empty String for storing result
        String str = "";
        
        int n1 = str1.length(), n2 = str2.length();
        
        //normally amra pechon theke number add kori
        str1 = new StringBuilder(str1).reverse().toString();
        str2 = new StringBuilder(str2).reverse().toString();
        
        int carry = 0;
        
        for(int i = 0; i < n1; i++) {
            int sum =  ((int) (str1.charAt(i) - '0') + (int) (str2.charAt(i) - '0' ) + carry);
            str += (char)(sum % 10 + '0');
            
            carry = sum / 10;
        }
        
        //Add remaining digits of larger number
        for(int i =n1; i < n2; i++)
        {
            int sum =((int)(str2.charAt(i) - '0') + carry);
            str += (char)(sum % 10 + '0' );
            carry = sum / 10;
        }
        
        //Add remaining carry
        if (carry > 0)
            str  += (char) (carry + '0' );
        
        //reverse resulting string
       str = new StringBuilder(str).reverse().toString();
       
        System.out.println(str); 
        
    }
}
