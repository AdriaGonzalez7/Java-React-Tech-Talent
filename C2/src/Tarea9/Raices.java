package Tarea9;	

public class Raices {

	// Atributos
	protected double a;
	protected double b;
	protected double c;
	

	
	// Constructor
	public Raices(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

	// Método para calcular el discriminante
	
	public double calcularDiscriminante() {
		return (b * b) - (4 * a * c);
	}	
	

	// Getters y Setters
	public double getA() {
		return a;
	}

	public void setA(double a) {
		this.a = a;
	}

	public double getB() {
		return b;
	}

	public void setB(double b) {
		this.b = b;
	}

	public double getC() {
        return c;
    }
	
	public void setC(double c) {
		this.c = c;	
		}
}
