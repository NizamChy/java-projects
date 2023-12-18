/*
Bismillahir Rahmanir Rahim
 */
package lab05;

import java.util.Scanner;

public class FrequencyString {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string to check frequency of its characters :");
        String s;
        s = input.nextLine();
        int freq[] = new int[s.length()];
        int i, j;
        char string[] = s.toCharArray();

        for (i = 0; i < s.length(); i++) {
            freq[i] = 1;
            for (j = i + 1; j < s.length(); j++) {
                if (string[i] == string[j]) {
                    freq[i]++;

                    string[j] = '0';
                }
            }
        }
        System.out.println("Frequency of character : ");
        for (i = 0; i < freq.length; i++) {
            if (string[i] != ' ' && string[i] != '0') {
                System.out.println(string[i] + " = " + freq[i]);
            }
        }

    }
}
