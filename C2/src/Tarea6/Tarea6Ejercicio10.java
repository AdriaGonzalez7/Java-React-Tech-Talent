package Tarea6;

import java.util.Scanner;
import java.lang.reflect.Array;
import java.util.Random;

public class Tarea6Ejercicio10 {

	public static void main(String[] args) {
			int lista[]= RellenarArray(1, 100);
			ImprimirArray(lista);
			System.out.println("\nEl número primo mayor del array es: " + esMayor(lista));
			}
		public static int [] RellenarArray (int min, int max) {			
			Scanner sc = new Scanner(System.in);
			System.out.println("Introduce el tamaño del array: ");
			int rango = Integer.parseInt(sc.nextLine());
			int lista[]	= new int[rango];	 // Crear el array
			int num;
	        Random random = new Random(); // Inicializar Random 
			// Rellenar array con numeros aleatorios
			for (int i = 0; i < rango; i++) {
				do {
					num = random.nextInt(max - min + 1) + min; // Genera un número aleatorio entre min y max
					} while (!esPrimo(num)); // Repite hasta que sea primo
						lista[i] = num;
			}
			sc.close();
			return lista;


		}

		public static boolean esPrimo(int num) {
		    if (num < 2) return false;
		    for (int i = 2; i < num; i++) { // Se recorre hasta num - 1
		        if (num % i == 0) return false; // Si es divisible, no es primo
		    }
		    return true;

		}
		
		public static void ImprimirArray (int array []) { 
				for (int i = 0; i < array.length; i++) {
				System.out.print( "{" +array[i] + "}" + " ");
				}
		}
		
		public static int esMayor (int[] array) { 
			int mayor = array[0];
			for (int i = 0; i < array.length; i++) {
				if (array[i] > array[0]) {
                    mayor = array[i];
                }
			}
			return mayor;
		}
}
	


