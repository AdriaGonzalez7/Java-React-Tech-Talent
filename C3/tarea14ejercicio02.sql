CREATE DATABASE IF NOT EXISTS Biblioteca;
USE Biblioteca;

CREATE TABLE Libro (
    ClaveLibro INT NOT NULL,
    Titulo VARCHAR(60) NOT NULL,
    Idioma VARCHAR(15) NOT NULL,
    Formato VARCHAR(15) NOT NULL,
    ClaveEditorial INT NOT NULL,
    PRIMARY KEY (ClaveLibro)
);

CREATE TABLE Tema (
    ClaveTema SMALLINT NOT NULL,
    Nombre VARCHAR(40) NOT NULL,
    PRIMARY KEY (ClaveTema)
);

CREATE TABLE Autor (
    ClaveAutor INT NOT NULL,
    Nombre VARCHAR(60) NOT NULL,
    PRIMARY KEY (ClaveAutor)
);

CREATE TABLE Editorial (
    ClaveEditorial SMALLINT NOT NULL,
    Nombre VARCHAR(60) NOT NULL,
    Direccion VARCHAR(60) NOT NULL,
    Telefono VARCHAR(15) NOT NULL,
    PRIMARY KEY (ClaveEditorial)
);

CREATE TABLE Ejemplar (
    ClaveEjemplar SMALLINT NOT NULL,
    ClaveLibro INT NOT NULL,
    NumeroOrden SMALLINT NOT NULL,
    Edicion SMALLINT NOT NULL,
    Ubicacion VARCHAR(15) NOT NULL,
    Categoria CHAR(1) NOT NULL,
    PRIMARY KEY (ClaveEjemplar),
    FOREIGN KEY (ClaveLibro) REFERENCES Libro (ClaveLibro)
);

CREATE TABLE Socio (
    ClaveSocio INT NOT NULL,
    Nombre VARCHAR(60) NOT NULL,
    Direccion VARCHAR(60) NOT NULL,
    Telefono VARCHAR(15) NOT NULL,
    Categoria CHAR(1) NOT NULL,
    PRIMARY KEY (ClaveSocio)
);

CREATE TABLE Prestamo (
    ClaveSocio INT NOT NULL,
    ClaveEjemplar SMALLINT NOT NULL,
)