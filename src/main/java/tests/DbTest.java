package tests;


import org.testng.annotations.Test;
import utils.DbUtils.Dao;

import java.sql.SQLException;
import java.util.List;

public class DbTest extends Dao {

    //TODO move these DBconnection params to config.properties file
    String lastUri = "jdbc:oracle:thin:@//orcl.cn1e1hoy5jio.us-east-1.rds.amazonaws.com:1521/ORCL";
    String userNameGx = "gxl";
    String passwordGx = "Sb123456";
    final String sql = "SELECT * FROM PERSONS";

    @Test
    public void myTest() throws SQLException {
        Dao dao = new Dao();
        List<String> retrievedStates = dao.getAllRecordsForColumn(
                lastUri, userNameGx, passwordGx, sql, "LASTNAME");
        System.out.println(retrievedStates.toString());
    }
}
