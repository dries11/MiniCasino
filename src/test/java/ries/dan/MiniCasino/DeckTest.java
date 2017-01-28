package ries.dan.MiniCasino;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

/**
 * Created by danries on 1/28/17.
 */
public class DeckTest {

   Deck deckTest = new Deck();


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

}
