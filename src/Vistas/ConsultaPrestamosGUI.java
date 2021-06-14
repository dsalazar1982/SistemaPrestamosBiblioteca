package Vistas;

import Servicios.ClaseConexion;

import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ConsultaPrestamosGUI extends javax.swing.JInternalFrame {

    public ConsultaPrestamosGUI() {
        initComponents();
        cargarListaPrestamos();
        this.setLocation(25, 15);
    }

    void cargarListaPrestamos() {
        DefaultTableModel tablaDetallesPrestamos = new DefaultTableModel();
        String[] encabezadoTabla = {"NUMERO", "FECHA DE PRESTAMO", "CODIGO DE ESTUDIANTE"};
        tablaDetallesPrestamos.setColumnIdentifiers(encabezadoTabla);
        this.jtDetallePrestamos.setModel(tablaDetallesPrestamos);
        String consultaSQL = "SELECT * FROM t_prestamos";
        String[] datos = new String[3];
        try {
            Statement st = conexionDB.createStatement();
            ResultSet rs = st.executeQuery(consultaSQL);
            while (rs.next()) {
                datos[0] = rs.getString("id_prestamo");
                datos[1] = rs.getString("fecha");
                datos[2] = rs.getString("codigo_est");
                tablaDetallesPrestamos.addRow(datos);
            }
        } catch (SQLException excepcion) {
            JOptionPane.showMessageDialog(null, "Codigo de error: " + excepcion.getErrorCode() + "\n" + "Mensaje de error: " + excepcion.getMessage(), "Error en conexion a DB", JOptionPane.ERROR_MESSAGE);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jbgBuscarPrestamo = new javax.swing.ButtonGroup();
        jPopupMenu1 = new javax.swing.JPopupMenu();
        jpmiVerDetallePrestamo = new javax.swing.JMenuItem();
        jpmiEliminarDetallePrestamo = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        jrbConsultaUnPrestamo = new javax.swing.JRadioButton();
        jrbConsultaPorFecha = new javax.swing.JRadioButton();
        jrbConsultaTodos = new javax.swing.JRadioButton();
        jtfDatoPrestamo = new javax.swing.JTextField();
        jbBuscarPrestamo = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtDetallePrestamos = new javax.swing.JTable();

        jpmiVerDetallePrestamo.setText("Ver Detalle");
        jpmiVerDetallePrestamo.setActionCommand("Ver Detalle Prestamo");
        jpmiVerDetallePrestamo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jpmiVerDetallePrestamoActionPerformed(evt);
            }
        });
        jPopupMenu1.add(jpmiVerDetallePrestamo);

        jpmiEliminarDetallePrestamo.setText("Eliminar Prestamo");
        jpmiEliminarDetallePrestamo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jpmiEliminarDetallePrestamoActionPerformed(evt);
            }
        });
        jPopupMenu1.add(jpmiEliminarDetallePrestamo);

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Consulta De Prestamos");

        jbgBuscarPrestamo.add(jrbConsultaUnPrestamo);
        jrbConsultaUnPrestamo.setFont(new java.awt.Font("Eras Medium ITC", 1, 12)); // NOI18N
        jrbConsultaUnPrestamo.setSelected(true);
        jrbConsultaUnPrestamo.setText("Buscar Prestamo Por Nº:");
        jrbConsultaUnPrestamo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbConsultaUnPrestamoActionPerformed(evt);
            }
        });

        jbgBuscarPrestamo.add(jrbConsultaPorFecha);
        jrbConsultaPorFecha.setFont(new java.awt.Font("Eras Medium ITC", 1, 12)); // NOI18N
        jrbConsultaPorFecha.setText("Buscar Prestamo Por Fecha:");
        jrbConsultaPorFecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbConsultaPorFechaActionPerformed(evt);
            }
        });

        jbgBuscarPrestamo.add(jrbConsultaTodos);
        jrbConsultaTodos.setFont(new java.awt.Font("Eras Medium ITC", 1, 12)); // NOI18N
        jrbConsultaTodos.setText("Mostrar Todos Los Prestamos");
        jrbConsultaTodos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbConsultaTodosActionPerformed(evt);
            }
        });

        jbBuscarPrestamo.setFont(new java.awt.Font("Eras Medium ITC", 1, 11)); // NOI18N
        jbBuscarPrestamo.setText("Buscar");
        jbBuscarPrestamo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBuscarPrestamoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(109, 109, 109)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jrbConsultaUnPrestamo)
                                .addGap(27, 27, 27)
                                .addComponent(jtfDatoPrestamo, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jrbConsultaPorFecha))
                        .addGap(26, 26, 26)
                        .addComponent(jbBuscarPrestamo, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jrbConsultaTodos))
                .addContainerGap(141, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtfDatoPrestamo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jrbConsultaUnPrestamo))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jrbConsultaPorFecha)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jrbConsultaTodos))
                    .addComponent(jbBuscarPrestamo, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(11, Short.MAX_VALUE))
        );

        jtDetallePrestamos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jtDetallePrestamos.setComponentPopupMenu(jPopupMenu1);
        jScrollPane1.setViewportView(jtDetallePrestamos);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 638, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        setBounds(0, 0, 674, 308);
    }// </editor-fold>//GEN-END:initComponents

private void jbBuscarPrestamoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBuscarPrestamoActionPerformed
    String dato = jtfDatoPrestamo.getText();
    String consultaSQL = "";
    if (jrbConsultaUnPrestamo.isSelected() == true) {
        consultaSQL = "SELECT * FROM t_prestamos WHERE id_prestamo='" + dato + "'";
    }
    if (jrbConsultaPorFecha.isSelected() == true) {
        String fecha = jtfDatoPrestamo.getText();
        consultaSQL = "SELECT * FROM t_prestamos WHERE fecha='" + fecha + "'";
    }
    if (jrbConsultaTodos.isSelected() == true) {
        consultaSQL = "SELECT * FROM t_prestamos";
        jtfDatoPrestamo.setText("");
        jtfDatoPrestamo.setEnabled(false);
    }
    DefaultTableModel tablaDetallesPrestamos = new DefaultTableModel();
    String[] encabezadoTabla = {"NUMERO", "FECHA DE PRESTAMO", "CODIGO DE ESTUDIANTE"};
    tablaDetallesPrestamos.setColumnIdentifiers(encabezadoTabla);
    this.jtDetallePrestamos.setModel(tablaDetallesPrestamos);
    String[] Datos = new String[4];
    try {
        Statement st = conexionDB.createStatement();
        ResultSet rs = st.executeQuery(consultaSQL);
        while (rs.next()) {
            Datos[0] = rs.getString("id_prestamo");
            Datos[1] = rs.getString("fecha");
            Datos[2] = rs.getString("codigo_est");
            tablaDetallesPrestamos.addRow(Datos);
        }
    } catch (SQLException excepcion) {
        JOptionPane.showMessageDialog(null, "Codigo de error: " + excepcion.getErrorCode() + "\n" + "Mensaje de error: " + excepcion.getMessage(), "Error en conexion a DB", JOptionPane.ERROR_MESSAGE);
    }
}//GEN-LAST:event_jbBuscarPrestamoActionPerformed

private void jrbConsultaUnPrestamoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbConsultaUnPrestamoActionPerformed
    if (jrbConsultaUnPrestamo.isSelected() == true) {
        jtfDatoPrestamo.setEnabled(true);
        jtfDatoPrestamo.setText("");
        jtfDatoPrestamo.requestFocus();
    }
}//GEN-LAST:event_jrbConsultaUnPrestamoActionPerformed
private void jrbConsultaPorFechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbConsultaPorFechaActionPerformed
    if (jrbConsultaPorFecha.isSelected() == true) {
        jtfDatoPrestamo.setEnabled(true);
        jtfDatoPrestamo.setText("");
        jtfDatoPrestamo.requestFocus();
    }
}//GEN-LAST:event_jrbConsultaPorFechaActionPerformed
private void jrbConsultaTodosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbConsultaTodosActionPerformed
    if (jrbConsultaTodos.isSelected() == true) {
        jtfDatoPrestamo.setEnabled(false);
        jtfDatoPrestamo.setText("");
        cargarListaPrestamos();
    }
}//GEN-LAST:event_jrbConsultaTodosActionPerformed
private void jpmiVerDetallePrestamoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jpmiVerDetallePrestamoActionPerformed
    int filaSeleccionada = jtDetallePrestamos.getSelectedRow();
    String idPrestammo = jtDetallePrestamos.getValueAt(filaSeleccionada, 0).toString();    
    
    if (filaSeleccionada == -1) {
        JOptionPane.showMessageDialog(null, "No seleciono un registro", "Seleccion invalida", JOptionPane.WARNING_MESSAGE);
    } else {
        ConsultaPrestamoDetalleGUI detallePrestamo = new ConsultaPrestamoDetalleGUI();
        detallePrestamo.cargarListaPrestamos(idPrestammo);
        int x = (Principal.jdpPrincipal.getWidth() / 2) - detallePrestamo.getWidth() / 2;
        int y = (Principal.jdpPrincipal.getHeight() / 2) - detallePrestamo.getHeight() / 2;
        if (detallePrestamo.isShowing()) {
            detallePrestamo.setLocation(x, y);
        } else {
            Principal.jdpPrincipal.add(detallePrestamo);
            detallePrestamo.setLocation(x, y);
            detallePrestamo.setVisible(true);
        }
    }
}//GEN-LAST:event_jpmiVerDetallePrestamoActionPerformed

private void jpmiEliminarDetallePrestamoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jpmiEliminarDetallePrestamoActionPerformed
    int filaSeleccionada = jtDetallePrestamos.getSelectedRow();
    if (filaSeleccionada >= 0) {
        String codigo = jtDetallePrestamos.getValueAt(filaSeleccionada, 0).toString();
        try {
            PreparedStatement pst = conexionDB.prepareStatement("DELETE FROM t_prestamos WHERE id_prestamo='" + codigo + "'");
            pst.executeUpdate();
        } catch (SQLException excepcion) {
            JOptionPane.showMessageDialog(null, "Codigo de error: " + excepcion.getErrorCode() + "\n" + "Mensaje de error: " + excepcion.getMessage(), "Error en conexion a DB", JOptionPane.ERROR_MESSAGE);
        }
        cargarListaPrestamos();
    } else {
        JOptionPane.showMessageDialog(this, "No seleciono un registro", "Seleccion invalida", JOptionPane.WARNING_MESSAGE);
    }
}//GEN-LAST:event_jpmiEliminarDetallePrestamoActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbBuscarPrestamo;
    private javax.swing.ButtonGroup jbgBuscarPrestamo;
    private javax.swing.JMenuItem jpmiEliminarDetallePrestamo;
    private javax.swing.JMenuItem jpmiVerDetallePrestamo;
    private javax.swing.JRadioButton jrbConsultaPorFecha;
    private javax.swing.JRadioButton jrbConsultaTodos;
    private javax.swing.JRadioButton jrbConsultaUnPrestamo;
    public static javax.swing.JTable jtDetallePrestamos;
    private javax.swing.JTextField jtfDatoPrestamo;
    // End of variables declaration//GEN-END:variables

    ClaseConexion objConexion = new ClaseConexion();
    Connection conexionDB = objConexion.conexion();
}
