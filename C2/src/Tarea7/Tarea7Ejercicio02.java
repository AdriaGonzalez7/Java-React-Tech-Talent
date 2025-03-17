
package Tarea7;

import java.util.ArrayList;
import java.util.Scanner;

public class Tarea7Ejercicio02 {

    public static void main(String[] args) {
        ArrayList<Double> carrito = RellenarArrayList();
        ArrayList<Double> listaIVA = ArrayIVA(carrito);
        suma(listaIVA);
        cambio(suma(listaIVA));
    }

    public static ArrayList<Double> RellenarArrayList() {
        double precioProducto;
        ArrayList<Double> carrito = new ArrayList<>();

        System.out.println("Caja de supermercado");
        System.out.print("Número de productos: ");
        Scanner sc = new Scanner(System.in);
        int numProductos = sc.nextInt();

        for (int i = 0; i < numProductos; i++) {
            do {
                System.out.print("Introduce el precio del producto " + (i + 1) + ": ");
                precioProducto = sc.nextDouble();
            } while (precioProducto <= 0);

            carrito.add(precioProducto);
        }
        System.out.println("Número de productos comprados: " + numProductos);
        return carrito;
    }

    public static ArrayList<Double> ArrayIVA (ArrayList<Double> carrito) {
        double IVA;
        ArrayList<Double> listaIVA = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < carrito.size(); i++) {
            do {
                System.out.print("Introduce el IVA para el producto " + (i + 1) + " (21 o 4): ");
                IVA = sc.nextDouble();
            } while (IVA != 21 && IVA != 4);
         
            listaIVA.add(IVA);
        }

        for (int i = 0; i < carrito.size(); i++) {
            double precioConIVA = carrito.get(i) * (1 + (listaIVA.get(i) / 100));
            listaIVA.set(i, precioConIVA);
        }
        System.out.println("Carrito sin IVA: " + carrito);
        System.out.println("Carrito con IVA: " + listaIVA);
        return listaIVA;
    }
    
    public static double suma( ArrayList<Double> listaIVA) {
    	double sum = 0;
    	for (int i = 0; i < listaIVA.size(); i++) {
    		sum += listaIVA.get(i);
    	}
        System.out.println("Precio Total: " + sum);
    	return sum;
    }
    
    public static double cambio(Double sum) {
    	Scanner sc = new Scanner(System.in);
    	System.out.println("Importe introducido: ");
    	double pago = sc.nextDouble();
    	double cambio = pago - sum;
    	System.out.println("El cambio es:" + cambio);
    	return cambio;
  }

    
}

    
