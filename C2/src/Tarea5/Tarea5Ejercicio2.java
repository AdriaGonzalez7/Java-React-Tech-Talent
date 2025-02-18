package Tarea5;

import java.util.Scanner;

public class Tarea5Ejercicio2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Introduce tu nombre: ");
		String name = sc.nextLine();
		sc.close();
		System.out.println("Bienvenido " + name);
	}

}
