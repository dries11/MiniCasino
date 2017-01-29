package ries.dan.MiniCasino;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by danries on 1/28/17.
 */
public class PlayerTest {


    Player player = new Player("Dan");


    @Test
    public void getNameTEST(){
        String expected = "Dan";
        String actual = player.getName();
        Assert.assertEquals("We expect to get the players name for use in i/o", expected, actual);
    }

}
