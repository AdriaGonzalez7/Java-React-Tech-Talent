package Tarea5;

import java.util.Scanner;

public class Tarea5Extra5 {

	public static void main(String[] args) {
		int numero = (int) (Math.random() * (100- 1 + 1) + 1);
		System.out.println("Número aleatorio entre 1 y 100 ");
		Scanner sc = new Scanner(System.in);
		System.out.println("Adivina el número: ");
		int intento = Integer.parseInt(sc.nextLine());
		for (int i = 0; ; i++) {
			if (intento > numero) {
				System.out.println("El número es menor");
				
			}
			else if (intento < numero) {
	            System.out.println("El número es mayor");
	        }
	        else {
	            System.out.println("¡Has acertado!");
	            sc.close();
	            break;
	        }
            System.out.println("Introduce otro número: ");	
            intento = Integer.parseInt(sc.nextLine());
		}
	}
}
