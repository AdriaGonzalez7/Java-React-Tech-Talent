package trabajo_grupal.util;

import javax.swing.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class LoginDAO {

	public static String[] mostrarLogin() {
	    String[] usuarios = new String[2];

	    for (int i = 0; i < 2; i++) {
	        boolean loginExitoso = false;
	        while (!loginExitoso) { // 🔹 Repetir hasta que el login sea correcto
	            JTextField usuarioField = new JTextField(10);
	            JPasswordField passwordField = new JPasswordField(10);

	            JPanel panel = new JPanel();
	            panel.add(new JLabel("Jugador " + (i + 1) + ":"));
	            panel.add(usuarioField);
	            panel.add(new JLabel("Contraseña:"));
	            panel.add(passwordField);

	            int resultado = JOptionPane.showConfirmDialog(null, panel, "Iniciar Sesión - Jugador " + (i + 1),
	                    JOptionPane.OK_CANCEL_OPTION);

	            if (resultado == JOptionPane.OK_OPTION) {
	                String username = usuarioField.getText();
	                String password = new String(passwordField.getPassword());

	                if (verificarUsuario(username, password)) {
	                    JOptionPane.showMessageDialog(null, "Acceso permitido. ¡Bienvenido, " + username + "!");
	                    usuarios[i] = username;
	                    loginExitoso = true; // 🔹 Login correcto, avanzamos al siguiente jugador
	                } else {
	                    JOptionPane.showMessageDialog(null, "Usuario o contraseña incorrectos. Inténtalo nuevamente.");
	                }
	            } else {
	                return null; // 🔹 Si el usuario cancela el login, cerrar sesión completamente
	            }
	        }
	    }

	    return usuarios;
	}



    public static boolean verificarUsuario(String username, String password) {
        String sql = "SELECT password FROM usuarios WHERE username = ?";
        try (Connection conn = connexionDB.conectar(); 
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, username);
            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    return rs.getString("password").equals(password);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    public static boolean registrarUsuario(String username, String password) {
        String sql = "INSERT INTO usuarios (username, password) VALUES (?, ?)";
        try (Connection conn = connexionDB.conectar(); 
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, username);
            stmt.setString(2, password);
            stmt.executeUpdate();
            return true;
        } catch (SQLException e) {
            System.err.println("Error al registrar usuario: " + e.getMessage());
        }
        return false;
    }
}
