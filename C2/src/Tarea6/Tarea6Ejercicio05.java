package Tarea6;

import java.util.Scanner;

public class Tarea6Ejercicio05 {

	public static void main(String[] args) {
		String result= "";
		System.out.println("Introduce un numero entero: ");
		Scanner sc = new Scanner(System.in);
		int num = Integer.parseInt(sc.nextLine());
		sc.close();
		System.out.println("El número " + num + " en binario es: " + Binario(num));
	}

	public static String Binario(int num) {
		String result= "";
		for ( int i = num; i > 0; i/=2) {
            result = (i % 2) + result;
        }
		return result;
	}
}
	

