package trabajo_grupal.util;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JugadoresDAO {

    public static void insertarJugador(String nombre) {
        String sql = "INSERT INTO usuarios (username, victorias) VALUES (?, 0) "
                   + "ON DUPLICATE KEY UPDATE victorias = victorias";
        try (Connection conn = connexionDB.conectar(); 
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, nombre);
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void actualizarVictorias(String nombre) {
        String sql = "UPDATE usuarios SET victorias = victorias + 1 WHERE username = ?";
        try (Connection conn = connexionDB.conectar(); 
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, nombre);
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void mostrarJugadores() {
        String sql = "SELECT * FROM usuarios";
        try (Connection conn = connexionDB.conectar();
             PreparedStatement stmt = conn.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {
            while (rs.next()) {
                System.out.println("ID: " + rs.getInt("id") + ", Usuario: " + rs.getString("username") 
                                   + ", Victorias: " + rs.getInt("victorias"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
