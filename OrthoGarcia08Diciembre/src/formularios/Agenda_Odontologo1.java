/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formularios;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author USUARIO
 */
public class Agenda_Odontologo1 extends javax.swing.JFrame {

    //declaracion de las tablas 
    DefaultTableModel modeloAgenda;
    DefaultTableModel modeloMes;
    /**
     * Creates new form Agenda_Odontologo
     */

    DateFormat df = DateFormat.getDateInstance();

    public Agenda_Odontologo1() {
        initComponents();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        JtablaAgenda = new javax.swing.JTable();
        jDateFecha_Agenda = new com.toedter.calendar.JDateChooser();
        BtnBuscar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        JtablaAgenda1 = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jcbMes = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        txtAño = new javax.swing.JTextField();

        jLabel2.setText("Bienvenido a su agenda.");

        jLabel1.setText("Seleccione el dìa para ver las citas asignadas.");

        JtablaAgenda.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Identificaciòn  paciente", "Nombre y apellidos paciente", "Hora Cita", "Servicio"
            }
        ));
        jScrollPane1.setViewportView(JtablaAgenda);

        BtnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/buscar.png"))); // NOI18N
        BtnBuscar.setText("Buscar");
        BtnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnBuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addGap(18, 18, 18))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(68, 68, 68)
                                .addComponent(jDateFecha_Agenda, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addComponent(BtnBuscar))
                            .addComponent(jLabel2))
                        .addContainerGap(176, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BtnBuscar)
                    .addComponent(jLabel1)
                    .addComponent(jDateFecha_Agenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(59, 59, 59)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(191, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Citas Por Dìa", jPanel1);

        JtablaAgenda1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Fecha", "Identificaciòn  paciente", "Nombre y apellidos paciente", "Hora Cita", "Servicio"
            }
        ));
        jScrollPane2.setViewportView(JtablaAgenda1);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Citas Mensuales");

        jcbMes.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" }));

        jLabel4.setText("Seleccione el mes");

        jButton2.setText("Buscar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel5.setText("Ingrese el año");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 764, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(63, 63, 63)
                .addComponent(jLabel4)
                .addGap(35, 35, 35)
                .addComponent(jcbMes, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addComponent(txtAño, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jcbMes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jButton2)
                    .addComponent(jLabel5)
                    .addComponent(txtAño, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(237, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Citas Por Mes", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 797, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnBuscarActionPerformed

        //obtener la fecha seleccionada del calendario
        Date fecha2 = jDateFecha_Agenda.getDate();

        if (fecha2 == null) {
            JOptionPane.showMessageDialog(rootPane, "Debe seleccionar una fecha");
        } else {

            java.sql.Date fecha_B;
            fecha_B = new java.sql.Date(fecha2.getTime());

            String nombreo = "";

            nombreo = nombreOdontologo();

            //iniciar la tabla de la cita por dia
            IniciarTabla(nombreo, fecha_B);

        }
    }//GEN-LAST:event_BtnBuscarActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        String mes = (String) jcbMes.getSelectedItem();
        String año = txtAño.getText();
        String nombreOdontologo = nombreOdontologo();

        if (año.equals("")) {
            JOptionPane.showMessageDialog(rootPane, "Debe digitar un año");
            return;
        }
        IniciarTablaMes(Integer.parseInt(mes), Integer.parseInt(año), nombreOdontologo);
    }//GEN-LAST:event_jButton2ActionPerformed

    public String nombreOdontologo() {
        String nombre_Odontologo = "";

        try {
            conectar cc = new conectar();
            Connection cn = cc.conexion();

            String cedula_odontologo = frmIngresar.txtcedula.getText();
            String nombreU = null, p_apellidoU = null, s_apellidou = null;

            String sql = "select nombre_usuario,p_apellido_usuario,s_apellido_usuario from usuarios where cedula_usuario='" + cedula_odontologo + "'";

            Statement st = cn.createStatement();
            System.out.println(sql);
            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {

                nombreU = rs.getString("nombre_usuario");
                p_apellidoU = rs.getString("p_apellido_usuario");
                s_apellidou = rs.getString("s_apellido_usuario");

            }
            nombre_Odontologo = nombreU + " " + p_apellidoU + " " + s_apellidou;

        } catch (SQLException ex) {
            Logger.getLogger(Agenda_Odontologo1.class.getName()).log(Level.SEVERE, null, ex);
        }
        return nombre_Odontologo;

    }

    /**
     * inicia tabla de busqueda de cita por día
     *
     * @param nombre_Odontologo para buscar el día por el nombre del odontólogo
     * que inició sesión
     * @param fecha_B fecha seleccionada del calendario
     */
    public void IniciarTabla(String nombre_Odontologo, Date fecha_B) {
        String nombre_completo = "";
        String Hora_minuto = "";
        String[] registro = new String[4];

        String[] Titulos = new String[4];
        Titulos[0] = "Identificación paciente";
        Titulos[1] = "Nombres y apellidos paciente";
        Titulos[2] = "Hora Cita";
        Titulos[3] = "Servicio";

        modeloAgenda = new DefaultTableModel(null, Titulos);
        try {
            conectar cc = new conectar();
            Connection cn = cc.conexion();

            String sql2 = "select id_pac_cita,nombres_pac,apellidos_pac,hora_cita,"
                    + "minuto_cita,servicios from citas where odontologo_cita='" + nombre_Odontologo + "'" + "and fecha_cita='" + fecha_B + "'";

            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql2);

            while (rs.next()) {
                registro[0] = rs.getString("id_pac_cita");
                nombre_completo = rs.getString("nombres_pac") + " " + rs.getString("apellidos_pac");
                registro[1] = nombre_completo;
                Hora_minuto = rs.getString("hora_cita") + " :" + rs.getString("minuto_cita");
                registro[2] = Hora_minuto;
                registro[3] = rs.getString("servicios");

                modeloAgenda.addRow(registro);
            }

            JtablaAgenda.setModel(modeloAgenda);

        } catch (SQLException ex) {
            Logger.getLogger(Agenda_Odontologo1.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    /**
     * inicia tabla de busqueda de cita por día
     *
     * @param mes para buscar las citas por el mes seleccionado que inició
     * sesión
     * @param nombreOdontologo para buscar las citas del mes del odontólogo que
     * inició sesión
     * @param año el año de la cita
     */
    public void IniciarTablaMes(int mes, int año, String nombreOdontologo) {
        String nombre_completo = "";
        String Hora_minuto = "";
        String[] registro = new String[5];

        String[] Titulos = new String[5];
        Titulos[0] = "Fecha";
        Titulos[1] = "Identificación paciente";
        Titulos[2] = "Nombres y apellidos paciente";
        Titulos[3] = "Hora Cita";
        Titulos[4] = "Servicio";

        modeloMes = new DefaultTableModel(null, Titulos);
        DateFormat df = DateFormat.getDateInstance();

        try {
            conectar cc = new conectar();
            Connection cn = cc.conexion();

            String sql2 = "select fecha_cita,id_pac_cita,nombres_pac,apellidos_pac,hora_cita,"
                    + "minuto_cita,servicios from citas where month(fecha_cita)=" + mes + " and year(fecha_cita)=" + año + " and odontologo_cita='" + nombreOdontologo + "'";

            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql2);

            while (rs.next()) {
                registro[0] = df.format(rs.getDate("fecha_cita"));
                registro[1] = rs.getString("id_pac_cita");
                nombre_completo = rs.getString("nombres_pac") + " " + rs.getString("apellidos_pac");
                registro[2] = nombre_completo;
                Hora_minuto = rs.getString("hora_cita") + " :" + rs.getString("minuto_cita");
                registro[3] = Hora_minuto;
                registro[4] = rs.getString("servicios");

               
                    modeloMes.addRow(registro);
                
            }
            if(nombre_completo.equals("")){
               JOptionPane.showMessageDialog(rootPane, "Usted no tiene cita asignada en el mes seleccionado");
               }
           

            JtablaAgenda1.setModel(modeloMes);
            

        } catch (SQLException ex) {
            Logger.getLogger(Agenda_Odontologo1.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnBuscar;
    private javax.swing.JTable JtablaAgenda;
    private javax.swing.JTable JtablaAgenda1;
    private javax.swing.JButton jButton2;
    private com.toedter.calendar.JDateChooser jDateFecha_Agenda;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JComboBox jcbMes;
    private javax.swing.JTextField txtAño;
    // End of variables declaration//GEN-END:variables

    private void setClosable(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void setIconifiable(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void setMaximizable(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}