use directores;

db.createCollection("directores");

db.createCollection("despachos");

db.directores.insertOne({
    dni: "12345678K",
    nom_apels: "Juan Perez",
    dni_jefe: "12345678K",
    despacho: 1
});
db.directores.insertOne({
    dni: "12345679K",
    nom_apels: "Ana Garcia",
    dni_jefe: "12345678K",
    despacho: 2
});
db.despachos.insertOne({
    numero: 1,
    capacidad: 10
});
db.despachos.insertOne({
    numero: 2,
    capacidad: 20
});

