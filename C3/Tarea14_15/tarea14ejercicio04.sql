CREATE DATABASE IF NOT EXISTS Empleados;
USE Empleados;

CREATE TABLE Departamento (
    codigo INT NOT NULL,
    nombre VARCHAR(100) NOT NULL,
    presupuesto INT NOT NULL,
    PRIMARY KEY (codigo)
);

CREATE TABLE Empleado (
    DNI VARCHAR(9) NOT NULL,
    Nombre VARCHAR(100) NOT NULL,
    Apellidos VARCHAR(255) NOT NULL,
    Departamento INT NOT NULL,
    PRIMARY KEY (DNI),
    FOREIGN KEY (Departamento) REFERENCES Departamento (codigo)
);