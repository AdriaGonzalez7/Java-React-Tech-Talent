<?php require 'db.php'; ?>
<link rel="stylesheet" href="style.css" />

<div class="carrito-contenedor">
  <h2>🛒 Carrito actual</h2>
  <ul>
  <?php
    $result = $conexion->query("SELECT * FROM carrito");
    $total = 0;
    while ($row = $result->fetch_assoc()) {
      echo "<li>{$row['nombre']} - " . number_format($row['precio'], 2) . " €</li>";
      $total += $row['precio'];
    }
  ?>
  </ul>
  <p><strong>Total: <?php echo number_format($total, 2); ?> €</strong></p>
  <a href="pago.php"><button>Pagar</button></a>
</div>

