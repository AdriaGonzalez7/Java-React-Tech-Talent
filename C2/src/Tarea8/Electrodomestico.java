package Tarea8;

public class Electrodomestico {
	//Atributos
	protected double precio_base;
	protected String color;
	protected char consumo_energetico;
	protected int peso;
	
	//Constantes
	
	private static final double precio_por_defecto = 100.0;
	private static final String color_por_defecto = "Blanco";
	private static final char consumo_energetico_por_defecto = 'F';
	private static final int peso_por_defecto = 5;

    private static final String[] COLORES_DISPONIBLES = {"blanco", "negro", "rojo", "azul", "gris"};

	// Constructor por defecto
	public Electrodomestico() {
		this.precio_base = precio_por_defecto;
		this.color = color_por_defecto;
		this.consumo_energetico = consumo_energetico_por_defecto;
		this.peso = peso_por_defecto;
		
	}
	
	//Un constructor con el precio y peso. El resto por defecto.
	public Electrodomestico(double precio_base, int peso) {
		this.precio_base = precio_base;
		this.color = color_por_defecto;
		this.consumo_energetico = consumo_energetico_por_defecto;	
		this.peso = peso;
	}
	
	//Constructor con todos los atributos
	public Electrodomestico(double precio, String color, char consumo_energetico, int peso, double precio_base ) {
		this.precio_base = precio_base;
		this.color = color;
		this.consumo_energetico = consumo_energetico;
		this.peso = peso;

	}
	
	// Getters y setters 
	public double getPrecioBase() {
	    return precio_base;
	}

	public String getColor() {
	    return color;
	}

	public char getConsumoEnergetico() {
	    return consumo_energetico;
	}

	public double getPeso() {
	    return peso;
	}

	public void setPrecioBase(double precioBase) {
	    this.precio_base = precioBase;
	}

	public void setColor(String color) {
	    // Convertimos a minúsculas 
	    String colorNormalizado = color.toLowerCase();

	    // Verificamos si el color está en COLORES_DISPONIBLES
	    boolean colorValido = false;
	    for (String colorDisponible : COLORES_DISPONIBLES) {
	        if (colorDisponible.equals(colorNormalizado)) {
	            colorValido = true;
	            break;
	        }
	    }

	    // Asignamos el color si es válido, de lo contrario, usamos el color por defecto
	    if (colorValido) {
	        this.color = colorNormalizado;
	    } else {
	        this.color = color_por_defecto;
	    }
	}

	

	public void setConsumoEnergetico(char consumoEnergetico) {
	    this.consumo_energetico = consumoEnergetico;
	}

	public void setPeso(int peso) {
	    this.peso = peso;
	}

	
}
