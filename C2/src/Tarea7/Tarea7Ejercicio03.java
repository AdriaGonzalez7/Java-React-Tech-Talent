package Tarea7;

import java.util.Enumeration;
import java.util.HashMap;
import java.util.Hashtable;

import javax.swing.JOptionPane;

public class Tarea7Ejercicio03 {

	
	 public static void main(String[] args) {
	        HashMap<String, Object> miHashtable = crearHashtable();
	        System.out.println(miHashtable);
	        miHashtable = modificarHashtable(miHashtable);
	        System.out.println("Productos modificados: " + miHashtable);
	        listarHashtable(miHashtable);

	    
	 public static HashMap<String, Object> crearHashtable() {
	        HashMap<Double, Integer> propiedades = new HashMap<>();
	        HashMap<String, Object> contenedor = new HashMap<>();
	        contenedor.put("Manzana", propiedades);
	        contenedor.put("Pera", propiedades);
	        contenedor.put("Aguacate", propiedades);
	        contenedor.put("Patatas", propiedades);
	        contenedor.put("Chorizo", propiedades);
	        contenedor.put("Fuet", propiedades);
	        contenedor.put("Queso", propiedades);
	        contenedor.put("Pizza", propiedades);
	        contenedor.put("Harina", propiedades);
	        contenedor.put("Huevo", propiedades);
	        
	        propiedades.put(3.0, 5);
	        propiedades.put(4.0, 3);
	        propiedades.put(3.5, 5);
	        propiedades.put(5.0, 2);
	        propiedades.put(5.6, 7);
	        propiedades.put(8.0, 9);
	        propiedades.put(4.3, 12);
	        propiedades.put(6.5, 7);
	        propiedades.put(2.2, 7);
	        propiedades.put(1.5, 22);

	        return contenedor;
	 } 

	 
	 public static HashMap<String, Object> modificarHashtable(HashMap<String, Object> propiedades, HashMap<String, Object> contenedor){
		 
		 while (true) {
	            String newProduct = JOptionPane.showInputDialog("Añade un nuevo producto o deja vacío para salir:");
	            
	            if (newProduct == null || newProduct.trim().isEmpty()) {
	                break;
	            }
	            
	            String stock = JOptionPane.showInputDialog("Añade la cantidad del producto:");
	            
	            if (stock == null || stock.trim().isEmpty()) {
	                JOptionPane.showMessageDialog(null, "Debes ingresar una cantidad válida.");
	                continue;
	            }
	            String newPrecio = JOptionPane.showInputDialog("Añade el precio del producto o deja vacío para salir:");
	            
	            if (newPrecio == null || newPrecio.trim().isEmpty()) {
	                break;
	            }
	            contenedor.put(newProduct, propiedades);
	            propiedades.put(stock, newPrecio);
	            

		 }
		 return contenedor;
	 }
	 
	 public static HashMap<String, Object> listarHashtable(HashMap<String, Object> contenedor){
         JOptionPane.showMessageDialog(null, "Consulta un producto");
         String consultProduct = JOptionPane.showInputDialog("Que prodcuto quieres consultar:");
         System.out.println(contenedor.get(consultProduct));
         return contenedor;


	 }

}
	 


