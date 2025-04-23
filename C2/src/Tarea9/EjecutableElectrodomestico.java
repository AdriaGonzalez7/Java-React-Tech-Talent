package Tarea9;

import java.util.ArrayList;

public class EjecutableElectrodomestico {
    public static void main(String[] args) {
        // Crear un array de Electrodomesticos de 10 posiciones.
        Electrodomestico[] electrodomesticos = new Electrodomestico[10];

        electrodomesticos[0] = new Electrodomestico(200, 15);
        electrodomesticos[1] = new Lavadora(40, 300, "rojo", 'A', 50);
        electrodomesticos[2] = new Lavadora(20, 250, "blanco", 'B', 30);
        electrodomesticos[3] = new Lavadora();
        electrodomesticos[4] = new Lavadora(35, 280, "negro", 'C', 60);
        electrodomesticos[5] = new Television(42, true, 500, "azul", 'D', 25);
        electrodomesticos[6] = new Television(55, false, 700, "gris", 'E', 40);
        electrodomesticos[7] = new Television();
        electrodomesticos[8] = new Television(65, true, 900, "rojo", 'F', 35);
        electrodomesticos[9] = new Electrodomestico("negro", 'A', 350, 80);

        double totalElectrodomesticos = 0;
        double totalTelevisores = 0;
        double totalLavadoras = 0;

        for (int i = 0; i < electrodomesticos.length; i++) {
            double precioFinal = electrodomesticos[i].precioFinal();
            totalElectrodomesticos += precioFinal;

            if (electrodomesticos[i] instanceof Lavadora) {
                totalLavadoras += precioFinal;
            } else if (electrodomesticos[i] instanceof Television) {
                totalTelevisores += precioFinal;
            }
            
            System.out.println("El precio final del electrodoméstico en la posición " + i + " es: " + precioFinal);
        }

        // Mostrar los totales finales.
        System.out.println("\nResumen de precios:");
        System.out.println("Total precio Lavadoras: " + totalLavadoras);
        System.out.println("Total precio Televisiones: " + totalTelevisores);
        System.out.println("Total precio Electrodomésticos: " + totalElectrodomesticos);
    }
}

