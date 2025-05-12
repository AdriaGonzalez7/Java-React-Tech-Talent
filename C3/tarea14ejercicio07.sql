CREATE DATABASE IF NOT EXISTS Los_Directores;
USE DATABASE Los_Directores;

CREATE TABLE Despachos (
    numero INT NOT NULL,
    Capacidad INT NOT NULL,
    PRIMARY KEY (numero) 
);

CREATE TABLE Directores (
    DNI VARCHAR(9) NOT NULL,
    NomApels VARCHAR(255) NOT NULL,
    DNIJefe VARCHAR(9) NOT NULL,
    Despacho INT NOT NULL,
    PRIMARY KEY (DNI),
    FOREIGN KEY (Despacho) REFERENCES Despachos (numero),
    FOREIGN KEY (DNIJefe) REFERENCES Directores (DNI)
);

