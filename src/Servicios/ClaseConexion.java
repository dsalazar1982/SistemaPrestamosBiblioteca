package Servicios;

import java.sql.*;
import javax.swing.JOptionPane;

public class ClaseConexion {

    Connection conect = null;

    public Connection conexion() {

        String serverDB = "jdbc:mysql://10.0.0.51/db_bibliotecaFCECEP";
        String usuarioDB = "dba_user";
        String claveUsuarioDB = "dba_user@MariaDB2020*";

        try {
            conect = DriverManager.getConnection(serverDB, usuarioDB, claveUsuarioDB);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error: " + e, "Error en conexion a DB", JOptionPane.ERROR_MESSAGE);
        }
        return conect;
    }
}
