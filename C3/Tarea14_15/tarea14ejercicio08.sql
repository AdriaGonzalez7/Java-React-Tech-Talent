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

INSERT INTO Piezas (codigo, nombre) VALUES (1, 'Pieza 1');
INSERT INTO Piezas (codigo, nombre) VALUES (2, 'Pieza 2');
INSERT INTO Piezas (codigo, nombre) VALUES (3, 'Pieza 3');
INSERT INTO Piezas (codigo, nombre) VALUES (4, 'Pieza 4');
INSERT INTO Piezas (codigo, nombre) VALUES (5, 'Pieza 5');
INSERT INTO Piezas (codigo, nombre) VALUES (6, 'Pieza 6');
INSERT INTO Piezas (codigo, nombre) VALUES (7, 'Pieza 7');
INSERT INTO Piezas (codigo, nombre) VALUES (8, 'Pieza 8');
INSERT INTO Piezas (codigo, nombre) VALUES (9, 'Pieza 9');
INSERT INTO Piezas (codigo, nombre) VALUES (10, 'Pieza 10');

INSERT INTO Proveedores (Id, Nombre) VALUES ('1', 'Proveedor 1');
INSERT INTO Proveedores (Id, Nombre) VALUES ('2', 'Proveedor 2');
INSERT INTO Proveedores (Id, Nombre) VALUES ('3', 'Proveedor 3');
INSERT INTO Proveedores (Id, Nombre) VALUES ('4', 'Proveedor 4');
INSERT INTO Proveedores (Id, Nombre) VALUES ('5', 'Proveedor 5');
INSERT INTO Proveedores (Id, Nombre) VALUES ('6', 'Proveedor 6');
INSERT INTO Proveedores (Id, Nombre) VALUES ('7', 'Proveedor 7');
INSERT INTO Proveedores (Id, Nombre) VALUES ('8', 'Proveedor 8');
INSERT INTO Proveedores (Id, Nombre) VALUES ('9', 'Proveedor 9');
INSERT INTO Proveedores (Id, Nombre) VALUES ('10', 'Proveedor 10');

INSERT INTO Suministra (CodigoPieza, IdProveedor, Precio) VALUES (1, '1', 100);
INSERT INTO Suministra (CodigoPieza, IdProveedor, Precio) VALUES (2, '2', 200);
INSERT INTO Suministra (CodigoPieza, IdProveedor, Precio) VALUES (3, '3', 300);
INSERT INTO Suministra (CodigoPieza, IdProveedor, Precio) VALUES (4, '4', 400);
INSERT INTO Suministra (CodigoPieza, IdProveedor, Precio) VALUES (5, '5', 500);
INSERT INTO Suministra (CodigoPieza, IdProveedor, Precio) VALUES (6, '6', 600);
INSERT INTO Suministra (CodigoPieza, IdProveedor, Precio) VALUES (7, '7', 700);
INSERT INTO Suministra (CodigoPieza, IdProveedor, Precio) VALUES (8, '8', 800);
INSERT INTO Suministra (CodigoPieza, IdProveedor, Precio) VALUES (9, '9', 900);
INSERT INTO Suministra (CodigoPieza, IdProveedor, Precio) VALUES (10, '10', 1000);














