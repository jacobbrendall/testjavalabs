package tests;


import org.junit.Test;
import utils.DbUtils.Dao;

import java.sql.SQLException;
import java.util.List;

public class DbTest extends Dao {
    String queryRead;
    @Test


  
    @Test
    public void testToReadFromSql() throws Exception{
        List<String> retrievedCities = getAllRecordsForColumn("CITY");
        System.out.println(retrievedCities.toString());
        }

    //TODO move these DBconnection params to config.properties file
    String lastUri = "jdbc:oracle:thin:@//orcl.cn1e1hoy5jio.us-east-1.rds.amazonaws.com:1521/ORCL";
    String userNameGx = "gxl";
    String passwordGx = "Sb123456";
    final String sql = "SELECT * FROM PERSONS";


    @Test
    public void myTest() throws SQLException {
        List<String> retrievedStates = getAllRecordsForColumn(
         "LASTNAME");
        System.out.println(retrievedStates.toString());
    }
}
