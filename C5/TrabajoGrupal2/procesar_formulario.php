<?php
// Clave secreta de test
$clave_secreta = "6LeIxAcTAAAAAGG-vFI1TnRWxMZNFuojJ4WifJWe";

// Validar reCAPTCHA
$token = $_POST["g-recaptcha-response"] ?? '';
$verificar = file_get_contents("https://www.google.com/recaptcha/api/siteverify?secret=$clave_secreta&response=$token");
$respuesta = json_decode($verificar);

if (!$respuesta->success) {
  http_response_code(400);
  echo "❌ Verificación reCAPTCHA fallida. Intenta otra vez.";
  exit;
}

// Recoger y validar datos del formulario
$nombre = $_POST['nombre'] ?? '';
$email = $_POST['email'] ?? '';
$mensaje = $_POST['mensaje'] ?? '';

if (!$nombre || !$email || !$mensaje) {
  http_response_code(400);
  echo "❌ Todos los campos son obligatorios.";
  exit;
}

// (Opcional) Conexión a base de datos
$host = "localhost";
$usuario = "root";
$contrasena = "";
$basedatos = "insultosdb";

$conn = new mysqli($host, $usuario, $contrasena, $basedatos);
if ($conn->connect_error) {
  http_response_code(500);
  echo "❌ Error de conexión con la base de datos.";
  exit;
}

$stmt = $conn->prepare("INSERT INTO mensajes (nombre, email, mensaje) VALUES (?, ?, ?)");
$stmt->bind_param("sss", $nombre, $email, $mensaje);

if ($stmt->execute()) {
  echo "💌 Mensaje enviado con éxito. Pronto te devolveremos el sarcasmo con cariño.";
} else {
  http_response_code(500);
  echo "❌ Error al guardar tu mensaje. Inténtalo más tarde.";
}

$stmt->close();
$conn->close();
?>
