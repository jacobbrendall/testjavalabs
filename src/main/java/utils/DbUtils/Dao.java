package utils.DbUtils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;
import java.lang.Class;

public class Dao {
        //TODO
        //CREATE A Branch

        String dbUri = "jdbc:oracle:thin:@//florida.csr9s71rdbw2.us-east-1.rds.amazonaws.com:1521/FLORIDA";
        String userName = "florida";
        String password = "miamiflorida";

        // We need to make these variables final so they cannot be changed by someone else
        final String queryCreate = "INSERT INTO ADDRESS (ID, STREETNAME, CITY, ZIPCODE, STATE)" +
                "VALUES(7, '311 True St', 'Richmond', '54544', 'VA')";
        final String queryRead = "SELECT * FROM ADDRESS WHERE ZIPCODE=54544";
        final String queryUpdate = "UPDATE ADDRESS SET CITY = 'Miami', ZIPCODE='22222' WHERE ID='7'";
        final String queryDelete = "DELETE FROM ADDRESS WHERE ID=7";

        // let us extract this and make a method
        Connection conn = DriverManager.getConnection(dbUri, userName, password);
        Statement statement = conn.prepareStatement(queryCreate);

        statement.executeQuery(queryCreate);
        statement.executeQuery(queryUpdate);
        statement.executeQuery(queryDelete);

        // do not leave blanks between lines
        // as you will see these are all executequery methods
        // you can extract  an execute sql query methods
        Statement statement = conn.prepareStatement(queryRead);
        ResultSet rs = statement.executeQuery(queryRead);
        // except this one read. Because when you read you get something back and  need to get that info
        // call this method in DbTest
        // and do some exception handling


}


