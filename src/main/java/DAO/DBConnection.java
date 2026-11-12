package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Locale;

public class DBConnection {

    public static final String URL =
            "jdbc:mysql://localhost:3306/bookshelfmanager";

    private static final String USER = "root";
    private static final String PASSWORD = "Nightmare@1";

    public static Connection getConnection() {

        try {

            Class.forName("com.mysql.cj.jdbc.Driver");

            return DriverManager.getConnection(
                    URL,
                    USER,
                    PASSWORD
            );
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
