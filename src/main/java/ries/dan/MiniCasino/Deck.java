package ries.dan.MiniCasino;

import java.util.ArrayList;
import java.util.*;

/**
 * Created by danries on 1/27/17.
 */
public class Deck {

    private ArrayList<Card> deck = new ArrayList<Card>();
    Card cards;


    protected Deck() {
        for (Rank rank : Rank.values()) {
            for (Suit suit: Suit.values()){
                deck.add(new Card(rank, suit));
            }
        }
        Collections.shuffle(deck);
    }

    protected ArrayList<Card> getDeck() {
        return deck;
    }

    protected Card drawCard(){
        Card currentCard;
        currentCard = deck.get(0);
        deck.remove(0);
        return currentCard;
    }

    protected String displayHand(ArrayList<Card> hand){
        String cards = "";
        for (Card card : hand){
            cards += ("|" + card.displayCard() + "|");
        }
        return cards;
    }


}

