package Tarea9.Ej05PersonaAula;

public class Estudiante extends Persona{

	// Atributos
	private double calificacionactual;
	
	// Constructor con parametros
	
	public Estudiante(String nombre, int edad, String sexo, double calificacionactual) {
		super(nombre, edad, sexo);
		this.calificacionactual = calificacionactual;
	}

	public double getCalificacionactual() {
		return calificacionactual;
	}

	public void setCalificacionactual(double calificacionactual) {
		this.calificacionactual = calificacionactual;
	}
	
	@Override
	public boolean EstaDisponible() {
        return Math.random() >= 0.5;
	}
	
}
