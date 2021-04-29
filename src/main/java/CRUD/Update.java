package CRUD;

import JDBC.connection;
import Models.Tribble;
import Models.TribbleLabs;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Update {
    public static boolean addTribbleToLab(Tribble t, TribbleLabs l){
        String SQL = "INSERT INTO labs_tribbles (lab_id, tribble_id) VALUES ('" + l.id + "', '" + t.id + "');";

        try (Connection conn = connection.connect(); PreparedStatement pstmt = conn.prepareStatement(SQL)) {
            pstmt.execute();
            return true;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return false;
        }
    }

    public static boolean removeTribbleFromLab(Tribble t){
        String SQL = "DELETE FROM labs_tribbles ";
        SQL += "WHERE tribble_id = '" + t.id + "';";

        try (Connection conn = connection.connect(); PreparedStatement pstmt = conn.prepareStatement(SQL)) {
            pstmt.execute();
            return true;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return false;
        }
    }

    public static boolean removeAllTribblesFromLab(TribbleLabs l){
        String SQL = "DELETE FROM labs_tribbles ";
        SQL += "WHERE lab_id = '" + l.id + "';";

        try (Connection conn = connection.connect(); PreparedStatement pstmt = conn.prepareStatement(SQL)) {
            pstmt.execute();
            return true;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return false;
        }
    }

    public static boolean changeTribbleName(Tribble t){
        String SQL = "UPDATE tribble ";
        SQL += "SET name = '" + t.name + "' ";
        SQL += "WHERE tribble_id = '" + t.id + "';";

        try (Connection conn = connection.connect(); PreparedStatement pstmt = conn.prepareStatement(SQL)) {
            pstmt.execute();
            return true;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return false;
        }
    }

    public static boolean changeLabName(TribbleLabs l){
        String SQL = "UPDATE lab ";
        SQL += "SET name = '" + l.name + "' ";
        SQL += "WHERE lab_id = '" + l.id + "';";

        try (Connection conn = connection.connect(); PreparedStatement pstmt = conn.prepareStatement(SQL)) {
            pstmt.execute();
            return true;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return false;
        }
    }
}
