package CRUD;

import Models.Tribble;
import Models.TribbleLabs;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import JDBC.connection;

public class Create {
    public static boolean createTribble(Tribble t){
        String SQL = "INSERT INTO tribble (tribble_id, name) VALUES ('" + t.id + "', '" + t.name + "');";

        try (Connection conn = connection.connect(); PreparedStatement pstmt = conn.prepareStatement(SQL)) {
            pstmt.execute();
            return true;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return false;
        }
    }

    public static boolean createLab(TribbleLabs l){
        String SQL = "INSERT INTO lab (lab_id, name) VALUES ('" + l.id + "', '" + l.name + "');";

        try (Connection conn = connection.connect(); PreparedStatement pstmt = conn.prepareStatement(SQL)) {
            pstmt.execute();
            return true;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return false;
        }
    }
}
