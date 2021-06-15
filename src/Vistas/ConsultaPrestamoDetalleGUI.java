/*
 * Programa         : ConsultaPrestamoDetalleGUI.java
 * Fecha            : 10/06/2021 10:03:45 a. m.
 * Objetivo         : Programa que permite listar todos los registros presentes en la tabla detalles_prestamos de la base de datos a traves de una GUI, 
                      detalles de cada uno de los prestamos.
 * Desarrollador    : Daniel Alberto Salazar Erazo
 */

package Vistas;

import Servicios.ClaseConexion;

import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ConsultaPrestamoDetalleGUI extends javax.swing.JInternalFrame {

    // Método constructor de la GUI con datos cargados
    public ConsultaPrestamoDetalleGUI() {
        initComponents();
        cargarListaPrestamos("");
    }

    // Método que carga la lista de detalles de los préstamos en la tabla
    void cargarListaPrestamos(String dato) {
        DefaultTableModel tablaDetallePrestamos = new DefaultTableModel();
        String[] encabezadoTabla = {"No", "NUMERO DE PRESTAMO", "ISBN"};
        tablaDetallePrestamos.setColumnIdentifiers(encabezadoTabla);
        this.jtDetallePrestamos.setModel(tablaDetallePrestamos);
        String consultaSQL = "SELECT * FROM t_detalles_prestamos WHERE id_prestamo = '" + dato + "'";
        String[] registros = new String[3];
        try {
            Statement st = conexionDB.createStatement();
            ResultSet rs = st.executeQuery(consultaSQL);
            while (rs.next()) {
                registros[0] = rs.getString("id_detalle");
                registros[1] = rs.getString("id_prestamo");
                registros[2] = rs.getString("isbn");
                tablaDetallePrestamos.addRow(registros);
            }
        } catch (SQLException excepcion) {
            JOptionPane.showMessageDialog(this, "Codigo de error: " + excepcion.getErrorCode() + "\n" + "Mensaje de error: " + excepcion.getMessage(), "Error en conexion a DB", JOptionPane.ERROR_MESSAGE);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jtDetallePrestamos = new javax.swing.JTable();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Detalle De Prestamo");

        jtDetallePrestamos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "No", "NUMERO PRESTAMO", "ISBN"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jtDetallePrestamos);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 630, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 236, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JTable jtDetallePrestamos;
    // End of variables declaration//GEN-END:variables

    // Instancia a la conexión de la base de datos
    ClaseConexion objConexion = new ClaseConexion();
    Connection conexionDB = objConexion.conexion();
}
