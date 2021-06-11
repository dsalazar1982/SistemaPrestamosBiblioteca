package Vistas;

import Servicios.ClaseConexion;
import java.sql.*;
import java.util.concurrent.locks.StampedLock;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

public class ConsultaLibrosGUI extends javax.swing.JInternalFrame {

    public ConsultaLibrosGUI() {
        initComponents();
        jtfTituloLibroConsultar.setEnabled(false);
        cargarListaLibros();
    }

    void cargarListaLibros() {
        DefaultTableModel tablaDetallesLibros = new DefaultTableModel();
        String[] encabezadoTabla = {"CODIGO", "TITULO", "EDITORIAL", "AÑO"};
        tablaDetallesLibros.setColumnIdentifiers(encabezadoTabla);
        jtDetalleLibros.setModel(tablaDetallesLibros);
        String consulta = "SELECT * FROM tb_libros";
        String[] Datos = new String[4];
        try {
            Statement st = conexionDB.createStatement();
            ResultSet rs = st.executeQuery(consulta);
            while (rs.next()) {
                Datos[0] = rs.getString("ISBN");
                Datos[1] = rs.getString("nombre_lib");
                Datos[2] = rs.getString("editorial_lib");
                Datos[3] = rs.getString("ano_publicacion");
                tablaDetallesLibros.addRow(Datos);
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
        jrbConsultarUnLibro = new javax.swing.JRadioButton();
        jrbConsultarTodosLibros = new javax.swing.JRadioButton();
        jtfTituloLibroConsultar = new javax.swing.JTextField();
        jbBuscarLibro = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtDetalleLibros = new javax.swing.JTable();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Consulta De Libros");

        jPanel1.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED)));

        buttonGroup1.add(jrbConsultarUnLibro);
        jrbConsultarUnLibro.setFont(new java.awt.Font("Eras Medium ITC", 1, 12)); // NOI18N
        jrbConsultarUnLibro.setSelected(true);
        jrbConsultarUnLibro.setText("Mostrar Libro Por Titulo:");
        jrbConsultarUnLibro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbConsultarUnLibroActionPerformed(evt);
            }
        });

        buttonGroup1.add(jrbConsultarTodosLibros);
        jrbConsultarTodosLibros.setFont(new java.awt.Font("Eras Medium ITC", 1, 12)); // NOI18N
        jrbConsultarTodosLibros.setText("Mostrar Todos Los Libros");
        jrbConsultarTodosLibros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbConsultarTodosLibrosActionPerformed(evt);
            }
        });

        jtfTituloLibroConsultar.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED)));

        jbBuscarLibro.setFont(new java.awt.Font("Eras Medium ITC", 0, 11)); // NOI18N
        jbBuscarLibro.setText("Buscar");
        jbBuscarLibro.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        jbBuscarLibro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBuscarLibroActionPerformed(evt);
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
                        .addComponent(jrbConsultarTodosLibros)
                        .addContainerGap(386, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jrbConsultarUnLibro)
                        .addGap(18, 18, 18)
                        .addComponent(jtfTituloLibroConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jbBuscarLibro, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jtfTituloLibroConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jbBuscarLibro, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jrbConsultarUnLibro))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jrbConsultarTodosLibros)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jtDetalleLibros.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jtDetalleLibros.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jtDetalleLibros);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(19, 19, 19))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbBuscarLibroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBuscarLibroActionPerformed
        if(jrbConsultarUnLibro.isSelected() == true){
            String titulo = jtfTituloLibroConsultar.getText();
            DefaultTableModel modelo = new DefaultTableModel();
            String[] encabezadoTabla = {"CODIGO", "TITULO", "EDITORIAL", "AÑO"};
            modelo.setColumnIdentifiers(encabezadoTabla);
            this.jtDetalleLibros.setModel(modelo);
            try {
                String consultaSQL = "SELECT * FROM tb_libros WHERE nombre_lib LIKE '%" + titulo + "%'";
                String[] registros = new String[4];
                Statement st = conexionDB.createStatement();
                ResultSet rs = st.executeQuery(consultaSQL);
                while (rs.next()) {                    
                    registros[0] = rs.getString("ISBN");
                    registros[1] = rs.getString("nombre_lib");
                    registros[2] = rs.getString("editorial_lib");
                    registros[3] = rs.getString("ano_publicacion");
                    modelo.addRow(registros);
                }
                jtDetalleLibros.setModel(modelo);
            } catch (SQLException e) {
                Logger.getLogger(ConsultaEstudiantesGUI.class.getName()).log(Level.SEVERE, null, e);
            }
        }
    }//GEN-LAST:event_jbBuscarLibroActionPerformed

    private void jrbConsultarTodosLibrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbConsultarTodosLibrosActionPerformed
        if(jrbConsultarTodosLibros.isSelected() == true){
            cargarListaLibros();
            jtfTituloLibroConsultar.setText("");
            jtfTituloLibroConsultar.setEnabled(false);
        }
    }//GEN-LAST:event_jrbConsultarTodosLibrosActionPerformed

    private void jrbConsultarUnLibroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbConsultarUnLibroActionPerformed
        if(jrbConsultarUnLibro.isSelected() == true){
            jtfTituloLibroConsultar.setEnabled(true);
            jtfTituloLibroConsultar.requestFocus();
        }
    }//GEN-LAST:event_jrbConsultarUnLibroActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbBuscarLibro;
    private javax.swing.JRadioButton jrbConsultarTodosLibros;
    private javax.swing.JRadioButton jrbConsultarUnLibro;
    private javax.swing.JTable jtDetalleLibros;
    private javax.swing.JTextField jtfTituloLibroConsultar;
    // End of variables declaration//GEN-END:variables
ClaseConexion objConexion = new ClaseConexion();
    Connection conexionDB = objConexion.conexion();
}
