package ries.dan.MiniCasino;

import java.security.Key;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;

/**
 * Created by danries on 1/27/17.
 */
public class GoFish extends Games {

    private Games goFish = new Games();
    IOGoFish ioGoFish = new IOGoFish();

    ArrayList<Card> playerHand = new ArrayList<Card>();
    ArrayList<Card> dealerHand = new ArrayList<Card>();
    ArrayList<Card> playerBooks = new ArrayList<Card>();
    ArrayList<Card> dealerBooks = new ArrayList<Card>();
    HashMap<Rank , Integer> books = new HashMap();


    public boolean runGame(){
        boolean playing = true;

        ioGoFish.welcomeGoFish();
        playerHand = deal();
        dealerHand = deal();

        while (playing){

        }

        return false;
    }

    protected ArrayList<Card> deal(){
        ArrayList<Card> hand = new ArrayList<Card>();
        for (int i = 0; i < 7; i ++){
            hand.add(goFish.deck.drawCard());
        }
        return hand;
    }

    protected int numberOfBooks(ArrayList<Card> hand){

        int numberOfBooks = 0;

        for (Card card : hand){
            if (books.containsKey(card.getRank())){
                int last = books.get(card.getRank());
                books.replace(card.getRank(), last, last + 1);
            }
            else
                books.putIfAbsent(card.getRank(),1);
        }
        if (books.containsValue(4)){
            numberOfBooks++;
        }
        return numberOfBooks;
    }

    protected Rank findCardsWithBook(HashMap<Rank, Integer> map){
        Rank card = null;

        for (Map.Entry<Rank,Integer> e : map.entrySet()){
            if (e.getValue() == 4){
                card = e.getKey();
            }

        }
        return card;
    }

    protected int countNumberOfCardsRemainingInDeck(ArrayList<Card> deck){

        return deck.size();
    }

    protected boolean transferCard(ArrayList<Card> from, ArrayList<Card> to, Rank rank){
        boolean hasCard = true;
        for (Card card : from){
            if (card.getRank().equals(rank)){
                to.add(card);
                from.remove(card);
            }
            else {
                hasCard = false;
            }
        }
        return hasCard;
    }

}
