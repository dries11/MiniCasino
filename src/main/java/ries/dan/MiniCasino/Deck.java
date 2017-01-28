package ries.dan.MiniCasino;

import java.util.ArrayList;
import java.util.*;

/**
 * Created by danries on 1/27/17.
 */
public class Deck {

    private ArrayList<Card> deck = new ArrayList();


    public Deck() {
        for (Rank rank : Rank.values()) {
            for (Suit suit: Suit.values()){
                deck.add(new Card(rank, suit));
            }
        }
    }

    public ArrayList<Card> getDeck() {
        return deck;
    }

    public Card drawCard(){
        Card currentCard;
        int index = (int)(Math.ceil(Math.random()*deck.size()));
        currentCard = deck.get(index);
        deck.remove(index);
        return currentCard;
    }


}

