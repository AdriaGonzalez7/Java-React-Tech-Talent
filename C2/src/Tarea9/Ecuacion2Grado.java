package Tarea9;

public class Ecuacion2Grado extends Raices {

    public Ecuacion2Grado(double a, double b, double c) {
		super(a, b, c);
	}


    public boolean tieneRaices() {
        return calcularDiscriminante() > 0;
    }

    
    public boolean tieneRaiz() {
        return calcularDiscriminante() == 0;
    }

    public void obtenerRaices() {
        if (tieneRaices()) {
            double disc = calcularDiscriminante();
            double raiz1 = (-b + Math.sqrt(disc)) / (2 * a);
            double raiz2 = (-b - Math.sqrt(disc)) / (2 * a);
            System.out.println("Las dos soluciones son: " + raiz1 + " y " + raiz2);
        } else {
            System.out.println("La ecuación no tiene dos soluciones reales distintas.");
        }
    }

    public void obtenerRaiz() {
        if (tieneRaiz()) {
            double raiz = -b / (2 * a);
            System.out.println("La única solución es: " + raiz);
        } else {
            System.out.println("La ecuación no tiene una única solución real.");
        }
    }

    public void calcular() {
        if (tieneRaices()) {
            obtenerRaices();
        } else if (tieneRaiz()) {
            obtenerRaiz();
        } else {
            System.out.println("La ecuación no tiene solución real.");
        }
    }
}
