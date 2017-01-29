package ries.dan.MiniCasino;

import java.util.ArrayList;

/**
 * Created by danries on 1/27/17.
 */
public class GoFish extends Games {
    Games goFish = new Games();

    ArrayList<Card> playerHand = new ArrayList<Card>();
    ArrayList<Card> dealerHand = new ArrayList<Card>();

    public ArrayList<Card> deal(){
        ArrayList<Card> hand = new ArrayList<Card>();
        for (int i = 0; i < 7; i ++){
            hand.add(goFish.deck.drawCard());
        }
        return hand;
    }

    public boolean checkForBook(ArrayList<Card> hand){
        for (Card card : hand){
            if (card.getRank().equals("")){
                return false;
            }
        }
        return true;
    }

}
