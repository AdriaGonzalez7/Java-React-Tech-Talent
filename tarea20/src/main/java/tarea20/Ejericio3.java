package tarea20;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ejericio3 extends JFrame {
    private int contadorBoton1 = 0;
    private int contadorBoton2 = 0;
    private JLabel etiquetaBoton1;
    private JLabel etiquetaBoton2;

    public Ejericio3() {
        // Configuración de la ventana
        setTitle("Contador de Clics");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(3, 2)); // Organiza los elementos en filas y columnas

        // Crear etiquetas
        etiquetaBoton1 = new JLabel("Botón 1: 0 veces");
        etiquetaBoton2 = new JLabel("Botón 2: 0 veces");

        // Crear botones
        JButton boton1 = new JButton("Botón 1");
        JButton boton2 = new JButton("Botón 2");

        // Añadir funcionalidad a los botones
        boton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                contadorBoton1++;
                etiquetaBoton1.setText("Botón 1: " + contadorBoton1 + " veces");
            }
        });

        boton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                contadorBoton2++;
                etiquetaBoton2.setText("Botón 2: " + contadorBoton2 + " veces");
            }
        });

        // Agregar componentes a la ventana
        add(etiquetaBoton1);
        add(etiquetaBoton2);
        add(boton1);
        add(boton2);

        // Hacer visible la ventana
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(Ejericio3::new);
    }
}
