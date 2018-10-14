package tests;

import helper.QueryHandlingHelper;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

// TODO updated
public class DbTest {
    private QueryHandlingHelper helper = new QueryHandlingHelper();

    @Test
    public void getRep() {
        Assert.assertEquals("abcd", helper.findRepById("1").getFirstName());
    }
}
