use investigadores;

db.createCollection("investigadores");

db.createCollection("facultades");

db.createCollection("equipos");

db.createCollection("reservas");

db.investigadores.insertOne({
    dni: "12345678K",
    nom_apels: "Juan Perez",
    facultad: 1
});
db.investigadores.insertOne({
    dni: "12345677K",
    nom_apels: "Juana Perez",
    facultad: 2
});
db.facultades.insertOne({
    codigo: 1,
    nombre: "Facultad de Ciencias"
});
db.facultades.insertOne({
    codigo: 2,
    nombre: "Facultad de Letras"
});
db.equipos.insertOne({
    num_serie: 1,
    nombre: "Equipo 1",
    facultad: 1
});
db.equipos.insertOne({
    num_serie: 1,
    nombre: "Equipo 2",
    facultad: 2
});
db.reservas.insertOne({
    dni: "12345678K",
    num_serie: 1,
    comienzo: "2021-01-01",
    fin: "2021-01-02"
});
db.reservas.insertOne({
    dni: "12345677K",
    num_serie: 2,
    comienzo: "2021-01-01",
    fin: "2021-01-02"
});
