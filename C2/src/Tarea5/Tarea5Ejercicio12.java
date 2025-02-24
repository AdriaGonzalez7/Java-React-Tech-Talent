package Tarea5;

import java.util.Scanner;

public class Tarea5Ejercicio12 {
//	// Escribe una aplicación con un String que contenga una contraseña cualquiera. Después
//	se te pedirá que introduzcas la contraseña, con 3 intentos. Cuando aciertes ya no pedirá mas
//	la contraseña y mostrara un mensaje diciendo “Enhorabuena”. Piensa bien en la condición
//	de salida (3 intentos y si acierta sale, aunque le queden intentos).
//	13)

	public static void main(String[] args) {
		String password = "manzana";
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce la contraseña: ");
		String input = sc.nextLine();
		
		for(int i = 1; i<3; i++) {	
		while(!input.equals(password)) {
			System.out.println("Contraseña incorrecta, intentalo de nuevo: ");
			input = sc.nextLine();
			i++;
			if (i == 3) {
				System.out.println("Has agotado los intentos");
				sc.close();
				break;
			}
		}
		if (input.equals(password)) {
			System.out.println("Enhorabuena");
			sc.close();
			break;
			
			}
		}
		
	}
}



