/*
 * Programa         : ConsultaEstudiantesGUI.java
 * Fecha            : 15/06/2021 02:00:00 p. m.
 * Objetivo         : Programa que permite listar todos los registros presentes en la tabla estudiantes de la base de datos a traves de una GUI, 
                      de igual forma, permite realizar la busqueda de un estudiante por codigo.
 * Desarrollador    : Daniel Alberto Salazar Erazo
 */

package Vistas;

import Servicios.ClaseConexion;

import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ConsultaEstudiantesGUI extends javax.swing.JInternalFrame {

    // Método constructor de la GUI con datos cargados
    public ConsultaEstudiantesGUI() {
        initComponents();
        jtfCodigoEstudiante.setEnabled(false);
        cargarListaEstudiantes();
    }

    // Método que carga la lista de estudiantes en la tabla
    void cargarListaEstudiantes() {
        DefaultTableModel tablaDetalleEstudiantes = new DefaultTableModel();
        String[] encabezadoTabla = {"CODIGO", "NOMBRES", "APELLIDOS", "TELEFONO"};
        tablaDetalleEstudiantes.setColumnIdentifiers(encabezadoTabla);
        jtDetalleEstudiantes.setModel(tablaDetalleEstudiantes);
        String consultaSQL = "SELECT * FROM t_estudiantes";
        String[] registros = new String[4];
        try {
            Statement st = conexionDB.createStatement();
            ResultSet rs = st.executeQuery(consultaSQL);
            while (rs.next()) {
                registros[0] = rs.getString("codigo_est");
                registros[1] = rs.getString("nombres_est");
                registros[2] = rs.getString("apellidos_est");
                registros[3] = rs.getString("telefono_est");
                tablaDetalleEstudiantes.addRow(registros);
            }
        } catch (SQLException excepcion) {
            JOptionPane.showMessageDialog(this, "Codigo de error: " + excepcion.getErrorCode() + "\n" + "Mensaje de error: " + excepcion.getMessage(), "Error en conexion a DB", JOptionPane.ERROR_MESSAGE);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jbgBuscarEstudiante = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jrbConsultarTodosEstudiante = new javax.swing.JRadioButton();
        jrbConsultarUnEstudiante = new javax.swing.JRadioButton();
        jtfCodigoEstudiante = new javax.swing.JTextField();
        jbBuscarEstudiante = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtDetalleEstudiantes = new javax.swing.JTable();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Consulta De Estudiantes");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED)));

        jbgBuscarEstudiante.add(jrbConsultarTodosEstudiante);
        jrbConsultarTodosEstudiante.setFont(new java.awt.Font("Eras Medium ITC", 1, 12)); // NOI18N
        jrbConsultarTodosEstudiante.setText("Mostrar Todos Los Estudiantes");
        jrbConsultarTodosEstudiante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbConsultarTodosEstudianteActionPerformed(evt);
            }
        });

        jbgBuscarEstudiante.add(jrbConsultarUnEstudiante);
        jrbConsultarUnEstudiante.setFont(new java.awt.Font("Eras Medium ITC", 1, 12)); // NOI18N
        jrbConsultarUnEstudiante.setText("Buscar Estudiante Por Codigo:");
        jrbConsultarUnEstudiante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbConsultarUnEstudianteActionPerformed(evt);
            }
        });

        jbBuscarEstudiante.setFont(new java.awt.Font("Eras Medium ITC", 0, 14)); // NOI18N
        jbBuscarEstudiante.setText("BUSCAR");
        jbBuscarEstudiante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBuscarEstudianteActionPerformed(evt);
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
                        .addGap(32, 303, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jrbConsultarUnEstudiante)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jtfCodigoEstudiante)
                        .addGap(18, 18, 18)
                        .addComponent(jbBuscarEstudiante, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jrbConsultarUnEstudiante)
                    .addComponent(jtfCodigoEstudiante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbBuscarEstudiante, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jrbConsultarTodosEstudiante)
                .addGap(25, 25, 25))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, 550, 130));

        jtDetalleEstudiantes.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jtDetalleEstudiantes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jtDetalleEstudiantes);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 540, 170));

        pack();
    }// </editor-fold>//GEN-END:initComponents

// Acción del botón buscar estudiante mediante el código de estudiante
private void jbBuscarEstudianteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBuscarEstudianteActionPerformed
    if (jrbConsultarUnEstudiante.isSelected() == true) {
        String dato = jtfCodigoEstudiante.getText();
        DefaultTableModel tablaDetalleEstudiantes = new DefaultTableModel();
        String[] encabezadoTabla = {"CODIGO", "NOMBRES", "APELLIDOS", "TELEFONO"};
        tablaDetalleEstudiantes.setColumnIdentifiers(encabezadoTabla);
        this.jtDetalleEstudiantes.setModel(tablaDetalleEstudiantes);
        try {
            String consultaSQL = "SELECT * FROM t_estudiantes WHERE codigo_est='" + dato + "'";
            String[] registros = new String[4];
            Statement st = conexionDB.createStatement();
            ResultSet rs = st.executeQuery(consultaSQL);
            while (rs.next()) {
                registros[0] = rs.getString("codigo_est");
                registros[1] = rs.getString("nombres_est");
                registros[2] = rs.getString("apellidos_est");
                registros[3] = rs.getString("telefono_est");
                tablaDetalleEstudiantes.addRow(registros);
            }
            jtDetalleEstudiantes.setModel(tablaDetalleEstudiantes);
        } catch (SQLException excepcion) {
            JOptionPane.showMessageDialog(this, "Codigo de error: " + excepcion.getErrorCode() + "\n" + "Mensaje de error: " + excepcion.getMessage(), "Error en conexion a DB", JOptionPane.ERROR_MESSAGE);
        }
    }
}//GEN-LAST:event_jbBuscarEstudianteActionPerformed

// Acción del JRadioButton consultar todos los estudiantes
private void jrbConsultarTodosEstudianteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbConsultarTodosEstudianteActionPerformed
    if (jrbConsultarTodosEstudiante.isSelected() == true) {
        jtfCodigoEstudiante.setText("");
        jtfCodigoEstudiante.setEnabled(false);
        cargarListaEstudiantes();
    }
}//GEN-LAST:event_jrbConsultarTodosEstudianteActionPerformed

// Acción del JRadioButton consultar un estudiante
    private void jrbConsultarUnEstudianteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbConsultarUnEstudianteActionPerformed
        if (jrbConsultarUnEstudiante.isSelected() == true) {
            jtfCodigoEstudiante.setEnabled(true);
            jtfCodigoEstudiante.requestFocus();
        }
    }//GEN-LAST:event_jrbConsultarUnEstudianteActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbBuscarEstudiante;
    private javax.swing.ButtonGroup jbgBuscarEstudiante;
    private javax.swing.JRadioButton jrbConsultarTodosEstudiante;
    private javax.swing.JRadioButton jrbConsultarUnEstudiante;
    private javax.swing.JTable jtDetalleEstudiantes;
    private javax.swing.JTextField jtfCodigoEstudiante;
    // End of variables declaration//GEN-END:variables

    // Instancia a la conexión de la base de datos
    ClaseConexion objConexion = new ClaseConexion();
    Connection conexionDB = objConexion.conexion();
}
