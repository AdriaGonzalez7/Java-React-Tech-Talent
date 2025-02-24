package Tarea5;

import java.util.Scanner;

public class Tarea5Ejercicio4 {

	public static void main(String[] args) {
		final double PI = 3.1416;							//Inicializamos constante PI
		
		Scanner sc = new Scanner(System.in);				//Generamos recurso scanner para leer datos
		System.out.println("Cual es el radio del circulo? ");
		String TextoRadio = sc.nextLine();
		sc.close();
		
		Double radio = Double.parseDouble(TextoRadio);					//Convertimos el texto a double
		double area = (Math.pow(radio, 2))* PI;							//Calculamos el area del circulo
		System.out.println("El area del circulo es: " + (area)); 	    //Mostramos el resultado
		
	}

}
