use cientificos;

db.createCollection("cientificos");

db.createCollection("proyectos");

db.createCollection("asignado_a");

db.cientificos.insertOne({
    dni: "12345678K",
    nom_apels: "Juan Perez"
});
db.cientificos.insertOne({
    dni: "12345677K",
    nom_apels: "Juana Perez"
});
db.proyectos.insertOne({
    id: 1,
    nombre: "Proyecto 1",
    horas: 100
});
db.proyectos.insertOne({
    id: 2,
    nombre: "Proyecto 2",
    horas: 200
});
db.asignado_a.insertOne({
    cientifico: "12345678K",
    proyecto: 1
});
db.asignado_a.insertOne({
    cientifico: "12345677K",
    proyecto: 2
}); 