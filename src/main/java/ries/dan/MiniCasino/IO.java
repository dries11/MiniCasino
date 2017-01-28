package ries.dan.MiniCasino;

import java.util.Scanner;

/**
 * Created by danries on 1/27/17.
 */
public class IO {

    Scanner input = new Scanner(System.in);
    BlackJack blackJack = new BlackJack();
    GoFish goFish = new GoFish();


    public int pickAGame(){
        System.out.println("Pick a game to play");
        displayBreak();
        System.out.println("1. BlackJack \n 2. Go Fish (Family Friendly)");
        int choice = input.nextInt();
        return choice;
    }

    public void displayBreak(){
        System.out.println("=====================");
    }

    public int promptPlayAgain(){
        System.out.println("Would you like to play again?");
        displayBreak();
        System.out.println("1. Yes \n 2. No");
        return input.nextInt();
    }

    public boolean playAgain(int answer){
        boolean play = false;
        if (answer == 1){
            play = true;
        }
        return play;
    }

    public int hitOrStay(){
        System.out.println("Would you like to hit or stay?");
        displayBreak();
        System.out.println("1. Hit \n 2. Stay");
        return input.nextInt();
    }

    public void playerWins(){
        System.out.println("You Win!!");
    }

    public void dealerWins(){
        System.out.println("You Lose...");
    }

    public void displayCardAmount(int playerAmount, int dealerAmount){
        System.out.println("You have " + playerAmount);
        System.out.println("The Dealer has " + dealerAmount);
    }



    public void goFishCues(){}

}
