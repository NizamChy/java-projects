/*
Bismillahir Rahmanir Rahim
 */
package lab05;

import java.math.BigInteger;

/**
 *
 * @author Nizam
 */
public class BigIntegerSum2 {

    public static void main(String[] args) {
        // BigInteger object to store result 
        BigInteger sum;
        
        String input1  = "5454564684456454684646454545";
        
        String input2 = "4256456484464684864864864864";

        // Convert the string input to BigInteger 
        BigInteger a = new BigInteger(input1);
        BigInteger b = new BigInteger(input2);

        // add() method 
        sum = a.add(b);

        System.out.println("The sum of\n" + a + " \nand\n" + b + " " + "\nis\n" + sum + "\n");
    }
}
