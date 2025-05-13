CREATE DATABASE IF NOT EXISTS piezas_proveedores;
USE piezas_proveedores;

CREATE TABLE Piezas (
    codigo INT NOT NULL,
    nombre VARCHAR(100) NOT NULL,
    PRIMARY KEY (codigo)
);

CREATE TABLE Proveedores (
    Id CHAR(4) NOT NULL,
    Nombre VARCHAR(100) NOT NULL,
    PRIMARY KEY (Id) 
);

CREATE TABLE Suministra (
    CodigoPieza INT NOT NULL,
    IdProveedor CHAR(4) NOT NULL,
    Precio INT NOT NULL,
    PRIMARY KEY (CodigoPieza, IdProveedor),
    FOREIGN KEY (CodigoPieza) REFERENCES Piezas (codigo),
    FOREIGN KEY (IdProveedor) REFERENCES Proveedores (Id)
);