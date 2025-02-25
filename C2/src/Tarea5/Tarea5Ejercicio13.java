package Tarea5;

import javax.swing.JOptionPane;

public class Tarea5Ejercicio13 {

	public static void main(String[] args) {
		
		int operando = 0;		//Inicializamos variables
        int operando2 = 0;
        double resultado = 0;
        JOptionPane.showMessageDialog(null, "Calculadora Inversa");		//Mostramos mensaje bienvenida
        operando = Integer.parseInt(JOptionPane.showInputDialog("Introduce el primer operando: "));	//Pedimos operandos y operador
        operando2 = Integer.parseInt(JOptionPane.showInputDialog("Introduce el segundo operando: "));
        String operador = JOptionPane.showInputDialog("Introduce el operador: ");
        switch (operador) {		//Según el operador, realizamos la operación correspondiente
		case "+":
			resultado = operando + operando2;
			JOptionPane.showMessageDialog(null, "El resultado de la suma es: " + (int) resultado);
			break;
		case "-":
			resultado = operando - operando2;
			JOptionPane.showMessageDialog(null, "El resultado de la resta es: " + (int) resultado);
		    break;
		case "*":
			resultado = operando * operando2;
			JOptionPane.showMessageDialog(null, "El resultado de la multiplicación es: " + (int) resultado);
			break;
		case "/":
			resultado = (double) operando / operando2; 
			JOptionPane.showMessageDialog(null, "El resultado de la división es: " + resultado);
			break;
		case "^":
			resultado = Math.pow(operando, operando2);
			JOptionPane.showMessageDialog(null, "El resultado de la potencia es: " + (int) resultado);
			break;
		case "%":
			resultado = operando % operando2;
			JOptionPane.showMessageDialog(null, "El resultado del módulo es: " + (int) resultado);
			break;
        } 
	}
}
