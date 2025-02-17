package Tarea4;

public class Tarea4Ejercicio5 {

	public static void main(String[] args) {
		int A = 1, B= 2, C= 3, D=4, FinalB=B;
		B=C;
		C=A;
		A=D;
		D=FinalB;
		System.out.println("Valores: \n" + "A= "+ A + "\nB= " + B + "\nC= " + C + "\nD= " + D );
	}

}

/*B=C;
C=A;
A=D;
D=B;
System.out.println("Valores: \n" + "A= "+ A + "\nB= " + B + "\nC= " + C + "\nD= " + D );*/