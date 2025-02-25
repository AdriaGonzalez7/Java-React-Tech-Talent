package Tarea5;

import java.util.Scanner;

public class Tarea5Ejercicio10 {
    public static void main(String[] args) {
    	double suma = 0; // Variable para sumar las ventas	
        Scanner sc = new Scanner(System.in); // Abrimos Scanner

        System.out.println("Número de ventas: ");
        int numVentas = Integer.parseInt(sc.nextLine()); 	//Leemos numero de ventas

        double[] ventas = new double[numVentas]; 	// Array para almacenar las ventas en double
        System.out.println("Introduce las " + numVentas + " ventas:");
        for (int i = 0; i < numVentas; i++) {		//Bucle para leer las ventas
            System.out.print("Venta " + (i + 1) + ": ");
            ventas[i] = Double.parseDouble(sc.nextLine()); // Leer cada venta individualmente  
            suma += ventas[i]; // Sumar cada venta a la suma total
        }

        sc.close(); // Cerramos Scanner después de su uso

        // Mostrar las ventas ingresadas
        System.out.println("\nVentas ingresadas:");
        for (int i = 0; i < numVentas; i++) {
            System.out.println("Venta " + (i + 1) + ": " + ventas[i]);
        }        
        System.out.println("\nSuma total de las ventas: " + suma);				//Mostrar suma ventas

    }
}


