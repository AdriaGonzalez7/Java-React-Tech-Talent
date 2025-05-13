CREATE DATABASE IF NOT EXISTS Los_cientificos;
USE Los_cientificos;

CREATE TABLE Cientificos (
    DNI VARCHAR(9) NOT NULL,
    NomApels VARCHAR(255) NOT NULL,
    PRIMARY KEY (DNI)
);

CREATE TABLE Proyectos (
    Id CHAR(4) NOT NULL,
    Nombre VARCHAR(255) NOT NULL,
    Horas INT NOT NULL,
    PRIMARY KEY (Id)
);

CREATE TABLE Asignado_a (
    Cientifico VARCHAR(9) NOT NULL,
    Proyecto CHAR(4) NOT NULL,
    PRIMARY KEY (Cientifico, Proyecto),
    FOREIGN KEY (Cientifico) REFERENCES Cientificos (DNI),
    FOREIGN KEY (Proyecto) REFERENCES Proyectos (Id)
);

INSERT INTO Cientificos (DNI, NomApels) VALUES ('12345678A', 'Juan Perez');
INSERT INTO Cientificos (DNI, NomApels) VALUES ('98765432B', 'Maria Lopez');
INSERT INTO Cientificos (DNI, NomApels) VALUES ('11111111C', 'Pedro Gomez');
INSERT INTO Cientificos (DNI, NomApels) VALUES ('22222222D', 'Ana Torres');
INSERT INTO Cientificos (DNI, NomApels) VALUES ('33333333E', 'Luis Martinez');
INSERT INTO Cientificos (DNI, NomApels) VALUES ('44444444F', 'Sofia Lopez');
INSERT INTO Cientificos (DNI, NomApels) VALUES ('55555555G', 'Miguel Garcia');
INSERT INTO Cientificos (DNI, NomApels) VALUES ('66666666H', 'Laura Rodriguez');
INSERT INTO Cientificos (DNI, NomApels) VALUES ('77777777I', 'Carlos Lopez');
INSERT INTO Cientificos (DNI, NomApels) VALUES ('88888888J', 'Eva Hernandez');
INSERT INTO Cientificos (DNI, NomApels) VALUES ('99999999K', 'David Lopez');

INSERT INTO Proyectos (Id, Nombre, Horas) VALUES ('1', 'Proyecto 1', 100);
INSERT INTO Proyectos (Id, Nombre, Horas) VALUES ('2', 'Proyecto 2', 200);
INSERT INTO Proyectos (Id, Nombre, Horas) VALUES ('3', 'Proyecto 3', 300);
INSERT INTO Proyectos (Id, Nombre, Horas) VALUES ('4', 'Proyecto 4', 400);
INSERT INTO Proyectos (Id, Nombre, Horas) VALUES ('5', 'Proyecto 5', 500);
INSERT INTO Proyectos (Id, Nombre, Horas) VALUES ('6', 'Proyecto 6', 600);
INSERT INTO Proyectos (Id, Nombre, Horas) VALUES ('7', 'Proyecto 7', 700);
INSERT INTO Proyectos (Id, Nombre, Horas) VALUES ('8', 'Proyecto 8', 800);
INSERT INTO Proyectos (Id, Nombre, Horas) VALUES ('9', 'Proyecto 9', 900);
INSERT INTO Proyectos (Id, Nombre, Horas) VALUES ('10', 'Proyecto 10', 1000);

INSERT INTO Asignado_a (Cientifico, Proyecto) VALUES ('12345678A', '1');
INSERT INTO Asignado_a (Cientifico, Proyecto) VALUES ('98765432B', '2');
INSERT INTO Asignado_a (Cientifico, Proyecto) VALUES ('11111111C', '3');
INSERT INTO Asignado_a (Cientifico, Proyecto) VALUES ('22222222D', '4');
INSERT INTO Asignado_a (Cientifico, Proyecto) VALUES ('33333333E', '5');
INSERT INTO Asignado_a (Cientifico, Proyecto) VALUES ('44444444F', '6');
INSERT INTO Asignado_a (Cientifico, Proyecto) VALUES ('55555555G', '7');
INSERT INTO Asignado_a (Cientifico, Proyecto) VALUES ('66666666H', '8');
INSERT INTO Asignado_a (Cientifico, Proyecto) VALUES ('77777777I', '9');
INSERT INTO Asignado_a (Cientifico, Proyecto) VALUES ('88888888J', '10');
INSERT INTO Asignado_a (Cientifico, Proyecto) VALUES ('99999999K', '1');







