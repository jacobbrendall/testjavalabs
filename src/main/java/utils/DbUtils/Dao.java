package utils.DbUtils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;
import java.lang.Class;

public class Dao {

    public static void main(String[] args) throws SQLException, ClassNotFoundException {


 /*     String dbUri = "jdbc:oracle:thin:@//florida.csr9s71rdbw2.us-east-1.rds.amazonaws.com:1521/FLORIDA";
        String userName = "florida";
        String password = "miamiflorida";
      */

        String userName = "gxl";
        String password = "Sb123456";
        String url = "jdbc:oracle:thin:@//experimentdbinstance.cn1e1hoy5jio.us-east-1.rds.amazonaws.com:1521/ORCL";

        String sqlCreateRecord = "INSERT INTO REPRESENTATIVES (REP_ID, STATE, DISTRICT, FIRST_NAME, LAST_NAME) " +
                "VALUES(3, 'MO', '3', 'ANN', 'WAGNER')";
        Properties connectionProps = new Properties();
        connectionProps.put("user", userName);
        connectionProps.put("password", password);

        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
        } catch (ClassNotFoundException ex) {
            System.out.println("Error: unable to load driver class!");
            System.exit(1);
        }

        Connection connection = DriverManager.getConnection(url, connectionProps);

        Statement statement = connection.createStatement();

        ResultSet resultSet = statement.executeQuery(sqlCreateRecord);





    }

}

