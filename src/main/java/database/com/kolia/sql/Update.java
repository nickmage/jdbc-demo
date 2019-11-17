package database.com.kolia.sql;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class Update {

    private final static String UPDATE = "UPDATE TEST SET name = 'PETER-2222' WHERE id = 1";

    public void update(Connection connection) throws SQLException {
        Statement statement = connection.createStatement();

        statement.execute(UPDATE);
    }
}
