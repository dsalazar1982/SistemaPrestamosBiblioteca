package Vistas;

import Servicios.ClaseConexion;

import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ConsultaPrestamoDetalleGUI extends javax.swing.JInternalFrame {

    public ConsultaPrestamoDetalleGUI() {
        initComponents();
        cargarListaPrestamos();
        //detallePrestamo();
    }

    void cargarListaPrestamos() {
        DefaultTableModel tablaDetallePrestamos = new DefaultTableModel();
        String[] encabezadoTabla = {"No", "NUMERO DE PRESTAMO", "ISBN"};
        tablaDetallePrestamos.setColumnIdentifiers(encabezadoTabla);
        this.jtDetallePrestamos.setModel(tablaDetallePrestamos);
        String consultaSQL = "SELECT * FROM t_detalles_prestamos";
        String[] datos = new String[3];
        try {
            Statement st = conexionDB.createStatement();
            ResultSet rs = st.executeQuery(consultaSQL);
            while (rs.next()) {
                datos[0] = rs.getString("id_detalle");
                datos[1] = rs.getString("id_prestamo");
                datos[2] = rs.getString("isbn");
                tablaDetallePrestamos.addRow(datos);
            }
        } catch (SQLException excepcion) {
            JOptionPane.showMessageDialog(null, "Codigo de error: " + excepcion.getErrorCode() + "\n" + "Mensaje de error: " + excepcion.getMessage(), "Error en conexion a DB", JOptionPane.ERROR_MESSAGE);
        }
    }

    /*void detallePrestamo() {
        DefaultTableModel tablaDetallePrestamos = new DefaultTableModel();
        String[] encabezadoTabla = {"No", "NUMERO DE PRESTAMO", "ISBN"};
        tablaDetallePrestamos.setColumnIdentifiers(encabezadoTabla);
        this.jtDetallePrestamos.setModel(tablaDetallePrestamos);
        for (int i = 0; i < jtDetallePrestamos.getRowCount(); i++) {
            String idPrestamo = jtDetallePrestamos.getValueAt(i, 0).toString();
            String consultaSQL = "SELECT * FROM t_detalles_prestamos WHERE id_prestamo = " + idPrestamo;
            String[] datos = new String[3];
            try {
                Statement st = conexionDB.createStatement();
                ResultSet rs = st.executeQuery(consultaSQL);
                while (rs.next()) {
                    datos[0] = rs.getString("id_detalle");
                    datos[1] = rs.getString("id_prestamo");
                    datos[2] = rs.getString("isbn");
                    tablaDetallePrestamos.addRow(datos);
                }
            } catch (SQLException excepcion) {
                JOptionPane.showMessageDialog(null, "Codigo de error: " + excepcion.getErrorCode() + "\n" + "Mensaje de error: " + excepcion.getMessage(), "Error en conexion a DB", JOptionPane.ERROR_MESSAGE);
            }
        }
    }*/

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

    ClaseConexion objConexion = new ClaseConexion();
    java.sql.Connection conexionDB = objConexion.conexion();
}
