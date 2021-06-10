package Vistas;

import Servicios.conectar;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

public class ConsultaLibrosGUI extends javax.swing.JInternalFrame {

    public ConsultaLibrosGUI() {
        initComponents();
        mostrartodoslibros();
    }

    void mostrartodoslibros() {
        DefaultTableModel tabla = new DefaultTableModel();
        String[] titulos = {"CODIGO", "NOMBRE", "EDITORIAL", "ANO"};
        tabla.setColumnIdentifiers(titulos);
        this.tbproductos.setModel(tabla);
        String consulta = "SELECT * FROM tb_libros";
        String[] Datos = new String[4];
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(consulta);
            while (rs.next()) {
                Datos[0] = rs.getString("ISBN");
                Datos[1] = rs.getString("nombre_lib");
                Datos[2] = rs.getString("editorial_lib");
                Datos[3] = rs.getString("ano_plublicacion");
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
        jPanel1 = new javax.swing.JPanel();
        rbtndes = new javax.swing.JRadioButton();
        rbtntodo = new javax.swing.JRadioButton();
        txtdes = new javax.swing.JTextField();
        btnbuscar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbproductos = new javax.swing.JTable();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("CONSULTA DE LIBROS");

        jPanel1.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED)));

        buttonGroup1.add(rbtndes);
        rbtndes.setFont(new java.awt.Font("Eras Medium ITC", 1, 12)); // NOI18N
        rbtndes.setSelected(true);
        rbtndes.setText("Mostrar Productos por Descripcion");
        rbtndes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtndesActionPerformed(evt);
            }
        });

        buttonGroup1.add(rbtntodo);
        rbtntodo.setFont(new java.awt.Font("Eras Medium ITC", 1, 12)); // NOI18N
        rbtntodo.setText("Mostrar todos los Libros");
        rbtntodo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtntodoActionPerformed(evt);
            }
        });

        txtdes.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED)));

        btnbuscar.setFont(new java.awt.Font("Eras Medium ITC", 0, 11)); // NOI18N
        btnbuscar.setText("Buscar");
        btnbuscar.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        btnbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(rbtndes)
                        .addGap(18, 18, 18)
                        .addComponent(txtdes, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnbuscar))
                    .addComponent(rbtntodo))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbtndes)
                    .addComponent(txtdes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnbuscar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rbtntodo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tbproductos.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        tbproductos.setFont(new java.awt.Font("Eras Medium ITC", 0, 11)); // NOI18N
        tbproductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tbproductos);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(19, 19, 19))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
private void rbtntodoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtntodoActionPerformed
    if (rbtntodo.isSelected() == true) {
        txtdes.setText("");
        txtdes.setEnabled(false);
        mostrartodoslibros();
    }
}//GEN-LAST:event_rbtntodoActionPerformed
private void btnbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbuscarActionPerformed
    String buscar = txtdes.getText();
    if (rbtndes.isSelected() == true) {
        DefaultTableModel tabla = new DefaultTableModel();
        String[] titulos = {"CODIGO", "NOMBRE", "EDITORIAL", "ANO"};
        tabla.setColumnIdentifiers(titulos);
        this.tbproductos.setModel(tabla);
        String consulta = "SELECT * FROM tb_libros WHERE nombre_lib  LIKE '%" + buscar + "%'";
        String[] Datos = new String[4];
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(consulta);
            while (rs.next()) {
                Datos[0] = rs.getString("ISBN");
                Datos[1] = rs.getString("nombre_lib");
                Datos[2] = rs.getString("editorial_lib");
                Datos[3] = rs.getString("ano_plublicacion");
                tabla.addRow(Datos);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ConsultaPrestamosGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    } else {
        mostrartodoslibros();
    }
}//GEN-LAST:event_btnbuscarActionPerformed
private void rbtndesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtndesActionPerformed
    if (rbtndes.isSelected() == true) {
        txtdes.setEnabled(true);
        txtdes.requestFocus();
    }
}//GEN-LAST:event_rbtndesActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnbuscar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton rbtndes;
    private javax.swing.JRadioButton rbtntodo;
    private javax.swing.JTable tbproductos;
    private javax.swing.JTextField txtdes;
    // End of variables declaration//GEN-END:variables
conectar cc = new conectar();
    Connection cn = cc.conexion();
}
