package Tarea6;

import java.util.Scanner;

public class Tarea6Ejercicio02 {

	public static void main(String[] args) {
		System.out.println("El numero aleatorio es: " + numAleatorio());

	}
	
	public static int numAleatorio() {
		int min = 0;
		int max = 0;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Dame un rango de números: ");
        System.out.println("Número mínimo: ");
        min = Integer.parseInt(sc.nextLine());
        System.out.println("Número máximo: ");
        max = Integer.parseInt(sc.nextLine());
        
		int num = (int) (Math.random() * (max - min + 1) + min);
		sc.close();
		return num;
	}

}
