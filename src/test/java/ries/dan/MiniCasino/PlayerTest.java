package ries.dan.MiniCasino;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by danries on 1/28/17.
 */
public class PlayerTest {


    Player player = new Player("Dan",1000000);


    @Test
    public void getAmountofMoneyTEST(){
        int expected = 1000000;
        int actual = player.getAmountOfMoney();
        Assert.assertEquals("We expect to get the amount of money the player has back",expected,actual);
    }

    @Test
    public void setAmountofMoneyTEST(){
        player.setAmountOfMoney(player.getAmountOfMoney() - 950000);
        int expected = 50000;
        int actual = player.getAmountOfMoney();
        Assert.assertEquals("We expect to be able to subtract the amount of money via Bets", expected, actual);
    }

    @Test
    public void getNameTEST(){
        String expected = "Dan";
        String actual = player.getName();
        Assert.assertEquals("We expect to get the players name for use in i/o", expected, actual);
    }

}
