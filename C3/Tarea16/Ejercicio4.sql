CREATE DATABASE IF NOT EXISTS cine1;
USE cine1;

CREATE TABLE Peliculas (
    codigo INT NOT NULL,
    Nombre VARCHAR(100) NOT NULL,
    CalificacionEdad INT NOT NULL,
    PRIMARY KEY (codigo)
);

CREATE TABLE Salas (
    codigo INT NOT NULL,
    Nombre VARCHAR(100) NOT NULL,
    Pelicula INT NOT NULL,
    FOREIGN KEY (Pelicula) REFERENCES Peliculas (codigo)
);

INSERT INTO Peliculas (codigo, Nombre, CalificacionEdad) VALUES (1, 'El padrino', 16);
INSERT INTO Peliculas (codigo, Nombre, CalificacionEdad) VALUES (2, 'El padrino: Parte II', 18);
INSERT INTO Peliculas (codigo, Nombre, CalificacionEdad) VALUES (3, 'El padrino: Parte III', 16);
INSERT INTO Peliculas (codigo, Nombre, CalificacionEdad) VALUES (4, 'Cadena perpetua', 16);
INSERT INTO Peliculas (codigo, Nombre, CalificacionEdad) VALUES (5, 'Pulp Fiction', 18);
INSERT INTO Peliculas (codigo, Nombre, CalificacionEdad) VALUES (6, 'El club de la pelea', 18);
INSERT INTO Peliculas (codigo, Nombre, CalificacionEdad) VALUES (7, 'Titanic', 13);
INSERT INTO Peliculas (codigo, Nombre, CalificacionEdad) VALUES (8, 'El señor de los anillos: El retorno del rey', 13);
INSERT INTO Peliculas (codigo, Nombre, CalificacionEdad) VALUES (9, 'El señor de los anillos: Las dos torres', 13);
INSERT INTO Peliculas (codigo, Nombre, CalificacionEdad) VALUES (10, 'El señor de los anillos: El rey oscuro', 13);

INSERT INTO Salas (codigo, Nombre, Pelicula) VALUES (1, 'Sala 1', 1);
INSERT INTO Salas (codigo, Nombre, Pelicula) VALUES (2, 'Sala 2', 2);
INSERT INTO Salas (codigo, Nombre, Pelicula) VALUES (3, 'Sala 3', 3);
INSERT INTO Salas (codigo, Nombre, Pelicula) VALUES (4, 'Sala 4', 4);
INSERT INTO Salas (codigo, Nombre, Pelicula) VALUES (5, 'Sala 5', 5);
INSERT INTO Salas (codigo, Nombre, Pelicula) VALUES (6, 'Sala 6', 6);
INSERT INTO Salas (codigo, Nombre, Pelicula) VALUES (7, 'Sala 7', 7);
INSERT INTO Salas (codigo, Nombre, Pelicula) VALUES (8, 'Sala 8', 8);
INSERT INTO Salas (codigo, Nombre, Pelicula) VALUES (9, 'Sala 9', 9);
INSERT INTO Salas (codigo, Nombre, Pelicula) VALUES (10, 'Sala 10', 10);


-- 4.1. Mostrar el nombre de todas las películas.
SELECT Nombre FROM Peliculas;

-- 4.2. Mostrar las distintas calificaciones de edad que existen.
SELECT DISTINCT CalificacionEdad FROM Peliculas;

-- 4.3. Mostrar todas las películas que no han sido calificadas.
SELECT * FROM Peliculas WHERE CalificacionEdad IS NULL;

-- 4.4. Mostrar todas las salas que no proyectan ninguna película.
SELECT * FROM Salas WHERE Pelicula IS NULL;

-- 4.5. Mostrar la información de todas las salas y, si se proyecta alguna película en la sala, mostrar también la información de la película.
SELECT Salas.*, Peliculas.* FROM Salas LEFT JOIN Peliculas ON Salas.Pelicula = Peliculas.codigo;


-- 4.6. Mostrar la información de todas las películas y, si se proyecta en alguna sala, mostrar también la información de la sala.
SELECT Peliculas.*, Salas.* FROM Peliculas LEFT JOIN Salas ON Peliculas.codigo = Salas.Pelicula;

-- 4.7. Mostrar los nombres de las películas que no se proyectan en ninguna sala.
SELECT Nombre FROM Peliculas WHERE codigo NOT IN (SELECT Pelicula FROM Salas);

-- 4.8. Añadir una nueva película 'Uno, Dos, Tres', para mayores de 7 años.
INSERT INTO Peliculas (codigo, Nombre, CalificacionEdad) VALUES (11, 'Uno, Dos, Tres', 7);

-- 4.9. Hacer constar que todas las películas no calificadas han sido calificadas 'no recomendables para menores de 13 años'.
UPDATE Peliculas SET CalificacionEdad = 13 WHERE CalificacionEdad IS NULL;

-- 4.10. Eliminar todas las salas que proyectan películas recomendadas para todos los públicos.
DELETE FROM Salas WHERE Pelicula IN (SELECT codigo FROM Peliculas WHERE CalificacionEdad = 13);






