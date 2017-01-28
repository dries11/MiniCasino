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

}
