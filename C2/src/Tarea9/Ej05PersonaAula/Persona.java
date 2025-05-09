package Tarea9.Ej05PersonaAula;

abstract class Persona {

	// Atributos
	
	protected String nombre;
	protected int edad;
	protected String sexo;
	
	// Constructor con parametros
	
	public Persona(String nombre, int edad, String sexo) {
		this.nombre = nombre;
		this.edad = edad;
		this.sexo = sexo;
		}

	// Getters y Setters
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	
	// Método asistencia
	
	public abstract boolean EstaDisponible();
	
}
