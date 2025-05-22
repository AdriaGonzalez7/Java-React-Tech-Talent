use cine;

db.createCollection("salas");

db.createCollection("peliculas");

db.salas.insertOne({
    codigo: 1,
    nombre: "Sala 1",
    pelicula: 1
});

db.salas.insertOne({
    codigo: 2,
    nombre: "Sala 2",
    pelicula: 2
});

db.peliculas.insertOne({
    codigo: 1,
    nombre: "Pelicula 1",
    calificacionEdad: 13
});

db.peliculas.insertOne({
    codigo: 2,
    nombre: "Pelicula 2",
    calificacionEdad: 18
});

