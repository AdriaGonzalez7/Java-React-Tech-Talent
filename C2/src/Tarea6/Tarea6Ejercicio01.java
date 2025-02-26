package Tarea6;

import java.util.Scanner;

public class Tarea6Ejercicio01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce la figura: ");
		String figura = sc.nextLine();
		switch (figura) {
		case "circulo":
			System.out.println("Introduce el radio: ");
			int radio = Integer.parseInt(sc.nextLine());
			System.out.println("El área del círculo es: " + areacirculo(radio));
			break;	
		case "cuadrado":
			System.out.println("Introduce el lado: ");
			int lado = Integer.parseInt(sc.nextLine());
			System.out.println("El área del cuadrado es: " + areacuadrado(lado));
			break;
		case "triangulo":
			System.out.println("Introduce la base: ");
			int base = Integer.parseInt(sc.nextLine());
			System.out.println("Introduce la altura: ");
			int altura = Integer.parseInt(sc.nextLine());
			System.out.println("El área del triángulo es: " + areatriangulo(base, altura));
            break;
		}
	}

	public static double areacirculo(int radio) {
		return Math.PI * Math.pow(radio, 2);
	}
	public static double areacuadrado(int lado) {
		return Math.pow(lado, 2);
	}

	public static double areatriangulo(int base, int altura) {
		return (base * altura) / 2;
	}
}
			

