CREATE DATABASE IF NOT EXISTS Academia_idiomas;
USE Academia_idiomas;


CREATE TABLE Profesores (
    codigo INT NOT NULL AUTO_INCREMENT,
    DNI VARCHAR(9) NOT NULL UNIQUE,
    nombre VARCHAR(50) NOT NULL UNIQUE,
    apellido1 VARCHAR(50) NOT NULL,
    apellido2 VARCHAR(50) NOT NULL,
    direccion VARCHAR(50) NOT NULL,
    titulacion VARCHAR(50) NOT NULL,
    gana DECIMAL(5,2) NOT NULL,
    PRIMARY KEY (codigo)
);

CREATE TABLE Cursos (
    codigo INT NOT NULL AUTO_INCREMENT,
    nombre VARCHAR(50) NOT NULL UNIQUE,
    num_max_alumnos INT NOT NULL,
    profesor INT NOT NULL,
    fecha_inicio DATE NOT NULL CHECK (fecha_inicio < fecha_fin),
    fecha_fin DATE NOT NULL CHECK (fecha_fin > fecha_inicio),
    num_horas_curso INT NOT NULL CHECK (num_horas_curso > 0),
    PRIMARY KEY (codigo),
    FOREIGN KEY (profesor) REFERENCES Profesores(codigo)
);

CREATE TABLE Alumnos (
    codigo INT NOT NULL AUTO_INCREMENT,
    nombre VARCHAR(50) NOT NULL,
    apellido1 VARCHAR(50) NOT NULL,
    apellido2 VARCHAR(50) NOT NULL,
    DNI VARCHAR(9) NOT NULL UNIQUE,
    direccion VARCHAR(50) NOT NULL,
    fecha_nacimiento DATE NOT NULL,
    sexo VARCHAR(1) NOT NULL CHECK (sexo IN ('H', 'M')),
    curso INT NOT NULL,
    PRIMARY KEY (codigo),
    FOREIGN KEY (curso) REFERENCES Cursos(codigo)
);
    

