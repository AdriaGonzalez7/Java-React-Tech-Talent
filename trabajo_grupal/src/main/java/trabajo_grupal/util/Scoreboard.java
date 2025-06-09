package trabajo_grupal.util;

import trabajo_grupal.util.connexionDB;


import javax.swing.*;
import java.awt.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Vector;

public class Scoreboard extends JFrame {
    private JTable tabla;
    private String username;

    public Scoreboard(String username) {
        this.username = username;

        setTitle("🏆 Clasificación - Hundir la Flota");
        setSize(400, 300);
        setLayout(new BorderLayout());

        JLabel titulo = new JLabel("🎯 Clasificación de jugadores", SwingConstants.CENTER);
        titulo.setFont(new Font("Arial", Font.BOLD, 18));
        add(titulo, BorderLayout.NORTH);

        tabla = new JTable(obtenerDatos(), crearColumnas());
        tabla.setRowHeight(25);
        tabla.setFont(new Font("Arial", Font.PLAIN, 14));
        JScrollPane scroll = new JScrollPane(tabla);
        add(scroll, BorderLayout.CENTER);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    private Vector<Vector<String>> obtenerDatos() {
        Vector<Vector<String>> data = new Vector<>();
        try (Connection conn = connexionDB.conectar()) {  // Cambio de connexionDB a Database
            PreparedStatement stmt = conn.prepareStatement("SELECT username, victorias FROM Scoreboard ORDER BY victorias DESC");
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                Vector<String> row = new Vector<>();
                row.add(rs.getString("username"));  // Agregar jugador
                row.add(String.valueOf(rs.getInt("victorias")));  // Agregar victorias
                data.add(row);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return data;
    }

    private Vector<String> crearColumnas() {
        Vector<String> columnas = new Vector<>();
        columnas.add("Jugador");
        columnas.add("Victorias");
        return columnas;
    }

    public static void actualizarVictorias(String username) {
        try (Connection conn = connexionDB.conectar()) {
            PreparedStatement stmt = conn.prepareStatement("UPDATE Scoreboard SET victorias = victorias + 1 WHERE username = ?");
            stmt.setString(1, username);
            stmt.executeUpdate();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

}

