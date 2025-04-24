package Tarea9;

public class TestAula {
    public static void main(String[] args) {
        Aula aula = new Aula(101, 30, "Matemáticas");

        Profesor profesor = new Profesor("Juan Pérez", 45, "M", "Matemáticas");
        aula.setProfesor(profesor);

        aula.añadirEstudiante(new Estudiante("Ana Gómez", 20, "F", 7));
        aula.añadirEstudiante(new Estudiante("Luis Martínez", 22, "M", 4.5));
        aula.añadirEstudiante(new Estudiante("Carlos Ruiz", 19, "M", 6));
        aula.añadirEstudiante(new Estudiante("María López", 21, "F", 8));
        aula.añadirEstudiante(new Estudiante("Elena Sánchez", 23, "F", 3));
        
        aula.imprimirAlumnosAprobados();
    }
}
