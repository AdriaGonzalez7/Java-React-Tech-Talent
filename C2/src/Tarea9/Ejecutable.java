package Tarea9;

public class Ejecutable {

	public static void main(String[] args) {
		Serie[] series = crearSeries();
        Videojuego[] videojuegos = crearVideojuegos();
        
        entregarSeries(series);
        entregarVideojuegos(videojuegos);
        
        String seriesEntregadas = listarYDevolverEntregados(series);
        String videojuegosEntregados = listarYDevolverEntregados(videojuegos);
        
        System.out.println("Series entregadas: " + seriesEntregadas);
        System.out.println("Videojuegos entregados: " +  videojuegosEntregados);
        
        Serie serieConMasTemporadas = encontrarSerieConMasTemporadas(series);
        Videojuego videojuegoConMasHoras = encontrarVideojuegoConMasHoras(videojuegos);

        // Mostrar resultados finales
        System.out.println("\nSerie con más temporadas:");
        System.out.println(serieConMasTemporadas);

        System.out.println("\nVideojuego con más horas estimadas:");
        System.out.println(videojuegoConMasHoras);
	}
	
	
//	Crea dos arrays, uno de Series y otro de Videojuegos, de 5 posiciones cada
//	uno.

	public static Serie[] crearSeries() {
	    Serie[] series = new Serie[5];
	    series[0] = new Serie("Breaking Bad", 5, "Drama", "Vince Gilligan");
	    series[1] = new Serie("Friends", 10, "Comedia", "David Crane");
	    series[2] = new Serie("Stranger Things", 4, "Ciencia Ficción", "Duffer Brothers");
	    series[3] = new Serie("The Witcher", 3, "Fantasía", "Lauren Schmidt");
	    series[4] = new Serie("Sherlock", 4, "Misterio", "Steven Moffat");
	    return series;
	}

	public static Videojuego[] crearVideojuegos() {
	    Videojuego[] videojuegos = new Videojuego[5];
	    videojuegos[0] = new Videojuego("The Legend of Zelda", 50, "Aventura", "Nintendo");
	    videojuegos[1] = new Videojuego("Minecraft", 100, "Sandbox", "Mojang");
	    videojuegos[2] = new Videojuego("Final Fantasy VII", 40, "RPG", "Square Enix");
	    videojuegos[3] = new Videojuego("The Witcher 3", 200, "RPG", "CD Projekt");
	    videojuegos[4] = new Videojuego("Grand Theft Auto V", 150, "Acción", "Rockstar Games");
	    return videojuegos;
	}
	
	public static void entregarSeries(Serie[] series) {
	    series[0].entregar();
	    series[2].entregar();
	}

	public static void entregarVideojuegos(Videojuego[] videojuegos) {
	    videojuegos[1].entregar();
	    videojuegos[3].entregar();
	}
	
	public static String listarYDevolverEntregados(Entregable[] entregables) {
	    StringBuilder nombresEntregados = new StringBuilder(); 
	    for (Entregable entregable : entregables) {
	        if (entregable.isEntregado()) { 
	            nombresEntregados.append(entregable.toString()).append("\n"); 
	            entregable.devolver(); 
	        }
	    }
	    return nombresEntregados.toString(); 
	}

	
	public static Serie encontrarSerieConMasTemporadas(Serie[] series) {
        Serie max = series[0];
        for (Serie serie : series) {
            if (serie.compareTo(max) > 0) {
                max = serie;
            }
        }
        return max;
    }

    public static Videojuego encontrarVideojuegoConMasHoras(Videojuego[] videojuegos) {
        Videojuego max = videojuegos[0];
        for (Videojuego videojuego : videojuegos) {
            if (videojuego.compareTo(max) > 0) {
                max = videojuego;
            }
        }
        return max;
    }
	
}
