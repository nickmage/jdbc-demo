package database.com.kolia.sql;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class Insert {

    public static final String insertPeter = "INSERT INTO TEST VALUES(1, 'PETER');";
    public static final String insertMary = "INSERT INTO TEST VALUES(2, 'Mary');";
    public static final String insertSomeone = "INSERT INTO TEST VALUES(?, ?);";

    public void insert(Connection connection) throws SQLException {
        Statement statement = connection.createStatement();
        statement.execute(insertPeter);
        statement.execute(insertMary);
        PreparedStatement preparedStatement = connection.prepareStatement(insertSomeone);
        for (int i = 700; i < 702; i++) {
            preparedStatement.setInt(1,i);
            preparedStatement.setString(2, "Someone - " + i);
            preparedStatement.execute();
        }
    }
}
