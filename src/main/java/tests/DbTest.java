package tests;


import org.testng.annotations.Test;
import utils.DbUtils.Dao;

import java.sql.SQLException;

// TODO updated
public class DbTest extends Dao {

    @Test
    public void myTest() throws SQLException {
        executeQuery();
        System.out.println(queryCreate);
    }
}
