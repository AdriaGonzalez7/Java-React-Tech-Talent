<?php
require 'db.php';
$conexion->query("DELETE FROM carrito");
echo "🗑️ Carrito vaciado con éxito";
?>
