package ries.dan.MiniCasino;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by danries on 1/28/17.
 */
public class IOTest {

    IO io = new IO();

    @Test
    public void pickAGameTEST(){
        int expected = 1;
        int actual = io.pickAGame();
        Assert.assertEquals("We expect to get the game back that was chosen", expected, actual);
    }



}
