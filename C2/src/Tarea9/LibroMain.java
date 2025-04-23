package Tarea9;

public class LibroMain {

	public static void main(String[] args) {
		
		        Libro libro = new Libro();
		        libro.setISBN("978-3-16-148410-0");
		        libro.setTitulo("El Principito");
		        libro.setAutor("Antoine de Saint-Exupéry");
		        libro.setNumeroPaginas(96);
		        
				Libro libro2 = new Libro();
				libro2.setISBN("978-0-7432-7356-5");
				libro2.setTitulo("Cien años de soledad");
				libro2.setAutor("Gabriel García Márquez");
				libro2.setNumeroPaginas(417);
				
		// Mostrar cual tiene más paginas
		
				if(libro.getNumeroPaginas() > libro2.getNumeroPaginas()) {
            System.out.println("El libro con más páginas es: " + libro.getTitulo());	
            } else if(libro.getNumeroPaginas() < libro2.getNumeroPaginas()) {
            	System.out.println("El libro con más páginas es: " + libro2.getTitulo());
            } else {
            	System.out.println("Ambos libros tienen el mismo número de páginas.");
            }
	}
}


