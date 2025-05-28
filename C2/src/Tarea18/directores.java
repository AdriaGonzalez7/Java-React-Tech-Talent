package Tarea18;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class directores{
    public static void main(String[] args) {
        String urlBase = "jdbc:mysql://localhost:3306/";
        String nombreBaseDatos = "Directores_java";
        String urlDB = "jdbc:mysql://localhost:3306/" + nombreBaseDatos;
        String usuario = "root";
        String contraseña = "";

        try (Connection conexionBase = DriverManager.getConnection(urlBase, usuario, contraseña);
             Statement stmtBase = conexionBase.createStatement()) {
            
            // Crear base de datos si no existe
            String sqlCrearDB = "CREATE DATABASE IF NOT EXISTS " + nombreBaseDatos;
            stmtBase.executeUpdate(sqlCrearDB);
            System.out.println("Base de datos creada o existente.");
        } catch (SQLException e) {
            e.printStackTrace();
            return;
        }

        // Ahora conectamos directamente a la base de datos recién creada
        try (Connection conexion = DriverManager.getConnection(urlDB, usuario, contraseña);
             Statement stmt = conexion.createStatement()) {

        	// Crear tabla Despachos
            String sqlDespachos = """
                CREATE TABLE IF NOT EXISTS Despachos (
                    numero INT NOT NULL,
                    Capacidad INT NOT NULL,
                    PRIMARY KEY (numero)
                )
            """;
            stmt.executeUpdate(sqlDespachos);
            System.out.println("Tabla Despachos creada.");

            // Crear tabla Directores
            String sqlDirectores = """
                CREATE TABLE IF NOT EXISTS Directores (
                    DNI VARCHAR(9) NOT NULL,
                    NomApels VARCHAR(255) NOT NULL,
                    DNIJefe VARCHAR(9),
                    Despacho INT NOT NULL,
                    PRIMARY KEY (DNI),
                    FOREIGN KEY (Despacho) REFERENCES Despachos (numero),
                    FOREIGN KEY (DNIJefe) REFERENCES Directores (DNI)
                )
            """;
            stmt.executeUpdate(sqlDirectores);
            System.out.println("Tabla Directores creada.");
            
            // Insertar datos en Despachos
            String sqlInsertDespachos = """
                INSERT INTO Despachos (numero, Capacidad) VALUES 
                (101, 3),
                (102, 5),
                (103, 2)
            """;
            stmt.executeUpdate(sqlInsertDespachos);
            System.out.println("Datos insertados en la tabla Despachos.");

            // Insertar datos en Directores
            String sqlInsertDirectores = """
                INSERT INTO Directores (DNI, NomApels, DNIJefe, Despacho) VALUES 
                ('123456789', 'Carlos García', NULL, 101),
                ('987654321', 'Marta Pérez', '123456789', 102),
                ('567890123', 'Juan López', '987654321', 103)
            """;
            stmt.executeUpdate(sqlInsertDirectores);
            System.out.println("Datos insertados en la tabla Directores.");
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
