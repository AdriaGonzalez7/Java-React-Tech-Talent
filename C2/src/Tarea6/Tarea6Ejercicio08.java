package Tarea6;

import java.util.Scanner;

public class Tarea6Ejercicio08 {

	public static void main(String[] args) {
	int lista[]= RellenarArray(10);
	ImprimirArray(lista);
	}
	public static int[] RellenarArray(int a) {
		int lista[] = new int[10];
		System.out.println("Introduce 10 números enteros: ");
		for (int i = 0; i < lista.length; i++) {
			Scanner sc = new Scanner(System.in);
			lista[i] = Integer.parseInt(sc.nextLine());
		}
		return	lista;
	}
	public static void ImprimirArray (int array[]) {
		for (int i = 0; i < array.length; i++) {
            System.out.println("Inidice: " + i);
            System.out.println(array[i]);	
        }
	
	}
}
