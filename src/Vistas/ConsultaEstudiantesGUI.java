package Vistas;

import Servicios.ClaseConexion;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

public class ConsultaEstudiantesGUI extends javax.swing.JInternalFrame {

    public ConsultaEstudiantesGUI() {
        initComponents();
        jtfCodigoEstudiante.setEnabled(false);
        CargarlistaEstudiantes();
    }

    void CargarlistaEstudiantes() {
        DefaultTableModel tabla = new DefaultTableModel();
        String[] titulos = {"CODIGO", "NOMBRES", "APELLIDOS", "TELEFONO"};
        tabla.setColumnIdentifiers(titulos);
        tbestudiantes.setModel(tabla);
        String consulta = "SELECT * FROM tb_estudiantes";
        String[] Datos = new String[5];
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(consulta);
            while (rs.next()) {
                Datos[0] = rs.getString("codigo_estu");
                Datos[1] = rs.getString("nombre_estu");
                Datos[2] = rs.getString("apellido_estu");
                Datos[3] = rs.getString("telefono_estu");
                //Datos[4] = rs.getString("dir_estu");

                tabla.addRow(Datos);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ConsultaEstudiantesGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btestugrupo = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jrbConsultarTodosEstudiante = new javax.swing.JRadioButton();
        jtfCodigoEstudiante = new javax.swing.JTextField();
        btnBuscarEstudiante = new javax.swing.JButton();
        jrbConsultarUnEstudiante = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbestudiantes = new javax.swing.JTable();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Consulta De Estudiantes");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED)));

        btestugrupo.add(jrbConsultarTodosEstudiante);
        jrbConsultarTodosEstudiante.setFont(new java.awt.Font("Eras Medium ITC", 1, 12)); // NOI18N
        jrbConsultarTodosEstudiante.setText("Mostrar Todos los Estudiantes");
        jrbConsultarTodosEstudiante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbConsultarTodosEstudianteActionPerformed(evt);
            }
        });

        jtfCodigoEstudiante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfCodigoEstudianteActionPerformed(evt);
            }
        });

        btnBuscarEstudiante.setFont(new java.awt.Font("Eras Medium ITC", 0, 11)); // NOI18N
        btnBuscarEstudiante.setText("BUSCAR");
        btnBuscarEstudiante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarEstudianteActionPerformed(evt);
            }
        });

        btestugrupo.add(jrbConsultarUnEstudiante);
        jrbConsultarUnEstudiante.setFont(new java.awt.Font("Eras Medium ITC", 1, 12)); // NOI18N
        jrbConsultarUnEstudiante.setText("Buscar Estudiante por Codigo:");
        jrbConsultarUnEstudiante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbConsultarUnEstudianteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jrbConsultarTodosEstudiante)
                        .addGap(30, 30, 30)
                        .addComponent(jtfCodigoEstudiante, javax.swing.GroupLayout.DEFAULT_SIZE, 93, Short.MAX_VALUE))
                    .addComponent(jrbConsultarUnEstudiante))
                .addGap(18, 18, 18)
                .addComponent(btnBuscarEstudiante)
                .addGap(32, 32, 32))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBuscarEstudiante)
                    .addComponent(jtfCodigoEstudiante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(19, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jrbConsultarUnEstudiante)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jrbConsultarTodosEstudiante))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, 470, 80));

        tbestudiantes.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
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
        jScrollPane1.setViewportView(tbestudiantes);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 470, 121));

        pack();
    }// </editor-fold>//GEN-END:initComponents
private void btnBuscarEstudianteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarEstudianteActionPerformed
    if (jrbConsultarUnEstudiante.isSelected() == true) {
        String cod = jtfCodigoEstudiante.getText();
        DefaultTableModel modelo = new DefaultTableModel();
        String[] Titulos = {"CODIGO", "NOMBRES", "APELLIDOS", "TELEFONO"};
        modelo.setColumnIdentifiers(Titulos);
        this.tbestudiantes.setModel(modelo);
        try {
            String ConsultaSQL = "SELECT * FROM tb_estudiantes WHERE codigo_estu='" + cod + "'";
            String[] registros = new String[9];
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(ConsultaSQL);
            while (rs.next()) {
                registros[0] = rs.getString("codigo_estu");
                registros[1] = rs.getString("nombre_estu");
                registros[2] = rs.getString("apellido_estu");
                registros[3] = rs.getString("telefono_estu");
                modelo.addRow(registros);
            }
            tbestudiantes.setModel(modelo);
        } catch (SQLException ex) {
            Logger.getLogger(ConsultaEstudiantesGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}//GEN-LAST:event_btnBuscarEstudianteActionPerformed
private void jrbConsultarTodosEstudianteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbConsultarTodosEstudianteActionPerformed
    if (jrbConsultarTodosEstudiante.isSelected() == true) {
        CargarlistaEstudiantes();
        jtfCodigoEstudiante.setText("");
        jtfCodigoEstudiante.setEnabled(false);
    }
}//GEN-LAST:event_jrbConsultarTodosEstudianteActionPerformed
    private void jtfCodigoEstudianteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfCodigoEstudianteActionPerformed

    }//GEN-LAST:event_jtfCodigoEstudianteActionPerformed

    private void jrbConsultarUnEstudianteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbConsultarUnEstudianteActionPerformed
        if (jrbConsultarUnEstudiante.isSelected() == true) {
            jtfCodigoEstudiante.setEnabled(true);
            jtfCodigoEstudiante.requestFocus();
        }
    }//GEN-LAST:event_jrbConsultarUnEstudianteActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup btestugrupo;
    private javax.swing.JButton btnBuscarEstudiante;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton jrbConsultarTodosEstudiante;
    private javax.swing.JRadioButton jrbConsultarUnEstudiante;
    private javax.swing.JTextField jtfCodigoEstudiante;
    private javax.swing.JTable tbestudiantes;
    // End of variables declaration//GEN-END:variables
ClaseConexion cc = new ClaseConexion();
    Connection cn = cc.conexion();
}
