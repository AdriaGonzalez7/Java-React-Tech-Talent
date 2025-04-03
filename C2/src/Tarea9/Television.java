package Tarea9;

public class Television extends Electrodomestico {
	// Atributos
	private int resolucion;
	private boolean sintonizador_TDT;
	// Constantes
	private static final int resolucion_por_defecto = 20;
	private static final boolean sintonizador_TDT_por_defecto = false;
	
	// Constructor por defecto
	public Television() {
		super();
		this.resolucion= resolucion_por_defecto;
		this.sintonizador_TDT = sintonizador_TDT_por_defecto;	
	}
	
	// Constructor con el precio y el peso, el resto por defecto
	public Television(double precio_base, int peso) {
		super(precio_base, peso);
		this.resolucion = resolucion_por_defecto;
		this.sintonizador_TDT = sintonizador_TDT_por_defecto;
	}
	
//	Un constructor con la resolución, sintonizador TDT y el resto de atributos heredados. 
	public Television(int resolucion, boolean sintonizador_TDT, double precio_base, String color,
			char consumo_energetico, int peso) {
		super(color, consumo_energetico, precio_base, peso);
		this.resolucion = resolucion;
		this.sintonizador_TDT = sintonizador_TDT;
	}
	
	// Getters
	public int getResolucion() {
		return resolucion;
	}
	public boolean getSintonizador_TDT() {
		return sintonizador_TDT;
	}
	
	// Metodo precioFinal
		public double precioFinal() {
			double precio_final = super.precioFinal();
			if (resolucion > 40) {
				precio_final = precio_final * 1.3;
			}
			if (sintonizador_TDT) {
				precio_final += 50;
			}
			return precio_final;
		}
	
}
