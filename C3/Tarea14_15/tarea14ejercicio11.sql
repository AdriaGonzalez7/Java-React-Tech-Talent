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

INSERT INTO Facultad (codigo, Nombre) VALUES (1, 'Facultad 1');
INSERT INTO Facultad (codigo, Nombre) VALUES (2, 'Facultad 2');
INSERT INTO Facultad (codigo, Nombre) VALUES (3, 'Facultad 3');
INSERT INTO Facultad (codigo, Nombre) VALUES (4, 'Facultad 4');
INSERT INTO Facultad (codigo, Nombre) VALUES (5, 'Facultad 5');
INSERT INTO Facultad (codigo, Nombre) VALUES (6, 'Facultad 6');
INSERT INTO Facultad (codigo, Nombre) VALUES (7, 'Facultad 7');
INSERT INTO Facultad (codigo, Nombre) VALUES (8, 'Facultad 8');
INSERT INTO Facultad (codigo, Nombre) VALUES (9, 'Facultad 9');
INSERT INTO Facultad (codigo, Nombre) VALUES (10, 'Facultad 10');

INSERT INTO Investigador (DNI, NomApels, Facultad) VALUES ('12345678A', 'Investigador 1', 1);
INSERT INTO Investigador (DNI, NomApels, Facultad) VALUES ('98765432B', 'Investigador 2', 2);
INSERT INTO Investigador (DNI, NomApels, Facultad) VALUES ('11111111C', 'Investigador 3', 3);
INSERT INTO Investigador (DNI, NomApels, Facultad) VALUES ('22222222D', 'Investigador 4', 4);
INSERT INTO Investigador (DNI, NomApels, Facultad) VALUES ('33333333E', 'Investigador 5', 5);
INSERT INTO Investigador (DNI, NomApels, Facultad) VALUES ('44444444F', 'Investigador 6', 6);
INSERT INTO Investigador (DNI, NomApels, Facultad) VALUES ('55555555G', 'Investigador 7', 7);
INSERT INTO Investigador (DNI, NomApels, Facultad) VALUES ('66666666H', 'Investigador 8', 8);
INSERT INTO Investigador (DNI, NomApels, Facultad) VALUES ('77777777I', 'Investigador 9', 9);
INSERT INTO Investigador (DNI, NomApels, Facultad) VALUES ('88888888J', 'Investigador 10', 10);

INSERT INTO Equipos (NumSerie, Nombre, Facultad) VALUES ('E001', 'Equipo 1', 1);
INSERT INTO Equipos (NumSerie, Nombre, Facultad) VALUES ('E002', 'Equipo 2', 2);
INSERT INTO Equipos (NumSerie, Nombre, Facultad) VALUES ('E003', 'Equipo 3', 3);
INSERT INTO Equipos (NumSerie, Nombre, Facultad) VALUES ('E004', 'Equipo 4', 4);
INSERT INTO Equipos (NumSerie, Nombre, Facultad) VALUES ('E005', 'Equipo 5', 5);
INSERT INTO Equipos (NumSerie, Nombre, Facultad) VALUES ('E006', 'Equipo 6', 6);
INSERT INTO Equipos (NumSerie, Nombre, Facultad) VALUES ('E007', 'Equipo 7', 7);
INSERT INTO Equipos (NumSerie, Nombre, Facultad) VALUES ('E008', 'Equipo 8', 8);
INSERT INTO Equipos (NumSerie, Nombre, Facultad) VALUES ('E009', 'Equipo 9', 9);
INSERT INTO Equipos (NumSerie, Nombre, Facultad) VALUES ('E010', 'Equipo 10', 10);

INSERT INTO Reserva (DNI, NumSerie, Comienzo, Fin) VALUES ('12345678A', 'E001', '2021-01-01', '2021-01-05');
INSERT INTO Reserva (DNI, NumSerie, Comienzo, Fin) VALUES ('98765432B', 'E002', '2021-01-06', '2021-01-10');
INSERT INTO Reserva (DNI, NumSerie, Comienzo, Fin) VALUES ('11111111C', 'E003', '2021-01-11', '2021-01-15');
INSERT INTO Reserva (DNI, NumSerie, Comienzo, Fin) VALUES ('22222222D', 'E004', '2021-01-16', '2021-01-20');
INSERT INTO Reserva (DNI, NumSerie, Comienzo, Fin) VALUES ('33333333E', 'E005', '2021-01-21', '2021-01-25');
INSERT INTO Reserva (DNI, NumSerie, Comienzo, Fin) VALUES ('44444444F', 'E006', '2021-01-26', '2021-01-30');
INSERT INTO Reserva (DNI, NumSerie, Comienzo, Fin) VALUES ('55555555G', 'E007', '2021-01-31', '2021-02-05');
INSERT INTO Reserva (DNI, NumSerie, Comienzo, Fin) VALUES ('66666666H', 'E008', '2021-02-06', '2021-02-10');
INSERT INTO Reserva (DNI, NumSerie, Comienzo, Fin) VALUES ('77777777I', 'E009', '2021-02-11', '2021-02-15');
INSERT INTO Reserva (DNI, NumSerie, Comienzo, Fin) VALUES ('88888888J', 'E010', '2021-02-16', '2021-02-20');














