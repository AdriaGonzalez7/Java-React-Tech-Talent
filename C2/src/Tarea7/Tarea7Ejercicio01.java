package Tarea7;

import java.util.ArrayList;
import java.util.Scanner;

public class Tarea7Ejercicio01 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Número de alumnos: ");
        int numAlumnos = sc.nextInt();

        for (int i = 0; i < numAlumnos; i++) {
            System.out.println("Nombre alumno " + (i+1) + ":");
            String nombreAlumno = sc.next();
            System.out.println("\nNotas de "+ nombreAlumno +  ":");
            ArrayList<Double> notasAlumno = pedirNotas(sc);
            System.out.println("Nota media de " + nombreAlumno + ": " + calcularNota(notasAlumno));
        }
    }

    public static ArrayList<Double> pedirNotas(Scanner sc) {
        ArrayList<Double> lista = new ArrayList<>();
        System.out.println("Número de notas: ");
        int numNotas = sc.nextInt();

        for (int i = 0; i < numNotas; i++) {
            double notaAlumno;
            do {
                System.out.println("Introduce una nota del 1 al 10: ");
                notaAlumno = sc.nextDouble();
                if (notaAlumno > 0 && notaAlumno <= 10) {
                    lista.add(notaAlumno);
                } else {
                    System.out.println("Nota inválida. Introduce un número entre 1 y 10.");
                }
            } while (notaAlumno <= 0 || notaAlumno > 10);
        }
        return lista;
    }

    public static double calcularNota(ArrayList<Double> notas) {
        double media = 0.0;
        for (double nota : notas) {
            media += nota;
        }
        return media / notas.size();
    }
}



