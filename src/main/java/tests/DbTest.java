package tests;


import org.junit.Test;
import utils.DbUtils.Dao;

import java.sql.SQLException;
import java.util.List;

// TODO updated
public class DbTest extends Dao {

    @Test
    public void myTest() throws SQLException {

        List<String> retrievedStates = getAllRecordsForColumn(
         "LASTNAME");
        System.out.println(retrievedStates.toString());
    }
}
