package helper;

import Utils.Database;
import dbdomain.Representatives;
import enums.Query;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class QueryHandlingHelper {

    private Database instance = Database.getInstance();
    private Connection connection = instance.getConnection();

    public Representatives findRepById(String repId) {
        Representatives representatives = new Representatives();

        try (PreparedStatement statement = connection.prepareStatement(Query.REPID.getQuery())){

            statement.setString(1, repId);
            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) {
                representatives.setFirstName(resultSet.getString("FIRST_NAME"));
            }

            statement.close();
            resultSet.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
     return representatives;
    }
}
