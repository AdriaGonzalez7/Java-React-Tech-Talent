package Tarea9;

public class Ecuacion2Grado extends Raices {

    // Constructor que utiliza el constructor de la clase base
    public Ecuacion2Grado(double a, double b, double c) {
		super(a, b, c);
	}

    // Determina si la ecuación tiene dos soluciones reales distintas.
    // Matemáticamente se tienen dos soluciones si el discriminante es mayor que cero.
    public boolean tieneRaices() {
        return calcularDiscriminante() > 0;
    }

    // Determina si la ecuación tiene una única solución real
    // Esto ocurre cuando el discriminante es exactamente 0.
    public boolean tieneRaiz() {
        return calcularDiscriminante() == 0;
    }

    // Imprime las dos soluciones posibles.
    // Se utiliza la fórmula: (-b ± √(discriminante)) / (2a)
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

    // Imprime la única solución posible
    // Para que exista una única solución, el discriminante debe ser 0.
    public void obtenerRaiz() {
        if (tieneRaiz()) {
            double raiz = -b / (2 * a);
            System.out.println("La única solución es: " + raiz);
        } else {
            System.out.println("La ecuación no tiene una única solución real.");
        }
    }

    // Método que analiza y muestra por consola las soluciones de la ecuación
    // - Si tiene dos soluciones (discriminante > 0): llama a obtenerRaices()
    // - Si tiene única solución (discriminante == 0): llama a obtenerRaiz()
    // - En caso contrario, informa que no hay solución real.
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
