package connect_db;

import java.sql.Connection;
import java.sql.DriverManager;

public class connect_db {
    /**
     * Establishes a connection to a PostgreSQL database using the provided URL, username, and password.
     *
     * @return A Connection object representing the connection to the database, or null if connection fails.
     */
    public static Connection connection() {
        String URL = "jdbc:postgresql://localhost:5432/RDVmedical/";
        String USER = "postgres";
        String PASSWORD = "postgres";
        try {
            Class.forName("org.postgresql.Driver");
            Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
            return connection;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return null;
    }
}
