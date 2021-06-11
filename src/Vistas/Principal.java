package Vistas;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class Principal extends javax.swing.JFrame {

    public Principal() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem7 = new javax.swing.JMenuItem();
        jdpPrincipal = new javax.swing.JDesktopPane();
        jlImagenFCECEP = new javax.swing.JLabel();
        jlTituloBiblioteca = new javax.swing.JLabel();
        jmbPrincipal = new javax.swing.JMenuBar();
        jmPrestamos = new javax.swing.JMenu();
        jmiPrestarLibro = new javax.swing.JMenuItem();
        jmiSalir = new javax.swing.JMenuItem();
        jmLibros = new javax.swing.JMenu();
        jmiIngresarLibro = new javax.swing.JMenuItem();
        jmiVerLibro = new javax.swing.JMenuItem();
        jmEstudiantes = new javax.swing.JMenu();
        jmiCrearEstudiante = new javax.swing.JMenuItem();
        jmiConsultarEstudiante = new javax.swing.JMenuItem();
        jmConsultas = new javax.swing.JMenu();
        jmiInforme = new javax.swing.JMenuItem();
        jmiConsultarPrestamo = new javax.swing.JMenuItem();

        jMenuItem7.setText("jMenuItem7");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema Biblioteca FCECEP");

        jdpPrincipal.setMaximumSize(new java.awt.Dimension(1100, 900));
        jdpPrincipal.setPreferredSize(new java.awt.Dimension(1300, 640));
        jdpPrincipal.setRequestFocusEnabled(false);

        jlImagenFCECEP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cecep.PNG"))); // NOI18N

        jlTituloBiblioteca.setFont(new java.awt.Font("DialogInput", 3, 48)); // NOI18N
        jlTituloBiblioteca.setForeground(new java.awt.Color(255, 255, 255));
        jlTituloBiblioteca.setText("BIBLIOTECA ");
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
                        .addComponent(jlTituloBiblioteca, javax.swing.GroupLayout.PREFERRED_SIZE, 417, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(280, 280, 280))))
        );
        jdpPrincipalLayout.setVerticalGroup(
            jdpPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jdpPrincipalLayout.createSequentialGroup()
                .addGap(112, 112, 112)
                .addComponent(jlTituloBiblioteca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jlImagenFCECEP, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(287, Short.MAX_VALUE))
        );

        jmbPrincipal.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, java.awt.Color.magenta, java.awt.Color.green));

        jmPrestamos.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        jmPrestamos.setForeground(new java.awt.Color(51, 0, 255));
        jmPrestamos.setText("PRESTRAMOS");
        jmPrestamos.setFont(new java.awt.Font("DialogInput", 1, 18)); // NOI18N

        jmiPrestarLibro.setFont(new java.awt.Font("DialogInput", 1, 14)); // NOI18N
        jmiPrestarLibro.setText("Registrar Prestamo");
        jmiPrestarLibro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiPrestarLibroActionPerformed(evt);
            }
        });
        jmPrestamos.add(jmiPrestarLibro);

        jmiSalir.setFont(new java.awt.Font("DialogInput", 1, 14)); // NOI18N
        jmiSalir.setText("Salir");
        jmiSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiSalirActionPerformed(evt);
            }
        });
        jmPrestamos.add(jmiSalir);

        jmbPrincipal.add(jmPrestamos);

        jmLibros.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        jmLibros.setForeground(new java.awt.Color(51, 0, 255));
        jmLibros.setText("LIBROS");
        jmLibros.setFont(new java.awt.Font("DialogInput", 1, 18)); // NOI18N

        jmiIngresarLibro.setFont(new java.awt.Font("DialogInput", 1, 14)); // NOI18N
        jmiIngresarLibro.setText("Registrar Libro");
        jmiIngresarLibro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiIngresarLibroActionPerformed(evt);
            }
        });
        jmLibros.add(jmiIngresarLibro);

        jmiVerLibro.setFont(new java.awt.Font("DialogInput", 1, 14)); // NOI18N
        jmiVerLibro.setText("Consultar Libro");
        jmiVerLibro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiVerLibroActionPerformed(evt);
            }
        });
        jmLibros.add(jmiVerLibro);

        jmbPrincipal.add(jmLibros);

        jmEstudiantes.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        jmEstudiantes.setForeground(new java.awt.Color(51, 0, 255));
        jmEstudiantes.setText("ESTUDIANTES");
        jmEstudiantes.setFont(new java.awt.Font("DialogInput", 1, 18)); // NOI18N

        jmiCrearEstudiante.setFont(new java.awt.Font("DialogInput", 1, 12)); // NOI18N
        jmiCrearEstudiante.setText("Registrar Estudiante");
        jmiCrearEstudiante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiCrearEstudianteActionPerformed(evt);
            }
        });
        jmEstudiantes.add(jmiCrearEstudiante);

        jmiConsultarEstudiante.setFont(new java.awt.Font("DialogInput", 1, 14)); // NOI18N
        jmiConsultarEstudiante.setText("Consultar Estudiante");
        jmiConsultarEstudiante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiConsultarEstudianteActionPerformed(evt);
            }
        });
        jmEstudiantes.add(jmiConsultarEstudiante);

        jmbPrincipal.add(jmEstudiantes);

        jmConsultas.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        jmConsultas.setForeground(new java.awt.Color(51, 0, 255));
        jmConsultas.setText("CONSULTAS");
        jmConsultas.setFont(new java.awt.Font("DialogInput", 1, 18)); // NOI18N

        jmiInforme.setFont(new java.awt.Font("DialogInput", 1, 14)); // NOI18N
        jmiInforme.setText("Informe De Prestamo");
        jmiInforme.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        jmiInforme.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiInformeActionPerformed(evt);
            }
        });
        jmConsultas.add(jmiInforme);

        jmiConsultarPrestamo.setFont(new java.awt.Font("DialogInput", 1, 14)); // NOI18N
        jmiConsultarPrestamo.setText("Consultar Prestamo");
        jmiConsultarPrestamo.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        jmiConsultarPrestamo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiConsultarPrestamoActionPerformed(evt);
            }
        });
        jmConsultas.add(jmiConsultarPrestamo);

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
            .addComponent(jdpPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, 649, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jmiPrestarLibroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiPrestarLibroActionPerformed
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
    }//GEN-LAST:event_jmiPrestarLibroActionPerformed

    private void jmiSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiSalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_jmiSalirActionPerformed

    private void jmiIngresarLibroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiIngresarLibroActionPerformed

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
    }//GEN-LAST:event_jmiIngresarLibroActionPerformed

    private void jmiVerLibroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiVerLibroActionPerformed

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
    }//GEN-LAST:event_jmiVerLibroActionPerformed

    private void jmiCrearEstudianteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiCrearEstudianteActionPerformed

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
    }//GEN-LAST:event_jmiCrearEstudianteActionPerformed

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

    private void jmiInformeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiInformeActionPerformed

        String dbUrl = "jdbc:mysql://10.0.0.51/db_bibliotecaFCECEP";
        String user = "dba_user";
        String pass = "dba_user@MariaDB2020*";
        Statement stmt = null;
        Connection con = null;
        JTextArea pantalla = new JTextArea(20, 70);
        JScrollPane desliza = new JScrollPane(pantalla);
        try {
            con = DriverManager.getConnection(dbUrl, user, pass);
            stmt = con.createStatement();
            String sql = "SELECT d.numero, p.fecha, d.ISBN, l.nombre_lib, l.editorial_lib, e.codigo_estu, e.nombre_estu FROM tb_detalles d \n"
                    + "INNER JOIN tb_prestamos p on d.numero=p.numero\n"
                    + "INNER JOIN tb_libros l on d.ISBN=l.ISBN\n"
                    + "INNER JOIN tb_estudiantes e on p.codigo_estu=e.codigo_estu";

            ResultSet resultado = stmt.executeQuery(sql);
            String listado = "";
            pantalla.setText("No.PRESTAMO \t FECHA \t ISBN \t NOMBRE LIBRO \t EDITORIAL \t COD.ESTUDIANTE \t NOMBRE \n ");
            while (resultado.next()) {
                listado = resultado.getString("numero") + "\t"
                        + resultado.getString("fecha") + "\t"
                        + resultado.getString("ISBN") + "\t"
                        + resultado.getString("nombre_lib") + "\t"
                        + resultado.getString("editorial_lib") + "\t"
                        + resultado.getString("Codigo_estu") + "\t"
                        + resultado.getString("nombre_estu") + "\n";
                pantalla.append(listado);
            }
            JOptionPane.showMessageDialog(null, desliza);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Código :" + ex.getErrorCode()
                    + "\n " + ex.getMessage());
        } finally {
            try {
                if (stmt != null) {
                    stmt.close();
                }
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Código :" + ex.getErrorCode()
                        + "\n " + ex.getMessage());
            }// nothing we can do
            try {
                if (con != null) {
                    con.close();
                }
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Código :" + ex.getErrorCode()
                        + "\n " + ex.getMessage());
            }//fin finally try
        }// Fin de try
    }//GEN-LAST:event_jmiInformeActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem jMenuItem7;
    public static javax.swing.JDesktopPane jdpPrincipal;
    private javax.swing.JLabel jlImagenFCECEP;
    private javax.swing.JLabel jlTituloBiblioteca;
    private javax.swing.JMenu jmConsultas;
    private javax.swing.JMenu jmEstudiantes;
    private javax.swing.JMenu jmLibros;
    private javax.swing.JMenu jmPrestamos;
    private javax.swing.JMenuBar jmbPrincipal;
    private javax.swing.JMenuItem jmiConsultarEstudiante;
    private javax.swing.JMenuItem jmiConsultarPrestamo;
    private javax.swing.JMenuItem jmiCrearEstudiante;
    private javax.swing.JMenuItem jmiInforme;
    private javax.swing.JMenuItem jmiIngresarLibro;
    private javax.swing.JMenuItem jmiPrestarLibro;
    private javax.swing.JMenuItem jmiSalir;
    private javax.swing.JMenuItem jmiVerLibro;
    // End of variables declaration//GEN-END:variables
}
