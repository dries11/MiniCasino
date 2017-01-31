package ries.dan.MiniCasino;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by danries on 1/30/17.
 */
public class ChoicesTest {

    Choices choice = new Choices();

    @Test
    public void gameChoiceTEST(){
        boolean expected = false;
        boolean actual = choice.gameChoice(3);
        Assert.assertEquals("We expect to get false because choice three is exit the casino",expected,actual);
    }

}
