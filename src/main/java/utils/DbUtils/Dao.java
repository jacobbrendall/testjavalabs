package utils.DbUtils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;
import java.lang.Class;

public class Dao {

    public static void main(String[] args) throws SQLException {
        String dbUri = "jdbc:oracle:thin:@//florida.csr9s71rdbw2.us-east-1.rds.amazonaws.com:1521/FLORIDA";
        String userName = "florida";
        String password = "miamiflorida";

        final String queryCreate = "INSERT INTO ADDRESS (ID, STREETNAME, CITY, ZIPCODE, STATE)" +
                "VALUES(7, '311 True St', 'Richmond', '54544', 'VA')";
        final String queryRead = "SELECT * FROM ADDRESS WHERE ZIPCODE=54544";
        final String queryUpdate = "UPDATE ADDRESS SET CITY = 'Miami', ZIPCODE='22222' WHERE ID='7'";
        final String queryDelete = "DELETE FROM ADDRESS WHERE ID=7";

        Connection conn = null;
        Statement statement = null;
        ResultSet rs = null;

        try {
            conn = DriverManager.getConnection(dbUri, userName, password);
            statement = conn.prepareStatement(queryCreate);

            conn.prepareStatement(queryRead);
            rs = statement.executeQuery(queryRead);

            // except this one read. Because when you read you get something back and  need to get that info
            // call this method in DbTest
            // and do some exception handling
        } finally {
            if (conn != null) {
                conn.close();
            }
            if (statement != null) {
                statement.close();
            }
        }

    }

}




