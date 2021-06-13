package Vistas;

import Servicios.ClaseConexion;

import java.awt.Color;
import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class RegistroPrestamosGUI extends javax.swing.JInternalFrame {

    public RegistroPrestamosGUI() {
        initComponents();
        this.setLocation(25, 15);
        jtfIdPrestamo.setEnabled(false);
        jtfFecha.setEnabled(false);
        jtfFecha.setDisabledTextColor(Color.blue);
        jtfFecha.setText(fechaHoy());
        numeros();
    }

    void numeros() {
        int j;
        int contador = 1;
        String numero = "";
        String c = "";
        String consultaSQL = "SELECT MAX(id_prestamo) FROM t_prestamos";
        try {
            Statement st = conexionDB.createStatement();
            ResultSet rs = st.executeQuery(consultaSQL);
            if (rs.next()) {
                c = rs.getString(1);
            }
            if (c == null) {
                jtfIdPrestamo.setText("1");
            } else {
                j = Integer.parseInt(c);
                GenerarNumero gen = new GenerarNumero();
                gen.generar(j);
                jtfIdPrestamo.setText(gen.serie());
            }
        } catch (SQLException excepcion) {
            JOptionPane.showMessageDialog(null, "Codigo de error: " + excepcion.getErrorCode() + "\n" + "Mensaje de error: " + excepcion.getMessage(), "Error en conexion a DB", JOptionPane.ERROR_MESSAGE);
        }
    }

    void prestamo() {
        String consultaSQL = "INSERT INTO t_prestamos (id_prestamo, fecha, codigo_est) VALUES (?,?,?)";
        String idPrestamo = jtfIdPrestamo.getText();
        String fecha = jtfFecha.getText();
        String codigoEstudiante = jtfCodigoEstudiante.getText();
        try {
            PreparedStatement pst = conexionDB.prepareStatement(consultaSQL);
            pst.setString(1, idPrestamo);
            pst.setString(2, fecha);
            pst.setString(3, codigoEstudiante);
            int n = pst.executeUpdate();
            if (n > 0) {
                JOptionPane.showMessageDialog(null, "Registro guardado con exito", "Registro exitoso", JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (SQLException excepcion) {
            JOptionPane.showMessageDialog(null, "Codigo de error: " + excepcion.getErrorCode() + "\n" + "Mensaje de error: " + excepcion.getMessage(), "Error en conexion a DB", JOptionPane.ERROR_MESSAGE);
        }
    }

    void detallePrestamo() {
        for (int i = 0; i < jtDetallePrestamo.getRowCount(); i++) {
            String consultaSQL = "INSERT INTO t_detalles_prestamos (id_prestamo, isbn) VALUES (?,?)";
            String idPrestamo = jtfIdPrestamo.getText();
            String isbn = jtDetallePrestamo.getValueAt(i, 0).toString();
            try {
                PreparedStatement pst = conexionDB.prepareStatement(consultaSQL);
                pst.setString(1, idPrestamo);
                pst.setString(2, isbn);
                pst.executeUpdate();
            } catch (SQLException excepcion) {
                JOptionPane.showMessageDialog(null, "Codigo de error: " + excepcion.getErrorCode() + "\n" + "Mensaje de error: " + excepcion.getMessage(), "Error en conexion a DB", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpDatosEstudiante = new javax.swing.JPanel();
        jlNombresEstudiante = new javax.swing.JLabel();
        jtfNombresEstudiante = new javax.swing.JTextField();
        jbSeleccionarEstudiante = new javax.swing.JButton();
        jtfCodigoEstudiante = new javax.swing.JTextField();
        jlCodigoEstudiante = new javax.swing.JLabel();
        jtfTelefonoEstudiante = new javax.swing.JTextField();
        jlTelefonoEstudiante = new javax.swing.JLabel();
        jlApellidosEstudiante = new javax.swing.JLabel();
        jtfApellidosEstudiante = new javax.swing.JTextField();
        jpTablaDetallesPrestamo = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtDetallePrestamo = new javax.swing.JTable();
        jpDatosLibro = new javax.swing.JPanel();
        jlConsecutivoPrestamo = new javax.swing.JLabel();
        jtfIdPrestamo = new javax.swing.JTextField();
        jlFechaPrestamo = new javax.swing.JLabel();
        jtfFecha = new javax.swing.JTextField();
        jbSeleccionarLibro = new javax.swing.JButton();
        jpControles = new javax.swing.JPanel();
        jbPrestarLibro = new javax.swing.JButton();
        jbRetirarLibro = new javax.swing.JButton();
        jbSalir = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Prestamo De Libros");
        setPreferredSize(new java.awt.Dimension(0, 0));

        jpDatosEstudiante.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED), javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(41, 43, 45)), "Datos Del Estudiante", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Eras Medium ITC", 1, 14)))); // NOI18N

        jlNombresEstudiante.setFont(new java.awt.Font("Eras Medium ITC", 1, 12)); // NOI18N
        jlNombresEstudiante.setText("NOMBRE:");

        jtfNombresEstudiante.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jtfNombresEstudiante.setForeground(new java.awt.Color(0, 51, 204));
        jtfNombresEstudiante.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jtfNombresEstudiante.setEnabled(false);

        jbSeleccionarEstudiante.setFont(new java.awt.Font("Eras Medium ITC", 1, 12)); // NOI18N
        jbSeleccionarEstudiante.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Search 1_opt (1).png"))); // NOI18N
        jbSeleccionarEstudiante.setText("Seleccionar Estudiante");
        jbSeleccionarEstudiante.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        jbSeleccionarEstudiante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSeleccionarEstudianteActionPerformed(evt);
            }
        });

        jtfCodigoEstudiante.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jtfCodigoEstudiante.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jtfCodigoEstudiante.setEnabled(false);

        jlCodigoEstudiante.setFont(new java.awt.Font("Eras Medium ITC", 1, 12)); // NOI18N
        jlCodigoEstudiante.setText("CODIGO:");

        jtfTelefonoEstudiante.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jtfTelefonoEstudiante.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jtfTelefonoEstudiante.setEnabled(false);

        jlTelefonoEstudiante.setFont(new java.awt.Font("Eras Medium ITC", 1, 12)); // NOI18N
        jlTelefonoEstudiante.setText("TELEFONO:");

        jlApellidosEstudiante.setFont(new java.awt.Font("Eras Medium ITC", 1, 12)); // NOI18N
        jlApellidosEstudiante.setText("APELLIDOS:");

        jtfApellidosEstudiante.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jtfApellidosEstudiante.setForeground(new java.awt.Color(0, 51, 204));
        jtfApellidosEstudiante.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jtfApellidosEstudiante.setEnabled(false);

        javax.swing.GroupLayout jpDatosEstudianteLayout = new javax.swing.GroupLayout(jpDatosEstudiante);
        jpDatosEstudiante.setLayout(jpDatosEstudianteLayout);
        jpDatosEstudianteLayout.setHorizontalGroup(
            jpDatosEstudianteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpDatosEstudianteLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpDatosEstudianteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpDatosEstudianteLayout.createSequentialGroup()
                        .addGroup(jpDatosEstudianteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlNombresEstudiante)
                            .addGroup(jpDatosEstudianteLayout.createSequentialGroup()
                                .addComponent(jlTelefonoEstudiante)
                                .addGap(18, 18, 18)
                                .addComponent(jtfTelefonoEstudiante, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jpDatosEstudianteLayout.createSequentialGroup()
                                .addComponent(jlApellidosEstudiante)
                                .addGap(18, 18, 18)
                                .addComponent(jtfApellidosEstudiante, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                        .addComponent(jbSeleccionarEstudiante, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpDatosEstudianteLayout.createSequentialGroup()
                        .addComponent(jlCodigoEstudiante)
                        .addGap(30, 30, 30)
                        .addGroup(jpDatosEstudianteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jtfNombresEstudiante, javax.swing.GroupLayout.DEFAULT_SIZE, 189, Short.MAX_VALUE)
                            .addComponent(jtfCodigoEstudiante))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jpDatosEstudianteLayout.setVerticalGroup(
            jpDatosEstudianteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpDatosEstudianteLayout.createSequentialGroup()
                .addGroup(jpDatosEstudianteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpDatosEstudianteLayout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addComponent(jbSeleccionarEstudiante, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(12, 12, 12))
                    .addGroup(jpDatosEstudianteLayout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addGroup(jpDatosEstudianteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlCodigoEstudiante, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jtfCodigoEstudiante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jpDatosEstudianteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlNombresEstudiante)
                            .addComponent(jtfNombresEstudiante))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jpDatosEstudianteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlApellidosEstudiante, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtfApellidosEstudiante))
                        .addGap(7, 7, 7)))
                .addGroup(jpDatosEstudianteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlTelefonoEstudiante, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfTelefonoEstudiante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43))
        );

        jpTablaDetallesPrestamo.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED)));

        jtDetallePrestamo.setFont(new java.awt.Font("DialogInput", 1, 12)); // NOI18N
        jtDetallePrestamo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CODIGO", "TITULO", "EDITORIAL", "AÑO"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, true, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jtDetallePrestamo);

        javax.swing.GroupLayout jpTablaDetallesPrestamoLayout = new javax.swing.GroupLayout(jpTablaDetallesPrestamo);
        jpTablaDetallesPrestamo.setLayout(jpTablaDetallesPrestamoLayout);
        jpTablaDetallesPrestamoLayout.setHorizontalGroup(
            jpTablaDetallesPrestamoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 788, Short.MAX_VALUE)
        );
        jpTablaDetallesPrestamoLayout.setVerticalGroup(
            jpTablaDetallesPrestamoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpTablaDetallesPrestamoLayout.createSequentialGroup()
                .addGap(0, 12, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jpDatosLibro.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED)));

        jlConsecutivoPrestamo.setFont(new java.awt.Font("Eras Medium ITC", 0, 14)); // NOI18N
        jlConsecutivoPrestamo.setText("No. De Prestamo");

        jtfIdPrestamo.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED)));

        jlFechaPrestamo.setFont(new java.awt.Font("Eras Medium ITC", 0, 14)); // NOI18N
        jlFechaPrestamo.setText("Fecha de Prestamo");

        jtfFecha.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED)));

        jbSeleccionarLibro.setFont(new java.awt.Font("Eras Medium ITC", 1, 12)); // NOI18N
        jbSeleccionarLibro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Search 1_opt (1).png"))); // NOI18N
        jbSeleccionarLibro.setText("Seleccionar Libro");
        jbSeleccionarLibro.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        jbSeleccionarLibro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSeleccionarLibroActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpDatosLibroLayout = new javax.swing.GroupLayout(jpDatosLibro);
        jpDatosLibro.setLayout(jpDatosLibroLayout);
        jpDatosLibroLayout.setHorizontalGroup(
            jpDatosLibroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpDatosLibroLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpDatosLibroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpDatosLibroLayout.createSequentialGroup()
                        .addComponent(jtfIdPrestamo)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpDatosLibroLayout.createSequentialGroup()
                        .addGap(0, 25, Short.MAX_VALUE)
                        .addGroup(jpDatosLibroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpDatosLibroLayout.createSequentialGroup()
                                .addComponent(jlConsecutivoPrestamo)
                                .addGap(77, 77, 77))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpDatosLibroLayout.createSequentialGroup()
                                .addComponent(jlFechaPrestamo)
                                .addGap(76, 76, 76))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpDatosLibroLayout.createSequentialGroup()
                                .addComponent(jtfFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(31, 31, 31))))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpDatosLibroLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jbSeleccionarLibro, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45))
        );
        jpDatosLibroLayout.setVerticalGroup(
            jpDatosLibroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpDatosLibroLayout.createSequentialGroup()
                .addContainerGap(9, Short.MAX_VALUE)
                .addComponent(jlConsecutivoPrestamo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtfIdPrestamo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jlFechaPrestamo, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtfFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jbSeleccionarLibro, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );

        jpControles.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED)));

        jbPrestarLibro.setFont(new java.awt.Font("Eras Medium ITC", 1, 12)); // NOI18N
        jbPrestarLibro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Save_opt.png"))); // NOI18N
        jbPrestarLibro.setText("Prestar Libros");
        jbPrestarLibro.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        jbPrestarLibro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbPrestarLibroActionPerformed(evt);
            }
        });

        jbRetirarLibro.setFont(new java.awt.Font("Eras Medium ITC", 1, 12)); // NOI18N
        jbRetirarLibro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/dustbin-full_opt.png"))); // NOI18N
        jbRetirarLibro.setText("Retirar Libro");
        jbRetirarLibro.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        jbRetirarLibro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbRetirarLibroActionPerformed(evt);
            }
        });

        jbSalir.setFont(new java.awt.Font("Eras Medium ITC", 1, 12)); // NOI18N
        jbSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Power Shutdown 1_opt.png"))); // NOI18N
        jbSalir.setText("Salir");
        jbSalir.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        jbSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpControlesLayout = new javax.swing.GroupLayout(jpControles);
        jpControles.setLayout(jpControlesLayout);
        jpControlesLayout.setHorizontalGroup(
            jpControlesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpControlesLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jbPrestarLibro, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(jbRetirarLibro, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 336, Short.MAX_VALUE)
                .addComponent(jbSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jpControlesLayout.setVerticalGroup(
            jpControlesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpControlesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jbRetirarLibro)
                .addComponent(jbPrestarLibro)
                .addComponent(jbSalir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jpControles, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jpTablaDetallesPrestamo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jpDatosEstudiante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jpDatosLibro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 33, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jpDatosEstudiante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jpDatosLibro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpTablaDetallesPrestamo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpControles, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(60, Short.MAX_VALUE))
        );

        setBounds(0, 0, 839, 538);
    }// </editor-fold>//GEN-END:initComponents

    public static String fechaHoy() {
        Date fecha = new Date();
        SimpleDateFormat formatoFecha = new SimpleDateFormat("yyyy-MM-dd");
        return formatoFecha.format(fecha);
    }

private void jbSeleccionarEstudianteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSeleccionarEstudianteActionPerformed
    RegistroPrestamoEstudiantesGUI agregarEstudiante = new RegistroPrestamoEstudiantesGUI();
    int x = (Principal.jdpPrincipal.getWidth() / 2) - agregarEstudiante.getWidth() / 2;
    int y = (Principal.jdpPrincipal.getHeight() / 2) - agregarEstudiante.getHeight() / 2;
    if (agregarEstudiante.isShowing()) {
        agregarEstudiante.setLocation(x, y);
    } else {
        Principal.jdpPrincipal.add(agregarEstudiante);
        agregarEstudiante.setLocation(x, y);
        agregarEstudiante.setVisible(true);
    }
}//GEN-LAST:event_jbSeleccionarEstudianteActionPerformed

private void jbSeleccionarLibroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSeleccionarLibroActionPerformed
    try {
        RegistroPrestamoLibrosGUI agregarLibro = new RegistroPrestamoLibrosGUI();
        int x = (Principal.jdpPrincipal.getWidth() / 2) - agregarLibro.getWidth() / 2;
        int y = (Principal.jdpPrincipal.getHeight() / 2) - agregarLibro.getHeight() / 2;
        if (agregarLibro.isShowing()) {
            agregarLibro.setLocation(x, y);
        } else {
            Principal.jdpPrincipal.add(agregarLibro);
            agregarLibro.setLocation(x, y);
            agregarLibro.setVisible(true);
        }
    } catch (Exception excepcion) {
        JOptionPane.showMessageDialog(null, "Mensaje de error: " + excepcion.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    }
}//GEN-LAST:event_jbSeleccionarLibroActionPerformed

private void jbSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalirActionPerformed
    this.dispose();
}//GEN-LAST:event_jbSalirActionPerformed

private void jbPrestarLibroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbPrestarLibroActionPerformed
    if (jtfCodigoEstudiante.getText().equals("")) {
        JOptionPane.showMessageDialog(this, "No selecciono un estudiante.", "Dato invalido", JOptionPane.WARNING_MESSAGE);
    } 
    else if (jtDetallePrestamo.getRowCount() == 0){
        JOptionPane.showMessageDialog(this, "No selecciono libros.", "Dato invalido", JOptionPane.WARNING_MESSAGE);
    }
    else {
        String capturarCodigo = "", capturarCantidad = "";
        for (int i = 0; i < RegistroPrestamosGUI.jtDetallePrestamo.getRowCount(); i++) {
            capturarCodigo = RegistroPrestamosGUI.jtDetallePrestamo.getValueAt(i, 0).toString();
            capturarCantidad = RegistroPrestamosGUI.jtDetallePrestamo.getValueAt(i, 1).toString();
        }
        prestamo();
        detallePrestamo();
        jtfCodigoEstudiante.setText("");
        jtfNombresEstudiante.setText("");
        jtfApellidosEstudiante.setText("");
        jtfTelefonoEstudiante.setText("");
        DefaultTableModel tablaDetallePrestamo = (DefaultTableModel) jtDetallePrestamo.getModel();
        int a = jtDetallePrestamo.getRowCount() - 1;
        int i;
        for (i = a; i >= 0; i--) {
            tablaDetallePrestamo.removeRow(i);
        }
        numeros();
    }
}//GEN-LAST:event_jbPrestarLibroActionPerformed

private void jbRetirarLibroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbRetirarLibroActionPerformed
    DefaultTableModel tablaDetallePrestamo = (DefaultTableModel) jtDetallePrestamo.getModel();
    int registroSeleccionado = jtDetallePrestamo.getSelectedRow();
    if (registroSeleccionado >= 0) {
        tablaDetallePrestamo.removeRow(registroSeleccionado);
    } else {
        JOptionPane.showMessageDialog(null, "No selecciono un registro", "Error en seleccion", JOptionPane.WARNING_MESSAGE);
    }
}//GEN-LAST:event_jbRetirarLibroActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton jbPrestarLibro;
    private javax.swing.JButton jbRetirarLibro;
    private javax.swing.JButton jbSalir;
    private javax.swing.JButton jbSeleccionarEstudiante;
    private javax.swing.JButton jbSeleccionarLibro;
    private javax.swing.JLabel jlApellidosEstudiante;
    private javax.swing.JLabel jlCodigoEstudiante;
    private javax.swing.JLabel jlConsecutivoPrestamo;
    private javax.swing.JLabel jlFechaPrestamo;
    private javax.swing.JLabel jlNombresEstudiante;
    private javax.swing.JLabel jlTelefonoEstudiante;
    private javax.swing.JPanel jpControles;
    private javax.swing.JPanel jpDatosEstudiante;
    private javax.swing.JPanel jpDatosLibro;
    private javax.swing.JPanel jpTablaDetallesPrestamo;
    public static javax.swing.JTable jtDetallePrestamo;
    public static javax.swing.JTextField jtfApellidosEstudiante;
    public static javax.swing.JTextField jtfCodigoEstudiante;
    private javax.swing.JTextField jtfFecha;
    private javax.swing.JTextField jtfIdPrestamo;
    public static javax.swing.JTextField jtfNombresEstudiante;
    public static javax.swing.JTextField jtfTelefonoEstudiante;
    // End of variables declaration//GEN-END:variables

    ClaseConexion objConexion = new ClaseConexion();
    Connection conexionDB = objConexion.conexion();
}
