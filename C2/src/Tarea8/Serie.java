package Tarea8;

public class Serie {
	
    // Atributos
	private String titulo;
	private int num_temporadas;
	private boolean entregado;
	private String genero;
	private String creador;
	
	//Constantes
	private static final String titulo_por_defecto = "";
	private static final int num_temporadas_por_defecto = 3;
	private static final boolean entregado_por_defecto = false;
	private static final String genero_por_defecto = "";
	private static final String creador_por_defecto = "";
	
	// Constructor por defecto
	
	public Serie() {
		this.titulo = titulo_por_defecto;
		this.num_temporadas = num_temporadas_por_defecto;
		this.entregado = entregado_por_defecto;
		this.genero = genero_por_defecto;
		this.creador = creador_por_defecto;
	}
	
	// Constructor con titulo y creador, el resto por defecto
	
	public Serie(String titulo, String creador) {
		this.titulo = titulo;
		this.creador = creador;
		this.num_temporadas = num_temporadas_por_defecto;
		this.entregado = entregado_por_defecto;
		this.genero = genero_por_defecto;
	}
	
	// Constructor con todos los atributos menos entregado
	
	public Serie(String titulo, int num_temporadas, String genero, String creador) {
		this.titulo = titulo;
		this.num_temporadas = num_temporadas;
		this.genero = genero;
		this.creador = creador;
		this.entregado = entregado_por_defecto;
	}
}
