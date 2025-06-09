package trabajo_grupal.util;

import trabajo_grupal.util.connexionDB;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Login extends JFrame {
    private JTextField usernameField;
    private JPasswordField passwordField;
    private JButton loginButton, registerButton;

    public Login() {
        setTitle("🔥 Hundir la Flota - Login");
        setSize(400, 250);
        setLayout(new BorderLayout());

        JLabel titulo = new JLabel("¡Bienvenido a Hundir la Flota!", SwingConstants.CENTER);
        titulo.setFont(new Font("Arial", Font.BOLD, 20));
        titulo.setForeground(Color.BLUE);
        add(titulo, BorderLayout.NORTH);

        JPanel panelFormulario = new JPanel(new GridLayout(3, 2, 10, 10));
        panelFormulario.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        panelFormulario.add(new JLabel("Usuario:", SwingConstants.RIGHT));
        usernameField = new JTextField();
        panelFormulario.add(usernameField);

        panelFormulario.add(new JLabel("Contraseña:", SwingConstants.RIGHT));
        passwordField = new JPasswordField();
        panelFormulario.add(passwordField);

        loginButton = new JButton("✅ Iniciar Sesión");
        loginButton.setBackground(Color.GREEN);
        loginButton.addActionListener(this::login);
        panelFormulario.add(loginButton);

        registerButton = new JButton("📌 Registrarse");
        registerButton.setBackground(Color.ORANGE);
        registerButton.addActionListener(this::registrarUsuario);
        panelFormulario.add(registerButton);

        add(panelFormulario, BorderLayout.CENTER);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    private void login(ActionEvent e) {
        String username = usernameField.getText();
        String password = new String(passwordField.getPassword());

        try (Connection conn = connexionDB.conectar()) {
            PreparedStatement stmt = conn.prepareStatement("SELECT * FROM Usuarios WHERE username = ? AND password = ?");
            stmt.setString(1, username);
            stmt.setString(2, password);
            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                JOptionPane.showMessageDialog(this, "🎉 Bienvenido, " + username + "!");
                new Scoreboard(username); // Abrir clasificación
                dispose();
            } else {
                JOptionPane.showMessageDialog(this, "❌ Usuario o contraseña incorrectos.");
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    private void registrarUsuario(ActionEvent e) {
        String username = usernameField.getText();
        String password = new String(passwordField.getPassword());

        try (Connection conn = connexionDB.conectar()) {
            PreparedStatement stmt = conn.prepareStatement("INSERT INTO Usuarios (username, password) VALUES (?, ?)");
            stmt.setString(1, username);
            stmt.setString(2, password);

            if (stmt.executeUpdate() > 0) {
                JOptionPane.showMessageDialog(this, "✅ Registro exitoso. ¡Ahora puedes iniciar sesión!");
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new Login();
    }
}
