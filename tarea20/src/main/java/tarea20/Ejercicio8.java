package tarea20;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ejercicio8 extends JFrame {
    private static final double TASA_CAMBIO = 166.386;
    private JTextField campoCantidad;
    private JLabel etiquetaResultado;

    public Ejercicio8() {
        // Configuración de la ventana
        setTitle("Conversor de Pesetas y Euros");
        setSize(350, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(3, 2));

        // Crear componentes
        JLabel etiquetaCantidad = new JLabel("Cantidad:");
        campoCantidad = new JTextField();
        JButton botonEurosAPts = new JButton("Euros a Pesetas");
        JButton botonPtsAEuros = new JButton("Pesetas a Euros");
        JButton botonBorrar = new JButton("Borrar");
        etiquetaResultado = new JLabel("Resultado: ");

        // Acciones
        botonEurosAPts.addActionListener(e -> convertirMoneda(true));

        botonPtsAEuros.addActionListener(e -> convertirMoneda(false));

        botonBorrar.addActionListener(e -> {
            campoCantidad.setText("");
            etiquetaResultado.setText("Resultado: ");
        });

        add(etiquetaCantidad);
        add(campoCantidad);
        add(botonEurosAPts);
        add(botonPtsAEuros);
        add(botonBorrar);
        add(etiquetaResultado);

        getRootPane().setDefaultButton(botonEurosAPts);

        setVisible(true);
    }
    	// función para convertir entre euros y pesetas
    private void convertirMoneda(boolean eurosAPts) {
        try {
            double cantidad = Double.parseDouble(campoCantidad.getText());
            double resultado;
            if (eurosAPts) {
                resultado = cantidad * TASA_CAMBIO;
            } else {
                resultado = cantidad / TASA_CAMBIO;
            }
            etiquetaResultado.setText("Resultado: " + String.format("%.2f", resultado));
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Por favor, introduce un número válido.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }


    public static void main(String[] args) {
        SwingUtilities.invokeLater(Ejercicio8::new);
    }
}
