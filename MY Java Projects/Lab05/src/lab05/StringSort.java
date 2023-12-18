/*
Bismillahir Rahmanir Rahim
 */
package lab05;

import java.util.Scanner;

/**
 *
 * @author Nizam
 */
public class StringSort {
    public static void main(String[] args) {
        System.out.println("Enter any string to sort it's Characters :");
        //String str = "nizam";
        Scanner input = new Scanner(System.in);
        String str;
        str = input.nextLine();
        char arr[] = str.toCharArray();
        char temp;
        
        for(int i = 0 ; i < arr.length; i++ ) {
            for(int j=i+1; j< arr.length; j++) {
                if(arr[i] > arr[j]) {
                    temp =arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        //System.out.println(new String(arr));
        System.out.println(arr);
    }
}
