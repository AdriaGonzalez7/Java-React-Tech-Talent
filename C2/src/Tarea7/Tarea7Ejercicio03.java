package Tarea7;

import java.util.Hashtable;
import javax.swing.JOptionPane;

public class Tarea7Ejercicio03{

    public static void main(String[] args) {
        ejecutarAplicacion();
    }

    // Método que encapsula toda la estructura de la aplicación
    public static void ejecutarAplicacion() {
        Hashtable<String, Double> precios = inicializarPrecios();
        Hashtable<String, Integer> stock = inicializarStock();

        boolean salir = false;
        while (!salir) {
            String menu = "Seleccione una opción:\n"
                        + "1. Añadir/Actualizar artículo\n"
                        + "2. Consultar artículo\n"
                        + "3. Listar artículos (ver en terminal)\n"
                        + "4. Salir";
            String opcion = JOptionPane.showInputDialog(null, menu, "Gestión de Stock", JOptionPane.QUESTION_MESSAGE);
            if (opcion == null) {
                break;
            }

            switch (opcion) {
                case "1":
                    añadirProducto(precios, stock);
                    break;
                case "2":
                    consultarProducto(precios, stock);
                    break;
                case "3":
                    listarProductos(precios, stock);
                    break;
                case "4":
                    salir = true;
                    JOptionPane.showMessageDialog(null, "Gracias por usar el sistema.");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opción no válida. Intente de nuevo.");
            }
        }
    }

    // Inicializa la tabla de precios con 10 productos
    public static Hashtable<String, Double> inicializarPrecios() {
        Hashtable<String, Double> precios = new Hashtable<>();
        precios.put("manzana", 2.5);
        precios.put("pera", 2.5);
        precios.put("pizza", 4.35);
        precios.put("salchicha", 6.25);
        precios.put("lasaña", 5.1);
        precios.put("piña", 3.0);
        precios.put("lomo", 4.2);
        precios.put("berenjena", 2.35);
        precios.put("plátano", 1.25);
        precios.put("patatas", 5.0);
        return precios;
    }

    // Inicializa la tabla de stock con 10 productos
    public static Hashtable<String, Integer> inicializarStock() {
        Hashtable<String, Integer> stock = new Hashtable<>();
        stock.put("manzana", 27);
        stock.put("pera", 19);
        stock.put("pizza", 12);
        stock.put("salchicha", 13);
        stock.put("lasaña", 20);
        stock.put("piña", 15);
        stock.put("lomo", 11);
        stock.put("berenjena", 15);
        stock.put("plátano", 12);
        stock.put("patatas", 26);
        return stock;
    }

    // Permite al usuario añadir o actualizar un producto en el inventario
    public static void añadirProducto(Hashtable<String, Double> precios, Hashtable<String, Integer> stock) {
        String producto = JOptionPane.showInputDialog(null, "Ingrese el nombre del producto:");
        // Verificación producto
        if (producto == null || producto.equals("")) {
            JOptionPane.showMessageDialog(null, "Nombre de producto no válido.");
            return;
        }
        producto = producto.toLowerCase();
        String precioStr = JOptionPane.showInputDialog(null, "Ingrese el precio de " + producto + ":");
        double precio = Double.parseDouble(precioStr);
        String cantidadStr = JOptionPane.showInputDialog(null, "Ingrese la cantidad de stock para " + producto + ":");
        int cantidad = Integer.parseInt(cantidadStr);

        if (precios.containsKey(producto)) {
            int stockActual = stock.get(producto);
            stock.put(producto, stockActual + cantidad);
            precios.put(producto, precio);
            JOptionPane.showMessageDialog(null, "Producto \"" + producto + "\" actualizado.\n"
                    + "Nuevo stock: " + (stockActual + cantidad) + " unidades.\n"
                    + "Precio actualizado a: " + precio + "€.");
        } else {
            precios.put(producto, precio);
            stock.put(producto, cantidad);
            JOptionPane.showMessageDialog(null, "Producto \"" + producto + "\" añadido al inventario.");
        }
    }

    // Permite al usuario consultar la información de un producto concreto
    public static void consultarProducto(Hashtable<String, Double> precios, Hashtable<String, Integer> stock) {
        String producto = JOptionPane.showInputDialog(null, "Ingrese el nombre del producto a consultar:");
        if (producto == null || producto.equals("")) {
            JOptionPane.showMessageDialog(null, "Nombre inválido.");
            return;
        }
        producto = producto.toLowerCase();
        if (precios.containsKey(producto)) {
            double precio = precios.get(producto);
            int cantidad = stock.get(producto);
            JOptionPane.showMessageDialog(null, "Producto: " + producto + "\n"
                    + "Precio: " + precio + "€\n"
                    + "Stock: " + cantidad + " unidades.");
        } else {
            JOptionPane.showMessageDialog(null, "El producto \"" + producto + "\" no se encuentra en el inventario.");
        }
    }

    // Lista todos los productos en la terminal utilizando concatenación de cadenas
    public static void listarProductos(Hashtable<String, Double> precios, Hashtable<String, Integer> stock) {
        System.out.println("----- Listado de Productos -----");
        for (String producto : precios.keySet()) {
            double precio = precios.get(producto);
            int cantidad = stock.get(producto);
            String info = "Producto: " + producto + " | Precio: " + precio + "€ | Stock: " + cantidad;
            System.out.println(info);
        }
        System.out.println("--------------------------------");
        JOptionPane.showMessageDialog(null, "La lista de productos se ha mostrado en la terminal.");
    }
}

