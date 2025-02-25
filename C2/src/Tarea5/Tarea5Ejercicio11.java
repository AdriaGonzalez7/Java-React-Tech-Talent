package Tarea5;

import java.util.Scanner;

public class Tarea5Ejercicio11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);		//Abrimos scanner
		System.out.println("Indica un dia de la semana: ");
		String dia = sc.nextLine();			//Leemos el dia
		sc.close();			//Cerramos scanner
		
		switch (dia) {			//Switch para comparar el dia como laborable o no
			case "Lunes","Martes","Miercoles","Jueves","Viernes":
				System.out.println("Es laborable");
				break;
			case "Sabado","Domingo":
				System.out.println("No es laborable");
				break;	
		}
	}
}
