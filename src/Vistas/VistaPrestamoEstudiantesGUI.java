package Vistas;

import Servicios.ClaseConexion;

import java.awt.Color;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class VistaPrestamoEstudiantesGUI extends javax.swing.JInternalFrame {

    public VistaPrestamoEstudiantesGUI() {
        initComponents();
        mostrarListaEstudiantes("");
    }

    void mostrarListaEstudiantes(String dato) {
        String[] encabezadoTabla = {"CODIGO", "NOMBRES", "APELLIDOS", "TELEFONO"};
        String[] registros = new String[4];
        DefaultTableModel tablaDetallesEstudiantes = new DefaultTableModel(null, encabezadoTabla);
        String consultaSQL = "SELECT * FROM tb_estudiantes WHERE CONCAT(codigo_estu, nombre_estu, apellido_estu, telefono_estu) LIKE '%" + dato + "%'";
        try {
            Statement st = conexionDB.createStatement();
            ResultSet rs = st.executeQuery(consultaSQL);
            while (rs.next()) {
                registros[0] = rs.getString("codigo_estu");
                registros[1] = rs.getString("nombre_estu");
                registros[2] = rs.getString("apellido_estu");
                registros[3] = rs.getString("telefono_estu");
                tablaDetallesEstudiantes.addRow(registros);
            }
            jtDetallesEstudiantes.setModel(tablaDetallesEstudiantes);
        } catch (SQLException excepcion) {
            JOptionPane.showMessageDialog(null, "Codigo de error: " + excepcion.getErrorCode() + "\n" + "Mensaje de error: " + excepcion.getMessage(), "Error en conexion a DB", JOptionPane.ERROR_MESSAGE);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        jpmiEnviarPrestamo = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        jlBuscarEstudiante = new javax.swing.JLabel();
        jbMostrarTodosEstudiantes = new javax.swing.JButton();
        jtfCodigoEstudiante = new javax.swing.JTextField();
        jbRegistrarEstudiante = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtDetallesEstudiantes = new javax.swing.JTable();

        jpmiEnviarPrestamo.setText("Enviar a Prestamo");
        jpmiEnviarPrestamo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jpmiEnviarPrestamoActionPerformed(evt);
            }
        });
        jPopupMenu1.add(jpmiEnviarPrestamo);

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Listado De Estudiantes");

        jlBuscarEstudiante.setFont(new java.awt.Font("Eras Medium ITC", 1, 12)); // NOI18N
        jlBuscarEstudiante.setText("Buscar Estudiante:");

        jbMostrarTodosEstudiantes.setFont(new java.awt.Font("Eras Medium ITC", 1, 12)); // NOI18N
        jbMostrarTodosEstudiantes.setText("Mostrar Todos");
        jbMostrarTodosEstudiantes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbMostrarTodosEstudiantesActionPerformed(evt);
            }
        });

        jtfCodigoEstudiante.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtfCodigoEstudianteKeyReleased(evt);
            }
        });

        jbRegistrarEstudiante.setFont(new java.awt.Font("Eras Medium ITC", 1, 12)); // NOI18N
        jbRegistrarEstudiante.setText("Registrar Estudiante");
        jbRegistrarEstudiante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbRegistrarEstudianteActionPerformed(evt);
            }
        });

        jtDetallesEstudiantes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jtDetallesEstudiantes.setComponentPopupMenu(jPopupMenu1);
        jScrollPane1.setViewportView(jtDetallesEstudiantes);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 590, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jlBuscarEstudiante)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jtfCodigoEstudiante, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jbMostrarTodosEstudiantes)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jbRegistrarEstudiante)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlBuscarEstudiante)
                    .addComponent(jtfCodigoEstudiante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbMostrarTodosEstudiantes)
                    .addComponent(jbRegistrarEstudiante))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
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
private void jbMostrarTodosEstudiantesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbMostrarTodosEstudiantesActionPerformed
    mostrarListaEstudiantes("");
    jtfCodigoEstudiante.setText("");
}//GEN-LAST:event_jbMostrarTodosEstudiantesActionPerformed

private void jtfCodigoEstudianteKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfCodigoEstudianteKeyReleased
    mostrarListaEstudiantes(jtfCodigoEstudiante.getText());
}//GEN-LAST:event_jtfCodigoEstudianteKeyReleased

private void jpmiEnviarPrestamoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jpmiEnviarPrestamoActionPerformed
    String codigo = "", nombres = "", apellidos = "", telefono = "";
    int registroSeleccionado = jtDetallesEstudiantes.getSelectedRow();
    try {
        if (registroSeleccionado == -1) {
            JOptionPane.showMessageDialog(null, "No selecciono un registro", "Error en seleccion", JOptionPane.WARNING_MESSAGE);
        } else {
            codigo = (String) jtDetallesEstudiantes.getValueAt(registroSeleccionado, 0);
            nombres = (String) jtDetallesEstudiantes.getValueAt(registroSeleccionado, 1);
            apellidos = (String) jtDetallesEstudiantes.getValueAt(registroSeleccionado, 2);
            telefono = (String) jtDetallesEstudiantes.getValueAt(registroSeleccionado, 3);
            RegistroPrestamosGUI.jtfCodigoEstudiante.setDisabledTextColor(Color.blue);
            RegistroPrestamosGUI.jtfCodigoEstudiante.setText(codigo);
            RegistroPrestamosGUI.jtfNombresEstudiante.setDisabledTextColor(Color.blue);
            RegistroPrestamosGUI.jtfNombresEstudiante.setText(nombres);
            RegistroPrestamosGUI.jtfApellidosEstudiante.setDisabledTextColor(Color.blue);
            RegistroPrestamosGUI.jtfApellidosEstudiante.setText(apellidos);
            RegistroPrestamosGUI.jtfTelefonoEstudiante.setDisabledTextColor(Color.blue);
            RegistroPrestamosGUI.jtfTelefonoEstudiante.setText(telefono);
            this.dispose();
        }
    } catch (Exception excepcion) {
        JOptionPane.showMessageDialog(null, "Mensaje de error: " + excepcion.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    }
}//GEN-LAST:event_jpmiEnviarPrestamoActionPerformed
private void jbRegistrarEstudianteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbRegistrarEstudianteActionPerformed
    try {
        RegistroEstudiantesGUI registrarEstudiante = new RegistroEstudiantesGUI();
        int x = (Principal.jdpPrincipal.getWidth() / 2) - registrarEstudiante.getWidth() / 2;
        int y = (Principal.jdpPrincipal.getHeight() / 2) - registrarEstudiante.getHeight() / 2;
        if (registrarEstudiante.isShowing()) {
            registrarEstudiante.setLocation(x, y);
        } else {
            Principal.jdpPrincipal.add(registrarEstudiante);
            registrarEstudiante.setLocation(x, y);
            registrarEstudiante.setVisible(true);
        }
    } catch (Exception excepcion) {
        JOptionPane.showMessageDialog(null, "Mensaje de error: " + excepcion.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    }
}//GEN-LAST:event_jbRegistrarEstudianteActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbMostrarTodosEstudiantes;
    private javax.swing.JButton jbRegistrarEstudiante;
    private javax.swing.JLabel jlBuscarEstudiante;
    private javax.swing.JMenuItem jpmiEnviarPrestamo;
    private javax.swing.JTable jtDetallesEstudiantes;
    private javax.swing.JTextField jtfCodigoEstudiante;
    // End of variables declaration//GEN-END:variables

    ClaseConexion objConexion = new ClaseConexion();
    Connection conexionDB = objConexion.conexion();
}
