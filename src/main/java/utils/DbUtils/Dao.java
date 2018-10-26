package utils.DbUtils;

import java.sql.*;

public class Dao<userName, dbUri, password, conn> {
        String dbUri = "jdbc:oracle:thin:@//florida.csr9s71rdbw2.us-east-1.rds.amazonaws.com:1521/FLORIDA";
        String userName = "florida";
        String password = "miamiflorida";

        protected final String queryCreate = "INSERT INTO ADDRESS (ID, STREETNAME, CITY, ZIPCODE, STATE)" +
                "VALUES(8, '311 False St', 'Austinos', '33333', 'TX')";
        protected final String queryRead = "SELECT * FROM ADDRESS WHERE ZIPCODE=54544";
        final String queryUpdate = "UPDATE ADDRESS SET CITY = 'Miami', ZIPCODE='22222' WHERE ID='7'";
        final String queryDelete = "DELETE FROM ADDRESS WHERE ID=7";

        Connection conn = null;
        Statement statement = null;
        ResultSet rs = null;

    public Dao() throws SQLException {
    }

    protected void executeQuery() throws SQLException {

            statement = conn.prepareStatement(queryCreate);
            rs = statement.executeQuery(queryCreate);

            statement = conn.prepareStatement(queryRead);
            statement.executeQuery(queryRead);

            statement = conn.prepareStatement(queryUpdate);
            statement.executeQuery(queryUpdate);

            statement = conn.prepareStatement(queryDelete);
            statement.executeQuery(queryDelete);
               }

           public Connection DbConnection() throws SQLException {

            if (isConnected()) {
                return Connection.get(database);
            } else{
                try {
                    conn = DriverManager.getConnection(dbUri, userName, password);


    private void isConnected() {
    }