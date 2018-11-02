package tests;


import org.junit.Test;
import utils.DbUtils.Dao;

import java.sql.SQLException;
import java.util.List;

// TODO updated
public class DbTest extends Dao {
    String queryRead;
    @Test

    public void myFirstTest() throws Exception{
        String queryDelete;
    }
    @Test
    public void testToReadFromSql() throws Exception{
        List<String> retrievedCities = getAllRecordsForColumn("CITY");
        System.out.println(retrievedCities.toString());
        }
    @Test
    public void myTest() throws SQLException {
        List<String> retrievedStates = getAllRecordsForColumn(
         "LASTNAME");
        System.out.println(retrievedStates.toString());
    }
}
