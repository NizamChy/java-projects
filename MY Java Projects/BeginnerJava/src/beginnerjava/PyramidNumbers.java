/*
 Bismillahir Rahmanir Rahim
        1
     1 2 1
  1 2 3 2 1
 */
package beginnerjava;

import java.util.Scanner;

public class PyramidNumbers {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i, j, n;
        System.out.print("Enter any number : ");
        n = input.nextInt();
        for (i = 1; i < n; i++) {
            for (j = 1; j <= n - i; j++) {
                System.out.print("   ");
            }
            for (j = 1; j <= i; j++) {
                System.out.print(" "+j);
            }

            for (j = i - 1; j >= 1; j--) {
                System.out.print(" "+j);
            }
            System.out.println();
        }

    }
}
