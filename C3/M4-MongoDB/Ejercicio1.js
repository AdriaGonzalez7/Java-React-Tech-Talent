use tienda_informatica;

db.createCollection("fabricantes");

db.createCollection("articulos");

db.fabricantes.insertOne({
    codigo: 1,
    nombre: "HP"
});

db.fabricantes.insertOne({
    codigo: 2,
    nombre: "Lenovo"
});

db.articulos.insertOne({
    codigo: 1,
    nombre: "Mouse",
    precio: 10,
    fabricante: 1
});

db.articulos.insertOne({
    codigo: 2,
    nombre: "Teclado",
    precio: 20,
    fabricante: 2   
});

