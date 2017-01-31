package ries.dan.MiniCasino;

import java.util.Scanner;

/**
 * Created by danries on 1/29/17.
 */
public class IO {

    Scanner input = new Scanner(System.in);

    public void displayBreak(){
        System.out.println("=====================");
    }

    public void welcomeMain(){
        displayBreak();
        System.out.println("Welcome To The WuTang Casino!");
        displayBreak();
    }

    public String askForName(){
        System.out.println("Could I have your name? ");
        return input.nextLine();
    }

    public int pickAGame(){
        System.out.println("Pick a game to play");
        displayBreak();
        System.out.println("1. BlackJack (Family Friendly)\n2. Go Fish (Family Friendly)\n3. Leave");
        return input.nextInt();
    }

    public void goodbyeMain(){
        displayBreak();
        System.out.println("Thanks for visiting! Come back soon!");
        displayBreak();
    }

    public void displayInHand(String playerHand, String dealerHand){
        System.out.println("You have: " + playerHand);
        System.out.println("The dealer has " + dealerHand);
    }
}
