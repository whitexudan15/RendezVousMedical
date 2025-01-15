package dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class Dao {
    private static Dao instance;
    private Connection connexion;
    private static String URL = "jdbc:postgresql://localhost:5432/RDVmedical/";
    private static String USER = "postgres";
    private static String PASSWORD = "postgres";
    
    
    private Dao() {
        try {
            Class.forName("org.postgresql.Driver");
            connexion = DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    public static Dao getInstance() {
        if (instance == null) {
            instance = new Dao();
        }
        return instance;
    }

    public Connection getConnexion() {
        return connexion;
    }
}
