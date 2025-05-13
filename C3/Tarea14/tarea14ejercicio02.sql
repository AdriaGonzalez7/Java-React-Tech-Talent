CREATE DATABASE IF NOT EXISTS Biblioteca;
USE Biblioteca;


CREATE TABLE Tema (
    ClaveTema SMALLINT NOT NULL,
    Nombre VARCHAR(40) NOT NULL,
    PRIMARY KEY (ClaveTema)
);

CREATE TABLE Autor (
    ClaveAutor INT NOT NULL,
    Nombre VARCHAR(60) NOT NULL,
    PRIMARY KEY (ClaveAutor)
);

CREATE TABLE Editorial (
    ClaveEditorial SMALLINT NOT NULL,
    Nombre VARCHAR(60) NOT NULL,
    Direccion VARCHAR(60) NOT NULL,
    Telefono VARCHAR(15) NOT NULL,
    PRIMARY KEY (ClaveEditorial)
);

CREATE TABLE Libro (
    ClaveLibro INT NOT NULL,
    Titulo VARCHAR(60) NOT NULL,
    Idioma VARCHAR(15) NOT NULL,
    Formato VARCHAR(15) NOT NULL,
    ClaveEditorial SMALLINT NOT NULL,
    PRIMARY KEY (ClaveLibro),
    FOREIGN KEY (ClaveEditorial) REFERENCES Editorial (ClaveEditorial)
);

CREATE TABLE Ejemplar (
    ClaveEjemplar SMALLINT NOT NULL,
    ClaveLibro INT NOT NULL,
    NumeroOrden SMALLINT NOT NULL,
    Edicion SMALLINT NOT NULL,
    Ubicacion VARCHAR(15) NOT NULL,
    Categoria CHAR(1) NOT NULL,
    PRIMARY KEY (ClaveEjemplar),
    FOREIGN KEY (ClaveLibro) REFERENCES Libro (ClaveLibro)
);

CREATE TABLE Socio (
    ClaveSocio INT NOT NULL,
    Nombre VARCHAR(60) NOT NULL,
    Direccion VARCHAR(60) NOT NULL,
    Telefono VARCHAR(15) NOT NULL,
    Categoria CHAR(1) NOT NULL,
    PRIMARY KEY (ClaveSocio)
);

CREATE TABLE Prestamo (
    ClaveSocio INT NOT NULL,
    ClaveEjemplar SMALLINT NOT NULL,
    NumeroOrden SMALLINT NOT NULL,
    FechaPrestamo DATE NOT NULL,
    FechaDevolucion DATE NOT NULL,
    Notas BLOB,
    PRIMARY KEY (ClaveSocio, ClaveEjemplar, NumeroOrden),
    FOREIGN KEY (ClaveSocio) REFERENCES Socio (ClaveSocio),
    FOREIGN KEY (ClaveEjemplar) REFERENCES Ejemplar (ClaveEjemplar)
);

CREATE TABLE Trata_sobre (
    ClaveLibro INT NOT NULL,
    ClaveTema SMALLINT NOT NULL,
    PRIMARY KEY (ClaveLibro, ClaveTema),
    FOREIGN KEY (ClaveLibro) REFERENCES Libro (ClaveLibro),
    FOREIGN KEY (ClaveTema) REFERENCES Tema (ClaveTema)
);

CREATE TABLE Escrito_por (
    ClaveLibro INT NOT NULL,
    ClaveAutor INT NOT NULL,
    PRIMARY KEY (ClaveLibro, ClaveAutor),
    FOREIGN KEY (ClaveLibro) REFERENCES Libro (ClaveLibro),
    FOREIGN KEY (ClaveAutor) REFERENCES Autor (ClaveAutor)
);

