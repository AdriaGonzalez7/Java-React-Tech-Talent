package Tarea9;

public class Videojuego implements Entregable {
	
	//Atributos
	protected String titulo;
	protected int horas_estimadas;
	protected boolean entregado;
	protected String genero;
	protected String company;
	
	//Constantes
	
	private static final int horas_estimadas_por_defecto = 10;
	private static final boolean entregado_por_defecto = false;
	private static final String titulo_por_defecto = "";
	private static final String genero_por_defecto = "";
	private static final String company_por_defecto = "";
	
	//Constructor por defecto
	public Videojuego() {
		this.titulo = titulo_por_defecto;
		this.horas_estimadas = horas_estimadas_por_defecto;
		this.entregado = entregado_por_defecto;
		this.genero = genero_por_defecto;
		this.company = company_por_defecto;
	}
	
	//Constructor con el titulo y creador. El resto por defecto
	
	public Videojuego(String titulo, int horas_estimadas) {
		this.titulo = titulo;
		this.horas_estimadas = horas_estimadas;
		this.entregado = entregado_por_defecto;
		this.genero = genero_por_defecto;
		this.company = company_por_defecto;
	}
	
	// Un constructor con todos los atributos, excepto de entregado
	public Videojuego(String titulo, int horas_estimadas, String genero, String company) {
		this.titulo = titulo;
		this.horas_estimadas = horas_estimadas;
		this.entregado = entregado_por_defecto;
		this.genero = genero;
		this.company = company;
	}
	
	//Getters
	
	public String getTitulo() {
		return titulo;
	}
	public int getHoras_estimadas() {
		return horas_estimadas;
	}
	public String getGenero() {
		return genero;
	}
	public String getCompany() {
		return company;
	}
	
	//Setters
	
	public void setTtitulo(String titulo) {
		this.titulo = titulo;
	}
	public void setHoras_estimadas(int horas_estimadas) {
		this.horas_estimadas = horas_estimadas;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	
	//Sobrescribir metodo to String()
	public String toString() {
		return "Videojuego [titulo=" + titulo + ", horas_estimadas=" + horas_estimadas + ", entregado=" + entregado
				+ ", genero=" + genero + ", compañia=" + company + "]";
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
	
	// Compara los videojuegos por las horas estimadas
    @Override
    public int compareTo(Object a) {
        if(a instanceof Videojuego) {
            Videojuego otroVideojuego = (Videojuego) a;
            return Integer.compare(this.horas_estimadas, otroVideojuego.getHoras_estimadas());
        }
        return 0;
    }
	
}
