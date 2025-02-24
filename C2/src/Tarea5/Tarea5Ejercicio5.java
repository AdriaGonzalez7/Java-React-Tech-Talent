package Tarea5;

import java.util.Scanner;

public class Tarea5Ejercicio5 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);		//Generamos recurso scanner para leer datos
		System.out.println("Indica un número: ");   
		Double numero = sc.nextDouble();			//Leemos el numero tipo decimal

		if(numero%2 == 0) {							//Comprobamos si el numero es divisible entre 2
			System.out.println("Es divisible entre 2");
		}else {
			System.out.println("No es divisible entre 2");
		}
	}
}
