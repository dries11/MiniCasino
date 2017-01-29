package ries.dan.MiniCasino;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

/**
 * Created by danries on 1/28/17.
 */
public class GoFishTest {

    GoFish goFish = new GoFish();
    ArrayList<Card> hand = new ArrayList<Card>();

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
    public void checkForBookTest(){
        boolean expected = true;
        boolean actual = goFish.checkForBook(hand);
        Assert.assertEquals("We expect to get true because four of the same kind were initialized", expected,actual);
    }


}
