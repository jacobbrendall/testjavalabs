package utils.DbUtils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class Dao {

    private ResultSet executeQuery(String dbUri, String userName, String password, String sqlQuery) {
        ResultSet resultSet = null;
        try {
            Statement statement = getDbConnection(dbUri, userName, password).prepareStatement(sqlQuery);
            resultSet = statement.executeQuery(sqlQuery);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return resultSet;
    }
    private Connection getDbConnection(String dbUri, String userName, String password) throws SQLException {
        Connection conn = null;
        //try {
            conn = DriverManager.getConnection(dbUri, userName, password);
       // } catch (SQLException e) {
         //   e.printStackTrace();
       // }
        return conn;
    }
    public List<String> getAllRecordsForColumn(String dbUri, String userName, String password, String queryRead, String columnName) throws SQLException {
        List<String> listOfColumns = new ArrayList<String>();

       ResultSet rs = executeQuery(dbUri, userName, password, queryRead);

       while (rs.next()){
           listOfColumns.add(rs.getString(columnName));
       }
               return listOfColumns;
    }
}



