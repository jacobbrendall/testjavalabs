package tests;


import org.testng.annotations.Test;
import utils.DbUtils.Dao;

import java.sql.SQLException;

// TODO updated
public class DbTest extends Dao {
    @Test
    public void myTest() throws SQLException {
        Dao dao = new Dao();
        executeQuery();
        System.out.println(queryCreate);
    }
}
