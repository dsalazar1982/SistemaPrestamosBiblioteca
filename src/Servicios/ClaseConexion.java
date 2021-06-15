package Servicios;

import java.sql.*;
import javax.swing.JOptionPane;

public class ClaseConexion {

    Connection conexionDB = null;

    public Connection conexion() {
        String serverDB = "jdbc:mysql://10.0.0.51/db_SistemaPrestamosBiblioteca";
        String usuarioDB = "dba_user";
        String claveUsuarioDB = "dba_user@MariaDB2020*";
        try {
            conexionDB = DriverManager.getConnection(serverDB, usuarioDB, claveUsuarioDB);
        } catch (SQLException excepcion) {
            JOptionPane.showMessageDialog(null, "Codigo de error: " + excepcion.getErrorCode() + "\n" + "Mensaje de error: " + excepcion.getMessage(), "Error en conexion a DB", JOptionPane.ERROR_MESSAGE);
        }
        return conexionDB;
    }
}
