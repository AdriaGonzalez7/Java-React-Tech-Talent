package Tarea5;

import java.util.Scanner;

public class Tarea5Ejercicio12 {

	public static void main(String[] args) {
		String password = "manzana";		//Inicializamos la contraseña
		Scanner sc = new Scanner(System.in);	//Abrimos scanner
		System.out.println("Introduce la contraseña: ");
		String input = sc.nextLine();		//Leemos la contraseña introducida
		
		for(int i = 1; i<3; i++) { 			//Bucle para 3 intentos
			if (input.equals(password)) {		//Si la contraseña es correcta, salimos del programa
				System.out.println("Enhorabuena");
				sc.close();
				break;	
				}
			while(!input.equals(password)) {	//Mientras la contraseña no sea correcta que la vuelva a pedir
				System.out.println("Contraseña incorrecta, intentalo de nuevo: ");
				input = sc.nextLine();
					i++;
				if (input.equals(password)) {		//Si la contraseña es correcta, salimos del programa
					System.out.println("Enhorabuena");
					sc.close();
					break;	
						}
				if (i >= 3) {		//Si llega a 3 intentos, salimos del programa
					System.out.println("Has agotado los intentos");
					sc.close();
					break;
					}
				}
			}
		}
	}



