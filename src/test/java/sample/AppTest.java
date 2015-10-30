package sample;

import org.junit.Assert;
import org.junit.Test;

public class AppTest {

    @Test
    public void testLengthOfTheUniqueKey() {

        sample.App obj = new sample.App();
        Assert.assertEquals(36, obj.generateUniqueKey().length());

    }
}