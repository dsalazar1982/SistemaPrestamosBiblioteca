package Vistas;

import Servicios.ClaseConexion;
import java.awt.event.KeyEvent;
import java.sql.*;
import java.util.logging.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class RegistroEstudiantesGUI extends javax.swing.JInternalFrame {

    public RegistroEstudiantesGUI() {
        initComponents();
        bloquear();
        cargar("");
    }

    void bloquear() {
        jtfCodigoEstudiante.setEnabled(false);
        jtfNombresEstudiante.setEnabled(false);
        jtfApellidosEstudiante.setEnabled(false);
        jtfTelefonoEstudiante.setEnabled(false);
        jbGuardarEstudiante.setEnabled(false);
        jbNuevoEstudiante.setEnabled(true);
        jbCancelar.setEnabled(false);
        jbActualizarEstudiante.setEnabled(false);
        jbGuardarEstudiante.setEnabled(false);
        jbSalir.setEnabled(true);
    }

    void limpiar() {
        jtfCodigoEstudiante.setText("");
        jtfNombresEstudiante.setText("");
        jtfTelefonoEstudiante.setText("");
        jtfApellidosEstudiante.setText("");
    }

    void desbloquear() {
        jtfCodigoEstudiante.setEnabled(true);
        jtfNombresEstudiante.setEnabled(true);
        jtfApellidosEstudiante.setEnabled(true);
        jtfTelefonoEstudiante.setEnabled(true);
        jbGuardarEstudiante.setEnabled(true);
        jbNuevoEstudiante.setEnabled(false);
        jbActualizarEstudiante.setEnabled(true);
    }

    void cargar(String dato) {
        String consultaSQL = "SELECT * FROM tb_estudiantes WHERE CONCAT(codigo_estu, nombre_estu, apellido_estu, telefono_estu) LIKE '%" + dato + "%'";
        String[] encabezadosTabla = {"CODIGO", "NOMBRES", "APELLIDOS", "TELEFONO"};
        String[] Registros = new String[4];
        DefaultTableModel tablaDetallesEstudiante = new DefaultTableModel(null, encabezadosTabla);
        try {
            Statement st = conexionDB.createStatement();
            ResultSet rs = st.executeQuery(consultaSQL);
            while (rs.next()) {
                Registros[0] = rs.getString("codigo_estu");
                Registros[1] = rs.getString("nombre_estu");
                Registros[2] = rs.getString("apellido_estu");
                Registros[3] = rs.getString("telefono_estu");
                tablaDetallesEstudiante.addRow(Registros);
            }
            jtDetalleEstudiantes.setModel(tablaDetallesEstudiante);
        } catch (SQLException ex) {
            Logger.getLogger(RegistroEstudiantesGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        jpmiActualizarEstudiante = new javax.swing.JMenuItem();
        jpmiEliminarEstudiante = new javax.swing.JMenuItem();
        jpDetalleEstudiantes = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtDetalleEstudiantes = new javax.swing.JTable();
        jpDatosEstudiante = new javax.swing.JPanel();
        jlCodigoEstudiante = new javax.swing.JLabel();
        jtfCodigoEstudiante = new javax.swing.JTextField();
        jlNombresEstudiante = new javax.swing.JLabel();
        jtfNombresEstudiante = new javax.swing.JTextField();
        jlApellidosEstudiante = new javax.swing.JLabel();
        jtfApellidosEstudiante = new javax.swing.JTextField();
        jtfTelefonoEstudiante = new javax.swing.JTextField();
        jlTelefonoEstudiante = new javax.swing.JLabel();
        jlAsteriscoNombresEstudiante = new javax.swing.JLabel();
        jlAsteriscoApellidosEstudiante = new javax.swing.JLabel();
        jlAsteriscoCodigoEstudiante = new javax.swing.JLabel();
        jlAsteriscoTelefonoEstudiante = new javax.swing.JLabel();
        jpControles = new javax.swing.JPanel();
        jbActualizarEstudiante = new javax.swing.JButton();
        jbNuevoEstudiante = new javax.swing.JButton();
        jbGuardarEstudiante = new javax.swing.JButton();
        jbSalir = new javax.swing.JButton();
        jbCancelar = new javax.swing.JButton();

        jpmiActualizarEstudiante.setText("Modificar Estudiante");
        jpmiActualizarEstudiante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jpmiActualizarEstudianteActionPerformed(evt);
            }
        });
        jPopupMenu1.add(jpmiActualizarEstudiante);

        jpmiEliminarEstudiante.setText("Eliminar Estudiante");
        jpmiEliminarEstudiante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jpmiEliminarEstudianteActionPerformed(evt);
            }
        });
        jPopupMenu1.add(jpmiEliminarEstudiante);

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Registro De Estudiantes");
        setAutoscrolls(true);

        jpDetalleEstudiantes.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED), javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(41, 43, 45)), "Detalles De Los Estudiantes", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("DialogInput", 1, 14)))); // NOI18N

        jtDetalleEstudiantes.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jtDetalleEstudiantes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jtDetalleEstudiantes.setComponentPopupMenu(jPopupMenu1);
        jScrollPane2.setViewportView(jtDetalleEstudiantes);

        javax.swing.GroupLayout jpDetalleEstudiantesLayout = new javax.swing.GroupLayout(jpDetalleEstudiantes);
        jpDetalleEstudiantes.setLayout(jpDetalleEstudiantesLayout);
        jpDetalleEstudiantesLayout.setHorizontalGroup(
            jpDetalleEstudiantesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 423, Short.MAX_VALUE)
        );
        jpDetalleEstudiantesLayout.setVerticalGroup(
            jpDetalleEstudiantesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );

        jpDatosEstudiante.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED), javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(41, 43, 45)), "Datos Del Estudiante", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("DialogInput", 1, 14)))); // NOI18N

        jlCodigoEstudiante.setFont(new java.awt.Font("Eras Medium ITC", 1, 12)); // NOI18N
        jlCodigoEstudiante.setText("Codigo:");

        jtfCodigoEstudiante.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtfCodigoEstudianteKeyTyped(evt);
            }
        });

        jlNombresEstudiante.setFont(new java.awt.Font("Eras Medium ITC", 1, 12)); // NOI18N
        jlNombresEstudiante.setText("Nombres:");

        jtfNombresEstudiante.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtfNombresEstudianteKeyTyped(evt);
            }
        });

        jlApellidosEstudiante.setFont(new java.awt.Font("Eras Medium ITC", 1, 12)); // NOI18N
        jlApellidosEstudiante.setText("Apellidos:");

        jtfApellidosEstudiante.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtfApellidosEstudianteKeyTyped(evt);
            }
        });

        jtfTelefonoEstudiante.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtfTelefonoEstudianteKeyTyped(evt);
            }
        });

        jlTelefonoEstudiante.setFont(new java.awt.Font("Eras Medium ITC", 1, 12)); // NOI18N
        jlTelefonoEstudiante.setText("Telefono:");

        jlAsteriscoNombresEstudiante.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jlAsteriscoNombresEstudiante.setForeground(new java.awt.Color(255, 0, 0));
        jlAsteriscoNombresEstudiante.setText("*");

        jlAsteriscoApellidosEstudiante.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jlAsteriscoApellidosEstudiante.setForeground(new java.awt.Color(255, 0, 0));
        jlAsteriscoApellidosEstudiante.setText("*");

        jlAsteriscoCodigoEstudiante.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jlAsteriscoCodigoEstudiante.setForeground(new java.awt.Color(255, 0, 0));
        jlAsteriscoCodigoEstudiante.setText("*");

        jlAsteriscoTelefonoEstudiante.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jlAsteriscoTelefonoEstudiante.setForeground(new java.awt.Color(255, 0, 0));
        jlAsteriscoTelefonoEstudiante.setText("*");

        javax.swing.GroupLayout jpDatosEstudianteLayout = new javax.swing.GroupLayout(jpDatosEstudiante);
        jpDatosEstudiante.setLayout(jpDatosEstudianteLayout);
        jpDatosEstudianteLayout.setHorizontalGroup(
            jpDatosEstudianteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpDatosEstudianteLayout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(jpDatosEstudianteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jlTelefonoEstudiante)
                    .addComponent(jlApellidosEstudiante))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jpDatosEstudianteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpDatosEstudianteLayout.createSequentialGroup()
                        .addComponent(jtfApellidosEstudiante, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(jlAsteriscoApellidosEstudiante, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpDatosEstudianteLayout.createSequentialGroup()
                        .addComponent(jtfTelefonoEstudiante, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jlAsteriscoTelefonoEstudiante, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jpDatosEstudianteLayout.createSequentialGroup()
                .addGroup(jpDatosEstudianteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpDatosEstudianteLayout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jlCodigoEstudiante))
                    .addComponent(jlNombresEstudiante, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jpDatosEstudianteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpDatosEstudianteLayout.createSequentialGroup()
                        .addComponent(jtfCodigoEstudiante, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jlAsteriscoCodigoEstudiante, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpDatosEstudianteLayout.createSequentialGroup()
                        .addComponent(jtfNombresEstudiante, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jlAsteriscoNombresEstudiante, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpDatosEstudianteLayout.setVerticalGroup(
            jpDatosEstudianteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpDatosEstudianteLayout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(jpDatosEstudianteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfCodigoEstudiante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlAsteriscoCodigoEstudiante, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlCodigoEstudiante))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpDatosEstudianteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlNombresEstudiante)
                    .addComponent(jtfNombresEstudiante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlAsteriscoNombresEstudiante, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpDatosEstudianteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfApellidosEstudiante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlApellidosEstudiante)
                    .addComponent(jlAsteriscoApellidosEstudiante, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpDatosEstudianteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfTelefonoEstudiante)
                    .addComponent(jlTelefonoEstudiante, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlAsteriscoTelefonoEstudiante, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33))
        );

        jpControles.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED), javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(41, 43, 45)), "Controles", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Eras Medium ITC", 1, 14)))); // NOI18N

        jbActualizarEstudiante.setFont(new java.awt.Font("Eras Medium ITC", 1, 12)); // NOI18N
        jbActualizarEstudiante.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/CANCEL_opt.png"))); // NOI18N
        jbActualizarEstudiante.setText("Actualizar");
        jbActualizarEstudiante.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        jbActualizarEstudiante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbActualizarEstudianteActionPerformed(evt);
            }
        });

        jbNuevoEstudiante.setFont(new java.awt.Font("Eras Medium ITC", 1, 12)); // NOI18N
        jbNuevoEstudiante.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Desktop 2_opt.png"))); // NOI18N
        jbNuevoEstudiante.setText("     Nuevo");
        jbNuevoEstudiante.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        jbNuevoEstudiante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbNuevoEstudianteActionPerformed(evt);
            }
        });

        jbGuardarEstudiante.setFont(new java.awt.Font("Eras Medium ITC", 1, 12)); // NOI18N
        jbGuardarEstudiante.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Save_opt.png"))); // NOI18N
        jbGuardarEstudiante.setText(" Guardar    ");
        jbGuardarEstudiante.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        jbGuardarEstudiante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbGuardarEstudianteActionPerformed(evt);
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

        jbCancelar.setFont(new java.awt.Font("Eras Medium ITC", 1, 12)); // NOI18N
        jbCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/CANCEL_opt.png"))); // NOI18N
        jbCancelar.setText("Cancelar");
        jbCancelar.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        jbCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpControlesLayout = new javax.swing.GroupLayout(jpControles);
        jpControles.setLayout(jpControlesLayout);
        jpControlesLayout.setHorizontalGroup(
            jpControlesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpControlesLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jpControlesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jbGuardarEstudiante, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
                    .addComponent(jbNuevoEstudiante, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jpControlesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jpControlesLayout.createSequentialGroup()
                        .addComponent(jbCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbActualizarEstudiante)))
                .addGap(287, 287, 287))
        );
        jpControlesLayout.setVerticalGroup(
            jpControlesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpControlesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpControlesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbNuevoEstudiante)
                    .addComponent(jbCancelar)
                    .addComponent(jbActualizarEstudiante))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jpControlesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbGuardarEstudiante)
                    .addComponent(jbSalir))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jpControles, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jpDatosEstudiante, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jpDetalleEstudiantes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jpDetalleEstudiantes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jpDatosEstudiante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jpControles, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtfNombresEstudianteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfNombresEstudianteKeyTyped
        char car = evt.getKeyChar();
        if ((car < 'a' || car > 'z') && (car < 'A' || car > 'Z') && (car != (char) KeyEvent.VK_SPACE) && (car != (char) KeyEvent.VK_BACK_SPACE) && (car != (char) KeyEvent.VK_DELETE)) {
            evt.consume();
            JOptionPane.showMessageDialog(null, "Los nombres ingresados no son validos.\nIngrese solo texto.", "Dato invalido", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jtfNombresEstudianteKeyTyped

    private void jtfApellidosEstudianteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfApellidosEstudianteKeyTyped
        char car = evt.getKeyChar();
        if ((car < 'a' || car > 'z') && (car < 'A' || car > 'Z') && (car != (char) KeyEvent.VK_SPACE) && (car != (char) KeyEvent.VK_BACK_SPACE) && (car != (char) KeyEvent.VK_DELETE)) {
            evt.consume();
            JOptionPane.showMessageDialog(null, "Los apellidos ingresados no son validos.\nIngrese solo texto.", "Dato invalido", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jtfApellidosEstudianteKeyTyped

    private void jtfTelefonoEstudianteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfTelefonoEstudianteKeyTyped
        char car = evt.getKeyChar();
        if (jtfTelefonoEstudiante.getText().length() >= 10) {
            evt.consume();
        }
        if ((car < '0' || car > '9') && (car != (char) KeyEvent.VK_BACK_SPACE) && (car != (char) KeyEvent.VK_DELETE)) {
            evt.consume();
            JOptionPane.showMessageDialog(null, "El telefono ingresado no es valido.\nIngrese solo numeros.", "Dato invalido", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jtfTelefonoEstudianteKeyTyped

    private void jbNuevoEstudianteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbNuevoEstudianteActionPerformed
        desbloquear();
        limpiar();
        jbCancelar.setEnabled(true);
        jbActualizarEstudiante.setEnabled(false);
        jtfCodigoEstudiante.requestFocus();
    }//GEN-LAST:event_jbNuevoEstudianteActionPerformed

    private void jbCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCancelarActionPerformed
        limpiar();
        bloquear();
        jbCancelar.setEnabled(false);
    }//GEN-LAST:event_jbCancelarActionPerformed

    private void jbActualizarEstudianteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbActualizarEstudianteActionPerformed
        String codigo, nombres, apellidos, telefono;
        String consultaSQL = "";
        codigo = jtfCodigoEstudiante.getText();
        nombres = jtfNombresEstudiante.getText();
        apellidos = jtfApellidosEstudiante.getText();
        telefono = jtfTelefonoEstudiante.getText();
        consultaSQL = "UPDATE tb_estudiantes SET nombre_estu = ?, apellido_estu = ?, telefono_estu = ? WHERE codigo_estu = ?";
        try {
            PreparedStatement pst = conexionDB.prepareStatement(consultaSQL);
            pst.setString(1, nombres);
            pst.setString(2, apellidos);
            pst.setString(3, telefono);
            pst.setString(4, codigo);
            int n = pst.executeUpdate();
            if (n > 0) {
                JOptionPane.showMessageDialog(null, "Registro Guardado con Exito", "Registro exitoso", JOptionPane.INFORMATION_MESSAGE);
                bloquear();
            }
            cargar("");
            limpiar();
        } catch (SQLException ex) {
            Logger.getLogger(RegistroEstudiantesGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jbActualizarEstudianteActionPerformed

    private void jbGuardarEstudianteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbGuardarEstudianteActionPerformed
        String codigo, nombres, apellidos, telefono;
        String consultaSQL = "";
        codigo = jtfCodigoEstudiante.getText();
        nombres = jtfNombresEstudiante.getText();
        apellidos = jtfApellidosEstudiante.getText();
        telefono = jtfTelefonoEstudiante.getText();
        consultaSQL = "INSERT INTO tb_estudiantes (codigo_estu, nombre_estu, apellido_estu, telefono_estu) VALUES (?,?,?,?)";
        try {
            PreparedStatement pst = conexionDB.prepareStatement(consultaSQL);
            pst.setString(1, codigo);
            pst.setString(2, nombres);
            pst.setString(3, apellidos);
            pst.setString(4, telefono);
            int n = pst.executeUpdate();
            if (n > 0) {
                JOptionPane.showMessageDialog(null, "Registro Guardado con Exito", "Registro exitoso", JOptionPane.INFORMATION_MESSAGE);
                bloquear();
            }
            cargar("");

        } catch (SQLException ex) {
            Logger.getLogger(RegistroEstudiantesGUI.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Diligencie todos los campos.", "Informacion incompleta", JOptionPane.WARNING_MESSAGE);
        }
        limpiar();
    }//GEN-LAST:event_jbGuardarEstudianteActionPerformed

    private void jbSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_jbSalirActionPerformed

    private void jpmiActualizarEstudianteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jpmiActualizarEstudianteActionPerformed
        desbloquear();
        jbCancelar.setEnabled(true);
        jbGuardarEstudiante.setEnabled(false);
        jtfCodigoEstudiante.setEditable(false);
        jtfCodigoEstudiante.setEnabled(false);
        int modificarRegistro = jtDetalleEstudiantes.getSelectedRow();
        if (modificarRegistro >= 0) {
            jtfCodigoEstudiante.setText(jtDetalleEstudiantes.getValueAt(modificarRegistro, 0).toString());
            jtfNombresEstudiante.setText(jtDetalleEstudiantes.getValueAt(modificarRegistro, 1).toString());
            jtfApellidosEstudiante.setText(jtDetalleEstudiantes.getValueAt(modificarRegistro, 2).toString());
            jtfTelefonoEstudiante.setText(jtDetalleEstudiantes.getValueAt(modificarRegistro, 3).toString());
        } else {
            JOptionPane.showMessageDialog(this, "No ha seleccionado un registro", "Error en seleccion", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_jpmiActualizarEstudianteActionPerformed

    private void jpmiEliminarEstudianteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jpmiEliminarEstudianteActionPerformed
        int eliminarRegistro = jtDetalleEstudiantes.getSelectedRow();
        String codigo = "";
        codigo = jtDetalleEstudiantes.getValueAt(eliminarRegistro, 0).toString();
        if (eliminarRegistro >= 0) {
            try {
                PreparedStatement pst = conexionDB.prepareStatement("DELETE FROM tb_estudiantes WHERE Codigo_estu='" + codigo + "'");
                pst.executeUpdate();
                cargar("");
            } catch (SQLException ex) {
                Logger.getLogger(RegistroEstudiantesGUI.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            JOptionPane.showMessageDialog(this, "No ha seleccionado un registro", "Error en seleccion", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_jpmiEliminarEstudianteActionPerformed

    private void jtfCodigoEstudianteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfCodigoEstudianteKeyTyped
        char car = evt.getKeyChar();
        if ((car < '0' || car > '9') && (car != (char) KeyEvent.VK_BACK_SPACE) && (car != (char) KeyEvent.VK_DELETE)) {
            evt.consume();
            JOptionPane.showMessageDialog(null, "El codigo ingresado no es valido.\nIngrese solo numeros.", "Dato invalido", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jtfCodigoEstudianteKeyTyped

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton jbActualizarEstudiante;
    private javax.swing.JButton jbCancelar;
    private javax.swing.JButton jbGuardarEstudiante;
    private javax.swing.JButton jbNuevoEstudiante;
    private javax.swing.JButton jbSalir;
    private javax.swing.JLabel jlApellidosEstudiante;
    private javax.swing.JLabel jlAsteriscoApellidosEstudiante;
    private javax.swing.JLabel jlAsteriscoCodigoEstudiante;
    private javax.swing.JLabel jlAsteriscoNombresEstudiante;
    private javax.swing.JLabel jlAsteriscoTelefonoEstudiante;
    private javax.swing.JLabel jlCodigoEstudiante;
    private javax.swing.JLabel jlNombresEstudiante;
    private javax.swing.JLabel jlTelefonoEstudiante;
    private javax.swing.JPanel jpControles;
    private javax.swing.JPanel jpDatosEstudiante;
    private javax.swing.JPanel jpDetalleEstudiantes;
    private javax.swing.JMenuItem jpmiActualizarEstudiante;
    private javax.swing.JMenuItem jpmiEliminarEstudiante;
    private javax.swing.JTable jtDetalleEstudiantes;
    private javax.swing.JTextField jtfApellidosEstudiante;
    private javax.swing.JTextField jtfCodigoEstudiante;
    private javax.swing.JTextField jtfNombresEstudiante;
    private javax.swing.JTextField jtfTelefonoEstudiante;
    // End of variables declaration//GEN-END:variables
ClaseConexion objConexion = new ClaseConexion();
    Connection conexionDB = objConexion.conexion();
}
