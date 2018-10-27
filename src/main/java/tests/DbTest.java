package tests;


import org.testng.annotations.Test;
import utils.DbUtils.Dao;

import java.sql.SQLException;
import java.util.List;

// TODO updated
public class DbTest extends Dao {

    String dbUri = "jdbc:oracle:thin:@//florida.csr9s71rdbw2.us-east-1.rds.amazonaws.com:1521/FLORIDA";
    String userName = "florida";
    String password = "miamiflorida";

    // We need to make these variables final so they cannot be changed by someone else
    final String queryCreate = "INSERT INTO ADDRESS (ID, STREETNAME, CITY, ZIPCODE, STATE)" +
            "VALUES(7, '311 True St', 'Richmond', '54544', 'VA')";
    final String queryRead = "SELECT * FROM ADDRESS";
    final String queryUpdate = "UPDATE ADDRESS SET CITY = 'Miami', ZIPCODE='22222' WHERE ID='7'";
    final String queryDelete = "DELETE FROM ADDRESS WHERE ID=7";

    @Test
    public void myTest() throws SQLException {
        Dao dao = new Dao();
        List<String> retrievedStates = (List<String>) dao.getAllRecordsForColumn(dbUri, userName, password, queryRead,"ID");
        System.out.println(retrievedStates.toString());
    }
}
