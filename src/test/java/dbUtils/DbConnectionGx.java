package dbUtils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;
import java.lang.Class;

public class DbConnectionGx {

    public static void main(String[] args) throws SQLException, ClassNotFoundException {

        String hostName = "pos-experiment.cn1e1hoy5jio.us-east-1.rds.amazonaws.com";
        int port = 1521;
        String dbName = "POS";
        String userName = "gxl";
        String password = "Sb123456";


String url =  "jdbc:oracle:thin:@//experimentdbinstance.cn1e1hoy5jio.us-east-1.rds.amazonaws.com:1521/ORCL";
        String sqlCreateTable = "create table REPRESENTATIVES"
                + "    (REP_ID integer NOT NULL,"
                + "    STATE varchar(40) NOT NULL,"
                + "    DISTRICT integer NOT NULL,"
                + "    FIRST_NAME varchar(40) NOT NULL,"
                + "    LAST_NAME varchar(40) NOT NULL,"
                + "    PARTY char(20),"
                + "    PHONE char(20),"
                + "    EMAIL char(20),"
                + "    COMMITTEE_ASSIGN char(20),"
                + "    PRIMARY KEY (REP_ID))";
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

