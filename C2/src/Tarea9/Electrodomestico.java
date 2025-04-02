package Tarea9;

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
		public Electrodomestico( String color, char consumo_energetico, double precio_base, int peso ) {
			this.precio_base = precio_base;
			this.color = comprobarColor(color);
			this.consumo_energetico = comprobarConsumoEnergetico(consumo_energetico);
			this.peso = peso;

		}
		
		// Getters
		
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
		private char comprobarConsumoEnergetico(char letra) {
			if (letra == 'A' || letra == 'B' || letra == 'C' || letra == 'D' || letra == 'E' || letra == 'F') {
                return letra;
            } else {
                return consumo_energetico_por_defecto;
            }
		}
		
		private String comprobarColor(String color) {
		    for (String c : COLORES_DISPONIBLES) {
		        if (c.equalsIgnoreCase(color)) {
		            return c;  
		        }
		    }
		    return color_por_defecto;
		}

		
		public double precioFinal() {
			double precio = 0;
			switch (consumo_energetico) {
			case 'A':
				precio += 100;
				break;
			case 'B':
				precio += 80;
				break;
			case 'C':
				precio += 60;
				break;
			case 'D':
				precio += 50;
				break;
			case 'E':
				precio += 30;
				break;
			case 'F':
				precio += 10;
				break;
			}
			if (peso >= 0 && peso <= 19) {
				precio += 10;
			} else if (peso >= 20 && peso <= 49) {
				precio += 50;
			} else if (peso >= 50 && peso <= 79) {
				precio += 80;
			} else if (peso >= 80) {
				precio += 100;
			}
			return precio_base + precio;
		}
		
		
		
		
}
