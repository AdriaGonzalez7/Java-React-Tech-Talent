CREATE DATABASE IF NOT EXISTS tienda_informatica;
USE tienda_informatica;

CREATE TABLE Fabricantes (
    codigo INT NOT NULL,
    nombre VARCHAR(100) NOT NULL,
    PRIMARY KEY (codigo)
);

CREATE TABLE Articulos (
    codigo INT NOT NULL,
    nombre VARCHAR(100) NOT NULL,
    precio INT NOT NULL, 
    fabricante INT NOT NULL,
    PRIMARY KEY (codigo),
    FOREIGN KEY (fabricante) REFERENCES Fabricantes (codigo)
);
