package Tarea9.Ej05PersonaAula;

import java.util.ArrayList;

public class Aula {
    private int id;
    private int maxEstudiantes;
    private String materia; 
    private Profesor profesor;
    private ArrayList<Estudiante> estudiantes;

    public Aula(int id, int maxEstudiantes, String materia) {
        this.id = id;
        this.maxEstudiantes = maxEstudiantes;
        this.materia = materia;
        estudiantes = new ArrayList<>();
    }

    // Getters y Setters
    public int getId() {
        return id;
    }

    public int getMaxEstudiantes() {
        return maxEstudiantes;
    }

    public String getMateria() {
        return materia;
    }

    public Profesor getProfesor() {
        return profesor;
    }

    public ArrayList<Estudiante> getEstudiantes() {
        return estudiantes;
    }

    public void setProfesor(Profesor profesor) {
        this.profesor = profesor;
    }

    public boolean añadirEstudiante(Estudiante e) {
        if (estudiantes.size() < maxEstudiantes) {
            estudiantes.add(e);
            return true;
        }
        return false;
    }

    public boolean puedeDarseClase() {
        if (profesor == null) {
            System.out.println("No hay profesor asignado.");
            return false;
        }

        if (!profesor.EstaDisponible()) {
            System.out.println("El profesor no está disponible.");
            return false;
        }

        if (!materia.equalsIgnoreCase(profesor.getMateria())) {
            System.out.println("El profesor no imparte la materia correspondiente al aula.");
            return false;
        }

        if (estudiantes.isEmpty()) {
            System.out.println("No hay estudiantes en el aula.");
            return false;
        }

        int presentes = 0;
        for (Estudiante e : estudiantes) {
            if (e.EstaDisponible()) {
                presentes++;
            }
        }

        double porcentajePresentes = (double) presentes / estudiantes.size();
        if (porcentajePresentes <= 0.5) {
            System.out.println("No asisten más del 50% de los estudiantes.");
            return false;
        }

        return true;
    }

    public void imprimirAlumnosAprobados() {
        if (puedeDarseClase()) {
            int aprobadosMasculinos = 0;
            int aprobadasFemeninas = 0;

            for (Estudiante e : estudiantes) {
                if (e.getCalificacionactual() >= 5.0) {
                    if (e.getSexo().equalsIgnoreCase("M")) {
                        aprobadosMasculinos++;
                    } else if (e.getSexo().equalsIgnoreCase("F")) {
                        aprobadasFemeninas++;
                    }
                }
            }
            System.out.println("Alumnos aprobados (masculinos): " + aprobadosMasculinos);
            System.out.println("Alumnas aprobadas (femeninas): " + aprobadasFemeninas);
        } else {
            System.out.println("No se puede dar clase, por lo tanto no se pueden mostrar los alumnos aprobados.");
        }
    }
}



