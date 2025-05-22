use grandes_almacenes;

db.createCollection("cajeros");

db.createCollection("maquinas_registradoras");

db.createCollection("productos");

db.createCollection("venta");

db.cajeros.insertOne({
    codigo: 1,
    nom_apels: "Juan Perez"
});
db.cajeros.insertOne({
    codigo: 2,
    nom_apels: "Juana Perez"
});
db.maquinas_registradoras.insertOne({
    codigo: 1,
    piso: 1
});
db.maquinas_registradoras.insertOne({
    codigo: 2,
    piso: 2
});
db.productos.insertOne({
    codigo: 1,
    nombre: "Producto 1",
    precio: 100
});
db.productos.insertOne({
    codigo: 2,
    nombre: "Producto 2",
    precio: 200
});
db.venta.insertOne({
    cajero: 1,
    maquina: 1,
    producto: 1,
});
db.venta.insertOne({
    cajero: 2,
    maquina: 2,
    producto: 2
});


