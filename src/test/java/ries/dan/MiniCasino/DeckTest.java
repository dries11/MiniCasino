package ries.dan.MiniCasino;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

/**
 * Created by danries on 1/28/17.
 */
public class DeckTest {

    Deck deckTest = new Deck();
    ArrayList<Card> hand = new ArrayList<Card>();

    @Test
    public void deckInitializeTEST(){
        int expected = 52;
        int actual = deckTest.getDeck().size();
        Assert.assertEquals("We expect to get 52 for a full deck",expected,actual);
    }

    @Test
    public void drawCardTEST(){
        deckTest.getDeck().add(0,new Card(Rank.ACE,Suit.CLUB));
        String expected = "ACE of CLUB";
        String actual = deckTest.drawCard().displayCard();
        Assert.assertEquals("We expect to get the same card so that we know this is returning cards",expected,actual);
    }

    @Before public void initialize(){
        hand.add(new Card(Rank.SEVEN,Suit.CLUB));
        hand.add(new Card(Rank.EIGHT,Suit.CLUB));
        hand.add(new Card(Rank.NINE,Suit.HEART));
    }

    @Test
    public void displayHandTEST(){
        String expected = "|7 of CLUB||8 of CLUB||9 of HEART|";
        String actual = deckTest.displayHand(hand);
        Assert.assertEquals("We expect to get the total output of the hand so that the player can see the cards in hand", expected, actual);
    }

}
