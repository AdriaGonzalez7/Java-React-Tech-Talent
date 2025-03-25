package Tarea8;

public class Persona {
	// Atributos
	private String nombre;
	private int edad;
	private String dni;
	private char sexo;
	private int peso;
	private double altura;
	
	//Constante sexo
	private static final char sexo_por_defecto = 'M';
	
	
	//Primer constructor todo por defecto
	
	public Persona() {
		this.nombre="";
		this.edad=0;
		this.dni=null;
		this.sexo= sexo_por_defecto;
		this.peso=0;
		this.altura=0;
	}
	
	//Segundo constructor nombre, edad y sexo, el resto por defecto
		
		public Persona(String nombre, int edad, char sexo) {
	        this.nombre = nombre;
	        this.edad = edad;
	        this.sexo = sexo;
	        this.dni = null; 
	        this.peso = 0;
	        this.altura = 0;
	}
		
		// constructor con todos los atributos como parámetro.
		
		public Persona(String nombre, int edad, char sexo, String dni, int peso, double altura) {
			this.nombre = nombre;
	        this.edad = edad;
	        this.sexo = sexo;
	        this.dni = dni; 
	        this.peso = peso;
	        this.altura = altura;
		}

}

