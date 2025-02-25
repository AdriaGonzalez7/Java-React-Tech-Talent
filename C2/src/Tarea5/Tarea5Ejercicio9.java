package Tarea5;

public class Tarea5Ejercicio9 {

	public static void main(String[] args) {
		for(double num = 1; num < 101; num++) {		//Creamos un bucle for que recorre los números del 1 al 100
		while ((num%2 == 0)||(num%3 == 0)){		//Añadimos condicion que solo muestre los números que sean divisibles por 2 o 3
			System.out.println(num);
			num++;
			}
		}
	}
	
}