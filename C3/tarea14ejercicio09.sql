CREATE DATABASE IF NOT EXISTS Los_cientificos;
USE Los_cientificos;

CREATE TABLE Cientificos (
    DNI VARCHAR(9) NOT NULL,
    NomApels VARCHAR(255) NOT NULL,
    PRIMARY KEY (DNI)
);

CREATE TABLE Proyectos (
    Id CHAR(4) NOT NULL,
    Nombre VARCHAR(255) NOT NULL,
    Horas INT NOT NULL,
    PRIMARY KEY (Id) NOT NULL
);

CREATE TABLE Asignado_a (
    Cientifico VARCHAR(9) NOT NULL,
    Proyecto CHAR(4) NOT NULL,
    PRIMARY KEY (Cientifico, Proyecto),
    FOREIGN KEY (Cientifico) REFERENCES Cientificos (DNI),
    FOREIGN KEY (Proyecto) REFERENCES Proyectos (Id)
);