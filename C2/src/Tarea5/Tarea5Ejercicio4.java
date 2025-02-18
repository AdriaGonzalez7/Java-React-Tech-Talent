package Tarea5;

import java.util.Scanner;

public class Tarea5Ejercicio4 {

	public static void main(String[] args) {
		final double PI = 3.1416;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Cual es el radio del circulo? ");
		String TextoRadio = sc.nextLine();
		sc.close();
		
		Double radio = Double.parseDouble(TextoRadio);
		double area = (Math.pow(radio, 2))* PI;
		System.out.println("El area del circulo es: " + (area));
		


	}

}
