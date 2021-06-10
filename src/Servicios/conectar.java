package Servicios;

import java.sql.*;
import javax.swing.*;

public class conectar {

    Connection conect = null;

    public Connection conexion() {

        String serverDB = "jdbc:mysql://10.0.0.51/db_bibliotecaFCECEP";
        String usuarioDB = "dba_user";
        String claveUsuarioDB = "dba_user@MariaDB2020*";

        try {
            Class.forName("com.mysql.jdbc.Driver");
            conect = DriverManager.getConnection(serverDB, usuarioDB, claveUsuarioDB);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e, "Error en conexion a DB", JOptionPane.ERROR_MESSAGE);
        }
        return conect;
    }
}
