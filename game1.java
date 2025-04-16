package com.company;
import java.util.Random;
import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class game1 {
    public static void main(String[] args) {

        System.out.println("Please enter your chance for Rock,Scissors,Paper,If u want to exit writeQuit");
        Scanner sc = new Scanner(System.in);
        //String myMove = sc.nextLine().trim().toLowerCase();


        while(true) {
            String myMove = sc.nextLine().trim().toLowerCase();

            if (myMove.equals("quit")) {
                System.out.println("Thanks for playing! 👋");
                break;
            }

            if (myMove.equals("rock") || myMove.equals("scissors") || myMove.equals("paper")) {
                System.out.println("It is a valid move");
            }
             else {
                System.out.println("Invalid move");
            }


            int computerMove = (int) (Math.random() * 3);
            String computerMoveStr = switch (computerMove) {
                case 0 -> "rock";
                case 1 -> "scissors";
                case 2 -> "paper";
                default -> ""; // Just in case
            };

            if (myMove.equals(computerMoveStr)) {
                System.out.println("It's a tie! 🤝");
            } else if (
                    (myMove.equals("rock") && computerMoveStr.equals("scissors")) ||
                            (myMove.equals("scissors") && computerMoveStr.equals("paper")) ||
                            (myMove.equals("paper") && computerMoveStr.equals("rock"))
            ) {
                System.out.println("You win! 🎉");
            } else {
                System.out.println("Computer wins! 😬");
            }
        }

    }


}

