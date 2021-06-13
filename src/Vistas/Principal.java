package Vistas;

import Servicios.ClaseConexion;

import java.sql.*;
import javax.swing.*;

public class Principal extends javax.swing.JFrame {

    public Principal() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jdpPrincipal = new javax.swing.JDesktopPane();
        jlImagenFCECEP = new javax.swing.JLabel();
        jlTituloBiblioteca = new javax.swing.JLabel();
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
        setTitle("Sistema Biblioteca FCECEP");

        jdpPrincipal.setMaximumSize(new java.awt.Dimension(1100, 900));
        jdpPrincipal.setPreferredSize(new java.awt.Dimension(1300, 640));
        jdpPrincipal.setRequestFocusEnabled(false);

        jlImagenFCECEP.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlImagenFCECEP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cecep.PNG"))); // NOI18N
        jlImagenFCECEP.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jlTituloBiblioteca.setFont(new java.awt.Font("DialogInput", 3, 48)); // NOI18N
        jlTituloBiblioteca.setForeground(new java.awt.Color(255, 255, 255));
        jlTituloBiblioteca.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlTituloBiblioteca.setText("BIBLIOTECA ");
        jlTituloBiblioteca.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jlTituloBiblioteca.setPreferredSize(new java.awt.Dimension(200, 48));

        jdpPrincipal.setLayer(jlImagenFCECEP, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jdpPrincipal.setLayer(jlTituloBiblioteca, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jdpPrincipalLayout = new javax.swing.GroupLayout(jdpPrincipal);
        jdpPrincipal.setLayout(jdpPrincipalLayout);
        jdpPrincipalLayout.setHorizontalGroup(
            jdpPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jdpPrincipalLayout.createSequentialGroup()
                .addContainerGap(347, Short.MAX_VALUE)
                .addGroup(jdpPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jdpPrincipalLayout.createSequentialGroup()
                        .addComponent(jlImagenFCECEP)
                        .addGap(365, 365, 365))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jdpPrincipalLayout.createSequentialGroup()
                        .addComponent(jlTituloBiblioteca, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(377, 377, 377))))
        );
        jdpPrincipalLayout.setVerticalGroup(
            jdpPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jdpPrincipalLayout.createSequentialGroup()
                .addGap(112, 112, 112)
                .addComponent(jlTituloBiblioteca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jlImagenFCECEP, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(291, Short.MAX_VALUE))
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

    private void jmiInformePrestamoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiInformePrestamoActionPerformed
        JTextArea areaDeTexto = new JTextArea(20, 70);
        JScrollPane panelInforme = new JScrollPane(areaDeTexto);
        try {
            String consultaSQL = "SELECT d.id_detalle, p.fecha, d.isbn, l.titulo_lib, l.editorial_lib, e.codigo_est, e.nombres_est FROM t_detalles_prestamos d \n"
                    + "INNER JOIN t_prestamos p on d.id_prestamo = p.id_prestamo\n"
                    + "INNER JOIN t_libros l on d.isbn = l.isbn\n"
                    + "INNER JOIN t_estudiantes e on p.codigo_est = e.codigo_est ORDER BY d.numero";
            Statement st = conexionDB.createStatement();
            ResultSet rs = st.executeQuery(consultaSQL);
            String listado = "";
            areaDeTexto.setText("No \t FECHA \t ISBN \t TITULO LIBRO \t\t EDITORIAL \t\t COD.ESTUDIANTE \t\t NOMBRE \n ");
            while (rs.next()) {
                listado = rs.getString("id_detalle") + "\t"
                        + rs.getString("fecha") + "\t"
                        + rs.getString("isbn") + "\t"
                        + rs.getString("titulo_lib") + "\t\t"
                        + rs.getString("editorial_lib") + "\t\t"
                        + rs.getString("codigo_est") + "\t\t"
                        + rs.getString("nombres_est") + "\n";
                areaDeTexto.append(listado);
            }
            JOptionPane.showMessageDialog(null, panelInforme, "Informe De Prestamos", JOptionPane.PLAIN_MESSAGE);
        } catch (SQLException excepcion) {
            JOptionPane.showMessageDialog(null, "Codigo de error: " + excepcion.getErrorCode() + "\n" + "Mensaje de error: " + excepcion.getMessage(), "Error en conexion a DB", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jmiInformePrestamoActionPerformed

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
    private javax.swing.JLabel jlImagenFCECEP;
    private javax.swing.JLabel jlTituloBiblioteca;
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

    ClaseConexion objConexion = new ClaseConexion();
    Connection conexionDB = objConexion.conexion();
}
