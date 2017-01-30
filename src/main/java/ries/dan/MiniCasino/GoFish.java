package ries.dan.MiniCasino;

import java.util.ArrayList;

/**
 * Created by danries on 1/27/17.
 */
public class GoFish extends Games {

    private Games goFish = new Games();

    ArrayList<Card> playerHand = new ArrayList<Card>();
    ArrayList<Card> dealerHand = new ArrayList<Card>();
    ArrayList<Card> playerBooks = new ArrayList<Card>();
    ArrayList<Card> dealerBooks = new ArrayList<Card>();

    public boolean runGame(){
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

    protected ArrayList hasBook(ArrayList<Card> hand){

        ArrayList<Card> tempBook = new ArrayList<Card>();
        ArrayList<Card> cardsBooked = new ArrayList<Card>();
        int size = hand.size();

        for (Card card : hand){
            Card cardBeingSearched = card;
            int cardCount = 1;
            tempBook.add(cardBeingSearched);

            for (int i = 1; i < size;){

                if (card.getRank().equals(hand.get(i).getRank())){

                    ++cardCount;
                    --size;

                    tempBook.add(hand.get(i));
                    hand.remove(i);
                    i = 1;

                }
                else
                    i++;
            }
            if (cardCount == 4){
                cardsBooked.add(tempBook.get(0));
                tempBook.clear();
                hand.remove(hand.indexOf(card));
            }

        }

        return cardsBooked;
    }

    protected int changedBooksSize(ArrayList<Card> book, int lastSize){
        int newSize = lastSize;
        if(book.size() > lastSize){
            newSize = book.size();
        }
        return newSize;
    }

    protected void sortCardsInOrder(ArrayList<Card> hand){

    }

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
