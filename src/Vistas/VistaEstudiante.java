package Vistas;

import Servicios.conectar;
import java.awt.Color;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class VistaEstudiante extends javax.swing.JInternalFrame {

    DefaultTableModel modelo;

    public VistaEstudiante() {
        initComponents();
        mostrarclientes("");
    }

    void mostrarclientes(String valor) {
        String[] titulos = {"CODIGO", "NOMBRES", "APELLIDOS", "TELEFONO"};
        String[] Registros = new String[4];
        modelo = new DefaultTableModel(null, titulos);
        String Sql = "SELECT * FROM tb_estudiantes WHERE CONCAT(codigo_estu, nombre_estu, apellido_estu, telefono_estu) LIKE '%" + valor + "%'";
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(Sql);
            while (rs.next()) {
                Registros[0] = rs.getString("codigo_estu");
                Registros[1] = rs.getString("nombre_estu");
                Registros[2] = rs.getString("apellido_estu");
                Registros[3] = rs.getString("telefono_estu");
                modelo.addRow(Registros);
            }
            tbestudiantes.setModel(modelo);
        } catch (SQLException ex) {
            Logger.getLogger(VistaEstudiante.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        mnenviar = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnBuscarEstudiante = new javax.swing.JButton();
        txtbus = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbestudiantes = new javax.swing.JTable();
        btnRegistrarEstudiante = new javax.swing.JButton();

        mnenviar.setText("Enviar Datos");
        mnenviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnenviarActionPerformed(evt);
            }
        });
        jPopupMenu1.add(mnenviar);

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("ESTUDIANTES");

        jLabel1.setFont(new java.awt.Font("Eras Medium ITC", 1, 12)); // NOI18N
        jLabel1.setText("Buscar Estudi..");

        btnBuscarEstudiante.setFont(new java.awt.Font("Eras Medium ITC", 1, 12)); // NOI18N
        btnBuscarEstudiante.setText("Mostrar Todo");
        btnBuscarEstudiante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarEstudianteActionPerformed(evt);
            }
        });

        txtbus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbusActionPerformed(evt);
            }
        });
        txtbus.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtbusKeyReleased(evt);
            }
        });

        tbestudiantes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tbestudiantes.setComponentPopupMenu(jPopupMenu1);
        jScrollPane1.setViewportView(tbestudiantes);

        btnRegistrarEstudiante.setFont(new java.awt.Font("Eras Medium ITC", 1, 12)); // NOI18N
        btnRegistrarEstudiante.setText("Registrar Estudiantes");
        btnRegistrarEstudiante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarEstudianteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 585, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtbus, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnBuscarEstudiante)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnRegistrarEstudiante)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtbus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscarEstudiante)
                    .addComponent(btnRegistrarEstudiante))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(40, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
private void btnBuscarEstudianteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarEstudianteActionPerformed
    mostrarclientes("");
}//GEN-LAST:event_btnBuscarEstudianteActionPerformed

private void txtbusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbusActionPerformed

}//GEN-LAST:event_txtbusActionPerformed

private void txtbusKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtbusKeyReleased
    mostrarclientes(txtbus.getText());
}//GEN-LAST:event_txtbusKeyReleased

private void mnenviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnenviarActionPerformed
    String cod = "", nom = "", tel = "";
    int fila = tbestudiantes.getSelectedRow();
    try {
        if (fila == -1) {
            JOptionPane.showMessageDialog(null, "No ha seleccionado ningun dato");
        } else {
            cod = (String) tbestudiantes.getValueAt(fila, 0);
            nom = (String) tbestudiantes.getValueAt(fila, 1);
            tel = (String) tbestudiantes.getValueAt(fila, 3);
            IngresarPrestamoGUI.jtfCodigoEstudiante.setDisabledTextColor(Color.blue);
            IngresarPrestamoGUI.jtfCodigoEstudiante.setText(cod);
            IngresarPrestamoGUI.txtnom.setDisabledTextColor(Color.blue);
            IngresarPrestamoGUI.txtnom.setText(nom);
            IngresarPrestamoGUI.txttel.setDisabledTextColor(Color.blue);
            IngresarPrestamoGUI.txttel.setText(tel);
            this.dispose();
        }
    } catch (Exception e) {
    }
}//GEN-LAST:event_mnenviarActionPerformed
private void btnRegistrarEstudianteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarEstudianteActionPerformed
    try {

        /*IngresoEstudianteGUI registrarEstudiante = new IngresoEstudianteGUI();
        Principal.jdpPrincipal.add(registrarEstudiante);
        registrarEstudiante.toFront();
        registrarEstudiante.setVisible(true);
        this.dispose();*/
        IngresoEstudianteGUI registrarEstudiante = new IngresoEstudianteGUI();

        int x = (Principal.jdpPrincipal.getWidth() / 2) - registrarEstudiante.getWidth() / 2;
        int y = (Principal.jdpPrincipal.getHeight() / 2) - registrarEstudiante.getHeight() / 2;

        if (registrarEstudiante.isShowing()) {
            registrarEstudiante.setLocation(x, y);
        } else {
            Principal.jdpPrincipal.add(registrarEstudiante);
            registrarEstudiante.setLocation(x, y);
            registrarEstudiante.setVisible(true);
        }
    } catch (Exception e) {
    }
}//GEN-LAST:event_btnRegistrarEstudianteActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscarEstudiante;
    private javax.swing.JButton btnRegistrarEstudiante;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JMenuItem mnenviar;
    private javax.swing.JTable tbestudiantes;
    private javax.swing.JTextField txtbus;
    // End of variables declaration//GEN-END:variables
    conectar cc = new conectar();
    Connection cn = cc.conexion();
}
