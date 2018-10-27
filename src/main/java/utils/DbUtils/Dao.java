package utils.DbUtils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class Dao {

    public ResultSet executeQuery(String dbUri, String userName, String password, String sqlQuery) {
        ResultSet resultSet = null;
        try {
            Statement statement = getDbConnection(dbUri, userName, password).prepareStatement(sqlQuery);
            resultSet = statement.executeQuery(sqlQuery);
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return resultSet;
    }

    private Connection getDbConnection(String dbUri, String userName, String password) throws ClassNotFoundException {
        Class.forName("oracle.jdbc.driver.OracleDriver");
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(dbUri, userName, password);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return conn;
    }

    public List<String> getAllRecordsForColumn(String uri, String user, String pwd, String query, String columnLabel) throws SQLException {
        List<String> listOfColumns = new ArrayList<>();
        ResultSet rs = executeQuery(uri, user, pwd, query);
        rs.next();
        do {
            listOfColumns.add(rs.getString(columnLabel));
            rs.next();
        } while (rs.next());
        return listOfColumns;
    }
}


