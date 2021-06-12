package Vistas;

import Servicios.ClaseConexion;
import java.sql.*;
import java.util.logging.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import com.placeholder.PlaceHolder;

public class RegistroLibrosGUI extends javax.swing.JInternalFrame {

    public RegistroLibrosGUI() {
        initComponents();
        this.setLocation(150, 15);
        bloquear();
        cargar("");
        PlaceHolder placeHolder = new PlaceHolder(jtfAnoPublicacionLibro, "AAAA-MM-DD");
    }

    void bloquear() {
        jtfISBNLibro.setEnabled(false);
        jtfTituloLibro.setEnabled(false);
        jtfEditorialLibro.setEnabled(false);
        jtfAnoPublicacionLibro.setEnabled(false);
        jbGuardarLibro.setEnabled(false);
        jbNuevoLibro.setEnabled(true);
        jbCancelar.setEnabled(false);
    }

    void limpiar() {
        jtfISBNLibro.setText("");
        jtfTituloLibro.setText("");
        jtfEditorialLibro.setText("");
        jtfAnoPublicacionLibro.setText("");
    }

    void desbloquear() {
        jtfISBNLibro.setEnabled(true);
        jtfTituloLibro.setEnabled(true);
        jtfEditorialLibro.setEnabled(true);
        jtfAnoPublicacionLibro.setEnabled(true);
        jbNuevoLibro.setEnabled(false);
        jbGuardarLibro.setEnabled(true);
        jbCancelar.setEnabled(true);
    }

    void cargar(String dato) {
        String consultaSQL = "SELECT * FROM tb_libros WHERE CONCAT(ISBN, nombre_lib, editorial_lib, ano_publicacion) LIKE '%" + dato + "%'";
        String[] encabezadosTabla = {"CODIGO", "NOMBRES", "EDITORIAL", "AÑO"};
        String[] Registros = new String[4];
        DefaultTableModel tablaDetallesLibros = new DefaultTableModel(null, encabezadosTabla);
        try {
            Statement st = conexionDB.createStatement();
            ResultSet rs = st.executeQuery(consultaSQL);
            while (rs.next()) {
                Registros[0] = rs.getString("ISBN");
                Registros[1] = rs.getString("nombre_lib");
                Registros[2] = rs.getString("editorial_lib");
                Registros[3] = rs.getString("ano_publicacion");
                tablaDetallesLibros.addRow(Registros);
            }
            jtTablaDetallesLibros.setModel(tablaDetallesLibros);
        } catch (SQLException ex) {
            Logger.getLogger(RegistroLibrosGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
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
        jtTablaDetallesLibros = new javax.swing.JTable();
        jpControles = new javax.swing.JPanel();
        jbGuardarLibro = new javax.swing.JButton();
        jbCancelar = new javax.swing.JButton();
        jbSalir = new javax.swing.JButton();
        jbNuevoLibro = new javax.swing.JButton();

        jpmiActualizarLibro.setText("Modificar");
        jpmiActualizarLibro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jpmiActualizarLibroActionPerformed(evt);
            }
        });
        jPopupMenu1.add(jpmiActualizarLibro);

        jpmiEliminarLibro.setText("Eliminar");
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

        jtTablaDetallesLibros.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jtTablaDetallesLibros.setComponentPopupMenu(jPopupMenu1);
        jScrollPane2.setViewportView(jtTablaDetallesLibros);

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
                    .addComponent(jbCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

    private void jbNuevoLibroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbNuevoLibroActionPerformed
        desbloquear();
        limpiar();
        PlaceHolder placeHolder = new PlaceHolder(jtfAnoPublicacionLibro, "AAAA-MM-DD");
        jtfISBNLibro.requestFocus();
    }//GEN-LAST:event_jbNuevoLibroActionPerformed

    private void jbGuardarLibroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbGuardarLibroActionPerformed
        String isbn, titulo, editorial, ano;
        String consultaSQL = "";
        isbn = jtfISBNLibro.getText();
        titulo = jtfTituloLibro.getText();
        editorial = jtfEditorialLibro.getText();
        ano = jtfAnoPublicacionLibro.getText();
        consultaSQL = "INSERT INTO tb_libros (ISBN, nombre_lib, editorial_lib, ano_publicacion) VALUES (?,?,?,?)";
        try {
            PreparedStatement pst = conexionDB.prepareStatement(consultaSQL);
            pst.setString(1, isbn);
            pst.setString(2, titulo);
            pst.setString(3, editorial);
            pst.setString(4, ano);
            int n = pst.executeUpdate();
            if (n > 0) {
                JOptionPane.showMessageDialog(null, "Registro Guardado con Exito", "Registro exitoso", JOptionPane.INFORMATION_MESSAGE);
                bloquear();
            }
            cargar("");
            limpiar();
        } catch (SQLException ex) {
            Logger.getLogger(RegistroLibrosGUI.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Registre toda la informacion.", "Informacion incompleta", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_jbGuardarLibroActionPerformed

    private void jbCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCancelarActionPerformed
        bloquear();
        PlaceHolder placeHolder = new PlaceHolder(jtfAnoPublicacionLibro, "AAAA-MM-DD");
    }//GEN-LAST:event_jbCancelarActionPerformed

    private void jbSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_jbSalirActionPerformed

    private void jpmiActualizarLibroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jpmiActualizarLibroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jpmiActualizarLibroActionPerformed

    private void jpmiEliminarLibroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jpmiEliminarLibroActionPerformed
        int eliminarSeleccion = jtTablaDetallesLibros.getSelectedRow();
        try {
            if (eliminarSeleccion == -1) {
                JOptionPane.showMessageDialog(null, "Seleccione un registro.", "Seleccion invalida", JOptionPane.WARNING_MESSAGE);
            } else {
                String isbn = (String) jtTablaDetallesLibros.getValueAt(eliminarSeleccion, 0);
                String eliminarSQL = "DELETE FROM tb_libros WHERE ISBN = '" + isbn + "'";
                try {
                    PreparedStatement pst = conexionDB.prepareStatement(eliminarSQL);
                    pst.executeUpdate();
                    JOptionPane.showMessageDialog(null, "Registro borrado exitosamente.", "Eliminacion exitosa", JOptionPane.INFORMATION_MESSAGE);
                    cargar("");
                } catch (SQLException e) {
                    JOptionPane.showMessageDialog(null, "Error al elimianr registro: " + e, "Eliminacion fallo", JOptionPane.ERROR_MESSAGE);
                }
            }
        } catch (Exception e) {
        }
    }//GEN-LAST:event_jpmiEliminarLibroActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane2;
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
    private javax.swing.JTable jtTablaDetallesLibros;
    private javax.swing.JTextField jtfAnoPublicacionLibro;
    private javax.swing.JTextField jtfEditorialLibro;
    private javax.swing.JTextField jtfISBNLibro;
    private javax.swing.JTextField jtfTituloLibro;
    // End of variables declaration//GEN-END:variables
   ClaseConexion objConexion = new ClaseConexion();
    Connection conexionDB = objConexion.conexion();
}
