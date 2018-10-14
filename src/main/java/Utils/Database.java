package Utils;

import javax.xml.crypto.Data;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Database {
    private static volatile Database instance = null;
    private static volatile Connection connection = null;

    private Database() {
        if(instance != null) {
            throw new RuntimeException("Use getInstance() method to create");
        }
    }

    public static Database getInstance() {
        if(instance == null) {
            synchronized (Database.class) {
                if (instance == null) {
                    instance = new Database();
                }
            }
        }
        return instance;
    }

    public Connection getConnection() {
        if(connection == null) {
            synchronized (Database.class) {
                if(connection == null) {
                    try {
                        String userId ="gxl";
                        String password = "Sb123456";
                        String dbUrl = "jdbc:oracle:thin:@//experimentdbinstance.cn1e1hoy5jio.us-east-1.rds.amazonaws.com:1521/ORCL";
                        connection = DriverManager.getConnection(dbUrl,userId,password);
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
        return connection;
    }



}
