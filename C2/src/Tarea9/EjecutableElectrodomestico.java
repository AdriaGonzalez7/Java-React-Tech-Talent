package Tarea9;

import java.util.ArrayList;

public class EjecutableElectrodomestico {
    public static void main(String[] args) {
        // Crear un array de Electrodomesticos de 10 posiciones.
        Electrodomestico[] electrodomesticos = new Electrodomestico[10];

        // Asignar instancias a cada posición:
        // Usamos distintos constructores de cada clase.

        // 0. Objeto Electrodomestico (usamos el constructor de precio y peso)
        electrodomesticos[0] = new Electrodomestico(200, 15);

        // 1. Lavadora con carga > 30 para que se aplique el suplemento
        electrodomesticos[1] = new Lavadora(40, 300, "rojo", 'A', 50);
        
        // 2. Lavadora con valores intermedios
        electrodomesticos[2] = new Lavadora(20, 250, "blanco", 'B', 30);
        
        // 3. Lavadora con constructor por defecto
        electrodomesticos[3] = new Lavadora();
        
        // 4. Otra Lavadora
        electrodomesticos[4] = new Lavadora(35, 280, "negro", 'C', 60);

        // 5. Television con resolución menor a 40
        electrodomesticos[5] = new Television(42, true, 500, "azul", 'D', 25);
        
        // 6. Television con resolución mayor a 40 sin sintonizador TDT
        electrodomesticos[6] = new Television(55, false, 700, "gris", 'E', 40);
        
        // 7. Television con constructor por defecto
        electrodomesticos[7] = new Television();
        
        // 8. Television con resolución elevada y sintonizador TDT
        electrodomesticos[8] = new Television(65, true, 900, "rojo", 'F', 35);
        
        // 9. Objeto Electrodomestico usando el constructor con todos los atributos heredados
        electrodomesticos[9] = new Electrodomestico("negro", 'A', 350, 80);

        // Variables para acumular los precios finales de cada categoría.
        double totalElectrodomesticos = 0;
        double totalTelevisores = 0;
        double totalLavadoras = 0;

        // Recorrer el array y ejecutar el método precioFinal() para cada objeto.
        for (int i = 0; i < electrodomesticos.length; i++) {
            double precioFinal = electrodomesticos[i].precioFinal();
            totalElectrodomesticos += precioFinal;

            // Usar instanceof para determinar la clase a la que pertenece cada objeto.
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

