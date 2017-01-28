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
        Collections.shuffle(deck);
    }

    public ArrayList<Card> getDeck() {
        return deck;
    }

    public Card drawCard(){
        Card currentCard;
        currentCard = deck.get(0);
        deck.remove(0);
        return currentCard;
    }


}

