use piezas_proveedores;

db.createCollection("piezas");

db.createCollection("proveedores");

db.createCollection("suministra");

db.piezas.insertOne({
    codigo: 1,
    nombre: "Pieza 1"
});
db.piezas.insertOne({
    codigo: 2,
    nombre: "Pieza 2"
});
db.proveedores.insertOne({
    id: 1,
    nombre: "Proveedor 1"
});
db.proveedores.insertOne({
    id: 2,
    nombre: "Proveedor 2"
});
db.suministra.insertOne({
    codigo_pieza: 1,
    id_proveedor: 1,
    precio: 100
});
db.suministra.insertOne({
    codigo_pieza: 2,
    id_proveedor: 2,
    precio: 200
});

