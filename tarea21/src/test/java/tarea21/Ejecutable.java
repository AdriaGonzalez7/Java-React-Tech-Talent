package tarea21;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class Ejecutable {

    @Test
    public void testAreaCuadrado() {
        Geometria geo = new Geometria();
        int resultado = geo.areacuadrado(4);
        assertEquals(10, resultado, "El área del cuadrado debería ser 16");
    }

    @Test
    public void testAreaCirculo() {
        Geometria geo = new Geometria();
        double resultado = geo.areaCirculo(3);
        assertEquals(28.2744, resultado, 0.0001, "El área del círculo debería ser aproximadamente 28.27");
    }

    @Test
    public void testAreaTriangulo() {
        Geometria geo = new Geometria();
        int resultado = geo.areatriangulo(4, 6);
        assertEquals(12, resultado, "El área del triángulo debería ser 12");
    }

    @Test
    public void testAreaRectangulo() {
        Geometria geo = new Geometria();
        int resultado = geo.arearectangulo(5, 10);
        assertEquals(50, resultado, "El área del rectángulo debería ser 50");
    }

    @Test
    public void testAreaPentagono() {
        Geometria geo = new Geometria();
        int resultado = geo.areapentagono(6, 8);
        assertEquals(24, resultado, "El área del pentágono debería ser 24");
    }
}



