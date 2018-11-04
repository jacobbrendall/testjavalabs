package tests;


import org.junit.BeforeClass;
import org.junit.Test;
import utils.DbUtils.Dao;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;
import java.util.Properties;

// TODO updated
public class DbTest extends Dao {
    String queryRead;
    static String dbUri;
    static String userName;
    static String password;
    static Properties prop = new Properties();

    @BeforeClass
    public static void init() throws IOException {
        prop.load(new FileInputStream("config.properties"));
        dbUri = prop.getProperty("dbUri");
        userName = prop.getProperty("userName");
        password = prop.getProperty("password");
    }
    @Test
    public void testToReadFromSql() throws Exception {
        List<String> retrievedCities = getAllRecordsForColumn(dbUri, userName, password, queryRead, "STATE");
            System.out.println(retrievedCities.toString());
        }

    @Test
    public void myTest () throws SQLException {
        List<String> retrievedStates = getAllRecordsForColumn(dbUri, userName, password, queryRead, "STATE");
            System.out.println(retrievedStates.toString());
            }
        }
