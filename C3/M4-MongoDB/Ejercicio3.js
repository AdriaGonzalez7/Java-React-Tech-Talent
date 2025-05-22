use los_almacenes;

db.createCollection("almacenes");

db.createCollection("cajas");

db.almacenes.insertOne({
    codigo: 1,
    lugar: "Barcelona",
    capacidad: 1000
});

db.almacenes.insertOne({
    codigo: 2,
    lugar: "Madrid",
    capacidad: 2000
});

db.cajas.insertOne({
    numReferencia: "1234567890",
    contenido: "Papel",
    valor: 100,
    almacen: 1
});

db.cajas.insertOne({
    numReferencia: "1234567891",
    contenido: "Papel",
    valor: 100, 
    almacen: 2
});
