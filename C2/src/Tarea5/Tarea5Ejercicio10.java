package Tarea5;

import java.util.Scanner;

public class Tarea5Ejercicio10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Un solo Scanner

        System.out.println("Número de ventas: ");
        int numVentas = Integer.parseInt(sc.nextLine());

        String[] ventas = new String[numVentas]; // Array para almacenar las ventas

        System.out.println("Introduce las " + numVentas + " ventas:");
        for (int i = 0; i < numVentas; i++) {
            System.out.print("Venta " + (i + 1) + ": ");
            ventas[i] = sc.nextLine(); // Leer cada venta individualmente
        }

        sc.close(); // Cerramos Scanner después de su uso

        // Mostrar las ventas ingresadas
        System.out.println("\nVentas ingresadas:");
        for (int i = 0; i < numVentas; i++) {
            System.out.println("Venta " + (i + 1) + ": " + ventas[i]);
        }
    }
}


