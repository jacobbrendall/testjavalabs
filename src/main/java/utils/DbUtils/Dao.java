package utils.DbUtils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class Dao {

    String dbUri = "jdbc:oracle:thin:@//florida.csr9s71rdbw2.us-east-1.rds.amazonaws.com:1521/FLORIDA";
    String userName = "florida";
    String password = "miamiflorida";

    // We need to make these variables final so they cannot be changed by someone else
    final String queryCreate = "INSERT INTO ADDRESS (ID, STREETNAME, CITY, ZIPCODE, STATE)" +
            "VALUES(7, '311 True St', 'Richmond', '54544', 'VA')";
    final String queryRead = "SELECT * FROM ADDRESS ";
    final String queryUpdate = "UPDATE ADDRESS SET CITY = 'Miami', ZIPCODE='22222' WHERE ID='7'";
    final String queryDelete = "DELETE FROM ADDRESS WHERE ID=7";

    public ResultSet executeQuery(String dbUri, String userName, String password, String sqlQuery) {
        ResultSet resultSet = null;
        try {
            Statement statement = getDbConnection(dbUri, userName, password).prepareStatement(sqlQuery);
            resultSet = statement.executeQuery(sqlQuery);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return resultSet;
    }
    // TODO Consider modifiying access modifier here
    //TODO try to understand why we have extracted the getDbCOnnection method
    public Connection getDbConnection(String dbUri, String userName, String password) {
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(dbUri, userName, password);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return conn;
    }

    //TODO for collaborators
    // Add a method to get all records as a List for the given column
    // Hint: this method will return List<String>
    // ResultSet from an ORACLE database returns first line the name of the columns
    // so you need to perform a rs.next() before retrieveing column content.
    // In Test CLass print all records
    // You will use queryRead
    public List<String> getAllRecordsForColumn(String columnName) throws SQLException {
        List<String> listOfColumns = new ArrayList<String>();

       ResultSet rs = executeQuery(dbUri, userName, password, queryRead);

       while (rs.next()){
           listOfColumns.add(rs.getString(columnName));
       }
               return listOfColumns;
    }
}



