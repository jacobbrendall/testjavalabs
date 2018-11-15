package utils.DbUtils;
import java.io.*;
import java.util.*;

public class UsePropertiesFile {
    public static void main(String[] args) throws Exception {
        Properties prop = new Properties();

        prop.load(new FileInputStream("config.properties"));
        String dbUri = prop.getProperty("dbUri");
        String userName = prop.getProperty("userName");
        String password = prop.getProperty("password");


        }

    }

