package Vistas;

import Servicios.ClaseConexion;
import java.awt.JobAttributes;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class VistaPrestamoLibrosGUI extends javax.swing.JInternalFrame {

    DefaultTableModel tabla;

    public VistaPrestamoLibrosGUI() {
        initComponents();
        cargarlistalibros("");
    }

    String comparar(String cod) {
        String cant = "";
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM tb_libros WHERE ISBN='" + cod + "'");
            while (rs.next()) {
                cant = rs.getString(4);
            }
        } catch (SQLException ex) {
            Logger.getLogger(VistaPrestamoLibrosGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
        return cant;
    }

    void cargarlistalibros(String dato) {
        String[] Titulo = {"CODIGO", "NOMBRE", "EDITORIAL", "AÑO"};
        tabla = new DefaultTableModel(null, Titulo);
        String[] Registro = new String[4];
        String[] titulos = {"CODIGO", "NOMBRES", "APELLIDOS", "TELEFONO"};
        String[] Registros = new String[4];
        String Sql = "SELECT * FROM tb_libros WHERE CONCAT(ISBN, nombre_lib, editorial_lib, ano_publicacion) LIKE '%" + dato + "%'";
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(Sql);
            while (rs.next()) {
                Registros[0] = rs.getString("ISBN");
                Registros[1] = rs.getString("nombre_lib");
                Registros[2] = rs.getString("editorial_lib");
                Registros[3] = rs.getString("ano_publicacion");
                tabla.addRow(Registros);
            }
            tblib.setModel(tabla);
        } catch (SQLException ex) {
            Logger.getLogger(VistaPrestamoLibrosGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPopupMenu1 = new javax.swing.JPopupMenu();
        mnenviarpro = new javax.swing.JMenuItem();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblib = new javax.swing.JTable();
        txtprod = new javax.swing.JTextField();
        btnmostrar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        mnenviarpro.setText("Enviar a Factura");
        mnenviarpro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnenviarproActionPerformed(evt);
            }
        });
        jPopupMenu1.add(mnenviarpro);

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Listado De Libros");

        tblib.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tblib.setComponentPopupMenu(jPopupMenu1);
        jScrollPane2.setViewportView(tblib);

        txtprod.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtprodKeyReleased(evt);
            }
        });

        btnmostrar.setFont(new java.awt.Font("Eras Medium ITC", 1, 12)); // NOI18N
        btnmostrar.setText("Mostrar todos");
        btnmostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmostrarActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Eras Medium ITC", 1, 12)); // NOI18N
        jLabel1.setText("Buscar Libro:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 369, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtprod, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnmostrar)
                        .addGap(30, 30, 30))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(btnmostrar)
                    .addComponent(txtprod, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
private void btnmostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmostrarActionPerformed
    cargarlistalibros("");
}//GEN-LAST:event_btnmostrarActionPerformed
private void txtprodKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtprodKeyReleased
    cargarlistalibros(txtprod.getText());
}//GEN-LAST:event_txtprodKeyReleased
private void mnenviarproActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnenviarproActionPerformed
    try {
        DefaultTableModel tabladet = (DefaultTableModel) RegistroPrestamosGUI.jtDetallePrestamo.getModel();
        String[] dato = new String[5];
        int fila = tblib.getSelectedRow();
        if (fila == -1) {
            JOptionPane.showMessageDialog(null, "No  ha seleccionado ningun registro");
        } else {
            String ISBN = tblib.getValueAt(fila, 0).toString();
            String nom = tblib.getValueAt(fila, 1).toString();
            String edit = tblib.getValueAt(fila, 2).toString();
            String ano = tblib.getValueAt(fila, 3).toString();
            dato[0] = ISBN;
            dato[1] = nom;
            dato[2] = edit;
            dato[3] = ano;
            tabladet.addRow(dato);
            RegistroPrestamosGUI.jtDetallePrestamo.setModel(tabladet);
        }
    } catch (Exception e) {
    }
}//GEN-LAST:event_mnenviarproActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnmostrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JMenuItem mnenviarpro;
    private javax.swing.JTable tblib;
    private javax.swing.JTextField txtprod;
    // End of variables declaration//GEN-END:variables
ClaseConexion cc = new ClaseConexion();
    Connection cn = cc.conexion();
}
