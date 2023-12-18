/*
Bismillahir Rahmanir Rahim
 */
package beginnerjava;

import java.util.Scanner;

/**
 *
 * @author Nizam
 */
public class BinarySearch {

    public static void main(String[] args) {
        int c, first, last, mid, n, search, arr[];

        Scanner input = new Scanner(System.in);
        System.out.println("Enter number of elements : ");
        n = input.nextInt();
        arr = new int[n];

        System.out.println("Enter " + n + " integers ");
        for (c = 0; c < n; c++) {
            arr[c] = input.nextInt();
        }
        System.out.println("Enter value to find ");
        search = input.nextInt();
 
        first = 0;
        last = n - 1;
        mid = (first + last) / 2;

        while (first <= last) {
            if (arr[mid] < search) {
                first = mid + 1;
            } else if (arr[mid] == search) {
                System.out.println(search + " found at location : " + (mid + 1));
                break;
            } else {
                last = mid - 1;
            }
            mid = (first + last) / 2;
        }
        if (first > last) {
            System.out.println(search + " isn't present in the list.");
        }

    }
}
