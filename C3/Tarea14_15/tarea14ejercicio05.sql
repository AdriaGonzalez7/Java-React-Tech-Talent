CREATE DATABASE IF NOT EXISTS Los_Almacenes;
USE Los_Almacenes;

CREATE TABLE Almacen (
    codigo INT NOT NULL,
    Lugar VARCHAR(100) NOT NULL,
    Capacidad INT NOT NULL,
    PRIMARY KEY (codigo)
);

CREATE TABLE Cajas (
    NumReferencia CHAR(5),
    Contenido VARCHAR(100) NOT NULL,
    Valor INT NOT NULL,
    Almacen INT NOT NULL,
    PRIMARY KEY (NumReferencia),
    FOREIGN KEY (Almacen) REFERENCES Almacen (codigo)
);