package ries.dan.MiniCasino;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by danries on 1/28/17.
 */
public class CardTest {


    Rank rank = Rank.TWO;
    Suit suit = Suit.CLUB;
    Card card = new Card(rank, suit);

    @Test
    public void getRankTEST(){
        Rank expected = Rank.TWO;
        Rank actual = card.getRank();
        Assert.assertEquals("We expect to get the same rank as the card",expected,actual);
    }

    @Test
    public void getSuitTEST(){
        Suit expected = Suit.CLUB;
        Suit actual = card.getSuit();
        Assert.assertEquals("We expect to get the same suit as the card",expected,actual);
    }

}
