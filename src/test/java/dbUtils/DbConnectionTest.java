package dbUtils;

import helper.QueryHandlingHelper;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DbConnectionTest {
    private QueryHandlingHelper helper = new QueryHandlingHelper();

    @Test
    public void getRep() {
        assertEquals("abcd", helper.findRepById("1").toString());
    }
}
