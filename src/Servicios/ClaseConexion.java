/*
 * Programa         : ClaseConexion.java
 * Fecha            : 15/06/2021 02:00:00 p. m.
 * Objetivo         : Programa que permite la conexion a la base de datos.
 * Desarrollador    : Daniel Alberto Salazar Erazo
 */
package Servicios;

import java.sql.*;
import javax.swing.JOptionPane;

public class ClaseConexion {

    Connection conexionDB = null;

    public Connection conexion() {
        // Driver de conexión, nombre de servidor y nombre de base de datos
        String serverDB = "jdbc:mysql://10.0.0.51/db_SistemaPrestamosBiblioteca";

        // Usuario de la base de datos
        String usuarioDB = "dba_user";

        // Clave de usuario de la base de datos
        String claveUsuarioDB = "dba_user@MariaDB2020*";

        try {
            conexionDB = DriverManager.getConnection(serverDB, usuarioDB, claveUsuarioDB);
        } catch (SQLException excepcion) {
            JOptionPane.showMessageDialog(null, "Codigo de error: " + excepcion.getErrorCode() + "\n" + "Mensaje de error: " + excepcion.getMessage(), "Error en conexion a DB", JOptionPane.ERROR_MESSAGE);
        }
        return conexionDB;
    }
}
