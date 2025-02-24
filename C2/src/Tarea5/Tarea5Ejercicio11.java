package Tarea5;

import java.util.Scanner;

public class Tarea5Ejercicio11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Indica un dia de la semana: ");
		String dia = sc.nextLine();
		sc.close();
		
		switch (dia) {
			case "Lunes","Martes","Miercoles","Jueves","Viernes":
				System.out.println("Es laborable");
				break;
			case "Sabado","Domingo":
				System.out.println("No es laborable");
				break;
		
		}
	}

}
