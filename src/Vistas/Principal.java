/*
 * Programa         : Principal.java
 * Fecha            : 10/06/2021 10:03:45 a. m.
 * Objetivo         : Programa que genera una GUI del programa de gestion de prestamos de libros en una biblioteca.
 * Desarrollador    : Daniel Alberto Salazar Erazo
 */
package Vistas;

import Servicios.ClaseConexion;

import java.sql.*;
import javax.swing.*;

public class Principal extends javax.swing.JFrame {

    // Método constructor de la GUI
    public Principal() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jdpPrincipal = new javax.swing.JDesktopPane();
        jlTituloBiblioteca = new javax.swing.JLabel();
        jlTituloBiblioteca1 = new javax.swing.JLabel();
        jlTituloBiblioteca2 = new javax.swing.JLabel();
        jmbPrincipal = new javax.swing.JMenuBar();
        jmEstudiantes = new javax.swing.JMenu();
        jmiRegistrarEstudiante = new javax.swing.JMenuItem();
        jmiConsultarEstudiante = new javax.swing.JMenuItem();
        jmLibros = new javax.swing.JMenu();
        jmiRegistrarLibro = new javax.swing.JMenuItem();
        jmiConsultarLibro = new javax.swing.JMenuItem();
        jmPrestamos = new javax.swing.JMenu();
        jmiRegistarPrestamo = new javax.swing.JMenuItem();
        jmiConsultarPrestamo = new javax.swing.JMenuItem();
        jmConsultas = new javax.swing.JMenu();
        jmiInformePrestamo = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle(".: Sistema De Prestamos Biblioteca");
        setResizable(false);

        jdpPrincipal.setMaximumSize(new java.awt.Dimension(1100, 900));
        jdpPrincipal.setPreferredSize(new java.awt.Dimension(1300, 640));
        jdpPrincipal.setRequestFocusEnabled(false);

        jlTituloBiblioteca.setFont(new java.awt.Font("DialogInput", 3, 48)); // NOI18N
        jlTituloBiblioteca.setForeground(new java.awt.Color(255, 255, 255));
        jlTituloBiblioteca.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlTituloBiblioteca.setText("BIBLIOTECA ");
        jlTituloBiblioteca.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jlTituloBiblioteca.setPreferredSize(new java.awt.Dimension(200, 48));

        jlTituloBiblioteca1.setFont(new java.awt.Font("DialogInput", 3, 48)); // NOI18N
        jlTituloBiblioteca1.setForeground(new java.awt.Color(255, 255, 255));
        jlTituloBiblioteca1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlTituloBiblioteca1.setText("SISTEMA");
        jlTituloBiblioteca1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jlTituloBiblioteca1.setPreferredSize(new java.awt.Dimension(200, 48));

        jlTituloBiblioteca2.setFont(new java.awt.Font("DialogInput", 3, 48)); // NOI18N
        jlTituloBiblioteca2.setForeground(new java.awt.Color(255, 255, 255));
        jlTituloBiblioteca2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlTituloBiblioteca2.setText("DE PRESTAMOS");
        jlTituloBiblioteca2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jlTituloBiblioteca2.setPreferredSize(new java.awt.Dimension(200, 48));

        jdpPrincipal.setLayer(jlTituloBiblioteca, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jdpPrincipal.setLayer(jlTituloBiblioteca1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jdpPrincipal.setLayer(jlTituloBiblioteca2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jdpPrincipalLayout = new javax.swing.GroupLayout(jdpPrincipal);
        jdpPrincipal.setLayout(jdpPrincipalLayout);
        jdpPrincipalLayout.setHorizontalGroup(
            jdpPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jdpPrincipalLayout.createSequentialGroup()
                .addGap(391, 391, 391)
                .addComponent(jlTituloBiblioteca1, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jdpPrincipalLayout.createSequentialGroup()
                .addGap(0, 327, Short.MAX_VALUE)
                .addGroup(jdpPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jlTituloBiblioteca, javax.swing.GroupLayout.PREFERRED_SIZE, 363, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlTituloBiblioteca2, javax.swing.GroupLayout.PREFERRED_SIZE, 374, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(369, 369, 369))
        );
        jdpPrincipalLayout.setVerticalGroup(
            jdpPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jdpPrincipalLayout.createSequentialGroup()
                .addContainerGap(155, Short.MAX_VALUE)
                .addComponent(jlTituloBiblioteca1, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jlTituloBiblioteca2, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jlTituloBiblioteca, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(273, 273, 273))
        );

        jmbPrincipal.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, java.awt.Color.magenta, java.awt.Color.green));

        jmEstudiantes.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        jmEstudiantes.setForeground(new java.awt.Color(51, 0, 255));
        jmEstudiantes.setText("ESTUDIANTES");
        jmEstudiantes.setFont(new java.awt.Font("DialogInput", 1, 18)); // NOI18N

        jmiRegistrarEstudiante.setFont(new java.awt.Font("DialogInput", 1, 12)); // NOI18N
        jmiRegistrarEstudiante.setText("Registrar Estudiante");
        jmiRegistrarEstudiante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiRegistrarEstudianteActionPerformed(evt);
            }
        });
        jmEstudiantes.add(jmiRegistrarEstudiante);

        jmiConsultarEstudiante.setFont(new java.awt.Font("DialogInput", 1, 14)); // NOI18N
        jmiConsultarEstudiante.setText("Consultar Estudiante");
        jmiConsultarEstudiante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiConsultarEstudianteActionPerformed(evt);
            }
        });
        jmEstudiantes.add(jmiConsultarEstudiante);

        jmbPrincipal.add(jmEstudiantes);

        jmLibros.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        jmLibros.setForeground(new java.awt.Color(51, 0, 255));
        jmLibros.setText("LIBROS");
        jmLibros.setFont(new java.awt.Font("DialogInput", 1, 18)); // NOI18N

        jmiRegistrarLibro.setFont(new java.awt.Font("DialogInput", 1, 14)); // NOI18N
        jmiRegistrarLibro.setText("Registrar Libro");
        jmiRegistrarLibro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiRegistrarLibroActionPerformed(evt);
            }
        });
        jmLibros.add(jmiRegistrarLibro);

        jmiConsultarLibro.setFont(new java.awt.Font("DialogInput", 1, 14)); // NOI18N
        jmiConsultarLibro.setText("Consultar Libro");
        jmiConsultarLibro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiConsultarLibroActionPerformed(evt);
            }
        });
        jmLibros.add(jmiConsultarLibro);

        jmbPrincipal.add(jmLibros);

        jmPrestamos.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        jmPrestamos.setForeground(new java.awt.Color(51, 0, 255));
        jmPrestamos.setText("PRESTRAMOS");
        jmPrestamos.setFont(new java.awt.Font("DialogInput", 1, 18)); // NOI18N

        jmiRegistarPrestamo.setFont(new java.awt.Font("DialogInput", 1, 14)); // NOI18N
        jmiRegistarPrestamo.setText("Registrar Prestamo");
        jmiRegistarPrestamo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiRegistarPrestamoActionPerformed(evt);
            }
        });
        jmPrestamos.add(jmiRegistarPrestamo);

        jmiConsultarPrestamo.setFont(new java.awt.Font("DialogInput", 1, 14)); // NOI18N
        jmiConsultarPrestamo.setText("Consultar Prestamo");
        jmiConsultarPrestamo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiConsultarPrestamoActionPerformed(evt);
            }
        });
        jmPrestamos.add(jmiConsultarPrestamo);

        jmbPrincipal.add(jmPrestamos);

        jmConsultas.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        jmConsultas.setForeground(new java.awt.Color(51, 0, 255));
        jmConsultas.setText("CONSULTAS");
        jmConsultas.setFont(new java.awt.Font("DialogInput", 1, 18)); // NOI18N

        jmiInformePrestamo.setFont(new java.awt.Font("DialogInput", 1, 14)); // NOI18N
        jmiInformePrestamo.setText("Informe De Prestamo");
        jmiInformePrestamo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiInformePrestamoActionPerformed(evt);
            }
        });
        jmConsultas.add(jmiInformePrestamo);

        jmbPrincipal.add(jmConsultas);

        setJMenuBar(jmbPrincipal);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jdpPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, 1070, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jdpPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, 653, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Acción del JMenuItem registrar un estudiante
    private void jmiRegistrarEstudianteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiRegistrarEstudianteActionPerformed
        RegistroEstudiantesGUI crearEstudiante = new RegistroEstudiantesGUI();
        int x = (jdpPrincipal.getWidth() / 2) - crearEstudiante.getWidth() / 2;
        int y = (jdpPrincipal.getHeight() / 2) - crearEstudiante.getHeight() / 2;
        if (crearEstudiante.isShowing()) {
            crearEstudiante.setLocation(x, y);
        } else {
            jdpPrincipal.add(crearEstudiante);
            crearEstudiante.setLocation(x, y);
            crearEstudiante.setVisible(true);
        }
    }//GEN-LAST:event_jmiRegistrarEstudianteActionPerformed

    // Acción del JMenuItem consultar un estudiante
    private void jmiConsultarEstudianteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiConsultarEstudianteActionPerformed
        ConsultaEstudiantesGUI consultarEstudiante = new ConsultaEstudiantesGUI();
        int x = (jdpPrincipal.getWidth() / 2) - consultarEstudiante.getWidth() / 2;
        int y = (jdpPrincipal.getHeight() / 2) - consultarEstudiante.getHeight() / 2;
        if (consultarEstudiante.isShowing()) {
            consultarEstudiante.setLocation(x, y);
        } else {
            jdpPrincipal.add(consultarEstudiante);
            consultarEstudiante.setLocation(x, y);
            consultarEstudiante.setVisible(true);
        }
    }//GEN-LAST:event_jmiConsultarEstudianteActionPerformed

    // Acción del JMenuItem registrar un libro
    private void jmiRegistrarLibroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiRegistrarLibroActionPerformed
        RegistroLibrosGUI ingresarLibro = new RegistroLibrosGUI();
        int x = (jdpPrincipal.getWidth() / 2) - ingresarLibro.getWidth() / 2;
        int y = (jdpPrincipal.getHeight() / 2) - ingresarLibro.getHeight() / 2;
        if (ingresarLibro.isShowing()) {
            ingresarLibro.setLocation(x, y);
        } else {
            jdpPrincipal.add(ingresarLibro);
            ingresarLibro.setLocation(x, y);
            ingresarLibro.setVisible(true);
        }
    }//GEN-LAST:event_jmiRegistrarLibroActionPerformed

    // Acción del JMenuItem consultar un libro
    private void jmiConsultarLibroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiConsultarLibroActionPerformed
        ConsultaLibrosGUI verLibro = new ConsultaLibrosGUI();
        int x = (jdpPrincipal.getWidth() / 2) - verLibro.getWidth() / 2;
        int y = (jdpPrincipal.getHeight() / 2) - verLibro.getHeight() / 2;
        if (verLibro.isShowing()) {
            verLibro.setLocation(x, y);
        } else {
            jdpPrincipal.add(verLibro);
            verLibro.setLocation(x, y);
            verLibro.setVisible(true);
        }
    }//GEN-LAST:event_jmiConsultarLibroActionPerformed

    // Acción del JMenuItem registrar un préstamo
    private void jmiRegistarPrestamoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiRegistarPrestamoActionPerformed
        RegistroPrestamosGUI prestarLibro = new RegistroPrestamosGUI();
        int x = (jdpPrincipal.getWidth() / 2) - prestarLibro.getWidth() / 2;
        int y = (jdpPrincipal.getHeight() / 2) - prestarLibro.getHeight() / 2;
        if (prestarLibro.isShowing()) {
            prestarLibro.setLocation(x, y);
        } else {
            jdpPrincipal.add(prestarLibro);
            prestarLibro.setLocation(x, y);
            prestarLibro.setVisible(true);
        }
    }//GEN-LAST:event_jmiRegistarPrestamoActionPerformed

    // Acción del JMenuItem consultar un préstamo
    private void jmiConsultarPrestamoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiConsultarPrestamoActionPerformed
        ConsultaPrestamosGUI consultarPrestamo = new ConsultaPrestamosGUI();
        int x = (jdpPrincipal.getWidth() / 2) - consultarPrestamo.getWidth() / 2;
        int y = (jdpPrincipal.getHeight() / 2) - consultarPrestamo.getHeight() / 2;
        if (consultarPrestamo.isShowing()) {
            consultarPrestamo.setLocation(x, y);
        } else {
            jdpPrincipal.add(consultarPrestamo);
            consultarPrestamo.setLocation(x, y);
            consultarPrestamo.setVisible(true);
        }
    }//GEN-LAST:event_jmiConsultarPrestamoActionPerformed

    // Acción del JMenuItem consultar informe de prestamos
    private void jmiInformePrestamoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiInformePrestamoActionPerformed
        JTextArea areaDeTexto = new JTextArea(20, 70);
        JScrollPane panelInforme = new JScrollPane(areaDeTexto);
        try {
            String consultaSQL = "SELECT tdp.id_detalle AS idDetalle, te.codigo_est AS codigoEst, CONCAT(te.nombres_est, \" \", te.apellidos_est) AS nombreEst, tp.fecha, tdp.isbn, tl.titulo_lib AS tituloLib, tl.editorial_lib AS editorialLib  FROM t_detalles_prestamos tdp\n"
                    + "INNER JOIN t_prestamos tp ON tp.id_prestamo = tdp.id_prestamo \n"
                    + "INNER JOIN t_libros tl ON tl.isbn = tdp.isbn \n"
                    + "INNER JOIN t_estudiantes te ON te.codigo_est = tp.codigo_est ORDER BY tdp.id_detalle";
            Statement st = conexionDB.createStatement();
            ResultSet rs = st.executeQuery(consultaSQL);
            String listado = "";
            areaDeTexto.setText("No \t COD.ESTUDIANTE \t NOMBRE \t FECHA \t ISBN \t TITULO LIBRO \t EDITORIAL \n ");
            while (rs.next()) {
                listado = rs.getString("idDetalle") + "\t"
                        + rs.getString("codigoEst") + "\t"
                        + rs.getString("nombreEst") + "\t"
                        + rs.getString("fecha") + "\t"
                        + rs.getString("isbn") + "\t"
                        + rs.getString("tituloLib") + "\t"
                        + rs.getString("editorialLib") + "\n";
                areaDeTexto.append(listado);
            }
            JOptionPane.showMessageDialog(this, panelInforme, "Informe De Prestamos", JOptionPane.PLAIN_MESSAGE);
        } catch (SQLException excepcion) {
            JOptionPane.showMessageDialog(this, "Codigo de error: " + excepcion.getErrorCode() + "\n" + "Mensaje de error: " + excepcion.getMessage(), "Error en conexion a DB", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jmiInformePrestamoActionPerformed

    // Método principal que genera el GUI
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException excepcion) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, excepcion);
        } catch (InstantiationException excepcion) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, excepcion);
        } catch (IllegalAccessException excepcion) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, excepcion);
        } catch (javax.swing.UnsupportedLookAndFeelException excepcion) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, excepcion);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JDesktopPane jdpPrincipal;
    private javax.swing.JLabel jlTituloBiblioteca;
    private javax.swing.JLabel jlTituloBiblioteca1;
    private javax.swing.JLabel jlTituloBiblioteca2;
    private javax.swing.JMenu jmConsultas;
    private javax.swing.JMenu jmEstudiantes;
    private javax.swing.JMenu jmLibros;
    private javax.swing.JMenu jmPrestamos;
    private javax.swing.JMenuBar jmbPrincipal;
    private javax.swing.JMenuItem jmiConsultarEstudiante;
    private javax.swing.JMenuItem jmiConsultarLibro;
    private javax.swing.JMenuItem jmiConsultarPrestamo;
    private javax.swing.JMenuItem jmiInformePrestamo;
    private javax.swing.JMenuItem jmiRegistarPrestamo;
    private javax.swing.JMenuItem jmiRegistrarEstudiante;
    private javax.swing.JMenuItem jmiRegistrarLibro;
    // End of variables declaration//GEN-END:variables

    // Instancia a la conexión de la base de datos
    ClaseConexion objConexion = new ClaseConexion();
    Connection conexionDB = objConexion.conexion();
}
