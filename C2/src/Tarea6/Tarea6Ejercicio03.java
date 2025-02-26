package Tarea6;

import java.util.Scanner;

public class Tarea6Ejercicio03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un numero entero: ");
		int num = Integer.parseInt(sc.nextLine());
		System.out.println("El número " + num + " es primo: " + EsPrimo(num));
	}
	
	public static boolean EsPrimo(int num) {
	    if (num < 2) {
	    	return false;
	    }
	    for ( int i = 2; i < num; i++) {
			if (num % i == 0) {
				return false;
				}
	    	}
	    return true;
	 	}

}
