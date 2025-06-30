<?php
require 'db.php';

$data = json_decode(file_get_contents("php://input"), true);
$nombre = $conexion->real_escape_string($data['nombre']);
$precio = floatval($data['precio']);

$sql = "INSERT INTO carrito (nombre, precio) VALUES ('$nombre', '$precio')";
if ($conexion->query($sql) === TRUE) {
    echo "Producto añadido al carrito 🛒";
} else {
    echo "Error: " . $conexion->error;
}
?>
