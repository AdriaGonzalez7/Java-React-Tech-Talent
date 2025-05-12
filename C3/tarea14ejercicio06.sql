CREATE DATABASE IF NOT EXISTS cine;
USE cine;

CREATE TABLE Peliculas (
    codigo INT NOT NULL,
    Nombre VARCHAR(100) NOT NULL,
    CalificacionEdad INT NOT NULL,
    PRIMARY KEY (codigo)
);

CREATE TABLE Salas (
    codigo INT NOT NULL,
    Nombre VARCHAR(100) NOT NULL,
    Pelicula INT NOT NULL,
    FOREIGN KEY (Pelicula) REFERENCES Peliculas (codigo)
);