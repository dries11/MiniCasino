package ries.dan.MiniCasino;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by danries on 1/27/17.
 */
public class BlackJack extends Games{

    Games BlackJack = new Games();

    IO io = new IO();

    ArrayList<Card> playerHand = new ArrayList<Card>();
    ArrayList<Card> dealerHand = new ArrayList<Card>();


    public void runGame(){
        do {
            Deck deck = new Deck();
            playerHand = deal();
            dealerHand = deal();
            boolean playing = true;

            io.displayCardAmount(calculateCardAmount(playerHand), calculateCardAmount(dealerHand));

            int condition = checkHands(dealerHand, playerHand);

            while (playing) {
                if (condition == 2) {
                    io.dealerWins();
                    break;
                } else if (condition == 3) {
                    io.playerWins();
                    break;
                }
                if (io.hitOrStay() == 1) {
                    playerHand.add(deck.drawCard());
                }
                if (aiDealer() == 0) {
                    dealerHand.add(deck.drawCard());
                }
                if (condition == 2) {
                    io.dealerWins();
                    break;
                } else if (condition == 3) {
                    io.playerWins();
                    break;
                }
            }
        }
        while(io.playAgain(io.promptPlayAgain()));
    }


    public ArrayList<Card> deal(){
        ArrayList<Card> hand = new ArrayList<Card>();
        for (int i = 0; i < 2; i ++){
            hand.add(BlackJack.deck.drawCard());
        }
        return hand;
    }

    public int checkHands(ArrayList<Card> dealer, ArrayList<Card> player){
        int condition = 1; //Play On
        if (didWin(dealer) || didBreak(player)){
            condition = 2; //Dealer Wins
        }
        else if (didWin(player) || didBreak(dealer)){
            condition = 3; //Player Wins
        }
        return condition;
    }

    public int calculateCardAmount(ArrayList<Card> hand){
        int amount = 0;
        String value;
        for (int i = 0; i < hand.size(); i++){
            value = (hand.get(i).getRank().getValue());
            if (value.equals("ACE")) {
                amount+= 1;
            }
            else if (value.equals("JACK") || value.equals("QUEEN")|| value.equals("KING")){
                amount += 10;
            }
            else
                amount += Integer.parseInt(hand.get(i).getRank().getValue());
        }
        return amount;
    }

    public boolean didWin(ArrayList<Card> hand){
        boolean status = false;
        if (calculateCardAmount(hand) == 21){
            status = true;
        }
        return status;
    }

    public boolean didBreak(ArrayList<Card> hand){
        boolean status = true;
        if (calculateCardAmount(hand) <= 21){
            status = false;
        }
        return status;
    }

    public int aiDealer(){
        double choice = (Math.random() + 1);
        if (choice < .75){//Stay
            return 1;
        }
        return 0;//Hit
    }

}
