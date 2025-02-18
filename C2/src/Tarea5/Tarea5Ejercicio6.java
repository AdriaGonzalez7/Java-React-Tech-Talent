package Tarea5;

import java.util.Scanner;

public class Tarea5Ejercicio6 {

	public static void main(String[] args) {
		final double IVA = 0.21;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese el precio del producto: ");
		String TextoPrecio = sc.nextLine();
		sc.close();
		
		Double Precio = Double.parseDouble(TextoPrecio);
		
		System.out.println("El precio final del producto con IVA es: " + (Precio + (Precio*IVA)));

	}

}
