package Tarea5;

import java.util.Scanner;

public class Tarea5Ejercicio6 {

	public static void main(String[] args) {
		final double IVA = 0.21;							//Inicializamos constante IVA
		
		Scanner sc = new Scanner(System.in);					//Generamos recurso scanner para leer datos
		System.out.println("Ingrese el precio del producto: ");
		Double Precio = sc.nextDouble();	            //Leemos el precio del producto	en tipo decimal
		sc.close();
				
		System.out.println("El precio final del producto con IVA es: " + (Precio + (Precio*IVA))); 	//Calculamos el precio final con IVA

	}

}
