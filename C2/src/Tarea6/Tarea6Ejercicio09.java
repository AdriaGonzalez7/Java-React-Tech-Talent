package Tarea6;

import java.util.Scanner;

public class Tarea6Ejercicio09 {

	public static void main(String[] args) {
		int lista[]= RellenarArray();
		ImprimirArray(lista);
		}
	public static int [] RellenarArray () {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce el tamaño del array: ");
		int rango = Integer.parseInt(sc.nextLine());
		int lista[]	= new int[rango];
		// Rellenar array con numeros aleatorios
			for (int i = 0; i < lista.length; i++) {
				lista[i] = (int) (Math.random() * 10);	
			}
		sc.close();
		return lista;
	}
		
	public static void ImprimirArray (int array []) {
		int suma = 0; 
			for (int i = 0; i < array.length; i++) {
			System.out.println("Índice " + i + ": " + array[i]);
			suma += array[i];
			}
		System.out.println("La suma de los elementos del array es: " + suma);
	}
}

