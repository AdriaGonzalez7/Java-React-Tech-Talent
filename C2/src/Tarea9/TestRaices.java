package Tarea9;

public class TestRaices {
    public static void main(String[] args) {
        // Ejemplo con dos soluciones reales: Discriminante > 0
        Ecuacion2Grado ecuacion1 = new Ecuacion2Grado(1, -5, 6); //  Discriminante = 1, soluciones: 3 y 2
        ecuacion1.calcular();
        
        // Ejemplo con una única solución: Discriminante = 0
        Ecuacion2Grado ecuacion2 = new Ecuacion2Grado(1, -4, 4); //  Discriminante = 0, solución: 2
        ecuacion2.calcular();
        
        // Ejemplo sin solución real: Discriminante < 0
        Ecuacion2Grado ecuacion3 = new Ecuacion2Grado(1, 2, 5);  //  Discriminante = -16
        ecuacion3.calcular();
    }
}

