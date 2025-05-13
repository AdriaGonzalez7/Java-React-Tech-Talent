CREATE DATABASE IF NOT EXISTS grandes_almacenes;
USE grandes_almacenes;

CREATE TABLE Productos (
    codigo INT NOT NULL,
    Nombre VARCHAR(100) NOT NULL,
    Precio INT NOT NULL,
    PRIMARY KEY (codigo)
);

CREATE TABLE Cajeros (
    codigo INT NOT NULL,
    NomApels VARCHAR(255) NOT NULL,
    PRIMARY KEY (codigo)
);

CREATE TABLE Maquinas_registradas (
    codigo INT NOT NULL,
    Piso INT NOT NULL,
    PRIMARY KEY (codigo)
);

CREATE TABLE Ventas (
    Cajero INT NOT NULL,
    Maquina INT NOT NULL,
    Producto INT NOT NULL,
    PRIMARY KEY (Cajero, Maquina, Producto),
    FOREIGN KEY (Cajero) REFERENCES Cajeros (codigo),
    FOREIGN KEY (Maquina) REFERENCES Maquinas_registradas (codigo),
    FOREIGN KEY (Producto) REFERENCES Productos (codigo)
);