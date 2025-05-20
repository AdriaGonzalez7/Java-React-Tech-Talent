CREATE DATABASE IF NOT EXISTS tienda_informatica;
USE tienda_informatica;

CREATE TABLE Fabricantes (
    codigo INT NOT NULL,
    nombre VARCHAR(100) NOT NULL,
    PRIMARY KEY (codigo)
);

CREATE TABLE Articulos (
    codigo INT NOT NULL,
    nombre VARCHAR(100) NOT NULL,
    precio INT NOT NULL, 
    fabricante INT NOT NULL,
    PRIMARY KEY (codigo),
    FOREIGN KEY (fabricante) REFERENCES Fabricantes (codigo)
);

INSERT INTO fabricantes (codigo, nombre) VALUES (1, 'Samsung');
INSERT INTO fabricantes (codigo, nombre) VALUES (2, 'Sony');
INSERT INTO fabricantes (codigo, nombre) VALUES (3, 'Logitech');
INSERT INTO fabricantes (codigo, nombre) VALUES (4, 'Microsoft');
INSERT INTO fabricantes (codigo, nombre) VALUES (5, 'LG');
INSERT INTO fabricantes (codigo, nombre) VALUES (6, 'Epson');
INSERT INTO fabricantes (codigo, nombre) VALUES (7, 'TP-Link');
INSERT INTO fabricantes (codigo, nombre) VALUES (8, 'HP');
INSERT INTO fabricantes (codigo, nombre) VALUES (9, 'NVIDIA');
INSERT INTO fabricantes (codigo, nombre) VALUES (10, 'Seagate');


INSERT INTO articulos (codigo, nombre, precio, fabricante) VALUES (1, 'Altavoz', 70, 1);
INSERT INTO articulos (codigo, nombre, precio, fabricante) VALUES (2, 'Auriculares', 60, 2);
INSERT INTO articulos (codigo, nombre, precio, fabricante) VALUES (3, 'Mouse', 50, 3);
INSERT INTO articulos (codigo, nombre, precio, fabricante) VALUES (4, 'Teclado', 40, 4);
INSERT INTO articulos (codigo, nombre, precio, fabricante) VALUES (5, 'Monitor', 250, 5);
INSERT INTO articulos (codigo, nombre, precio, fabricante) VALUES (6, 'Proyector', 21, 6);
INSERT INTO articulos (codigo, nombre, precio, fabricante) VALUES (7, 'Router', 10, 7);
INSERT INTO articulos (codigo, nombre, precio, fabricante) VALUES (8, 'Impresora', 150, 8);
INSERT INTO articulos (codigo, nombre, precio, fabricante) VALUES (9, 'Tarjeta Grafica', 280, 9);
INSERT INTO articulos (codigo, nombre, precio, fabricante) VALUES (10, 'Disco Duro', 100, 10);

-- 1.1. Obtener los nombres de los productos de la tienda.

SELECT * FROM articulos;

-- 1.2. Obtener los nombres y los precios de los productos de la tienda.

SELECT nombre, precio FROM articulos;

-- 1.3. Obtener el nombre de los productos cuyo precio sea menor o igual a 200 €.

SELECT nombre FROM articulos WHERE precio <= 200;

--1.4. Obtener todos los datos de los artículos cuyo precio esté entre los 60 € y los 120 € (ambas cantidades incluidas).

SELECT * FROM articulos WHERE precio >= 60 AND precio <= 120;

-- 1.5. Obtener el nombre y el precio en pesetas (es decir, el precio en euros multiplicado por 166'386).

SELECT nombre, (precio * 166.386) AS precio_pesetas FROM articulos;

-- 1.6. Calcular el precio promedio de todos los productos en la base de datos

SELECT AVG(precio) FROM articulos;


-- 1.7. Calcular el precio promedio de los productos del fabricante con código 2

SELECT AVG(precio) FROM articulos WHERE fabricante = 2;

-- 1.8. Contar cuántos productos tienen un precio mayor o igual a 180€

SELECT COUNT(*) FROM articulos WHERE precio >= 180;

-- 1.9. Listar nombre y precio de productos de 180€ o más, ordenados por precio descendente y nombre ascendente

SELECT nombre, precio FROM articulos WHERE precio >= 180 ORDER BY precio DESC, nombre ASC;

-- 1.10. Mostrar todos los datos de los productos junto con la información de sus fabricantes

SELECT * FROM articulos INNER JOIN fabricantes ON articulos.fabricante = fabricantes.codigo;

-- 1.11. Obtener un listado de artículos, incluyendo el nombre del artículo, su precio, y el nombre de su fabricante.

SELECT articulos.nombre, articulos.precio, fabricantes.nombre as fabricante 
FROM articulos INNER JOIN fabricantes ON articulos.fabricante = fabricantes.codigo;

-- 1.12. Calcular el precio medio de los productos por fabricante, mostrando solo el código del fabricante
SELECT fabricante, AVG(precio) as precio_medio 
FROM articulos GROUP BY fabricante;

-- 1.13. Obtener el precio medio de los productos de cada fabricante, mostrando el nombre del fabricante.

SELECT fabricantes.nombre, AVG(articulos.precio) as precio_medio
FROM articulos INNER JOIN fabricantes 


ON articulos.fabricante = fabricantes.codigo
GROUP BY fabricantes.nombre, fabricantes.codigo;

-- 1.14. Obtener los nombres de los fabricantes que ofrezcan productos cuyo precio medio sea mayor o igual a 150 €.

SELECT fabricantes.nombre FROM fabricantes INNER JOIN articulos ON articulos.fabricante = fabricantes.codigo WHERE articulos.precio >= 150;

-- 1.15. Obtener el nombre y precio del artículo más barato.

SELECT nombre, precio FROM articulos WHERE precio = (SELECT MIN(precio) FROM articulos);

-- 1.16. Obtener una lista con el nombre y precio de los artículos más caros de cada proveedor (incluyendo el nombre del proveedor).

SELECT articulos.nombre, articulos.precio, fabricantes.nombre as fabricante
FROM articulos INNER JOIN fabricantes ON articulos.fabricante = fabricantes.codigo
WHERE articulos.precio = (SELECT MAX(precio) FROM articulos WHERE articulos.fabricante = fabricantes.codigo);

-- 1.17. Añadir un nuevo producto: Altavoces de 70 € (del fabricante 2)

INSERT INTO articulos (codigo, nombre, precio, fabricante) VALUES (11, 'Altavoces', 70, 2);

-- 1.18. Cambiar el nombre del producto 8 a 'Impresora Laser'

UPDATE articulos SET nombre = 'Impresora Laser' WHERE codigo = 8;

-- 1.19. Aplicar un descuento del 10% (multiplicar el precio por 0'9) a todos los productos.

UPDATE articulos SET precio = precio * 0.9;

-- 1.20. Aplicar un descuento de 10€ a todos los productos cuyo precio sea mayor o igual a 120 €.

UPDATE articulos SET precio = precio - 10 WHERE precio >= 120;


