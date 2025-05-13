CREATE DATABASE IF NOT EXISTS Los_Directores;
USE Los_Directores;

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

INSERT INTO Despachos (numero, Capacidad) VALUES (1, 10);
INSERT INTO Despachos (numero, Capacidad) VALUES (2, 20);
INSERT INTO Despachos (numero, Capacidad) VALUES (3, 30);
INSERT INTO Despachos (numero, Capacidad) VALUES (4, 40);
INSERT INTO Despachos (numero, Capacidad) VALUES (5, 50);
INSERT INTO Despachos (numero, Capacidad) VALUES (6, 60);
INSERT INTO Despachos (numero, Capacidad) VALUES (7, 70);
INSERT INTO Despachos (numero, Capacidad) VALUES (8, 80);
INSERT INTO Despachos (numero, Capacidad) VALUES (9, 90);
INSERT INTO Despachos (numero, Capacidad) VALUES (10, 100);

INSERT INTO Directores (DNI, NomApels, DNIJefe, Despacho) VALUES ('45678912K', 'Juan Perez', '45678912K', 1);
INSERT INTO Directores (DNI, NomApels, DNIJefe, Despacho) VALUES ('78234561M', 'Maria Lopez', '78234561M', 2);
INSERT INTO Directores (DNI, NomApels, DNIJefe, Despacho) VALUES ('23456789P', 'Pedro Gomez', '45678912K', 3);
INSERT INTO Directores (DNI, NomApels, DNIJefe, Despacho) VALUES ('34567891L', 'Ana Torres', '45678912K', 4);
INSERT INTO Directores (DNI, NomApels, DNIJefe, Despacho) VALUES ('56789123H', 'Luis Martinez', '45678912K', 5);
INSERT INTO Directores (DNI, NomApels, DNIJefe, Despacho) VALUES ('89123456Q', 'Laura Rodriguez', '45678912K', 6);
INSERT INTO Directores (DNI, NomApels, DNIJefe, Despacho) VALUES ('67891234X', 'Carlos Lopez', '78234561M', 7);
INSERT INTO Directores (DNI, NomApels, DNIJefe, Despacho) VALUES ('12345678Z', 'Sofia Torres', '78234561M', 8);
INSERT INTO Directores (DNI, NomApels, DNIJefe, Despacho) VALUES ('90123456B', 'Miguel Garcia', '45678912K', 9);
INSERT INTO Directores (DNI, NomApels, DNIJefe, Despacho) VALUES ('45612378N', 'Eva Hernandez', '45678912K', 10);









