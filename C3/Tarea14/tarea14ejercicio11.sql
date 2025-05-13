CREATE DATABASE IF NOT EXISTS Los_investigadores;
USE Los_investigadores;

CREATE TABLE Facultad (
    codigo INT NOT NULL,
    Nombre VARCHAR(100) NOT NULL,
    PRIMARY KEY (codigo)
);

CREATE TABLE Investigador (
    DNI VARCHAR(9) NOT NULL,
    NomApels VARCHAR(100) NOT NULL,
    Facultad INT NOT NULL,
    PRIMARY KEY (DNI),
    FOREIGN KEY (Facultad) REFERENCES Facultad (codigo)
);

CREATE TABLE Equipos (
    NumSerie CHAR(4) NOT NULL,
    Nombre VARCHAR (100) NOT NULL,
    Facultad INT NOT NULL,
    PRIMARY KEY (NumSerie),
    FOREIGN KEY (Facultad) REFERENCES Facultad (codigo)
);

CREATE TABLE Reserva (
    DNI VARCHAR(9) NOT NULL,
    NumSerie CHAR(4) NOT NULL,
    Comienzo DATE NOT NULL,
    Fin DATE NOT NULL,
    PRIMARY KEY (DNI, NumSerie),
    FOREIGN KEY (DNI) REFERENCES Investigador (DNI),
    FOREIGN KEY (NumSerie) REFERENCES Equipos (NumSerie)
);