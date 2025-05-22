-- Generamos una base de datos de una biblioteca en MongoDB

use biblioteca;

-- Creamos una colección de libros

db.createCollection("libros");

-- Insertamos datos en la colección de libros

db.libros.insertOne({
    ASIN: "B000F2JUZM",
    titulo: "El Quijote",
    fecha_lanzamiento: "1605-01-01",
    autor: "Cervantes",
    categoria: "Novela",
    editorial: "Planeta",
    numero_paginas: 1000,
    idioma: "Castellano",
    paginas: 920,
    descripcion: "Novela de aventuras de Don Quijote de la Mancha"
    Portada: "El Quijote"
});



