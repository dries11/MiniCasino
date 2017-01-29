package ries.dan.MiniCasino;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by danries on 1/28/17.
 */
public class RankTest {

    Rank rank = Rank.TWO;

    @Test
    public void getValueTest(){
        String expected = "2";
        String actual = rank.getValue();
        Assert.assertEquals("We expect to get back the rank of the card",expected,actual);
    }
}
