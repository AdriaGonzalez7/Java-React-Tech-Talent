package Tarea5;
//importamos la clase Scanner del paquete java.util
import java.util.Scanner;

public class Tarea5Ejercicio2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);			//Abrimos el scanner
		System.out.println("Introduce tu nombre: ");	//Pedimos el nombre	
		String name = sc.nextLine();					//Leemos el nombre
		sc.close();										//Cerramos el scanner
		System.out.println("Bienvenido " + name);		//Saludamos al usuario	
	}
}