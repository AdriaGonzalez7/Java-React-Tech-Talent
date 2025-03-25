package Tarea8;

import java.util.Random;
import java.util.Scanner;

public class Password {
	// Atributos
	private int longitud = 8;
	private String contrasenya;
	
	// Constructor por defecto
	public Password() {
		this.longitud=8;
		this.contrasenya= generarContrasenya(longitud);
	}
	
	 // Constructor con la longitud especificada
    public Password(int longitud) {
        this.longitud = longitud;
        this.contrasenya = generarContrasenya(longitud);
    }
    
    // Método para generar una contraseña aleatoria
    
    private String generarContrasenya(int longitud) {
        String caracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%^&*";
        String contrasenya = "";
        Random random = new Random();

        for (int i = 0; i < longitud; i++) {
            int indice = random.nextInt(caracteres.length());
            contrasenya += caracteres.charAt(indice);         }

        return contrasenya;
    }

        public static void main(String[] args) {
            // Crear un objeto de Password con el constructor por defecto
            Password passwordPorDefecto = new Password();
            System.out.println("Contraseña por defecto:");
            System.out.println("Longitud: " + passwordPorDefecto.longitud);
            System.out.println("Contraseña: " + passwordPorDefecto.contrasenya);

            // Crear un objeto de Password con longitud personalizada
            Scanner sc = new Scanner(System.in);
            System.out.print("\nIntroduce la longitud de la contraseña personalizada: ");
            int longitud = sc.nextInt();
            Password passwordPersonalizada = new Password(longitud);
            System.out.println("\nContraseña personalizada:");
            System.out.println("Longitud: " + passwordPersonalizada.longitud);
            System.out.println("Contraseña: " + passwordPersonalizada.contrasenya);
        }
    }
	

