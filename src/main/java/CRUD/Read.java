package CRUD;

import JDBC.connection;
import Models.Tribble;
import Models.TribbleLabs;
import Models.TribblesInLabs;

import java.sql.*;
import java.util.ArrayList;

public class Read {
    public static Tribble getTribble(String tribleName) {
        String SQL = "SELECT * " +
                "FROM tribble " +
                "WHERE name = '" + tribleName +"';";

        try (Connection conn = connection.connect(); Statement stmnt = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE)) {
            Tribble t = new Tribble();
            ResultSet rs = stmnt.executeQuery(SQL);
            rs.first();
            t.setId(rs.getInt(1));
            t.setName(rs.getString(2));

            return t;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    public static Tribble getTribbleById(int id) {
        String SQL = "SELECT * " +
                "FROM tribble " +
                "WHERE tribble_id = '" + id +"';";

        try (Connection conn = connection.connect(); Statement stmnt = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE)) {
            Tribble t = new Tribble();
            ResultSet rs = stmnt.executeQuery(SQL);
            rs.first();
            t.setId(rs.getInt(1));
            t.setName(rs.getString(2));

            return t;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    public static TribbleLabs getLab(String labName) {
        String SQL = "SELECT * " +
                "FROM lab " +
                "WHERE name = '" + labName +"';";

        try (Connection conn = connection.connect(); Statement stmnt = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE)) {
            TribbleLabs l = new TribbleLabs();
            ResultSet rs = stmnt.executeQuery(SQL);
            rs.first();
            l.setId(rs.getInt(1));
            l.setName(rs.getString(2));

            return l;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    public static TribbleLabs getLabById(int id) {
        String SQL = "SELECT * " +
                "FROM lab " +
                "WHERE lab_id = '" + id +"';";

        try (Connection conn = connection.connect(); Statement stmnt = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE)) {
            TribbleLabs l = new TribbleLabs();
            ResultSet rs = stmnt.executeQuery(SQL);
            rs.first();
            l.setId(rs.getInt(1));
            l.setName(rs.getString(2));

            return l;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    public static TribblesInLabs getAllTribblesWithinALab(TribbleLabs l) {
        String SQL = "SELECT * " +
                "FROM labs_tribbles " +
                "WHERE lab_id = '" + l.id +"';";

            try (Connection conn = connection.connect(); Statement stmnt = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE)) {
                ArrayList<Tribble> tl = new ArrayList<>();
                ArrayList<TribbleLabs> ll = new ArrayList<>();

                ResultSet rs = stmnt.executeQuery(SQL);
                rs.first();
                while (rs.next()) {
                    ll.add(getLabById(rs.getInt(1)));
                    tl.add(getTribbleById(rs.getInt(2)));
                }

                return new TribblesInLabs(tl, ll);
            } catch (SQLException e) {
                System.out.println(e.getMessage());
                return null;
            }
    }
}
