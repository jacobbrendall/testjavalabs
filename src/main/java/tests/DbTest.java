package tests;


import org.junit.Test;
import utils.DbUtils.Dao;

import javax.xml.crypto.URIReferenceException;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;
import java.util.Properties;

// TODO updated
public class DbTest extends Dao {
    Properties prop = new Properties();

        prop.load(new FileInputStream("config.properties");
    String user = prop.getProperty("dbUri");
    String pass = prop.getProperty("userName");
    String port = prop.getProperty("password");

    final String queryCreate = "INSERT INTO ADDRESS (ID, STREETNAME, CITY, ZIPCODE, STATE)" +
            "VALUES(7, '311 True St', 'Richmond', '54544', 'VA')";
    final String queryRead = "SELECT * FROM ADDRESS ";
    final String queryUpdate = "UPDATE ADDRESS SET CITY = 'Miami', ZIPCODE='22222' WHERE ID='7'";
    final String queryDelete = "DELETE FROM ADDRESS WHERE ID=7";
    @Test
    public void myTest(URIReferenceException ex) throws SQLException {
        Dao dao = new Dao();
      //  List<String> retrievedStates = getAllRecordsForColumn(prop.getProperty.dbUri, userName, password, queryRead,"STATE" );

     //   System.out.println(retrievedStates.toString());
     //   catch (IOException ex) {
     //       ex.printStackTrace();
//        } finally {
//            if (input != null) {
//                try {
//                    input.close();
//                } catch (IOException e) {
//                    e.printStackTrace();
                }
    }

