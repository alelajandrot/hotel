/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hotel;

/**
 *
 * @author alejandro
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionBD {
    private static final String URL = "jdbc:mysql://localhost:3306/hotel"; // Corregir el nombre de la base de datos
    private static final String USUARIO = "root";
    private static Connection conexion;

    public static Connection obtenerConexion() throws SQLException {
        if (conexion == null) {
            try {
                conexion = DriverManager.getConnection(URL, USUARIO, "");
            } catch (SQLException e) {
                // Maneja la excepción adecuadamente (lanza o imprime un mensaje de error)
                throw e;
            }
        }
        return conexion;
    }
}
