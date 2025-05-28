package Tarea18;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class TiendaInfo{
    public static void main(String[] args) {
        String urlBase = "jdbc:mysql://localhost:3306/";
        String nombreBaseDatos = "TiendaInfo_java";
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

            // Crear tabla Fabricantes
            String sqlFabricantes = """
                CREATE TABLE IF NOT EXISTS Fabricantes (
                    codigo INT NOT NULL,
                    nombre VARCHAR(100) NOT NULL,
                    PRIMARY KEY (codigo)
                )
            """;
            stmt.executeUpdate(sqlFabricantes);
            System.out.println("Tabla Fabricantes creada.");

            // Crear tabla Articulos
            String sqlArticulos = """
                CREATE TABLE IF NOT EXISTS Articulos (
                    codigo INT NOT NULL,
                    nombre VARCHAR(100) NOT NULL,
                    precio INT NOT NULL, 
                    fabricante INT NOT NULL,
                    PRIMARY KEY (codigo),
                    FOREIGN KEY (fabricante) REFERENCES Fabricantes (codigo)
                )
            """;
            stmt.executeUpdate(sqlArticulos);
            System.out.println("Tabla Articulos creada.");

            // Insertar datos en Fabricantes
            String sqlInsertFabricantes = """
                INSERT INTO Fabricantes (codigo, nombre) VALUES 
                (1, 'Samsung'),
                (2, 'Apple'),
                (3, 'Sony')
            """;
            stmt.executeUpdate(sqlInsertFabricantes);
            System.out.println("Datos insertados en la tabla Fabricantes.");

            // Insertar datos en Articulos
            String sqlInsertArticulos = """
                INSERT INTO Articulos (codigo, nombre, precio, fabricante) VALUES 
                (1, 'Galaxy S21', 799, 1),
                (2, 'iPhone 13', 999, 2),
                (3, 'PlayStation 5', 499, 3)
            """;
            stmt.executeUpdate(sqlInsertArticulos);
            System.out.println("Datos insertados en la tabla Articulos.");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
