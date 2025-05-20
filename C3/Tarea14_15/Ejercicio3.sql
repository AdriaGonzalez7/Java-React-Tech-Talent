CREATE DATABASE IF NOT EXISTS Los_Almacenes;
USE Los_Almacenes;

CREATE TABLE Almacen (
    codigo INT NOT NULL,
    Lugar VARCHAR(100) NOT NULL,
    Capacidad INT NOT NULL,
    PRIMARY KEY (codigo)
);

CREATE TABLE Cajas (
    NumReferencia CHAR(5),
    Contenido VARCHAR(100) NOT NULL,
    Valor INT NOT NULL,
    Almacen INT NOT NULL,
    PRIMARY KEY (NumReferencia),
    FOREIGN KEY (Almacen) REFERENCES Almacen (codigo)
);

INSERT INTO Almacen (codigo, Lugar, Capacidad) VALUES (1, 'Barcelona', 5);
INSERT INTO Almacen (codigo, Lugar, Capacidad) VALUES (2, 'Madrid', 8);
INSERT INTO Almacen (codigo, Lugar, Capacidad) VALUES (3, 'Valencia', 6);
INSERT INTO Almacen (codigo, Lugar, Capacidad) VALUES (4, 'Bilbao', 7);
INSERT INTO Almacen (codigo, Lugar, Capacidad) VALUES (5, 'Alicante', 4);
INSERT INTO Almacen (codigo, Lugar, Capacidad) VALUES (6, 'Zaragoza', 5);
INSERT INTO Almacen (codigo, Lugar, Capacidad) VALUES (7, 'Malaga', 6);
INSERT INTO Almacen (codigo, Lugar, Capacidad) VALUES (8, 'Sevilla', 4);
INSERT INTO Almacen (codigo, Lugar, Capacidad) VALUES (9, 'Valencia', 5);
INSERT INTO Almacen (codigo, Lugar, Capacidad) VALUES (10, 'Bilbao', 6);

INSERT INTO Cajas (NumReferencia, Contenido, Valor, Almacen) VALUES ('00001', 'Electronica', 1500, 1);
INSERT INTO Cajas (NumReferencia, Contenido, Valor, Almacen) VALUES ('00002', 'Ropa', 800, 2);
INSERT INTO Cajas (NumReferencia, Contenido, Valor, Almacen) VALUES ('00003', 'Libros', 100, 3);
INSERT INTO Cajas (NumReferencia, Contenido, Valor, Almacen) VALUES ('00004', 'Juguetes', 450, 4);
INSERT INTO Cajas (NumReferencia, Contenido, Valor, Almacen) VALUES ('00005', 'Herramientas', 1200, 5);
INSERT INTO Cajas (NumReferencia, Contenido, Valor, Almacen) VALUES ('00006', 'Alimentos', 600, 6);
INSERT INTO Cajas (NumReferencia, Contenido, Valor, Almacen) VALUES ('00007', 'Muebles', 2500, 7);
INSERT INTO Cajas (NumReferencia, Contenido, Valor, Almacen) VALUES ('00008', 'Deportes', 750, 8);
INSERT INTO Cajas (NumReferencia, Contenido, Valor, Almacen) VALUES ('00009', 'Joyeria', 5000, 9);
INSERT INTO Cajas (NumReferencia, Contenido, Valor, Almacen) VALUES ('00010', 'Cosmeticos', 350, 10);
INSERT INTO Cajas (NumReferencia, Contenido, Valor, Almacen) VALUES ('00011', 'Informatica', 2000, 1);
INSERT INTO Cajas (NumReferencia, Contenido, Valor, Almacen) VALUES ('00012', 'Calzado', 900, 2);
INSERT INTO Cajas (NumReferencia, Contenido, Valor, Almacen) VALUES ('00013', 'Material Oficina', 80, 3);
INSERT INTO Cajas (NumReferencia, Contenido, Valor, Almacen) VALUES ('00014', 'Electrodomesticos', 1800, 4);
INSERT INTO Cajas (NumReferencia, Contenido, Valor, Almacen) VALUES ('00015', 'Jardineria', 55, 5);


-- 3.1. Obtener todos los almacenes
SELECT * FROM Almacen;

-- 3.2. Obtener todas las cajas cuyo contenido tenga un valor superior a 150 €.
SELECT * FROM Cajas WHERE Valor > 150;

-- 3.3. Obtener los tipos de contenidos de las cajas.
SELECT DISTINCT Contenido FROM Cajas;

-- 3.4. Obtener el valor medio de todas las cajas.
SELECT AVG(Valor) FROM Cajas;

-- 3.5. Obtener el valor medio de las cajas de cada almacen.
SELECT AVG(Valor) FROM Cajas GROUP BY Almacen;

-- 3.6. Obtener los códigos de los almacenes en los cuales el valor medio de las cajas sea superior a 150 €.
SELECT Almacen FROM Cajas GROUP BY Almacen HAVING AVG(Valor) > 150;

-- 3.7. Obtener el numero de referencia de cada caja junto con el nombre de la ciudad en el que se encuentra.
SELECT Cajas.NumReferencia, Almacen.Lugar FROM Cajas JOIN Almacen ON Cajas.Almacen = Almacen.codigo;

-- 3.8. Obtener el numero de cajas que hay en cada almacén.
SELECT Almacen, COUNT(*) AS NumeroCajas FROM Cajas GROUP BY Almacen;

-- 3.9. Obtener los códigos de los almacenes que están saturados (los almacenes donde el numero de cajas es superior a la capacidad).
SELECT Cajas.Almacen 
FROM Cajas 
JOIN Almacen ON Cajas.Almacen = Almacen.codigo 
GROUP BY Cajas.Almacen 
HAVING COUNT(*) > (SELECT Capacidad FROM Almacen WHERE codigo = Cajas.Almacen);

-- 3.10. Obtener los números de referencia de las cajas que están en Bilbao.
SELECT Cajas.NumReferencia FROM Cajas JOIN Almacen ON Cajas.Almacen = Almacen.codigo WHERE Almacen.Lugar = 'Bilbao';

-- 3.11. Insertar un nuevo almacén en Barcelona con capacidad para 3 cajas.

-- 3.12. Insertar una nueva caja, con número de referencia 'H5RT', contenido 'Papel', valor 200, y situada en el almacén 2.

-- 3.13. Rebajar el valor de todas las cajas un 15 %.

-- 3.14. Rebajar un 20% el valor de todas las cajas cuyo valor sea superior al valor medio de todas las cajas.

-- 3.15. Eliminar todas las cajas cuyo valor sea inferior a 100 €.

-- 3.16. Vaciar el contenido de los almacenes que están saturados
