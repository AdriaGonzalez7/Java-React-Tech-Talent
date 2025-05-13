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

INSERT INTO Productos (codigo, Nombre, Precio) VALUES (1, 'Producto 1', 100);
INSERT INTO Productos (codigo, Nombre, Precio) VALUES (2, 'Producto 2', 200);
INSERT INTO Productos (codigo, Nombre, Precio) VALUES (3, 'Producto 3', 300);
INSERT INTO Productos (codigo, Nombre, Precio) VALUES (4, 'Producto 4', 400);
INSERT INTO Productos (codigo, Nombre, Precio) VALUES (5, 'Producto 5', 500);
INSERT INTO Productos (codigo, Nombre, Precio) VALUES (6, 'Producto 6', 600);
INSERT INTO Productos (codigo, Nombre, Precio) VALUES (7, 'Producto 7', 700);
INSERT INTO Productos (codigo, Nombre, Precio) VALUES (8, 'Producto 8', 800);
INSERT INTO Productos (codigo, Nombre, Precio) VALUES (9, 'Producto 9', 900);
INSERT INTO Productos (codigo, Nombre, Precio) VALUES (10, 'Producto 10', 1000);

INSERT INTO Cajeros (codigo, NomApels) VALUES (1, 'Cajero 1');
INSERT INTO Cajeros (codigo, NomApels) VALUES (2, 'Cajero 2');
INSERT INTO Cajeros (codigo, NomApels) VALUES (3, 'Cajero 3');
INSERT INTO Cajeros (codigo, NomApels) VALUES (4, 'Cajero 4');
INSERT INTO Cajeros (codigo, NomApels) VALUES (5, 'Cajero 5');
INSERT INTO Cajeros (codigo, NomApels) VALUES (6, 'Cajero 6');
INSERT INTO Cajeros (codigo, NomApels) VALUES (7, 'Cajero 7');
INSERT INTO Cajeros (codigo, NomApels) VALUES (8, 'Cajero 8');
INSERT INTO Cajeros (codigo, NomApels) VALUES (9, 'Cajero 9');
INSERT INTO Cajeros (codigo, NomApels) VALUES (10, 'Cajero 10');

INSERT INTO Maquinas_registradas (codigo, Piso) VALUES (1, 1);
INSERT INTO Maquinas_registradas (codigo, Piso) VALUES (2, 2);
INSERT INTO Maquinas_registradas (codigo, Piso) VALUES (3, 3);
INSERT INTO Maquinas_registradas (codigo, Piso) VALUES (4, 4);
INSERT INTO Maquinas_registradas (codigo, Piso) VALUES (5, 5);
INSERT INTO Maquinas_registradas (codigo, Piso) VALUES (6, 6);
INSERT INTO Maquinas_registradas (codigo, Piso) VALUES (7, 7);
INSERT INTO Maquinas_registradas (codigo, Piso) VALUES (8, 8);
INSERT INTO Maquinas_registradas (codigo, Piso) VALUES (9, 9);
INSERT INTO Maquinas_registradas (codigo, Piso) VALUES (10, 10);

INSERT INTO Ventas (Cajero, Maquina, Producto) VALUES (1, 1, 1);
INSERT INTO Ventas (Cajero, Maquina, Producto) VALUES (2, 2, 2);
INSERT INTO Ventas (Cajero, Maquina, Producto) VALUES (3, 3, 3);
INSERT INTO Ventas (Cajero, Maquina, Producto) VALUES (4, 4, 4);
INSERT INTO Ventas (Cajero, Maquina, Producto) VALUES (5, 5, 5);
INSERT INTO Ventas (Cajero, Maquina, Producto) VALUES (6, 6, 6);
INSERT INTO Ventas (Cajero, Maquina, Producto) VALUES (7, 7, 7);
INSERT INTO Ventas (Cajero, Maquina, Producto) VALUES (8, 8, 8);
INSERT INTO Ventas (Cajero, Maquina, Producto) VALUES (9, 9, 9);
INSERT INTO Ventas (Cajero, Maquina, Producto) VALUES (10, 10, 10);













