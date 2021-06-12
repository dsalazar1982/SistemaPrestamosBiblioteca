package Vistas;

import Servicios.ClaseConexion;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class VistaPrestamoLibrosGUI extends javax.swing.JInternalFrame {

    DefaultTableModel tabla;

    public VistaPrestamoLibrosGUI() {
        initComponents();
        cargarListaLibros("");
    }

    String comparar(String cod) {
        String cant = "";
        try {
            Statement st = conexionDB.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM tb_libros WHERE ISBN='" + cod + "'");
            while (rs.next()) {
                cant = rs.getString(4);
            }
        } catch (SQLException ex) {
            Logger.getLogger(VistaPrestamoLibrosGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
        return cant;
    }

    void cargarListaLibros(String dato) {
        String[] Titulo = {"CODIGO", "TITULO", "EDITORIAL", "AÑO"};
        tabla = new DefaultTableModel(null, Titulo);
        String[] Registro = new String[4];
        String[] titulos = {"CODIGO", "NOMBRES", "APELLIDOS", "TELEFONO"};
        String[] Registros = new String[4];
        String Sql = "SELECT * FROM tb_libros WHERE CONCAT(ISBN, nombre_lib, editorial_lib, ano_publicacion) LIKE '%" + dato + "%'";
        try {
            Statement st = conexionDB.createStatement();
            ResultSet rs = st.executeQuery(Sql);
            while (rs.next()) {
                Registros[0] = rs.getString("ISBN");
                Registros[1] = rs.getString("nombre_lib");
                Registros[2] = rs.getString("editorial_lib");
                Registros[3] = rs.getString("ano_publicacion");
                tabla.addRow(Registros);
            }
            jtDetalleLibros.setModel(tabla);
        } catch (SQLException ex) {
            Logger.getLogger(VistaPrestamoLibrosGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        jpmiEnviarPrestamo = new javax.swing.JMenuItem();
        jtfTituloLibroConsultar = new javax.swing.JTextField();
        jbMostrarTodosLibros = new javax.swing.JButton();
        jlBuscarLibro = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtDetalleLibros = new javax.swing.JTable();

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
        setTitle("Listado De Libros");

        jtfTituloLibroConsultar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtfTituloLibroConsultarKeyReleased(evt);
            }
        });

        jbMostrarTodosLibros.setFont(new java.awt.Font("Eras Medium ITC", 1, 12)); // NOI18N
        jbMostrarTodosLibros.setText("Mostrar todos");
        jbMostrarTodosLibros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbMostrarTodosLibrosActionPerformed(evt);
            }
        });

        jlBuscarLibro.setFont(new java.awt.Font("Eras Medium ITC", 1, 12)); // NOI18N
        jlBuscarLibro.setText("Buscar Libro:");

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
        jtDetalleLibros.setComponentPopupMenu(jPopupMenu1);
        jScrollPane2.setViewportView(jtDetalleLibros);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jlBuscarLibro)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtfTituloLibroConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addComponent(jbMostrarTodosLibros)
                .addGap(30, 30, 30))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlBuscarLibro)
                    .addComponent(jbMostrarTodosLibros)
                    .addComponent(jtfTituloLibroConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 141, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
private void jbMostrarTodosLibrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbMostrarTodosLibrosActionPerformed
    cargarListaLibros("");
}//GEN-LAST:event_jbMostrarTodosLibrosActionPerformed
private void jtfTituloLibroConsultarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfTituloLibroConsultarKeyReleased
    cargarListaLibros(jtfTituloLibroConsultar.getText());
}//GEN-LAST:event_jtfTituloLibroConsultarKeyReleased
private void jpmiEnviarPrestamoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jpmiEnviarPrestamoActionPerformed
    try {
        DefaultTableModel tabladet = (DefaultTableModel) RegistroPrestamosGUI.jtDetallePrestamo.getModel();
        String[] dato = new String[5];
        int fila = jtDetalleLibros.getSelectedRow();
        if (fila == -1) {
            JOptionPane.showMessageDialog(null, "No  ha seleccionado ningun registro");
        } else {
            String ISBN = jtDetalleLibros.getValueAt(fila, 0).toString();
            String nom = jtDetalleLibros.getValueAt(fila, 1).toString();
            String edit = jtDetalleLibros.getValueAt(fila, 2).toString();
            String ano = jtDetalleLibros.getValueAt(fila, 3).toString();
            dato[0] = ISBN;
            dato[1] = nom;
            dato[2] = edit;
            dato[3] = ano;
            tabladet.addRow(dato);
            RegistroPrestamosGUI.jtDetallePrestamo.setModel(tabladet);
        }
    } catch (Exception e) {
    }
}//GEN-LAST:event_jpmiEnviarPrestamoActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton jbMostrarTodosLibros;
    private javax.swing.JLabel jlBuscarLibro;
    private javax.swing.JMenuItem jpmiEnviarPrestamo;
    private javax.swing.JTable jtDetalleLibros;
    private javax.swing.JTextField jtfTituloLibroConsultar;
    // End of variables declaration//GEN-END:variables
ClaseConexion objConexion = new ClaseConexion();
    Connection conexionDB = objConexion.conexion();
}
