CREATE DATABASE IF NOT EXISTS estaciones;
USE estaciones;

CREATE TABLE Estacion (
    Identificador INT NOT NULL,
    Latitud DECIMAL(9,6) NOT NULL,
    Longitud DECIMAL(9,6) NOT NULL,
    Altitud DECIMAL(5,2) NOT NULL,
    PRIMARY KEY (Identificador)
);

CREATE TABLE Muestra (
    IdentificadorEstacion INT NOT NULL,
    Fecha DATE NOT NULL,
    TempreaturaMinima DECIMAL(5,2) NOT NULL,
    TemperaturaMaxima DECIMAL(5,2) NOT NULL,
    Precipitaciones DECIMAL(5,2) NOT NULL,
    HumedadMinima DECIMAL(5,2) NOT NULL,
    HumedadMaxima DECIMAL(5,2) NOT NULL,
    VelocidadVientoMin DECIMAL(5,2) NOT NULL,
    VelocidadVientoMax DECIMAL(5,2) NOT NULL,
    FOREIGN KEY (IdentificadorEstacion) REFERENCES Estacion (Identificador)
);