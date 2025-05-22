use empleados;

db.createCollection("empleados");

db.createCollection("departamentos");

db.departamentos.insertOne({
    codigo: 1,
    nombre: "Informatica",
    presupuesto: 100000
});

db.departamentos.insertOne({
    codigo: 2,
    nombre: "Recursos Humanos",
    presupuesto: 50000
});

db.empleados.insertOne({
    dni: "12345678K",
    nombre: "Juan",
    apellido: "Perez",
    departamento: 1
});

db.empleados.insertOne({
    dni: "12345677K",
    nombre: "Pepe",
    apellido: "Lopez",
    departamento: 2
});

