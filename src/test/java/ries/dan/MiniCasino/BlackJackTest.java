package ries.dan.MiniCasino;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

/**
 * Created by danries on 1/28/17.
 */
public class BlackJackTest {

    BlackJack bj = new BlackJack();
    IO inpurt = new IO();

    ArrayList<Card> playerHand = new ArrayList<Card>();
    ArrayList<Card> dealerHand = new ArrayList<Card>();

    @Test
    public void dealTEST(){
        playerHand = bj.deal();
        int expected = 2;
        int actual = playerHand.size();
        Assert.assertEquals("We expect to get a size of 2 cards for start of blackjack ",expected,actual);
    }

    @Before public void addCards(){
        playerHand.add(0,new Card(Rank.KING,Suit.CLUB));
        playerHand.add(1,new Card(Rank.ACE,Suit.CLUB));
        playerHand.add(2,new Card(Rank.QUEEN, Suit.HEART));
    }

    @Test
    public void calculateCardAmountTEST(){
        int expected = 21;
        int actual = bj.calculateCardAmount(playerHand);
        Assert.assertEquals("We expect to get the total of the cards in hand", expected,actual);
    }

    @Test
    public void didWinTest(){
        boolean expected = true;
        boolean actual = bj.didWin(playerHand);
        Assert.assertEquals("We expect to get a yes for win as we set the card total to 21", expected,actual);
    }

    @Test
    public void didBreakTest(){
        boolean expected = false;
        boolean actual = bj.didBreak(playerHand);
        Assert.assertEquals("We expect to get a false because it didnt go over", expected, actual);
    }

    @Before public void addDealer(){
        dealerHand = bj.deal();
    }

    @Test
    public void checkHandsTest(){
        String expected = "Player Wins";
        String actual = bj.checkHands(dealerHand,playerHand);
        Assert.assertEquals("We expect to get player wins based off of preset cards in test", expected, actual);
    }

}
