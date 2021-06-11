package Vistas;

import Servicios.ClaseConexion;
import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.logging.*;
import javax.swing.JOptionPane;
import java.util.Date;
import javax.swing.table.DefaultTableModel;

public class ConsultaPrestamosGUI extends javax.swing.JInternalFrame {

    public ConsultaPrestamosGUI() {
        initComponents();
        cargartodasEntregas();
        this.setLocation(25, 15);
        //jDateChooser1.setEnabled(false);
    }

    void cargartodasEntregas() {
        DefaultTableModel tabla = new DefaultTableModel();
        String[] titulos = {"NUMERO", "FECHA", "COD. ESTUDIANTE"};
        tabla.setColumnIdentifiers(titulos);
        this.jtDetallePrestamos.setModel(tabla);
        String consulta = "SELECT * FROM tb_prestamos";
        String[] Datos = new String[3];
        try {
            Statement st = conexionDB.createStatement();
            ResultSet rs = st.executeQuery(consulta);
            while (rs.next()) {
                Datos[0] = rs.getString("numero");
                Datos[1] = rs.getString("fecha");
                Datos[2] = rs.getString("codigo_estu");
                tabla.addRow(Datos);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ConsultaPrestamosGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPopupMenu1 = new javax.swing.JPopupMenu();
        mnver = new javax.swing.JMenuItem();
        mneliminar = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        jrbConsultaPorNumero = new javax.swing.JRadioButton();
        jrbConsultaPorFecha = new javax.swing.JRadioButton();
        jrbConsultaTodos = new javax.swing.JRadioButton();
        jtfDatoDeConsulta = new javax.swing.JTextField();
        jbBuscarPrestamos = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtDetallePrestamos = new javax.swing.JTable();

        mnver.setText("Ver Detalle");
        mnver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnverActionPerformed(evt);
            }
        });
        jPopupMenu1.add(mnver);

        mneliminar.setText("Eliminar");
        mneliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mneliminarActionPerformed(evt);
            }
        });
        jPopupMenu1.add(mneliminar);

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Consulta De Prestamos");

        buttonGroup1.add(jrbConsultaPorNumero);
        jrbConsultaPorNumero.setFont(new java.awt.Font("Eras Medium ITC", 1, 12)); // NOI18N
        jrbConsultaPorNumero.setSelected(true);
        jrbConsultaPorNumero.setText("Mostrar  por Nº:");
        jrbConsultaPorNumero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbConsultaPorNumeroActionPerformed(evt);
            }
        });

        buttonGroup1.add(jrbConsultaPorFecha);
        jrbConsultaPorFecha.setFont(new java.awt.Font("Eras Medium ITC", 1, 12)); // NOI18N
        jrbConsultaPorFecha.setText("Mostrar por Fecha");
        jrbConsultaPorFecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbConsultaPorFechaActionPerformed(evt);
            }
        });

        buttonGroup1.add(jrbConsultaTodos);
        jrbConsultaTodos.setFont(new java.awt.Font("Eras Medium ITC", 1, 12)); // NOI18N
        jrbConsultaTodos.setText("Mostrar todas:");
        jrbConsultaTodos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbConsultaTodosActionPerformed(evt);
            }
        });

        jbBuscarPrestamos.setFont(new java.awt.Font("Eras Medium ITC", 1, 11)); // NOI18N
        jbBuscarPrestamos.setText("BUSCAR");
        jbBuscarPrestamos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBuscarPrestamosActionPerformed(evt);
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
                                .addComponent(jrbConsultaPorNumero)
                                .addGap(27, 27, 27)
                                .addComponent(jtfDatoDeConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jrbConsultaPorFecha))
                        .addGap(26, 26, 26)
                        .addComponent(jbBuscarPrestamos, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jrbConsultaTodos))
                .addContainerGap(172, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtfDatoDeConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jrbConsultaPorNumero))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jrbConsultaPorFecha)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jrbConsultaTodos))
                    .addComponent(jbBuscarPrestamos, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
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

private void jbBuscarPrestamosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBuscarPrestamosActionPerformed
    String num = jtfDatoDeConsulta.getText();
    String consulta = "";
    if (jrbConsultaPorNumero.isSelected() == true) {
        consulta = "SELECT * FROM tb_prestamos WHERE numero='" + num + "'";
    }
    if (jrbConsultaPorFecha.isSelected() == true) {
        Date fecha = jDateChooser1.getDate();
        SimpleDateFormat formatofecha = new SimpleDateFormat("dd/MM/YYYY");
        String fec = "" + formatofecha.format(fecha);
        consulta = "SELECT * FROM tb_prestamos WHERE fecha='" + fec + "'";
    }
    if (jrbConsultaTodos.isSelected() == true) {
        consulta = "SELECT * FROM tb_prestamos";
    }
    DefaultTableModel tabla = new DefaultTableModel();
    String[] titulos = {"NUMERO", "FECHA", "COD. ESTUDIANTE"};
    tabla.setColumnIdentifiers(titulos);
    this.jtDetallePrestamos.setModel(tabla);
    String[] Datos = new String[4];
    try {
        Statement st = conexionDB.createStatement();
        ResultSet rs = st.executeQuery(consulta);
        while (rs.next()) {
            Datos[0] = rs.getString("numero");
            Datos[1] = rs.getString("fecha");
            Datos[2] = rs.getString("codigo_estu");
            tabla.addRow(Datos);
        }
    } catch (SQLException ex) {
        Logger.getLogger(ConsultaPrestamosGUI.class.getName()).log(Level.SEVERE, null, ex);
    }
}//GEN-LAST:event_jbBuscarPrestamosActionPerformed
private void jrbConsultaPorNumeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbConsultaPorNumeroActionPerformed
    if (jrbConsultaPorNumero.isSelected() == true) {
        jtfDatoDeConsulta.setEnabled(true);
        jtfDatoDeConsulta.requestFocus();
        jDateChooser1.setDate(null);
        jDateChooser1.setEnabled(false);
    }
}//GEN-LAST:event_jrbConsultaPorNumeroActionPerformed
private void jrbConsultaPorFechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbConsultaPorFechaActionPerformed
    if (jrbConsultaPorFecha.isSelected() == true) {
        jDateChooser1.setEnabled(true);
        jtfDatoDeConsulta.setEnabled(false);
        jtfDatoDeConsulta.setText("");
    }
}//GEN-LAST:event_jrbConsultaPorFechaActionPerformed
private void jrbConsultaTodosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbConsultaTodosActionPerformed
    if (jrbConsultaTodos.isSelected() == true) {
        jDateChooser1.setEnabled(false);
        jDateChooser1.setDate(null);
        jtfDatoDeConsulta.setText("");
        jtfDatoDeConsulta.setEnabled(false);
        cargartodasEntregas();
    }
}//GEN-LAST:event_jrbConsultaTodosActionPerformed
private void mnverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnverActionPerformed
    int filasele = jtDetallePrestamos.getSelectedRow();
    if (filasele == -1) {
        JOptionPane.showMessageDialog(null, "No Seleciono ninguna fila");
    } else {
        DetallePrestamoGUI detalle = new DetallePrestamoGUI();
        Principal.jdpPrincipal.add(detalle);
        detalle.toFront();
        detalle.setVisible(true);
        DefaultTableModel model = (DefaultTableModel) DetallePrestamoGUI.tbdetalle.getModel();
        String[] titulos = {"NUMERO ENTREGA", "ISBN"};
        model.setColumnIdentifiers(titulos);
        this.jtDetallePrestamos.setModel(model);
        String consulta = "SELECT * FROM tb_detalles";
        String[] Datos = new String[4];
        try {
            Statement st = conexionDB.createStatement();
            ResultSet rs = st.executeQuery(consulta);
            while (rs.next()) {
                Datos[0] = rs.getString("numero");
                Datos[1] = rs.getString("ISBN");
                model.addRow(Datos);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ConsultaLibrosGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}//GEN-LAST:event_mnverActionPerformed

private void mneliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mneliminarActionPerformed
    int fila = jtDetallePrestamos.getSelectedRow();
    if (fila >= 0) {
        String cod = jtDetallePrestamos.getValueAt(fila, 0).toString();
        try {
            PreparedStatement pst = conexionDB.prepareStatement("DELETE FROM tb_facturas WHERE num_fac='" + cod + "'");
            pst.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(ConsultaPrestamosGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
        cargartodasEntregas();
    } else {
        JOptionPane.showMessageDialog(this, "Seleccione alguna fila");
    }
}//GEN-LAST:event_mneliminarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbBuscarPrestamos;
    private javax.swing.JRadioButton jrbConsultaPorFecha;
    private javax.swing.JRadioButton jrbConsultaPorNumero;
    private javax.swing.JRadioButton jrbConsultaTodos;
    public static javax.swing.JTable jtDetallePrestamos;
    private javax.swing.JTextField jtfDatoDeConsulta;
    private javax.swing.JMenuItem mneliminar;
    private javax.swing.JMenuItem mnver;
    // End of variables declaration//GEN-END:variables
ClaseConexion objConexion = new ClaseConexion();
    Connection conexionDB = objConexion.conexion();
}
