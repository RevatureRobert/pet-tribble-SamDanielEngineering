package CRUD;

import JDBC.connection;
import Models.Tribble;
import Models.TribbleLabs;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Delete {
    public static boolean deleteTribble(Tribble t){
        String SQL = "DELETE FROM tribble ";
        SQL += "WHERE tribble_id = '" + t.id + "';";


        try (Connection conn = connection.connect(); PreparedStatement pstmt = conn.prepareStatement(SQL)) {
            pstmt.executeUpdate();
            return true;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return false;
        }
    }

    public static boolean deleteLab(TribbleLabs l){
        String SQL = "DELETE FROM lab ";
        SQL += "WHERE lab__id = '" + l.id + "';";


        try (Connection conn = connection.connect(); PreparedStatement pstmt = conn.prepareStatement(SQL)) {
            pstmt.executeUpdate();
            return true;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return false;
        }
    }
}
