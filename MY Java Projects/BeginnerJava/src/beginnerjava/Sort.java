/*
Bismillahir Rahmanir Rahim
 */
package beginnerjava;

import java.util.Scanner;

public class Sort {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n, i, j;
        int swap;
        // int[] array = new int[100];
        int array[] = new int[100];
        System.out.print("Enter number of elements : ");
        n = input.nextInt();
        System.out.println("Enter " + n + " integers :\n");

        for (i = 1; i <= n; i++) {
            array[i] = input.nextInt();
        }
        for (i = 1; i <= n; i++) {
            for (j = 1; j <= n - i; j++) {
                if (array[j] > array[j + 1]) {
                    swap = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = swap;
                }
            }
        }
        System.out.println("Sorted list in ascending order : \n");
        for (i = 1; i <= n; i++) {
            System.out.println(array[i] + "\t");
        }

    }
}
