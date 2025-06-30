<?php
require 'db.php';

$resultado = $conexion->query("SELECT nombre, precio FROM carrito ORDER BY fecha_agregado DESC");
$carrito = [];

while ($row = $resultado->fetch_assoc()) {
  $carrito[] = $row;
}

header('Content-Type: application/json');
echo json_encode($carrito);
?>
