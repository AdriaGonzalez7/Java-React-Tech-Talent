package Tarea6;

import java.util.Scanner;

public class Tarea6Ejercicio04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un numero entero: ");
		int num = Integer.parseInt(sc.nextLine());
		System.out.println("El factorial de " + num + " es: " + Factorial(num));
	}
	
	
	public static int Factorial(int num) {
		int result= 1;
		for ( int i = num; i > 0; i--) {
            result = result * i;
        }
		return result;
	}

}
