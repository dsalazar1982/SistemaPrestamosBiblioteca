package Vistas;

import Servicios.conectar;
import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.logging.*;
import javax.swing.JOptionPane;
import java.util.Date;
import javax.swing.table.DefaultTableModel;

public class ConsultaPrestamoGUI extends javax.swing.JInternalFrame {

    public ConsultaPrestamoGUI() {
        initComponents();
        cargartodasEntregas();
        this.setLocation(25, 15);
        //jDateChooser1.setEnabled(false);
    }

    void cargartodasEntregas() {
        DefaultTableModel tabla = new DefaultTableModel();
        String[] titulos = {"NUMERO", "FECHA", "COD. ESTUDIANTE"};
        tabla.setColumnIdentifiers(titulos);
        this.tbentregas.setModel(tabla);
        String consulta = "SELECT * FROM tb_prestamos";
        String[] Datos = new String[3];
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(consulta);
            while (rs.next()) {
                Datos[0] = rs.getString("numero");
                Datos[1] = rs.getString("fecha");
                Datos[2] = rs.getString("codigo_estu");
                tabla.addRow(Datos);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ConsultaPrestamoGUI.class.getName()).log(Level.SEVERE, null, ex);
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
        rdbnnumero = new javax.swing.JRadioButton();
        rdbbnfecha = new javax.swing.JRadioButton();
        rdbntodos = new javax.swing.JRadioButton();
        txtnumero = new javax.swing.JTextField();
        btnbuscador = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbentregas = new javax.swing.JTable();

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
        setTitle("CONSULTA DE ENTREGAS");

        buttonGroup1.add(rdbnnumero);
        rdbnnumero.setFont(new java.awt.Font("Eras Medium ITC", 1, 12)); // NOI18N
        rdbnnumero.setSelected(true);
        rdbnnumero.setText("Mostrar  por Nº:");
        rdbnnumero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbnnumeroActionPerformed(evt);
            }
        });

        buttonGroup1.add(rdbbnfecha);
        rdbbnfecha.setFont(new java.awt.Font("Eras Medium ITC", 1, 12)); // NOI18N
        rdbbnfecha.setText("Mostrar por Fecha");
        rdbbnfecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbbnfechaActionPerformed(evt);
            }
        });

        buttonGroup1.add(rdbntodos);
        rdbntodos.setFont(new java.awt.Font("Eras Medium ITC", 1, 12)); // NOI18N
        rdbntodos.setText("Mostrar todas:");
        rdbntodos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbntodosActionPerformed(evt);
            }
        });

        btnbuscador.setFont(new java.awt.Font("Eras Medium ITC", 1, 11)); // NOI18N
        btnbuscador.setText("BUSCAR");
        btnbuscador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbuscadorActionPerformed(evt);
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
                                .addComponent(rdbnnumero)
                                .addGap(27, 27, 27)
                                .addComponent(txtnumero, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(rdbbnfecha))
                        .addGap(26, 26, 26)
                        .addComponent(btnbuscador, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(rdbntodos))
                .addContainerGap(172, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtnumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rdbnnumero))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rdbbnfecha)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rdbntodos))
                    .addComponent(btnbuscador, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(11, Short.MAX_VALUE))
        );

        tbentregas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tbentregas.setComponentPopupMenu(jPopupMenu1);
        jScrollPane1.setViewportView(tbentregas);

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

private void btnbuscadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbuscadorActionPerformed
    String num = txtnumero.getText();
    String consulta = "";
    if (rdbnnumero.isSelected() == true) {
        consulta = "SELECT * FROM tb_prestamos WHERE numero='" + num + "'";
    }
    if (rdbbnfecha.isSelected() == true) {
        Date fecha = jDateChooser1.getDate();
        SimpleDateFormat formatofecha = new SimpleDateFormat("dd/MM/YYYY");
        String fec = "" + formatofecha.format(fecha);
        consulta = "SELECT * FROM tb_prestamos WHERE fecha='" + fec + "'";
    }
    if (rdbntodos.isSelected() == true) {
        consulta = "SELECT * FROM tb_prestamos";
    }
    DefaultTableModel tabla = new DefaultTableModel();
    String[] titulos = {"NUMERO", "FECHA", "COD. ESTUDIANTE"};
    tabla.setColumnIdentifiers(titulos);
    this.tbentregas.setModel(tabla);
    String[] Datos = new String[4];
    try {
        Statement st = cn.createStatement();
        ResultSet rs = st.executeQuery(consulta);
        while (rs.next()) {
            Datos[0] = rs.getString("numero");
            Datos[1] = rs.getString("fecha");
            Datos[2] = rs.getString("codigo_estu");
            tabla.addRow(Datos);
        }
    } catch (SQLException ex) {
        Logger.getLogger(ConsultaPrestamoGUI.class.getName()).log(Level.SEVERE, null, ex);
    }
}//GEN-LAST:event_btnbuscadorActionPerformed
private void rdbnnumeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdbnnumeroActionPerformed
    if (rdbnnumero.isSelected() == true) {
        txtnumero.setEnabled(true);
        txtnumero.requestFocus();
        jDateChooser1.setDate(null);
        jDateChooser1.setEnabled(false);
    }
}//GEN-LAST:event_rdbnnumeroActionPerformed
private void rdbbnfechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdbbnfechaActionPerformed
    if (rdbbnfecha.isSelected() == true) {
        jDateChooser1.setEnabled(true);
        txtnumero.setEnabled(false);
        txtnumero.setText("");
    }
}//GEN-LAST:event_rdbbnfechaActionPerformed
private void rdbntodosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdbntodosActionPerformed
    if (rdbntodos.isSelected() == true) {
        jDateChooser1.setEnabled(false);
        jDateChooser1.setDate(null);
        txtnumero.setText("");
        txtnumero.setEnabled(false);
        cargartodasEntregas();
    }
}//GEN-LAST:event_rdbntodosActionPerformed
private void mnverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnverActionPerformed
    int filasele = tbentregas.getSelectedRow();
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
        this.tbentregas.setModel(model);
        String consulta = "SELECT * FROM tb_detalles";
        String[] Datos = new String[4];
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(consulta);
            while (rs.next()) {
                Datos[0] = rs.getString("numero");
                Datos[1] = rs.getString("ISBN");
                model.addRow(Datos);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ConsultaLibroGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}//GEN-LAST:event_mnverActionPerformed

private void mneliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mneliminarActionPerformed
    int fila = tbentregas.getSelectedRow();
    if (fila >= 0) {
        String cod = tbentregas.getValueAt(fila, 0).toString();
        try {
            PreparedStatement pst = cn.prepareStatement("DELETE FROM tb_facturas WHERE num_fac='" + cod + "'");
            pst.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(ConsultaPrestamoGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
        cargartodasEntregas();
    } else {
        JOptionPane.showMessageDialog(this, "Seleccione alguna fila");
    }
}//GEN-LAST:event_mneliminarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnbuscador;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JMenuItem mneliminar;
    private javax.swing.JMenuItem mnver;
    private javax.swing.JRadioButton rdbbnfecha;
    private javax.swing.JRadioButton rdbnnumero;
    private javax.swing.JRadioButton rdbntodos;
    public static javax.swing.JTable tbentregas;
    private javax.swing.JTextField txtnumero;
    // End of variables declaration//GEN-END:variables
conectar cc = new conectar();
    Connection cn = cc.conexion();
}
