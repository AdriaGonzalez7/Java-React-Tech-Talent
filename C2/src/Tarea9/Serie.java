package Tarea9;

public class Serie implements Entregable {
	//Atributos
	protected String titulo;
	protected int num_temporadas;
	protected boolean entregado;
	protected String genero;
	protected String creador;
	
	//Constantes
	private static final int num_temporadas_por_defecto = 3;
	private static final boolean entregado_por_defecto = false;
	private static final String titulo_por_defecto = "";
	private static final String genero_por_defecto = "";
	private static final String creador_por_defecto = "";
	
	//Constructor por defecto
	
	public Serie() {
		this.titulo = titulo_por_defecto;
		this.num_temporadas = num_temporadas_por_defecto;
		this.entregado = entregado_por_defecto;
		this.genero = genero_por_defecto;
		this.creador = creador_por_defecto;
	}
	
	//Constructor con el titulo y creador. El resto por defecto
	
	public Serie(String titulo, String creador) {
		this.titulo = titulo;
		this.creador = creador;
		this.num_temporadas = num_temporadas_por_defecto;
		this.entregado = entregado_por_defecto;
		this.genero = genero_por_defecto;
	}
	
	// Un constructor con todos los atributos, excepto de entregado
	public Serie(String titulo, int num_temporadas, String genero, String creador) {
		this.titulo = titulo;
		this.num_temporadas = num_temporadas;
		this.entregado = entregado_por_defecto;
		this.genero = genero;
		this.creador = creador;
	}
	
	//Getters
	
	public String getTitulo() {
		return titulo;
	}
	public int getNum_temporadas() {
		return num_temporadas;
	}
	public String getGenero() {
		return genero;
	}
	public String getCreador() {
		return creador;
	}
	
	//Setters
	
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public void setNum_temporadas(int num_temporadas) {
		this.num_temporadas = num_temporadas;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public void setCreador(String creador) {
		this.creador = creador;
		
	}
	
	
	@Override
	public String toString() {
		return "Serie [titulo=" + titulo + ", num_temporadas=" + num_temporadas + ", entregado=" + entregado
				+ ", genero=" + genero + ", creador=" + creador + "]";
	}
	
    @Override
    public void entregar() {
        this.entregado = true;
    }
    
    @Override
    public void devolver() {
        this.entregado = false;
    }
    
    @Override
    public boolean isEntregado() {
        return this.entregado;
    }
    
 // Compara las series por el número de temporadas.
    @Override
    public int compareTo(Object a) {
        if(a instanceof Serie) {
            Serie otraSerie = (Serie) a;
            return Integer.compare(this.num_temporadas, otraSerie.getNum_temporadas());
        }
        return 0;
    }
	
	
}
	