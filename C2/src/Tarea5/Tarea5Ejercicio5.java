package Tarea5;

import java.util.Scanner;

public class Tarea5Ejercicio5 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Indica un número: ");
		String TextoNumero = sc.nextLine();
		sc.close();
		Double numero = Double.parseDouble(TextoNumero);

		if(numero%2 == 0) {
			System.out.println("Es divisible entre 2");
		}else {
			System.out.println("No es divisible entre 2");
		}
		

	}

}
