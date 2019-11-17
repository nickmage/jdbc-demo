package database.com.kolia;

import database.com.kolia.sql.CreateTable;
import database.com.kolia.sql.Insert;
import database.com.kolia.sql.Select;
import database.com.kolia.sql.Update;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {
    public static String url = "jdbc:h2:~/test";
    public static String username = "sa";
    public static String password = "";

    public static void main(String[] args) throws ClassNotFoundException {
        //Class.forName("org.h2.Driver");

        //Driver driver = org.h2.Driver.load();
        try(Connection connection = DriverManager.getConnection(url, username, password)){
            System.out.println("123");
            new CreateTable().create(connection);
            new Insert().insert(connection);
            new Select().select(connection);
            new Update().update(connection);
            new Select().select(connection);
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

}
