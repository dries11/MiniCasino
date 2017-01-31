package ries.dan.MiniCasino;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by danries on 1/28/17.
 */
public class GoFishTest {

    GoFish goFish = new GoFish();
    ArrayList<Card> hand = new ArrayList<Card>();
    ArrayList<Card> dealer = new ArrayList<Card>();
    Deck deck = new Deck();
    Card card;
    HashMap<Rank , Integer> books = new HashMap();


    @Test
    public void dealTest(){
        hand = goFish.deal();
        int expected = 7;
        int actual = hand.size();
        Assert.assertEquals("We expect to get the first deal size of 7 per rules of gofish",expected,actual);
    }

    @Before public void initialize(){
        hand.add(new Card(Rank.EIGHT,Suit.DIAMOND));
        hand.add(new Card(Rank.EIGHT,Suit.HEART));
        hand.add(new Card(Rank.EIGHT,Suit.CLUB));
        hand.add(new Card(Rank.EIGHT,Suit.SPADE));
        hand.add(new Card(Rank.TEN, Suit.SPADE));
        hand.add(new Card(Rank.NINE,Suit.HEART));
    }

    @Test
    public void countNumberOfCardsRemainingInDeckTEST(){
        int expected = 52;
        int actual = goFish.countNumberOfCardsRemainingInDeck(deck.getDeck());
    }



    @Test
    public void numberOfBooksTEST(){
        int expected = 1;
        int actual = goFish.numberOfBooks(hand);
        Assert.assertEquals("We should get back the number of books of which was initialized to 1",expected,actual);
    }

    @Before public void createHashMap(){
        books.put(Rank.EIGHT,4);
        books.put(Rank.ACE,3);
    }

    @Test
    public void findCardsWithBookTEST(){
        Rank expected = Rank.EIGHT;
        Rank actual = goFish.findCardsWithBook(books);
        Assert.assertEquals("We expect to get the card that we have a book of",expected,actual);
    }

    @Test
    public void runGameTest(){
        boolean expected = false;
        boolean actual = goFish.runGame();
        Assert.assertEquals("We expect to get that the game is running",expected,actual);
    }

    @Before public void addToDealerHand(){
        dealer.add(new Card(Rank.FIVE,Suit.HEART));
    }

    @Test
    public void transferCardTEST(){
        boolean expected = true;
        boolean actual = goFish.transferCard(hand,dealer,Rank.EIGHT);
        Assert.assertEquals("We expect the card to transfer hands over from hand to dealer hand",expected,actual);
    }
}
