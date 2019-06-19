package formularios;

import com.mysql.jdbc.PreparedStatement;
import java.awt.HeadlessException;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.sql.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.GregorianCalendar;
import javax.swing.table.DefaultTableModel;

/**
 * Ventana para el manejo de las citas de los pacientes
 *
 * @author Sebastian Galeano Bolivar
 * @author Sebastian Toro Cano
 * @version 1
 */
public class frmCitas extends javax.swing.JFrame{

    frmIngresar info_ingresar = new frmIngresar();
    String cedula_usuario = frmIngresar.obtener_usuario();
    DefaultTableModel m;
    ArrayList<String> odontologos = new ArrayList<>();
    Date fecha_inicial;

    public frmCitas() {

        initComponents();
        cargar_odontologos();
        iniciar_tabla();
//        cargarPacienteCitas();
        //txtFecha.setText(getFechaActual());
        SNumeros(txtId);
        SNumeros(txtTelefono);
        SLetras(txtNombres);
        SLetras(txtApellidos);
        SLetras(txtServicios);
        JOptionPane.showMessageDialog(rootPane, "Si el paciente ingresa por primera vez, es necesario diligenciar todos los datos. En caso contrario, se realiza una busqueda usando el numero de documento.");

    }

    @SuppressWarnings("unchecked")/*
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        usuariosList = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : ((javax.persistence.Query)null).getResultList();
        jPanel1 = new javax.swing.JPanel();
        btnEliminar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        btnBuscarcitas = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jPanel3 = new javax.swing.JPanel();
        txtTelefono = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTablaCitas = new javax.swing.JTable();
        jcbodontologo = new javax.swing.JComboBox();
        jLabel9 = new javax.swing.JLabel();
        txtServicios = new javax.swing.JTextField();
        jcmbHora = new javax.swing.JComboBox();
        jcalendario = new com.toedter.calendar.JCalendar();
        jcmbMinutos = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btnBuscarhistorial = new javax.swing.JButton();
        btnBuscarcitasxfecha = new javax.swing.JButton();
        txtApellidos = new javax.swing.JTextField();
        lbl9 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtNombres = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtAObservacion = new javax.swing.JTextArea();
        txtId = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();

        setTitle("Citas");

        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/borrar.png"))); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.setToolTipText("Eliminar ");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/modificar.png"))); // NOI18N
        btnModificar.setText("Modificar");
        btnModificar.setToolTipText("Modificar ");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cancelar.png"))); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.setToolTipText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/guardar.png"))); // NOI18N
        btnGuardar.setText("Guardar");
        btnGuardar.setToolTipText("Guardar ");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnBuscarcitas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/buscar.png"))); // NOI18N
        btnBuscarcitas.setText("Consultar");
        btnBuscarcitas.setToolTipText("Consultar citas");
        btnBuscarcitas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarcitasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnGuardar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnModificar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnBuscarcitas, javax.swing.GroupLayout.DEFAULT_SIZE, 147, Short.MAX_VALUE)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnGuardar)
                .addGap(18, 18, 18)
                .addComponent(btnModificar)
                .addGap(18, 18, 18)
                .addComponent(btnEliminar)
                .addGap(16, 16, 16)
                .addComponent(btnBuscarcitas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCancelar)
                .addContainerGap(68, Short.MAX_VALUE))
        );

        txtTelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTelefonoActionPerformed(evt);
            }
        });
        txtTelefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtTelefonoKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTelefonoKeyTyped(evt);
            }
        });

        jTablaCitas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Paciente", "Hora", "Minutos", "Servicios"
            }
        ));
        jScrollPane2.setViewportView(jTablaCitas);

        jLabel9.setText("*Servicios");

        txtServicios.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtServiciosKeyTyped(evt);
            }
        });

        jcmbHora.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccione una hora.", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17" }));

        jcalendario.setToolTipText("Calendario");
        jcalendario.setName("JCalendario"); // NOI18N

        jcmbMinutos.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccione los minutos.", "00", "15", "30", "45" }));

        jLabel4.setText("Citas del día de hoy");

        jLabel8.setText("*Apellidos");

        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btnBuscarhistorial.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/buscar.png"))); // NOI18N
        btnBuscarhistorial.setText("Consultar historial");
        btnBuscarhistorial.setToolTipText("Consultar citas");
        btnBuscarhistorial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarhistorialActionPerformed(evt);
            }
        });

        btnBuscarcitasxfecha.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/buscar.png"))); // NOI18N
        btnBuscarcitasxfecha.setText("Consultar citas");
        btnBuscarcitasxfecha.setToolTipText("Buscar ");
        btnBuscarcitasxfecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarcitasxfechaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnBuscarcitasxfecha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnBuscarhistorial, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(16, 16, 16))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnBuscarcitasxfecha)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnBuscarhistorial)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        txtApellidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtApellidosActionPerformed(evt);
            }
        });
        txtApellidos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtApellidosKeyTyped(evt);
            }
        });

        lbl9.setText("*Teléfono");

        jLabel2.setText("*Fecha de cita");

        jLabel1.setText("*Cédula del paciente");

        txtNombres.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombresKeyTyped(evt);
            }
        });

        jtAObservacion.setColumns(20);
        jtAObservacion.setLineWrap(true);
        jtAObservacion.setRows(5);
        jtAObservacion.setWrapStyleWord(true);
        jScrollPane1.setViewportView(jtAObservacion);

        txtId.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtIdKeyTyped(evt);
            }
        });

        jLabel6.setText("*Odontólogo");

        jLabel5.setText("Observaciones");

        jLabel3.setText("*Hora de cita");

        jLabel7.setText("*Nombres");

        jLabel10.setText("Nota:");

        jTextArea1.setColumns(20);
        jTextArea1.setLineWrap(true);
        jTextArea1.setRows(5);
        jTextArea1.setText("Si el paciente ingresa por primera vez, es necesario diligenciar todos los datos. En caso contrario, se realiza una busqueda usando el numero de documento.");
        jTextArea1.setWrapStyleWord(true);
        jTextArea1.setEnabled(false);
        jScrollPane4.setViewportView(jTextArea1);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 475, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel8)
                                    .addComponent(lbl9)
                                    .addComponent(jLabel6))
                                .addGap(72, 72, 72)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtNombres)
                                    .addComponent(txtApellidos)
                                    .addComponent(txtTelefono)
                                    .addComponent(jcbodontologo, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4))
                                .addGap(78, 78, 78)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtServicios, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(jcmbHora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jcmbMinutos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jcalendario, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(181, 181, 181))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel10)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel7)
                            .addComponent(txtNombres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jcbodontologo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jcalendario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel9)
                                .addGap(12, 12, 12)
                                .addComponent(jLabel5)
                                .addGap(46, 46, 46)
                                .addComponent(jLabel4))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jcmbHora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jcmbMinutos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtServicios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jScrollPane3.setViewportView(jPanel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 713, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 563, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
*/

    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtAObservacion = new javax.swing.JTextArea();
        jLabel7 = new javax.swing.JLabel();
        txtNombres = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtApellidos = new javax.swing.JTextField();
        jcmbHora = new javax.swing.JComboBox();
        jcmbMinutos = new javax.swing.JComboBox();
        jPanel1 = new javax.swing.JPanel();
        btnEliminar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        btnBuscarcitas = new javax.swing.JButton();
        lbl9 = new javax.swing.JLabel();
        txtTelefono = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTablaCitas = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        txtServicios = new javax.swing.JTextField();
        jcalendario = new com.toedter.calendar.JCalendar();
        jLabel4 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btnBuscarhistorial = new javax.swing.JButton();
        btnBuscarcitasxfecha = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jcbodontologo = new javax.swing.JComboBox();

        
        setResizable(true);
        setTitle("Citas");

        jLabel1.setText("Cédula del paciente");

        jLabel2.setText("Fecha de cita");

        jLabel3.setText("Hora de cita");

        jLabel5.setText("Observaciones");

        jtAObservacion.setColumns(20);
        jtAObservacion.setRows(5);
        jScrollPane1.setViewportView(jtAObservacion);

        jLabel7.setText("Nombres");

        jLabel8.setText("Apellidos");

        txtApellidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtApellidosActionPerformed(evt);
            }
        });

        jcmbHora.setModel(new javax.swing.DefaultComboBoxModel(new String[]{"Seleccione una hora.", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17"}));

        jcmbMinutos.setModel(new javax.swing.DefaultComboBoxModel(new String[]{"Seleccione los minutos.", "00", "15", "30", "45"}));

        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/borrar.png"))); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.setToolTipText("Eliminar ");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/modificar.png"))); // NOI18N
        btnModificar.setText("Modificar");
        btnModificar.setToolTipText("Modificar ");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cancelar.png"))); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.setToolTipText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/guardar.png"))); // NOI18N
        btnGuardar.setText("Guardar");
        btnGuardar.setToolTipText("Guardar ");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnBuscarcitas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/buscar.png"))); // NOI18N
        btnBuscarcitas.setText("Consultar");
        btnBuscarcitas.setToolTipText("Consultar citas");
        btnBuscarcitas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarcitasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(btnBuscarcitas, javax.swing.GroupLayout.DEFAULT_SIZE, 139, Short.MAX_VALUE)
                                .addComponent(btnCancelar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 139, Short.MAX_VALUE)
                                .addComponent(btnEliminar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnModificar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnGuardar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap(30, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnGuardar)
                        .addGap(18, 18, 18)
                        .addComponent(btnModificar)
                        .addGap(18, 18, 18)
                        .addComponent(btnEliminar)
                        .addGap(16, 16, 16)
                        .addComponent(btnBuscarcitas)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCancelar)
                        .addContainerGap(68, Short.MAX_VALUE))
        );

        lbl9.setText("Teléfono");

        txtTelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTelefonoActionPerformed(evt);
            }
        });
        txtTelefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtTelefonoKeyPressed(evt);
            }
        });

        jTablaCitas.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][]{
                    {null, null},
                    {null, null},
                    {null, null},
                    {null, null}
                },
                new String[]{
                    "Hora", "Servicios"
                }
        ));
        jScrollPane2.setViewportView(jTablaCitas);

        jLabel9.setText("Servicios");

        jcalendario.setToolTipText("Calendario");
        jcalendario.setName("JCalendario"); // NOI18N

        jLabel4.setText("Citas del día de hoy");

        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btnBuscarhistorial.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/buscar.png"))); // NOI18N
        btnBuscarhistorial.setText("Consultar historial");
        btnBuscarhistorial.setToolTipText("Consultar citas");
        btnBuscarhistorial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarhistorialActionPerformed(evt);
            }
        });

        btnBuscarcitasxfecha.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/buscar.png"))); // NOI18N
        btnBuscarcitasxfecha.setText("Consultar citas");
        btnBuscarcitasxfecha.setToolTipText("Buscar ");
        btnBuscarcitasxfecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarcitasxfechaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(btnBuscarcitasxfecha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnBuscarhistorial, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(16, 16, 16))
        );
        jPanel2Layout.setVerticalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnBuscarcitasxfecha)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnBuscarhistorial)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel6.setText("Odontólogo");

        jcbodontologo.setModel(new javax.swing.DefaultComboBoxModel(new String[]{"Seleccione."}));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                                .addGroup(layout.createSequentialGroup()
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addComponent(jLabel1)
                                                                .addComponent(jLabel7)
                                                                .addComponent(jLabel2)
                                                                .addComponent(jLabel8)
                                                                .addComponent(lbl9)
                                                                .addComponent(jLabel5)
                                                                .addComponent(jLabel9)
                                                                .addComponent(jLabel3)
                                                                .addComponent(jLabel6))
                                                        .addGap(72, 72, 72)
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                .addComponent(txtServicios, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(jcalendario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(txtNombres)
                                                                .addComponent(txtApellidos)
                                                                .addComponent(txtTelefono)
                                                                .addGroup(layout.createSequentialGroup()
                                                                        .addComponent(jcmbHora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                        .addComponent(jcmbMinutos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addComponent(jScrollPane1)
                                                                .addComponent(jcbodontologo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                        .addGap(0, 7, Short.MAX_VALUE)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(12, 12, 12))
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addContainerGap())))
                                .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel1)
                                                .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(jLabel7)
                                                .addComponent(txtNombres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(txtApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jLabel8))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(lbl9))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(jLabel6)
                                                .addComponent(jcbodontologo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jcalendario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jLabel2))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(jcmbHora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jcmbMinutos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jLabel3))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel9)
                                                .addComponent(txtServicios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel5)
                                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(3, 3, 3)
                                        .addComponent(jLabel4))
                                .addGroup(layout.createSequentialGroup()
                                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 89, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20))
        );

        pack();
    }
    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        SNumeros(txtId);
        SLetras(txtNombres);
        SLetras(txtApellidos);
        Calendar c2 = new GregorianCalendar();
        Date date = c2.getTime();
        if (jcalendario.getDate().before(date)) {
            JOptionPane.showMessageDialog(rootPane, "No es posible asignar una fecha para dias anteriores");
            return;
        }
        boolean disp = disponibilidad_odont();
        if (disp == false) {
            JOptionPane.showMessageDialog(rootPane, "El odontólogo ya tiene esa hora reservada");
            return;
        }
        if(jcbodontologo.getSelectedIndex()==0){
            JOptionPane.showMessageDialog(rootPane, "Debe seleccionar un odontólogo");
            return;
        }
        if(jcmbHora.getSelectedIndex()==0){
            JOptionPane.showMessageDialog(rootPane, "Debe seleccionar una hora");
            return;
        }
        if(jcmbMinutos.getSelectedIndex()==0){
            JOptionPane.showMessageDialog(rootPane, "Debe seleccionar los minutos");
            return;
        }
        String id, telefono, hora, minutos, servicios, observaciones;

        hora = (String) jcmbHora.getSelectedItem();
        minutos = (String) jcmbMinutos.getSelectedItem();
        Date fecha2 = jcalendario.getDate();

        /**
         * Metodo para guardar la informacion ingresada en los campos del
         * formulario Se crea instancia de clase conectar y de clase Connection
         */
        conectar cc = new conectar();
        Connection cn = cc.conexion();
        String sql = "";

        //Validaciondes de campos vacios
        if (txtId.getText().equals("")) {
            JOptionPane.showMessageDialog(rootPane, "Debe digitar una cédula del paciente");
            return;
        }

        if (txtNombres.getText().equals("")) {
            JOptionPane.showMessageDialog(rootPane, "Debe digitar un nombre del paciente");
            return;
        }

        if (txtApellidos.getText().equals("")) {
            JOptionPane.showMessageDialog(rootPane, "Debe digitar los apellidos del paciente");
            return;
        }

        if (txtTelefono.getText().equals("")) {
            JOptionPane.showMessageDialog(rootPane, "Debe digitar un teléfono del paciente");
            return;
        }

        if (hora.equals("Seleccione una hora.")) {
            JOptionPane.showMessageDialog(rootPane, "Debe seleccionar una hora");
            jcmbHora.requestFocusInWindow();
            return;
        }

        if (minutos.equals("Seleccione los minutos.")) {
            JOptionPane.showMessageDialog(rootPane, "Debe seleccionar los minutos");
            jcmbHora.requestFocusInWindow();
            return;
        }

        //Validaciones limite de campos
        if (txtId.getText().length() > 15) {
            JOptionPane.showMessageDialog(rootPane, "El limite de caracteres del campo cédula es 15");
            return;
        }

        if (txtNombres.getText().length() > 30) {
            JOptionPane.showMessageDialog(rootPane, "El limite de caracteres del campo nombres es 30");
            return;
        }

        if (txtApellidos.getText().length() > 30) {
            JOptionPane.showMessageDialog(rootPane, "El limite de caracteres del campo apellidos es 30");
            return;
        }
        if (txtTelefono.getText().length() > 15) {
            JOptionPane.showMessageDialog(rootPane, "El limite de caracteres del campo telefono es 15");
            return;
        }
        if (txtServicios.getText().length() > 30) {
            JOptionPane.showMessageDialog(rootPane, "El limite de caracteres del campo servicios es 30");
            return;
        }

        id = txtId.getText();
        telefono = txtTelefono.getText();
        servicios = txtServicios.getText();
        hora = (String) jcmbHora.getSelectedItem();
        minutos = (String) jcmbMinutos.getSelectedItem();
        String id_cita = "" + Nuevo_Codigo();//debe ser asignada automaticamente por el sistema
        String id_usuario_cita = info_ingresar.obtener_usuario();//debe ser la cedula del usuario que inicio sesion
        System.out.println("El id del usuario en el sistema es " + id_usuario_cita);
        String nombre_pac = txtNombres.getText();
        String apellidos_pac = txtApellidos.getText();
        observaciones = jtAObservacion.getText();

        sql = "INSERT INTO citas(id_cita,fecha_cita,hora_cita,minuto_cita,nombres_pac,apellidos_pac,"
                + "telefono_paciente_cita,observaciones_cita,id_usuario_citas,id_pac_cita,servicios,odontologo_cita)"
                + " VALUES(?,?,?,?,?,?,?,?,?,?,?,?)";
        java.sql.Date sqlf1 = new java.sql.Date(fecha2.getTime());
        try {
            PreparedStatement sts = (PreparedStatement) cn.prepareStatement(sql);
            sts.setString(1, id_cita);
            sts.setDate(2, sqlf1);
            sts.setString(3, hora);
            sts.setString(4, minutos);
            sts.setString(5, nombre_pac);
            sts.setString(6, apellidos_pac);
            sts.setString(7, telefono);
            sts.setString(8, observaciones);
            sts.setString(9, id_usuario_cita);
            sts.setString(10, id);
            sts.setString(11, servicios);
            sts.setString(12, (String) jcbodontologo.getSelectedItem());

            int R = sts.executeUpdate();
            if (R > 0) {
                JOptionPane.showMessageDialog(null, "Cita asignada con éxito");
            } else {
                JOptionPane.showMessageDialog(null, "Error al guardar");
            }
        } catch (SQLException ex) {
            Logger.getLogger(frmCitas.class.getName()).log(Level.SEVERE, null, ex);
        }
        limpiar();
        txtId.setEnabled(true);
        txtNombres.setEnabled(true);
        txtApellidos.setEnabled(true);
        txtTelefono.setEnabled(true);

    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        int rta = JOptionPane.showConfirmDialog(rootPane, "¿está seguro de eliminar la cita?");
        if (rta != 0) {
            return;
        }

        conectar cc = new conectar();
        Connection cn = cc.conexion();
        String sql = "";

        Date fecha2 = jcalendario.getDate();
        java.sql.Date sqlf1 = new java.sql.Date(fecha2.getTime());
        if (!txtId.getText().equals("")) {
            try {

                sql = "DELETE FROM citas WHERE nombres_pac= '" + txtNombres.getText() + "' and apellidos_pac='" + txtApellidos.getText() + "'"
                        + " and telefono_paciente_cita= '" + txtTelefono.getText() + "' and fecha_cita= '" + sqlf1 + "' and id_pac_cita='"
                        + txtId.getText()+"'";
                System.out.println("" + sql);
                PreparedStatement st = (PreparedStatement) cn.prepareStatement(sql);
                int cambios = st.executeUpdate();
                if (cambios == 1) {
                    JOptionPane.showMessageDialog(null, "Cita eliminada con éxito");
                } else {
                    JOptionPane.showMessageDialog(null, "Error al eliminar cita");
                }
            } catch (SQLException | HeadlessException e) {
                Logger.getLogger(frmCitas.class.getName()).log(Level.SEVERE, null, e);
                JOptionPane.showMessageDialog(null, "Error al eliminar cita");
            }
        } else {
            try {
                sql = "DELETE FROM citas WHERE nombres_pac= '" + txtNombres.getText() + "' and apellidos_pac='" + txtApellidos.getText() + "'"
                        + " and telefono_paciente_cita= '" + txtTelefono.getText() + "' and fecha_cita= '" + sqlf1 + "' and id_pac_cita='"
                        + txtId.getText()+"'";
                PreparedStatement st = (PreparedStatement) cn.prepareStatement(sql);
                System.out.println("" + sql);
                int cambios = st.executeUpdate();
                if (cambios == 1) {
                    JOptionPane.showMessageDialog(null, "Cita eliminada con éxito");
                } else {
                    JOptionPane.showMessageDialog(null, "Error al eliminar, la sentencia fue: " + sql);
                }
            } catch (SQLException | HeadlessException e) {
                Logger.getLogger(frmCitas.class.getName()).log(Level.SEVERE, null, e);
                JOptionPane.showMessageDialog(null, "Error al eliminar cita");
            }
        }
        limpiar();
        txtId.setEnabled(true);
        txtNombres.setEnabled(true);
        txtApellidos.setEnabled(true);
        txtTelefono.setEnabled(true);
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnBuscarcitasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarcitasActionPerformed
        String sql2 = "";
        String nombre = "", apellido = null;
        String hora = null, minutos = null, telefono = null, observaciones = null, servicios = null;
        //Validaciones limite de campos
        if (txtId.getText().length() > 15) {
            JOptionPane.showMessageDialog(rootPane, "El limite de caracteres del campo cédula es 15");
            return;
        }
        if (txtNombres.getText().length() > 30) {
            JOptionPane.showMessageDialog(rootPane, "El limite de caracteres del campo nombres es 30");
            return;
        }

        if (txtApellidos.getText().length() > 30) {
            JOptionPane.showMessageDialog(rootPane, "El limite de caracteres del campo apellidos es 30");
            return;
        }
        if (txtTelefono.getText().length() > 15) {
            JOptionPane.showMessageDialog(rootPane, "El limite de caracteres del campo telefono es 15");
            return;
        }
        if (txtServicios.getText().length() > 30) {
            JOptionPane.showMessageDialog(rootPane, "El limite de caracteres del campo servicios es 30");
            return;
        }
        Date fecha2 = null;
        String odontologo = "";
        conectar cc = new conectar();
        Connection cn = cc.conexion();

        if ((txtId.getText().equals("")) && (txtNombres.getText().equals("")) && (txtApellidos.getText().equals(""))
                && (txtTelefono.getText().equals(""))) {
            JOptionPane.showMessageDialog(rootPane, "Debe digitar una cédula, nombre, apellido y telefono");
        } else {
            System.out.println("la cédula " + txtId.getText());
            System.out.println("Nombre " + txtNombres.getText());
            System.out.println("Apellido " + txtApellidos.getText());
            System.out.println("Telefono " + txtTelefono.getText());

            if (!txtId.getText().equals("")) {
                try {
                    sql2 = "SELECT numero_doc_paciente,nombre_paciente,apellido_paciente,"
                            + "telefono_paciente FROM  pacientes Where numero_doc_paciente='" + txtId.getText() + "'";
                    System.out.println("La sentencia es " + sql2);
                    Statement st = cn.createStatement();
                    ResultSet rs = st.executeQuery(sql2);
                    if (rs.next()) {
                        rs.beforeFirst();
                        while (rs.next()) {
                            nombre = rs.getString("nombre_paciente");
                            apellido = rs.getString("apellido_paciente");
                            telefono = rs.getString("telefono_paciente");
                        }
                    } else {
                        System.out.println("Entro a buscar en citas y no en pacientes");
                        sql2 = "SELECT nombres_pac,apellidos_pac,"
                                + "telefono_paciente_cita FROM  citas Where id_pac_cita='" + txtId.getText() + "'";
                        System.out.println("La sentencia es " + sql2);
                        st = cn.createStatement();
                        rs = st.executeQuery(sql2);
                        while (rs.next()) {
                            nombre = rs.getString("nombres_pac");
                            apellido = rs.getString("apellidos_pac");
                            telefono = rs.getString("telefono_paciente_cita");
                        }
                    }

                } catch (Exception e) {
                    Logger.getLogger(frmCitas.class.getName()).log(Level.SEVERE, null, e);
                }
                txtNombres.setText(nombre);
                txtApellidos.setText(apellido);
                txtTelefono.setText(telefono);

                inhabilitar(txtId);
                inhabilitar(txtNombres);
                inhabilitar(txtApellidos);
                inhabilitar(txtTelefono);

            }
            if ((!txtNombres.getText().equals("")) && (!txtApellidos.getText().equals("")) && (!txtTelefono.getText().equals(""))) {
                System.out.println("Nombre " + txtNombres.getText());
                System.out.println("Apellido " + txtApellidos.getText());
                System.out.println("Telefono " + txtTelefono.getText());

                try {
                    sql2 = "SELECT * FROM  citas Where nombres_pac= '" + txtNombres.getText() + "' and apellidos_pac= '" + txtApellidos.getText()
                            + "' and telefono_paciente_cita = '" + txtTelefono.getText() + "'";
                    System.out.println("La sentencia es " + sql2);
                    Statement st = cn.createStatement();
                    ResultSet rs = st.executeQuery(sql2);

                    while (rs.next()) {

                        nombre = rs.getString("nombres_pac");
                        apellido = rs.getString("apellidos_pac");
                        telefono = rs.getString("telefono_paciente_cita");
                        fecha2 = rs.getDate("fecha_cita");
                        hora = rs.getString("hora_cita");
                        minutos = rs.getString("minuto_cita");
                        observaciones = rs.getString("observaciones_cita");
                        servicios = rs.getString("servicios");
                        odontologo = rs.getString("odontologo_cita");
                    }
                    System.out.println("Los valores traidos de la bd son: " + nombre + ", " + apellido + ", " + telefono
                            + ", " + fecha2 + ", " + hora + ", " + minutos + ", " + observaciones + ", " + servicios
                            + " " + odontologo);
                    //JOptionPane.showMessageDialog(rootPane, "Se muestra informacion de " + nombre);
                } catch (SQLException | HeadlessException e) {
                    Logger.getLogger(frmCitas.class.getName()).log(Level.SEVERE, null, e);
                    JOptionPane.showMessageDialog(rootPane, "Error en la busqueda, por favor verifique la información" );
                }

                txtNombres.setText(nombre);
                txtApellidos.setText(apellido);
                txtTelefono.setText(telefono);
                jcalendario.setDate(fecha2);
                System.out.println("JdateChooser tiene " + jcalendario.getDate());
                jcmbHora.setSelectedItem(hora);
                jcmbMinutos.setSelectedItem(minutos);
                txtServicios.setText(servicios);
                jtAObservacion.setText(observaciones);
                jcbodontologo.setSelectedItem(odontologo);
                fecha_inicial = jcalendario.getDate();
            }
        }
    }//GEN-LAST:event_btnBuscarcitasActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        SNumeros(txtId);
        SLetras(txtNombres);
        SLetras(txtApellidos);
        Calendar c2 = new GregorianCalendar();
        Date date = c2.getTime();
        boolean disp = disponibilidad_odont();
        if (disp == false) {
            JOptionPane.showMessageDialog(rootPane, "El odontólogo ya tiene esa hora reservada");
            return;
        }
        if (jcalendario.getDate().before(date)) {
            JOptionPane.showMessageDialog(rootPane, "No es posible asignar una fecha para dias anteriores");
            return;
        }
        if (txtId.getText().length() > 15) {
            JOptionPane.showMessageDialog(rootPane, "El limite de caracteres del campo cédula es 15");
            return;
        }

        if (txtNombres.getText().length() > 30) {
            JOptionPane.showMessageDialog(rootPane, "El limite de caracteres del campo nombres es 30");
            return;
        }

        if (txtApellidos.getText().length() > 30) {
            JOptionPane.showMessageDialog(rootPane, "El limite de caracteres del campo apellidos es 30");
            return;
        }
        if (txtTelefono.getText().length() > 15) {
            JOptionPane.showMessageDialog(rootPane, "El limite de caracteres del campo telefono es 15");
            return;
        }
        if(jcbodontologo.getSelectedIndex()==0){
            JOptionPane.showMessageDialog(rootPane, "Debe seleccionar un odontólogo");
            return;
        }
        if(jcmbHora.getSelectedIndex()==0){
            JOptionPane.showMessageDialog(rootPane, "Debe seleccionar una hora");
            return;
        }
        if(jcmbMinutos.getSelectedIndex()==0){
            JOptionPane.showMessageDialog(rootPane, "Debe seleccionar los minutos");
            return;
        }
        conectar cc = new conectar();
        Connection cn = cc.conexion();
        String id, nombres, apellidos, telefono, hora;
        id = txtId.getText();
        nombres = txtNombres.getText();
        apellidos = txtApellidos.getText();
        telefono = txtTelefono.getText();
        hora = (String) jcmbHora.getSelectedItem();
        String minutos = (String) jcmbMinutos.getSelectedItem();
        String odont = (String) jcbodontologo.getSelectedItem();
        String servicios = txtServicios.getText();
        Date fecha2 = jcalendario.getDate();
        java.sql.Date sqlf1 = new java.sql.Date(fecha2.getTime());
        String observaciones = jtAObservacion.getText();
        String idcita = "";

        try {
            idcita = Obtener_idcita(id, nombres, apellidos, telefono, fecha_inicial);
        } catch (SQLException ex) {
            Logger.getLogger(frmCitas.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("Lee los campos con " + id + " " + nombres);
        if (!txtId.getText().equals("")) {
            try {
                PreparedStatement pst = (PreparedStatement) cn.prepareStatement("UPDATE citas SET "
                        + "fecha_cita='" + sqlf1
                        + "',hora_cita='" + hora
                        + "',minuto_cita='" + minutos
                        + "',observaciones_cita='" + observaciones
                        + "',servicios='" + servicios
                        + "' , odontologo_cita ='" + odont
                        + "' , id_usuario_citas='" + cedula_usuario
                        + "' where id_cita='" + idcita + "'");
                //   + "' Where nombres_pac= '" + txtNombres.getText() + "' and apellidos_pac= '" + txtApellidos.getText()
                //   + "' and telefono_paciente_cita = '" + txtTelefono.getText() + "'");

                int bandera = pst.executeUpdate();
                if (bandera > 0) {
                    JOptionPane.showMessageDialog(null, "Modificado con éxito");
                } else {
                    JOptionPane.showMessageDialog(null, "Error al modificar");
                    txtId.setEnabled(true);
                    txtNombres.setEnabled(true);
                    txtApellidos.setEnabled(true);
                    txtTelefono.setEnabled(true);
                }
                limpiar();
                txtId.setEnabled(true);
                txtNombres.setEnabled(true);
                txtApellidos.setEnabled(true);
                txtTelefono.setEnabled(true);
            } catch (SQLException | HeadlessException e) {
                Logger.getLogger(frmCitas.class.getName()).log(Level.SEVERE, null, e);
            }
        } else {
            try {
                PreparedStatement pst = (PreparedStatement) cn.prepareStatement("UPDATE citas SET "
                        + " nombres_pac='" + nombres
                        + "', apellidos_pac='" + apellidos
                        + "', fecha_cita='" + sqlf1
                        + "',hora_cita='" + hora
                        + "',minuto_cita='" + minutos
                        + "',telefono_paciente_cita='" + telefono
                        + "',observaciones_cita='" + observaciones
                        + "',servicios='" + servicios
                        + "' , odontologo_cita ='" + odont
                        + "' , id_usuario_citas='" + cedula_usuario
                        + "'  Where nombres_pac= '" + txtNombres.getText() + "' and apellidos_pac= '" + txtApellidos.getText()
                        + "' and telefono_paciente_cita = '" + txtTelefono.getText() + "'");

                int bandera = pst.executeUpdate();
                if (bandera > 0) {
                    JOptionPane.showMessageDialog(null, "Modificado con éxito");
                } else {
                    JOptionPane.showMessageDialog(null, "Error al modificar");
                    txtId.setEnabled(true);
                    txtNombres.setEnabled(true);
                    txtApellidos.setEnabled(true);
                    txtTelefono.setEnabled(true);
                }
                limpiar();
                txtId.setEnabled(true);
                txtNombres.setEnabled(true);
                txtApellidos.setEnabled(true);
                txtTelefono.setEnabled(true);
            } catch (Exception e) {
                Logger.getLogger(frmCitas.class.getName()).log(Level.SEVERE, null, e);
            }
        }
        limpiar();
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        limpiar();
        txtId.setEnabled(true);
        txtNombres.setEnabled(true);
        txtApellidos.setEnabled(true);
        txtTelefono.setEnabled(true);
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void txtApellidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtApellidosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtApellidosActionPerformed

    private void txtTelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTelefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTelefonoActionPerformed

    private void txtTelefonoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTelefonoKeyPressed
        SNumeros(txtTelefono);
    }//GEN-LAST:event_txtTelefonoKeyPressed

    private void btnBuscarcitasxfechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarcitasxfechaActionPerformed
        try {
            conectar cc = new conectar();
            Connection cn = cc.conexion();

            String[] titulos = new String[4];
            titulos[0] = "Paciente";
            titulos[1] = "Telefono";
            titulos[2] = "Hora";

            titulos[3] = "Servicios";
            Date fecha2 = jcalendario.getDate();
            java.sql.Date sqlf1 = new java.sql.Date(fecha2.getTime());
            String sql = "select nombres_pac,apellidos_pac,telefono_paciente_cita,"
                    + "hora_cita,minuto_cita,servicios from citas where fecha_cita= '" + sqlf1 + "'";
            System.out.println("" + sql);
            DefaultTableModel modelo = new DefaultTableModel(null, titulos);
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            String[] filas = new String[5];
            String[] registro = new String[6];

            while (rs.next()) {
                registro[0] = rs.getString("nombres_pac");
                registro[1] = rs.getString("apellidos_pac");
                registro[2] = rs.getString("telefono_paciente_cita");
                registro[3] = rs.getString("hora_cita");
                registro[4] = rs.getString("minuto_cita");
                registro[5] = rs.getString("servicios");
                filas[0] = "" + registro[0] + " " + registro[1];
                filas[1] = registro[2];
                filas[2] = registro[3] + ":" + registro[4];
                filas[3] = registro[5];
                modelo.addRow(filas);
                System.out.println("Mostrando en tabla " + registro[0] + " " + registro[1] + " " + registro[2] + ""
                        + registro[3] + " " + registro[4] + " " + registro[5]);
            }
            jTablaCitas.setModel(modelo);
        } catch (SQLException ex) {
            Logger.getLogger(frmCitas.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnBuscarcitasxfechaActionPerformed

    private void btnBuscarhistorialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarhistorialActionPerformed
        try {
            String nombre = txtNombres.getText();
            String apellido = txtApellidos.getText();
            String telefono = txtTelefono.getText();
            conectar cc = new conectar();
            Connection cn = cc.conexion();
            String[] titulos = new String[3];
            titulos[0] = "Fecha";
            titulos[1] = "Hora";
            titulos[2] = "Servicios";
            String sql = "select "
                    + "hora_cita,minuto_cita,servicios,fecha_cita from citas where nombres_pac= '" + nombre + "'"
                    + " and apellidos_pac= '" + apellido + "' and telefono_paciente_cita='" + telefono + "'";
            System.out.println("" + sql);
            DefaultTableModel modelo = new DefaultTableModel(null, titulos);
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            String[] filas = new String[3];
            String[] registro = new String[4];

            while (rs.next()) {

                registro[0] = rs.getString("hora_cita");
                registro[1] = rs.getString("minuto_cita");
                registro[2] = rs.getString("servicios");
                registro[3] = "" + rs.getDate("fecha_cita");

                filas[0] = registro[3];
                filas[1] = registro[0] + ":" + registro[1];
                filas[2] = registro[2];

                modelo.addRow(filas);

            }
            jTablaCitas.setModel(modelo);
        } catch (SQLException ex) {
            Logger.getLogger(frmCitas.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnBuscarhistorialActionPerformed
    /**
     *
     * Metodo que no deja ingresar otro tipo de datos diferentes a numero en un
     * campo de texto
     *
     * @param a Toma del JTextField los datos y valida que sean solo numeros
     */
    public void SNumeros(JTextField a) {
        a.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();
                if (!Character.isDigit(c)) {
                    getToolkit().beep();
                    e.consume();
                }
            }
        });
    }

    /**
     *
     *
     * Metodo que no deja ingresar otro tipo de datos diferentes a letras en un
     * campo de texto
     *
     * @param a Toma del JTextField los datos y valida que sean solo letras
     */
    public void SLetras(JTextField a) {
        a.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();
                if (Character.isDigit(c)) {
                    getToolkit().beep();
                    e.consume();
                }
            }
        });
    }

    /**
     *
     * Funcion que se encarga de obtener la fecha actual del sistema y
     * retornarla
     *
     * @return la fecha actual en el formatoFecha(dd/MM/YYYY)
     */
    public static String fechaActual() {
        Date fecha = new Date();
        DateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println("Fecha actual : " + formatoFecha.format(fecha));
        String dia, mes, anio, fecha2;

        Calendar c1 = Calendar.getInstance();
        dia = Integer.toString(c1.get(Calendar.DATE));
        mes = Integer.toString(c1.get(Calendar.MONTH));
        anio = Integer.toString(c1.get(Calendar.YEAR));

        return formatoFecha.format(fecha);
    }

    /*
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscarcitas;
    private javax.swing.JButton btnBuscarcitasxfecha;
    private javax.swing.JButton btnBuscarhistorial;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable jTablaCitas;
    private javax.swing.JTextArea jTextArea1;
    private com.toedter.calendar.JCalendar jcalendario;
    public javax.swing.JComboBox jcbodontologo;
    private javax.swing.JComboBox jcmbHora;
    private javax.swing.JComboBox jcmbMinutos;
    private javax.swing.JTextArea jtAObservacion;
    private javax.swing.JLabel lbl9;
    private javax.swing.JTextField txtApellidos;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtNombres;
    private javax.swing.JTextField txtServicios;
    private javax.swing.JTextField txtTelefono;
    private java.util.List<formularios.Usuarios> usuariosList;
    // End of variables declaration//GEN-END:variables
*/
    private javax.swing.JButton btnBuscarcitas;
    private javax.swing.JButton btnBuscarcitasxfecha;
    private javax.swing.JButton btnBuscarhistorial;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTablaCitas;
    private com.toedter.calendar.JCalendar jcalendario;
    public javax.swing.JComboBox jcbodontologo;
    private javax.swing.JComboBox jcmbHora;
    private javax.swing.JComboBox jcmbMinutos;
    private javax.swing.JTextArea jtAObservacion;
    private javax.swing.JLabel lbl9;
    private javax.swing.JTextField txtApellidos;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtNombres;
    private javax.swing.JTextField txtServicios;
    private javax.swing.JTextField txtTelefono;

    private void limpiar() {
        txtId.setText("");
        txtNombres.setText("");
        txtApellidos.setText("");
        txtTelefono.setText("");
        jcalendario.setDate(jcalendario.getDate());
        jcmbHora.setSelectedIndex(0);
        jcmbMinutos.setSelectedIndex(0);
        jcbodontologo.setSelectedIndex(0);
        txtServicios.setText("");
        jtAObservacion.setText("");
        txtId.setEnabled(true);
        txtNombres.setEnabled(true);
        txtApellidos.setEnabled(true);
        txtTelefono.setEnabled(true);
    }

    private void inhabilitar(JTextField campo) {
        campo.setEnabled(false);
    }

    /**
     * metodo que devuelve el ultimo codigo mas 1 para un nuevo registro
     * @return el ultimo codigo mas uno que obtiene de la base de datos
     */
    private int Nuevo_Codigo() {
        conectar cc = new conectar();
        Connection cn = cc.conexion();
        String sql = "";
        String registro[] = new String[1];
        String numerocodigo = "";

        try {
            sql = "SELECT * FROM citas ORDER BY id_cita ASC";
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                registro[0] = rs.getString("id_cita");
            }
        } catch (SQLException ex) {
            Logger.getLogger(frmCitas.class.getName()).log(Level.SEVERE, null, ex);
        }
        numerocodigo = registro[0];
        int possig = 0;
        if (numerocodigo == null) {
            numerocodigo = "0";
        }
        possig = Integer.parseInt(numerocodigo) + 1;
        return possig;
    }

    /**
     * metodo que inicia la tabla de citas
     */
    public void iniciar_tabla() {

        try {
            conectar cc = new conectar();
            Connection cn = cc.conexion();
            String[] titulos = new String[4];
            titulos[0] = "Paciente";
            titulos[1] = "Hora";
            titulos[2] = "Minutos";
            titulos[3] = "Servicios";
            DateFormat df = DateFormat.getDateInstance();
            String fecha = df.format(jcalendario.getDate());
            String sql = "select nombres_pac,apellidos_pac,hora_cita,minuto_cita,servicios from citas where fecha_cita= '" + fecha + "'";
            System.out.println("" + sql);
            DefaultTableModel modelo = new DefaultTableModel(null, titulos);
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            String[] filas = new String[4];
            String[] registro = new String[5];

            while (rs.next()) {
                registro[0] = rs.getString("nombres_pac");
                registro[1] = rs.getString("apellidos_pac");
                registro[2] = rs.getString("hora_cita");
                registro[3] = rs.getString("minuto_cita");
                registro[4] = rs.getString("servicios");

                filas[0] = "" + registro[0] + " " + registro[1];
                filas[1] = registro[2];
                filas[2] = registro[3];
                filas[3] = registro[4];
                modelo.addRow(filas);

                System.out.println("Mostrando en tabla " + registro[0] + " " + registro[1] + " " + registro[2] + ""
                        + registro[3] + " " + registro[4]);

            }
            jTablaCitas.setModel(modelo);
        } catch (SQLException ex) {
            Logger.getLogger(frmCitas.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * metodo que carga en una lista desplegable los odontólogos registrados
     */
    public void cargar_odontologos() {
        try {
            conectar cc = new conectar();
            Connection cn = cc.conexion();
            String nombre, pape, sape;
            String odont;

            ResultSet rs;
            String sql = "select nombre_usuario,p_apellido_usuario,s_apellido_usuario from usuarios "
                    + "where cargo_usuario='Odontólogo'";
            java.sql.PreparedStatement pst = cn.prepareStatement(sql);

            rs = pst.executeQuery();
            while (rs.next()) {
                try {
                    nombre = rs.getString("nombre_usuario");
                    pape = rs.getString("p_apellido_usuario");
                    sape = rs.getString("s_apellido_usuario");
                    System.out.println(nombre + " " + pape + " " + sape);
                    odont = nombre + " " + pape + " " + sape;
                    odontologos.add(odont);

                } catch (SQLException ex) {
                    //Logger.getLogger(frmMatcons.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            for (int i = 0; i < odontologos.size(); i++) {
                if (odontologos.get(i) != null) {
                    jcbodontologo.addItem(odontologos.get(i));
                } else {
                    return;
                }
            }
        } catch (SQLException ex) {
//            Logger.getLogger(frmMatcons.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

/**
 * metodo que verifica la disponibilidad  de la cita de un odontólogo
 * @return false si el odontológo tiene cita, a esa hora y  ese día 
 */   
    public boolean disponibilidad_odont() {
        int cont = 0;
        try {
            conectar cc = new conectar();
            Connection cn = cc.conexion();
            Date fecha2 = jcalendario.getDate();
            java.sql.Date sqlf1;
            sqlf1 = new java.sql.Date(fecha2.getTime());

            ResultSet rs;
            String sql = "select fecha_cita,hora_cita,minuto_cita from citas "
                    + "where fecha_cita=? and odontologo_cita=? and minuto_cita=? and hora_cita=?";

            java.sql.PreparedStatement pst = cn.prepareStatement(sql);
            pst.setDate(1, sqlf1);
            pst.setString(2, (String) jcbodontologo.getSelectedItem());
            pst.setString(3, (String) jcmbMinutos.getSelectedItem());
            pst.setString(4, (String) jcmbHora.getSelectedItem());

            rs = pst.executeQuery();

            while (rs.next()) {
                cont = cont + 1;
            }

        } catch (SQLException ex) {
//            Logger.getLogger(frmMatcons.class.getName()).log(Level.SEVERE, null, ex);
        }
        if (cont != 0) {
            return false;
        } else {
            return true;
        }
    }

/**
 * a partir de todos esos datos por parametros, identifica la ultima cita 
 * y obtiene el id_cita, para modificar esa fecha de esa cita, y no todas
 * @param id
 * @param nombres
 * @param apellidos
 * @param telefono
 * @param fecha2
 * @return el id de la cita a modificar
 * @throws SQLException 
 */
    private String Obtener_idcita(String id, String nombres, String apellidos, String telefono, Date fecha2) throws SQLException {
        conectar cc = new conectar();
        Connection cn = cc.conexion();
        String sql = "select id_cita from citas where id_pac_cita=? and nombres_pac=?"
                + " and apellidos_pac=? and telefono_paciente_cita=?"
                + " and fecha_cita=?";
        java.sql.Date sqlf1;
        sqlf1 = new java.sql.Date(fecha2.getTime());
        ResultSet rs;
        java.sql.PreparedStatement pst = cn.prepareStatement(sql);
        pst.setString(1, id);
        pst.setString(2, nombres);
        pst.setString(3, apellidos);
        pst.setString(4, telefono);
        pst.setDate(5, sqlf1);
        System.out.println("Sentencia en metodo obtener_idcita: " + pst);
        rs = pst.executeQuery();
        String id_cita = "";
        while (rs.next()) {
            id_cita = rs.getString("id_cita");
        }
        System.out.println("El metodo obtener cita retorno :" + id_cita);
        return id_cita;
    }

}
