package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class connection {
    private static String url = "jdbc:postgresql://localhost:5432/postgres";

    public static Connection connect(){
        java.sql.Connection conn = null;
        try{
            conn = DriverManager.getConnection(url);
            System.out.println("Connected to the PostgreSQL server successfully.");
        }catch (SQLException e){
            System.out.println(e.getMessage());
        }

        return conn;
    }
}
