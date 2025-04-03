package Tarea9;

public class Lavadora extends Electrodomestico {
	// Atributos
	private int carga;
	// Constantes
	private static final int carga_por_defecto = 5;

	// Constructor por defecto
	public Lavadora() {
		super();
		this.carga = carga_por_defecto;
	}

	// Un constructor con el precio y peso. El resto por defecto.
	
	public Lavadora(double precio_base, int peso) {
		super(precio_base, peso);
		this.carga = carga_por_defecto;
	}
	
	// Constructor con la carga y el resto atributos heredados
	
	public Lavadora(int carga, double precio_base, String color, char consumo_energetico, int peso) {
		super(color, consumo_energetico, precio_base, peso);
		this.carga = carga;
	}
	// Getters
	public int getCarga() {
		return carga;
	}

	// Metodo precioFinal
	public double precioFinal() {
		double precio_final = super.precioFinal();
		if (carga > 30) {
			precio_final += 50;
		}
		return precio_final;
	}
}
