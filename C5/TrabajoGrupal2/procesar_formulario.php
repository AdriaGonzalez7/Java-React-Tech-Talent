<?php
// Configura la conexión
$host = "localhost";
$usuario = "root";
$contrasena = "";  // Cambia esto si tu servidor tiene una contraseña
$basedatos = "insultosdb";

// Conectar a la base de datos
$conn = new mysqli($host, $usuario, $contrasena, $basedatos);

// Comprobar conexión
if ($conn->connect_error) {
  die("Conexión fallida: " . $conn->connect_error);
}

// Obtener datos del formulario
$nombre = $_POST['nombre'];
$email = $_POST['email'];
$mensaje = $_POST['mensaje'];

// Insertar en la base de datos
$sql = "INSERT INTO mensajes (nombre, email, mensaje) VALUES ('$nombre', '$email', '$mensaje')";

if ($conn->query($sql) === TRUE) {
  echo "Mensaje recibido con éxito. Te responderemos con amor (o ironía).";
} else {
  echo "Error: " . $sql . "<br>" . $conn->error;
}

$conn->close();
?>
