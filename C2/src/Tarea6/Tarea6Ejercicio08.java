package Tarea6;

import java.util.Scanner;

public class Tarea6Ejercicio08 {

	public static void main(String[] args) {
	RellenarArray(array[], lista);
	ImprimirArray(new int[10]);
	}
	public static int[] RellenarArray(int array[]) {
		int lista[] = new int[10];
		System.out.println("Introduce 10 números enteros: ");
		for (int i = 0; i < lista.length; i++) {
			Scanner sc = new Scanner(System.in);
			lista[i] = Integer.parseInt(sc.nextLine());
		}
		return lista;
	}
	public static void ImprimirArray (int array[]) {
		for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
	
	}
}
