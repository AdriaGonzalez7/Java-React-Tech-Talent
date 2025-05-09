package Tarea9.Ej05PersonaAula;

public class Profesor extends Persona {

	// Atributos
	
	private String materia;
	
	// Constructor con parametros
	
	public Profesor(String nombre, int edad, String sexo, String materia) {
		super(nombre, edad, sexo);
		this.materia = materia;
	}

	public String getMateria() {
		return materia;
	}

	public void setMateria(String materia) {
		this.materia = materia;
	}
	
	@Override
	
	public boolean EstaDisponible() {
        return Math.random() >= 0.2;
	}
	
}
