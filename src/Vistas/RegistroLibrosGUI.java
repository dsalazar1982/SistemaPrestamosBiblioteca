/*
 * Programa         : RegistroLibrosGUI.java
 * Fecha            : 10/06/2021 10:03:45 a. m.
 * Objetivo         : Programa que permite listar todos los registros presentes en la tabla libros de la base de datos a traves de una GUI, 
                      de igual forma, permite realizar registro de un libro.
 * Desarrollador    : Daniel Alberto Salazar Erazo
 */

package Vistas;

import Servicios.ClaseConexion;

import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import com.placeholder.PlaceHolder;

public class RegistroLibrosGUI extends javax.swing.JInternalFrame {

    // Método constructor de la GUI con datos cargados
    public RegistroLibrosGUI() {
        initComponents();
        this.setLocation(150, 15);
        bloquear();
        cargarListaLibros("");
        placeHolder();
    }

    // Método que des activa los controles, campos de textos y botones
    void bloquear() {
        jtfISBNLibro.setEnabled(false);
        jtfTituloLibro.setEnabled(false);
        jtfEditorialLibro.setEnabled(false);
        jtfAnoPublicacionLibro.setEnabled(false);
        jbGuardarLibro.setEnabled(false);
        jbNuevoLibro.setEnabled(true);
        jbCancelar.setEnabled(false);
        jbActualizarLibro.setEnabled(false);
    }

    // Método que limpia las cajas de texto
    void limpiar() {
        jtfISBNLibro.setText("");
        jtfTituloLibro.setText("");
        jtfEditorialLibro.setText("");
        jtfAnoPublicacionLibro.setText("");
    }

    // Método que activa los controles, campos de textos y botones
    void desbloquear() {
        jtfISBNLibro.setEnabled(true);
        jtfTituloLibro.setEnabled(true);
        jtfEditorialLibro.setEnabled(true);
        jtfAnoPublicacionLibro.setEnabled(true);
        jbNuevoLibro.setEnabled(false);
        jbGuardarLibro.setEnabled(true);
        jbCancelar.setEnabled(true);
    }

    // Método que carga la lista de libros en la tabla
    void cargarListaLibros(String dato) {
        String consultaSQL = "SELECT * FROM t_libros WHERE CONCAT(isbn, titulo_lib, editorial_lib, ano_publicacion) LIKE '%" + dato + "%'";
        String[] encabezadoTabla = {"ISBN", "TITULO", "EDITORIAL", "AÑO"};
        String[] registros = new String[4];
        DefaultTableModel tablaDetallesLibros = new DefaultTableModel(null, encabezadoTabla);
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

    // Método que agrega el place holder al campo de texto tipo de fecha
    void placeHolder() {
        PlaceHolder placeHolder = new PlaceHolder(jtfAnoPublicacionLibro, "AAAA-MM-DD");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        jpmiActualizarLibro = new javax.swing.JMenuItem();
        jpmiEliminarLibro = new javax.swing.JMenuItem();
        jpDatosLibro = new javax.swing.JPanel();
        jlISBNLibro = new javax.swing.JLabel();
        jtfISBNLibro = new javax.swing.JTextField();
        jlTituloLibro = new javax.swing.JLabel();
        jtfTituloLibro = new javax.swing.JTextField();
        jlEditorialLibro = new javax.swing.JLabel();
        jtfEditorialLibro = new javax.swing.JTextField();
        jtfAnoPublicacionLibro = new javax.swing.JTextField();
        jlAnoPublicacionLibro = new javax.swing.JLabel();
        jpDetalleLibros = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtDetalleLibros = new javax.swing.JTable();
        jpControles = new javax.swing.JPanel();
        jbGuardarLibro = new javax.swing.JButton();
        jbCancelar = new javax.swing.JButton();
        jbSalir = new javax.swing.JButton();
        jbNuevoLibro = new javax.swing.JButton();
        jbActualizarLibro = new javax.swing.JButton();

        jpmiActualizarLibro.setText("Modificar Registro");
        jpmiActualizarLibro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jpmiActualizarLibroActionPerformed(evt);
            }
        });
        jPopupMenu1.add(jpmiActualizarLibro);

        jpmiEliminarLibro.setText("Eliminar Registro");
        jpmiEliminarLibro.setActionCommand("Eliminar Registro");
        jpmiEliminarLibro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jpmiEliminarLibroActionPerformed(evt);
            }
        });
        jPopupMenu1.add(jpmiEliminarLibro);

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Registro De Libros");

        jpDatosLibro.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED), javax.swing.BorderFactory.createTitledBorder("Datos de Libro")));

        jlISBNLibro.setFont(new java.awt.Font("Eras Medium ITC", 1, 12)); // NOI18N
        jlISBNLibro.setText("ISBN:");

        jlTituloLibro.setFont(new java.awt.Font("Eras Medium ITC", 1, 12)); // NOI18N
        jlTituloLibro.setText("Titulo:");

        jlEditorialLibro.setFont(new java.awt.Font("Eras Medium ITC", 1, 12)); // NOI18N
        jlEditorialLibro.setText("Editorial:");

        jtfAnoPublicacionLibro.setEnabled(false);

        jlAnoPublicacionLibro.setFont(new java.awt.Font("Eras Medium ITC", 1, 12)); // NOI18N
        jlAnoPublicacionLibro.setText("Año:");

        javax.swing.GroupLayout jpDatosLibroLayout = new javax.swing.GroupLayout(jpDatosLibro);
        jpDatosLibro.setLayout(jpDatosLibroLayout);
        jpDatosLibroLayout.setHorizontalGroup(
            jpDatosLibroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpDatosLibroLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpDatosLibroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpDatosLibroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jpDatosLibroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jlAnoPublicacionLibro)
                            .addComponent(jlEditorialLibro))
                        .addComponent(jlISBNLibro, javax.swing.GroupLayout.Alignment.TRAILING))
                    .addComponent(jlTituloLibro, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGroup(jpDatosLibroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpDatosLibroLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(jpDatosLibroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtfEditorialLibro)
                            .addComponent(jtfTituloLibro)
                            .addComponent(jtfISBNLibro)))
                    .addGroup(jpDatosLibroLayout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(jtfAnoPublicacionLibro, javax.swing.GroupLayout.DEFAULT_SIZE, 172, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jpDatosLibroLayout.setVerticalGroup(
            jpDatosLibroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpDatosLibroLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpDatosLibroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlISBNLibro)
                    .addComponent(jtfISBNLibro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpDatosLibroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfTituloLibro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlTituloLibro))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpDatosLibroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlEditorialLibro)
                    .addComponent(jtfEditorialLibro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jpDatosLibroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlAnoPublicacionLibro)
                    .addComponent(jtfAnoPublicacionLibro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jpDetalleLibros.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED), javax.swing.BorderFactory.createTitledBorder("Detalles De Los Libros")));

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

        javax.swing.GroupLayout jpDetalleLibrosLayout = new javax.swing.GroupLayout(jpDetalleLibros);
        jpDetalleLibros.setLayout(jpDetalleLibrosLayout);
        jpDetalleLibrosLayout.setHorizontalGroup(
            jpDetalleLibrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 470, Short.MAX_VALUE)
        );
        jpDetalleLibrosLayout.setVerticalGroup(
            jpDetalleLibrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );

        jpControles.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED), javax.swing.BorderFactory.createTitledBorder("Controles")));

        jbGuardarLibro.setFont(new java.awt.Font("Eras Medium ITC", 0, 11)); // NOI18N
        jbGuardarLibro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Floppy 2_opt.png"))); // NOI18N
        jbGuardarLibro.setText("Guardar");
        jbGuardarLibro.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        jbGuardarLibro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbGuardarLibroActionPerformed(evt);
            }
        });

        jbCancelar.setFont(new java.awt.Font("Eras Medium ITC", 0, 11)); // NOI18N
        jbCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/CANCEL_opt.png"))); // NOI18N
        jbCancelar.setText("Cancelar");
        jbCancelar.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        jbCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCancelarActionPerformed(evt);
            }
        });

        jbSalir.setFont(new java.awt.Font("Eras Medium ITC", 0, 11)); // NOI18N
        jbSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Power Shutdown 1_opt.png"))); // NOI18N
        jbSalir.setText("Salir");
        jbSalir.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        jbSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalirActionPerformed(evt);
            }
        });

        jbNuevoLibro.setFont(new java.awt.Font("Eras Medium ITC", 0, 11)); // NOI18N
        jbNuevoLibro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Desktop 2_opt.png"))); // NOI18N
        jbNuevoLibro.setText("Nuevo");
        jbNuevoLibro.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        jbNuevoLibro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbNuevoLibroActionPerformed(evt);
            }
        });

        jbActualizarLibro.setFont(new java.awt.Font("Eras Medium ITC", 0, 11)); // NOI18N
        jbActualizarLibro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/CANCEL_opt.png"))); // NOI18N
        jbActualizarLibro.setText("Actualizar");
        jbActualizarLibro.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        jbActualizarLibro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbActualizarLibroActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpControlesLayout = new javax.swing.GroupLayout(jpControles);
        jpControles.setLayout(jpControlesLayout);
        jpControlesLayout.setHorizontalGroup(
            jpControlesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpControlesLayout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(jbNuevoLibro, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jbGuardarLibro, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(jbCancelar)
                .addGap(18, 18, 18)
                .addComponent(jbActualizarLibro)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jbSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jpControlesLayout.setVerticalGroup(
            jpControlesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpControlesLayout.createSequentialGroup()
                .addGroup(jpControlesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbGuardarLibro)
                    .addComponent(jbNuevoLibro)
                    .addComponent(jbCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbActualizarLibro))
                .addGap(0, 11, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jpControles, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jpDatosLibro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jpDetalleLibros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jpDatosLibro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jpDetalleLibros, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpControles, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Acción del botón nuevo libro
    private void jbNuevoLibroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbNuevoLibroActionPerformed
        desbloquear();
        limpiar();
        placeHolder();
        jtfISBNLibro.setEditable(true);
        jtfISBNLibro.requestFocus();
    }//GEN-LAST:event_jbNuevoLibroActionPerformed

    // Acción del botón guardar libro
    private void jbGuardarLibroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbGuardarLibroActionPerformed
        String isbn, titulo, editorial, anoPublicacion;
        String consultaSQL = "";
        isbn = jtfISBNLibro.getText();
        titulo = jtfTituloLibro.getText();
        editorial = jtfEditorialLibro.getText();
        anoPublicacion = jtfAnoPublicacionLibro.getText();
        consultaSQL = "INSERT INTO t_libros (isbn, titulo_lib, editorial_lib, ano_publicacion) VALUES (?,?,?,?)";
        try {
            if (isbn.isEmpty() || titulo.isEmpty() || editorial.isEmpty() || anoPublicacion.equalsIgnoreCase("AAAA-MM-DD")) {
                JOptionPane.showMessageDialog(this, "Diligencie todos los campos.", "Informacion incompleta", JOptionPane.WARNING_MESSAGE);
            } else {
                PreparedStatement pst = conexionDB.prepareStatement(consultaSQL);
                pst.setString(1, isbn);
                pst.setString(2, titulo);
                pst.setString(3, editorial);
                pst.setString(4, anoPublicacion);
                int n = pst.executeUpdate();
                if (n > 0) {
                    JOptionPane.showMessageDialog(this, "Registro guardado con exito", "Registro exitoso", JOptionPane.INFORMATION_MESSAGE);
                    bloquear();
                }
                cargarListaLibros("");
                limpiar();
            }
            placeHolder();
        } catch (SQLException excepcion) {
            if (excepcion.getSQLState().equalsIgnoreCase("23000")) {
                JOptionPane.showMessageDialog(this, "El codigo ISBN " + isbn + " ya existe en el sistema.", "Informacion invalida", JOptionPane.ERROR_MESSAGE);
                jtfISBNLibro.requestFocus();
            } else {
                JOptionPane.showMessageDialog(this, "Codigo de error: " + excepcion.getErrorCode() + "\n" + "Mensaje de error: " + excepcion.getMessage(), "Error en conexion a DB", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_jbGuardarLibroActionPerformed

    // Acción del botón cancelar
    private void jbCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCancelarActionPerformed
        limpiar();
        bloquear();
        placeHolder();
    }//GEN-LAST:event_jbCancelarActionPerformed

    // Acción del botón salir
    private void jbSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_jbSalirActionPerformed

    // Acción del JPopupMenuItem actualizar datos del libro
    private void jpmiActualizarLibroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jpmiActualizarLibroActionPerformed
        desbloquear();
        jbCancelar.setEnabled(true);
        jbActualizarLibro.setEnabled(true);
        jbGuardarLibro.setEnabled(false);
        jtfISBNLibro.setEditable(false);
        jtfISBNLibro.setEnabled(false);
        jtfAnoPublicacionLibro.setEditable(true);
        int modificarRegistro = jtDetalleLibros.getSelectedRow();
        if (modificarRegistro >= 0) {
            jtfISBNLibro.setText(jtDetalleLibros.getValueAt(modificarRegistro, 0).toString());
            jtfTituloLibro.setText(jtDetalleLibros.getValueAt(modificarRegistro, 1).toString());
            jtfEditorialLibro.setText(jtDetalleLibros.getValueAt(modificarRegistro, 2).toString());
            jtfAnoPublicacionLibro.setText(jtDetalleLibros.getValueAt(modificarRegistro, 3).toString());
        } else {
            JOptionPane.showMessageDialog(this, "No ha seleccionado un registro", "Error en seleccion", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_jpmiActualizarLibroActionPerformed

    // Acción del JPopupMenuItem eliminar datos del libro
    private void jpmiEliminarLibroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jpmiEliminarLibroActionPerformed
        int registroSeleccionado = jtDetalleLibros.getSelectedRow();
        String isbn = jtDetalleLibros.getValueAt(registroSeleccionado, 0).toString();
        try {
            if (registroSeleccionado == -1) {
                JOptionPane.showMessageDialog(this, "Seleccione un registro.", "Seleccion invalida", JOptionPane.WARNING_MESSAGE);
            } else {
                int respuesta = JOptionPane.showConfirmDialog(this, "Realmente desea eliminar el libro con ISBN: " + isbn,
                        "Eliminar registro?", JOptionPane.YES_NO_OPTION,
                        JOptionPane.QUESTION_MESSAGE);
                if (respuesta == 0) {
                    String consultaSQL = "DELETE FROM t_libros WHERE isbn = '" + isbn + "'";
                    try {
                        PreparedStatement pst = conexionDB.prepareStatement(consultaSQL);
                        pst.executeUpdate();
                        JOptionPane.showMessageDialog(this, "Registro borrado exitosamente.", "Eliminacion exitosa", JOptionPane.INFORMATION_MESSAGE);
                    } catch (SQLException excepcion) {
                        JOptionPane.showMessageDialog(this, "Error al elimianr registro: " + excepcion, "Eliminacion fallo", JOptionPane.ERROR_MESSAGE);
                    }
                    cargarListaLibros("");
                }
            }
        } catch (Exception excepcion) {
            JOptionPane.showMessageDialog(this, "Mensaje de error: " + excepcion.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jpmiEliminarLibroActionPerformed

    // Acción del botón actualizar libro
    private void jbActualizarLibroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbActualizarLibroActionPerformed
        String isbn, titulo, editorial, anoPublicacion;
        String consultaSQL = "";
        isbn = jtfISBNLibro.getText();
        titulo = jtfTituloLibro.getText();
        editorial = jtfEditorialLibro.getText();
        anoPublicacion = jtfAnoPublicacionLibro.getText();
        consultaSQL = "UPDATE t_libros SET titulo_lib = ?, editorial_lib = ?, ano_publicacion = ? WHERE isbn = ?";
        try {
            PreparedStatement pst = conexionDB.prepareStatement(consultaSQL);
            pst.setString(1, titulo);
            pst.setString(2, editorial);
            pst.setString(3, anoPublicacion);
            pst.setString(4, isbn);
            int n = pst.executeUpdate();
            if (n > 0) {
                JOptionPane.showMessageDialog(this, "Registro actualizado con exito", "Actualizacion exitoso", JOptionPane.INFORMATION_MESSAGE);
                bloquear();
            }
            cargarListaLibros("");
            limpiar();
            bloquear();
            placeHolder();
        } catch (SQLException excepcion) {
            JOptionPane.showMessageDialog(this, "Codigo de error: " + excepcion.getErrorCode() + "\n" + "Mensaje de error: " + excepcion.getMessage(), "Error en conexion a DB", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jbActualizarLibroActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton jbActualizarLibro;
    private javax.swing.JButton jbCancelar;
    private javax.swing.JButton jbGuardarLibro;
    private javax.swing.JButton jbNuevoLibro;
    private javax.swing.JButton jbSalir;
    private javax.swing.JLabel jlAnoPublicacionLibro;
    private javax.swing.JLabel jlEditorialLibro;
    private javax.swing.JLabel jlISBNLibro;
    private javax.swing.JLabel jlTituloLibro;
    private javax.swing.JPanel jpControles;
    private javax.swing.JPanel jpDatosLibro;
    private javax.swing.JPanel jpDetalleLibros;
    private javax.swing.JMenuItem jpmiActualizarLibro;
    private javax.swing.JMenuItem jpmiEliminarLibro;
    private javax.swing.JTable jtDetalleLibros;
    private javax.swing.JTextField jtfAnoPublicacionLibro;
    private javax.swing.JTextField jtfEditorialLibro;
    private javax.swing.JTextField jtfISBNLibro;
    private javax.swing.JTextField jtfTituloLibro;
    // End of variables declaration//GEN-END:variables

    // Instancia a la conexión de la base de datos
    ClaseConexion objConexion = new ClaseConexion();
    Connection conexionDB = objConexion.conexion();
}
