package ries.dan.MiniCasino;

import java.util.ArrayList;

/**
 * Created by danries on 1/27/17.
 */
public class GoFish extends Games {

    private Games goFish = new Games();

    ArrayList<Card> playerHand = new ArrayList<Card>();
    ArrayList<Card> dealerHand = new ArrayList<Card>();

    public boolean runGame(){
        System.out.println("Sorry, Closed");
        return false;
    }

    protected ArrayList<Card> deal(){
        ArrayList<Card> hand = new ArrayList<Card>();
        for (int i = 0; i < 7; i ++){
            hand.add(goFish.deck.drawCard());
        }
        return hand;
    }

    protected boolean checkForBook(ArrayList<Card> hand){
        for (Card card : hand){
            if (card.getRank().equals("")){
                return false;
            }
        }
        return true;
    }

    protected int countAndSearchForTypes(ArrayList<Card> hand){
        return 0;
    }

    protected void sortCardsInOrder(ArrayList<Card> hand){}

    protected int countTotalNumberofBooks(ArrayList<Card> books){
        return 0;
    }

    protected Card removeCardsandAddToBooks(ArrayList<Card> hand){
        return hand.iterator().next();
    }

    protected int countNumberofCardsRemainingInDeck(ArrayList<Card> deck){
        return deck.size();
    }

}
