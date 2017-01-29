package ries.dan.MiniCasino;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by danries on 1/28/17.
 */
public class SuitTest {

    Suit suit = Suit.DIAMOND;

    @Test
    public void getValueTest(){
        String expected = "DIAMOND";
        String actual = suit.getValue();
        Assert.assertEquals("We expect to get back the value of this suit",expected,actual);
    }
}
