package Tarea6;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Tarea6Ejercicio11 {

    public static void main(String[] args) {
        int[] resultado = RandomArray1();
        System.out.println("El primer array es: " + Arrays.toString(resultado));
        
        int[] array2 = CopiarArray(resultado); 
        System.out.println("El segundo array (copia randomizada) es: " + Arrays.toString(array2));
        
        int[] array3 = MultiplicarArrays(resultado, array2);
        System.out.println("El array resultante de la multiplicación es: " + Arrays.toString(array3));
    }

     public static int[] RandomArray1() {
            Random rand = new Random();
            Scanner sc = new Scanner(System.in);
            
            System.out.println("Introduce el tamaño del array 1: ");
            int rango1 = sc.nextInt();
            int lista11[] = new int[rango1];

            for (int i = 0; i < lista11.length; i++) {
                lista11[i] = rand.nextInt(15) + 1;  
            }

            return lista11; 
        }
     public static int[] CopiarArray(int [] ArrayOriginal) {
         int[] CopiaArray = new int[ArrayOriginal.length];
            for (int i = 0; i < ArrayOriginal.length; i++) {
                CopiaArray[i] = ArrayOriginal[i];
            }
            Random rand = new Random();
            int listaRandom = rand.nextInt(5) + 1; 
            System.out.println("Factor aleatorio: " + listaRandom);
                for (int i = 0; i < CopiaArray.length; i++) {
                    CopiaArray[i] *= listaRandom;
                }
            return CopiaArray;
     }
     
    public static int [] MultiplicarArrays (int a[], int b[]) {
        int[] resultado = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            resultado[i] = a[i] * b[i];
            }
        return resultado;

        }
    }
	

