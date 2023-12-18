package beginnerjava;

import java.util.Scanner;

public class RockPaperGame {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int choice1, choice2;
        String winner;

        System.out.println("Rock (0),  Paper (1),  Scissors (2)  ");
        System.out.print("Player : 1 choose any : ");
        choice1 = input.nextInt();
        System.out.print("Player : 2 choose any : ");
        choice2 = input.nextInt();

        switch (choice2 - choice1) {
            case 0:
                winner = "\t You Tied! ";
                break;
            case -1:
                winner = "\t Player 1 Wins!  ";
                break;
            case 2:
                winner = "\t Player 1 Wins!  ";
                break;
            case -2:
                winner = "\t Player 2 Wins! ";
                break;
            case 1:
                winner = "\t Player 2 Wins! ";
                break;
            default:
                winner = "Oops! Somthing went wrong! ";
        }

        System.out.println( winner);

    }

}
