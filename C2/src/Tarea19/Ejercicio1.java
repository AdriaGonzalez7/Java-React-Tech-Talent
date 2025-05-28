package Tarea19;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ejercicio1 {
    public static void main(String[] args) {
    	
        JFrame frame = new JFrame("Saludador Personalizable");
        frame.setSize(300, 150);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());

        JTextField campoTexto = new JTextField(15);

        JButton botonSaludar = new JButton("Saludar");

        botonSaludar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nombre = campoTexto.getText();
                JOptionPane.showMessageDialog(frame, "¡Hola " + nombre + "!");
            }
        });

        frame.add(new JLabel("Escribe tu nombre:"));
        frame.add(campoTexto);
        frame.add(botonSaludar);

        frame.setVisible(true);
    }
}

