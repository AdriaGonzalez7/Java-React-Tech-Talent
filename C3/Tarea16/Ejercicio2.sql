CREATE DATABASE IF NOT EXISTS Empleados;
USE Empleados;

CREATE TABLE Departamento (
    codigo INT NOT NULL,
    nombre VARCHAR(100) NOT NULL,
    presupuesto INT NOT NULL,
    PRIMARY KEY (codigo)
);

CREATE TABLE Empleado (
    DNI VARCHAR(9) NOT NULL,
    Nombre VARCHAR(100) NOT NULL,
    Apellidos VARCHAR(255) NOT NULL,
    Departamento INT NOT NULL,
    PRIMARY KEY (DNI),
    FOREIGN KEY (Departamento) REFERENCES Departamento (codigo)
);

INSERT INTO Departamento (codigo, nombre, presupuesto) VALUES (1, 'Desarrollo', 120000);
INSERT INTO Departamento (codigo, nombre, presupuesto) VALUES (2, 'Sistemas', 150000);
INSERT INTO Departamento (codigo, nombre, presupuesto) VALUES (3, 'Recursos Humanos', 280000);
INSERT INTO Departamento (codigo, nombre, presupuesto) VALUES (4, 'Contabilidad', 11000);
INSERT INTO Departamento (codigo, nombre, presupuesto) VALUES (5, 'I+D', 375000);
INSERT INTO Departamento (codigo, nombre, presupuesto) VALUES (6, 'Vendedores', 100000);
INSERT INTO Departamento (codigo, nombre, presupuesto) VALUES (7, 'Mantenimiento', 15000);
INSERT INTO Departamento (codigo, nombre, presupuesto) VALUES (77, 'Direccion', 20000);
INSERT INTO Departamento (codigo, nombre, presupuesto) VALUES (37, 'Compras', 100000);
INSERT INTO Departamento (codigo, nombre, presupuesto) VALUES (14, 'Informatica', 240000);

INSERT INTO Empleado (DNI, Nombre, Apellidos, Departamento) VALUES ('123456789', 'Ana', 'Gomez', 37);
INSERT INTO Empleado (DNI, Nombre, Apellidos, Departamento) VALUES ('123456790', 'Carlos', 'Lopez', 37);
INSERT INTO Empleado (DNI, Nombre, Apellidos, Departamento) VALUES ('123456791', 'Maria', 'Perez', 3);
INSERT INTO Empleado (DNI, Nombre, Apellidos, Departamento) VALUES ('123456792', 'Luis', 'Garcia', 77);
INSERT INTO Empleado (DNI, Nombre, Apellidos, Departamento) VALUES ('123456793', 'Eva', 'Martinez', 2);
INSERT INTO Empleado (DNI, Nombre, Apellidos, Departamento) VALUES ('123456794', 'Miguel', 'Sanchez', 6);
INSERT INTO Empleado (DNI, Nombre, Apellidos, Departamento) VALUES ('123456795', 'Laura', 'Lopez', 7);
INSERT INTO Empleado (DNI, Nombre, Apellidos, Departamento) VALUES ('123456796', 'Miguel', 'Ramirez', 1);
INSERT INTO Empleado (DNI, Nombre, Apellidos, Departamento) VALUES ('123456797', 'Sara', 'Jimenez', 2);
INSERT INTO Empleado (DNI, Nombre, Apellidos, Departamento) VALUES ('123456798', 'David', 'Hernandez', 14);
INSERT INTO Empleado (DNI, Nombre, Apellidos, Departamento) VALUES ('123456799', 'Sara', 'Gomez', 14);
INSERT INTO Empleado (DNI, Nombre, Apellidos, Departamento) VALUES ('123456710', 'Carlos', 'Lama', 4);
INSERT INTO Empleado (DNI, Nombre, Apellidos, Departamento) VALUES ('123456711', 'Maria', 'Garcia', 5);
INSERT INTO Empleado (DNI, Nombre, Apellidos, Departamento) VALUES ('123456712', 'Luisa', 'Garcia', 6);
INSERT INTO Empleado (DNI, Nombre, Apellidos, Departamento) VALUES ('123456713', 'Particia', 'Martinez', 4);
INSERT INTO Empleado (DNI, Nombre, Apellidos, Departamento) VALUES ('123456714', 'Jorge', 'Sanchez', 7);
INSERT INTO Empleado (DNI, Nombre, Apellidos, Departamento) VALUES ('123456715', 'Laura', 'Sanchez', 1);



-- 2.1. Obtener los apellidos de los empleados.
SELECT Apellidos FROM Empleado;

-- 2.2. Obtener los apellidos de los empleados sin repeticiones
SELECT DISTINCT Apellidos FROM Empleado;

-- 2.3. Obtener todos los datos de los empleados que se apellidan 'López'
SELECT * FROM Empleado WHERE Apellidos = 'López';

-- 2.4. Obtener todos los datos de los empleados que se apellidan 'López' y los que se apellidan 'Pérez'.
SELECT * FROM Empleado WHERE Apellidos = 'López' OR Apellidos = 'Pérez';

-- 2.5. Obtener todos los datos de los empleados que trabajan para el departamento 14.
SELECT * FROM Empleado WHERE Departamento = 14;

-- 2.6. Obtener todos los datos de los empleados que trabajan para el departamento 37 y para el departamento 77
SELECT * FROM Empleado WHERE Departamento = 37 OR Departamento = 77;

-- 2.7. Obtener todos los datos de los empleados cuyo apellido comience por 'P'.
SELECT * FROM Empleado WHERE Apellidos LIKE 'P%';

-- 2.8. Obtener el presupuesto total de todos los departamentos.
SELECT SUM(presupuesto) FROM Departamento;

-- 2.9. Obtener el numero de empleados en cada departamento.
SELECT Departamento, COUNT(*) FROM Empleado GROUP BY Departamento;

-- 2.10. Obtener un listado completo de empleados, incluyendo por cada empleado los datos del empleado y de su departamento.
SELECT e.*, d.nombre AS nombre_departamento, d.presupuesto AS presupuesto_departamento
FROM Empleado e
JOIN Departamento d ON e.Departamento = d.codigo;

-- 2.11. Obtener un listado completo de empleados, incluyendo el nombre y apellidos del empleado junto al nombre y presupuesto de su departamento

SELECT e.Nombre, e.Apellidos, d.nombre AS nombre_departamento, d.presupuesto AS presupuesto_departamento
FROM Empleado e
JOIN Departamento d ON e.Departamento = d.codigo;


-- 2.12. Obtener los nombres y apellidos de los empleados que trabajen en departamentos cuyo presupuesto sea mayor de 60.000 €.
SELECT Nombre, Apellidos FROM Empleado WHERE Departamento IN (SELECT codigo FROM Departamento WHERE presupuesto > 60000);
-- 2.13. Obtener los datos de los departamentos cuyo presupuesto es superior al presupuesto medio de todos los departamentos.
SELECT * FROM Departamento WHERE presupuesto > (SELECT AVG(presupuesto) FROM Departamento);

-- 2.14. Obtener los nombres (únicamente los nombres) de los departamentos que tienen más de dos empleados.
SELECT nombre FROM Departamento WHERE codigo IN (SELECT Departamento FROM Empleado GROUP BY Departamento HAVING COUNT(*) > 2);

-- 2.15. Añadir un nuevo departamento: 'Calidad', con presupuesto de 40.000 € y código11. Añadir un empleado vinculado al departamento recién creado: Esther Vázquez, DNI: 89267109
INSERT INTO Departamento (codigo, nombre, presupuesto) VALUES (11, 'Calidad', 40000);
INSERT INTO Empleado (DNI, Nombre, Apellidos, Departamento) VALUES ('89267109', 'Esther', 'Vázquez', 11);

-- 2.16. Aplicar un recorte presupuestario del 10% a todos los departamentos.
SELECT presupuesto * 0.9 FROM Departamento;

-- 2.17. Reasignar a los empleados del departamento de investigación (código 77) al departamento de informática ( código 14).
UPDATE Empleado SET Departamento = 14 WHERE Departamento = 77;

-- 2.18. Despedir a todos los empleados que trabajan para el departamento de informática( código 14).
DELETE FROM Empleado WHERE Departamento = 14;

-- 2.19. Despedir a todos los empleados que trabajen para departamentos cuyo presupuesto sea superior a los 60.000 €.
DELETE FROM Empleado WHERE Departamento IN (SELECT codigo FROM Departamento WHERE presupuesto > 60000);

-- 2.20. Despedir a todos los empleados.
DELETE FROM Empleado;







