package Tarea6;

import java.util.Scanner;

public class Tarea6Ejercicio07 {

	public static void main(String[] args) {
		System.out.println("Introduce una cantidad en euros: ");
		Scanner sc = new Scanner(System.in);
        double euros = Double.parseDouble(sc.nextLine());
		conversion(euros, "euros");
	}
	public static void conversion(double euros, String moneda ) {
		double libras = 0.86;
		double dolares = 1.28611;
		double yenes = 129.852;
		System.out.println(euros + " euros son " + (euros * libras) + " libras.");
		System.out.println(euros + " euros son " + (euros * dolares) + " dolares.");
		System.out.println(euros + " euros son " + (euros * yenes) + " yenes.");
	}
}
