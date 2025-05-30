package tarea20;

import javax.swing.*;

public class Ejercicio1 extends JFrame {
    public Ejercicio1() {
    	
        // Configuración del JFrame
        setTitle("Ventana con controles básicos");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Salir de la aplicación al cerrar
        setResizable(true); // Permitir cambio de tamaño

        // Crear una etiqueta
        JLabel etiqueta = new JLabel("¡Bienvenido!", SwingConstants.CENTER);
        add(etiqueta); 

        setVisible(true);
    }

    public static void main(String[] args) {
        // Ejecutar la ventana en el hilo de eventos de Swing
        SwingUtilities.invokeLater(Ejercicio1::new);
    }
}

