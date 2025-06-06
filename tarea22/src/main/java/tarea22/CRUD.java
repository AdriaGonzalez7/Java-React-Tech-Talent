package tarea22;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.sql.*;

public class CRUD extends JFrame {
    private JTable tablaClientes;
    private DefaultTableModel modelo;
    private JTextField txtNombre, txtApellido, txtDireccion, txtDni, txtFecha;
    private JButton btnAgregar, btnActualizar, btnEliminar, btnConsultar;

    public CRUD() {
        setTitle("Gestión de Clientes");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Panel de formulario
        JPanel panelFormulario = new JPanel(new GridLayout(6, 2));
        panelFormulario.add(new JLabel("Nombre:"));
        txtNombre = new JTextField();
        panelFormulario.add(txtNombre);
        
        panelFormulario.add(new JLabel("Apellido:"));
        txtApellido = new JTextField();
        panelFormulario.add(txtApellido);

        panelFormulario.add(new JLabel("Dirección:"));
        txtDireccion = new JTextField();
        panelFormulario.add(txtDireccion);
        
        panelFormulario.add(new JLabel("DNI:"));
        txtDni = new JTextField();
        panelFormulario.add(txtDni);
        
        panelFormulario.add(new JLabel("Fecha:"));
        txtFecha = new JTextField();
        panelFormulario.add(txtFecha);

        // Botones de CRUD
        btnAgregar = new JButton("Agregar");
        btnActualizar = new JButton("Actualizar");
        btnEliminar = new JButton("Eliminar");
        btnConsultar = new JButton("Consultar");

        panelFormulario.add(btnAgregar);
        panelFormulario.add(btnActualizar);
        panelFormulario.add(btnEliminar);
        panelFormulario.add(btnConsultar);

        add(panelFormulario, BorderLayout.NORTH);

        // Tabla para mostrar datos
        modelo = new DefaultTableModel();
        modelo.setColumnIdentifiers(new String[]{"ID", "Nombre", "Apellido", "Dirección", "DNI", "Fecha"});
        tablaClientes = new JTable(modelo);
        add(new JScrollPane(tablaClientes), BorderLayout.CENTER);

        // Eventos de los botones
        btnAgregar.addActionListener(this::agregarCliente);
        btnActualizar.addActionListener(this::actualizarCliente);
        btnEliminar.addActionListener(this::eliminarCliente);
        btnConsultar.addActionListener(this::listarClientes);
    }

    // Método para insertar cliente
    private void agregarCliente(ActionEvent e) {
        try (Connection conn = ConnexionBD.obtenerConexion();
             PreparedStatement stmt = conn.prepareStatement("INSERT INTO clientes (nombre, apellido, direccion, dni, fecha) VALUES (?, ?, ?, ?, ?)")) {
            stmt.setString(1, txtNombre.getText());
            stmt.setString(2, txtApellido.getText());
            stmt.setString(3, txtDireccion.getText());
            stmt.setInt(4, Integer.parseInt(txtDni.getText()));
            stmt.setString(5, txtFecha.getText());
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(this, "Cliente agregado correctamente.");
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    // Método para actualizar cliente
    private void actualizarCliente(ActionEvent e) {
        String id = JOptionPane.showInputDialog(this, "Ingrese ID del cliente a actualizar:");
        if (id != null) {
            try (Connection conn = ConnexionBD.obtenerConexion();
                 PreparedStatement stmt = conn.prepareStatement("UPDATE clientes SET nombre=?, apellido=?, direccion=?, dni=?, fecha=? WHERE id=?")) {
                stmt.setString(1, txtNombre.getText());
                stmt.setString(2, txtApellido.getText());
                stmt.setString(3, txtDireccion.getText());
                stmt.setInt(4, Integer.parseInt(txtDni.getText()));
                stmt.setString(5, txtFecha.getText());
                stmt.setInt(6, Integer.parseInt(id));
                stmt.executeUpdate();
                JOptionPane.showMessageDialog(this, "Cliente actualizado correctamente.");
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    }

    // Método para eliminar cliente
    private void eliminarCliente(ActionEvent e) {
        String id = JOptionPane.showInputDialog(this, "Ingrese ID del cliente a eliminar:");
        if (id != null) {
            try (Connection conn = ConnexionBD.obtenerConexion();
                 PreparedStatement stmt = conn.prepareStatement("DELETE FROM clientes WHERE id=?")) {
                stmt.setInt(1, Integer.parseInt(id));
                stmt.executeUpdate();
                JOptionPane.showMessageDialog(this, "Cliente eliminado correctamente.");
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    }

    // Método para consultar clientes
    private void listarClientes(ActionEvent e) {
        modelo.setRowCount(0); // Limpiar tabla antes de agregar nuevos datos
        try (Connection conn = ConnexionBD.obtenerConexion();
             PreparedStatement stmt = conn.prepareStatement("SELECT * FROM clientes");
             ResultSet rs = stmt.executeQuery()) {
            while (rs.next()) {
                modelo.addRow(new Object[]{rs.getInt("id"), rs.getString("nombre"), rs.getString("apellido"), rs.getString("direccion"), rs.getInt("dni"), rs.getString("fecha")});
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public static void main(String[] args) {
    	SwingUtilities.invokeLater(() -> new CRUD().setVisible(true));
    }
}

