package Tarea7;

import java.util.ArrayList;
import java.util.Scanner;

public class Tarea7Ejercicio01 {

	public static void main(String[] args) {
		ArrayList<Double> notas = pedirNotas();
		System.out.println("Nota Media: " + calcularNota (notas));
	}
	
	public static ArrayList<Double> pedirNotas(){
		double notaAlumno = 0.0;
		
		ArrayList<Double> lista = new ArrayList<Double>();
		System.out.println("Calculadora de notas");
		Scanner sc = new Scanner(System.in);
		System.out.println("Numero de notas: ");
		int numNotas = sc.nextInt();
		
		for ( int i = 0; i < numNotas; i++) {
			do {
				System.out.println("Introduce una nota del 1-10: ");
				notaAlumno = sc.nextDouble();
				lista.add(notaAlumno);
				System.out.println("Nota: " + lista);

			} while (notaAlumno <= 0 || notaAlumno >= 10);
			
		}
		return lista;	
	}
	
	public static double calcularNota (ArrayList<Double> notas) {
		double media = 0.0;
		for (int i= 0; i < notas.size() ; i++ ) {
			notas.get(i);
			media += notas.get(i);
		}
		media = media / notas.size();
		return media;
	}
	
	}


