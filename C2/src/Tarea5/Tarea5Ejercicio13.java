package Tarea5;

import javax.swing.JOptionPane;

public class Tarea5Ejercicio13 {

	public static void main(String[] args) {
		//Crea una aplicación llamada CalculadoraInversa, nos pedirá 2 operandos (int) y un signo
//		aritmético (String), según este último se realizara la operación correspondiente. Al final
//		mostrara el resultado en un cuadro de dialogo.
		
		int operando = 0;
        int operando2 = 0;
        JOptionPane.showMessageDialog(null, "Calculadora Inversa");
        operando = Integer.parseInt(JOptionPane.showInputDialog("Introduce el primer operando: "));
        operando2 = Integer.parseInt(JOptionPane.showInputDialog("Introduce el segundo operando: "));
        String operador = JOptionPane.showInputDialog("Introduce el operador: ");
        double resultado = 0;
        switch (operador) {
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
