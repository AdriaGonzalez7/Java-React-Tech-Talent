package Tarea6;

import java.util.Scanner;

public class Tarea6Ejercicio06 {

	public static void main(String[] args) {
		System.out.println("Introduce un numero entero: ");
		Scanner sc = new Scanner(System.in);
		String num = sc.nextLine();
        sc.close();
        System.out.println("El número " + num + " tiene " + NumeroCifras(num) + " cifras.");
        
	}
	
	public static int NumeroCifras(String num) {
		return num.length();
	}

}
