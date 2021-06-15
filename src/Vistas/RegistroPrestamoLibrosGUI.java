/*
 * Programa         : RegistroPrestamoLibrosGUI.java
 * Fecha            : 10/06/2021 10:03:45 a. m.
 * Objetivo         : Programa que permite listar todos los registros presentes en la tabla libros de la base de datos a traves de una GUI, 
                      y enviarlos a un prestamo.
 * Desarrollador    : Daniel Alberto Salazar Erazo
 */
package Vistas;

import Servicios.ClaseConexion;

import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class RegistroPrestamoLibrosGUI extends javax.swing.JInternalFrame {

    // Método constructor de la GUI con datos cargados
    public RegistroPrestamoLibrosGUI() {
        initComponents();
        cargarListaLibros("");
    }

    // Método que carga la lista de libros en la tabla
    void cargarListaLibros(String dato) {
        String[] encabezadoTabla = {"CODIGO", "TITULO", "EDITORIAL", "AÑO"};
        DefaultTableModel tablaDetallesLibros = new DefaultTableModel(null, encabezadoTabla);
        String[] registros = new String[4];
        String consultaSQL = "SELECT * FROM t_libros WHERE CONCAT(isbn, titulo_lib, editorial_lib, ano_publicacion) LIKE '%" + dato + "%'";
        try {
            Statement st = conexionDB.createStatement();
            ResultSet rs = st.executeQuery(consultaSQL);
            while (rs.next()) {
                registros[0] = rs.getString("isbn");
                registros[1] = rs.getString("titulo_lib");
                registros[2] = rs.getString("editorial_lib");
                registros[3] = rs.getString("ano_publicacion");
                tablaDetallesLibros.addRow(registros);
            }
            jtDetalleLibros.setModel(tablaDetallesLibros);
        } catch (SQLException excepcion) {
            JOptionPane.showMessageDialog(this, "Codigo de error: " + excepcion.getErrorCode() + "\n" + "Mensaje de error: " + excepcion.getMessage(), "Error en conexion a DB", JOptionPane.ERROR_MESSAGE);
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
        jbRegistrarLibro = new javax.swing.JButton();
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

        jbRegistrarLibro.setFont(new java.awt.Font("Eras Medium ITC", 1, 12)); // NOI18N
        jbRegistrarLibro.setText("Registrar Libro");
        jbRegistrarLibro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbRegistrarLibroActionPerformed(evt);
            }
        });

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
                .addGap(37, 37, 37)
                .addComponent(jbMostrarTodosLibros)
                .addGap(38, 38, 38)
                .addComponent(jbRegistrarLibro)
                .addContainerGap(77, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 582, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlBuscarLibro)
                    .addComponent(jbMostrarTodosLibros)
                    .addComponent(jtfTituloLibroConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbRegistrarLibro))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 141, Short.MAX_VALUE)
                .addGap(12, 12, 12))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Acción que consulta un libro en la tabla de libros, de acuerdo con el valor ingresado en la caja de texto título de libro
    private void jtfTituloLibroConsultarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfTituloLibroConsultarKeyReleased
        cargarListaLibros(jtfTituloLibroConsultar.getText());
    }//GEN-LAST:event_jtfTituloLibroConsultarKeyReleased

    // Acción del botón listar todos los registros de la tabla libros de la base de datos
    private void jbMostrarTodosLibrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbMostrarTodosLibrosActionPerformed
        cargarListaLibros("");
    }//GEN-LAST:event_jbMostrarTodosLibrosActionPerformed

    // Acción del botón registrar libro
    private void jbRegistrarLibroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbRegistrarLibroActionPerformed
        try {
            RegistroLibrosGUI registrarLibro = new RegistroLibrosGUI();
            int x = (Principal.jdpPrincipal.getWidth() / 2) - registrarLibro.getWidth() / 2;
            int y = (Principal.jdpPrincipal.getHeight() / 2) - registrarLibro.getHeight() / 2;
            if (registrarLibro.isShowing()) {
                registrarLibro.setLocation(x, y);
            } else {
                Principal.jdpPrincipal.add(registrarLibro);
                registrarLibro.setLocation(x, y);
                registrarLibro.setVisible(true);
            }
        } catch (Exception excepcion) {
            JOptionPane.showMessageDialog(this, "Mensaje de error: " + excepcion.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jbRegistrarLibroActionPerformed

    // Acción del JPopupMenuItem enviar datos del listado de libros al préstamo
    private void jpmiEnviarPrestamoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jpmiEnviarPrestamoActionPerformed
        try {
            DefaultTableModel tablaDetallePrestamo = (DefaultTableModel) RegistroPrestamosGUI.jtDetallePrestamo.getModel();
            String[] dato = new String[5];
            int registroSeleccionado = jtDetalleLibros.getSelectedRow();
            if (registroSeleccionado == -1) {
                JOptionPane.showMessageDialog(this, "No selecciono un registro", "Error en seleccion", JOptionPane.WARNING_MESSAGE);
            } else {
                String isbn = jtDetalleLibros.getValueAt(registroSeleccionado, 0).toString();
                String titulo = jtDetalleLibros.getValueAt(registroSeleccionado, 1).toString();
                String editorial = jtDetalleLibros.getValueAt(registroSeleccionado, 2).toString();
                String ano = jtDetalleLibros.getValueAt(registroSeleccionado, 3).toString();
                dato[0] = isbn;
                dato[1] = titulo;
                dato[2] = editorial;
                dato[3] = ano;
                tablaDetallePrestamo.addRow(dato);
                RegistroPrestamosGUI.jtDetallePrestamo.setModel(tablaDetallePrestamo);
            }
        } catch (Exception excepcion) {
            JOptionPane.showMessageDialog(this, "Mensaje de error: " + excepcion.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jpmiEnviarPrestamoActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton jbMostrarTodosLibros;
    private javax.swing.JButton jbRegistrarLibro;
    private javax.swing.JLabel jlBuscarLibro;
    private javax.swing.JMenuItem jpmiEnviarPrestamo;
    private javax.swing.JTable jtDetalleLibros;
    private javax.swing.JTextField jtfTituloLibroConsultar;
    // End of variables declaration//GEN-END:variables

    // Instancia a la conexión de la base de datos
    ClaseConexion objConexion = new ClaseConexion();
    Connection conexionDB = objConexion.conexion();
}
