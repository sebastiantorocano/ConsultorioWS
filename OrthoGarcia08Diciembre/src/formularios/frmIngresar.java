package formularios;

import Clases.Panel;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 * Contiene metodos para el ingreso al menu de la aplicación
 *
 * @author Sebastian Galenano Bolivar
 * @author Sebastian Toro Cano
 * @version 1
 */
public class frmIngresar extends javax.swing.JFrame {
    public static String ced_usuario="";
    /**
     * Creación nuevo formulario, frmIngresar
     */
    public frmIngresar() {
        initComponents();
        add(new Panel());
        SNumeros(txtcedula);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnIngresar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnIngresar1 = new javax.swing.JButton();
        lblusuario = new javax.swing.JLabel();
        lblcontrasena = new javax.swing.JLabel();
        txtcontrasena = new javax.swing.JPasswordField();
        txtcedula = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/doctor.png"))); // NOI18N

        btnIngresar.setText("Ingresar");
        btnIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setText("Bienvenido");

        btnIngresar1.setText("Salir");
        btnIngresar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresar1ActionPerformed(evt);
            }
        });

        lblusuario.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblusuario.setText("Cédula");

        lblcontrasena.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblcontrasena.setText("Contraseña");

        txtcontrasena.setToolTipText("Contraseña");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(47, 47, 47)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblusuario)
                                    .addComponent(lblcontrasena))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtcedula, javax.swing.GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE)
                                    .addComponent(txtcontrasena))
                                .addGap(60, 60, 60))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(112, 112, 112)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jLabel3))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addComponent(btnIngresar, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 118, Short.MAX_VALUE)
                .addComponent(btnIngresar1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblusuario)
                            .addComponent(txtcedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtcontrasena, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblcontrasena))
                        .addGap(30, 30, 30))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(160, Short.MAX_VALUE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 161, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnIngresar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnIngresar1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarActionPerformed

        /**
         * Se crea una instancia de la clase conectar llamado cc se crea una
         * instancia de la clase connection llamada cn y se le concatena la
         * instancia cc
         */
        conectar cc = new conectar();
        Connection cn = cc.conexion();
        String sql = "";
        String registro[] = new String[8];
        String pass = "";
        ced_usuario=""+txtcedula.getText();
        /**
         * Opción que busca la información en la base de datos correspondiente a
         * lo ingresado en los campos de la ventana de login
         */
        try {
            sql =" SELECT * FROM usuarios WHERE cedula_usuario='" +txtcedula.getText()+"' AND  contrasena='"+ txtcontrasena.getText()+"'"
                    + " AND estado='"+1+"'";
           
            System.out.println(" sentencia " + sql + " con pass " + txtcontrasena.getText());
            System.out.println("En ced_usuario hay para citas "+ced_usuario);
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            //System.out.println(""+txtcontrasena.getPassword());
            while (rs.next()) {
                registro[0] = rs.getString("cedula_usuario");
                registro[1] = rs.getString("nombre_usuario");
                registro[2] = rs.getString("p_apellido_usuario");
                registro[3] = rs.getString("s_apellido_usuario");
                registro[4] = rs.getString("cargo_usuario");
                registro[5] = rs.getString("especialidad_usuario");
                registro[6] = rs.getString("contrasena");
               

            }
            System.out.println("en los registros hay " + registro[0] + " " + registro[1] + " " + registro[2] + " " + registro[3]);
           
            if ((txtcedula.getText().equals(registro[0])) && (txtcontrasena.getText().equals(registro[6]))) {
                
                if (registro[4].equals("Auxiliar")) {
                 /*   frmPrincipalOrtho miPrincipal = new frmPrincipalOrtho();
                    this.setVisible(false);
                    miPrincipal.setExtendedState(JFrame.MAXIMIZED_BOTH);
                    miPrincipal.setVisible(true);
                    JOptionPane.showMessageDialog(rootPane, "Bienvenid@: "+registro[1]);
                    */
                       PrincipalAuxiliar auxiliar = new PrincipalAuxiliar();
                    this.setVisible(false);
                    auxiliar.setVisible(true);
                    JOptionPane.showMessageDialog(rootPane, "Bienvenid@: "+registro[1]);
                }

                if (registro[4].equals("Odontólogo")) {
                    
                   /* frmPrincipalOdontologo miPrincipalOdonto = new frmPrincipalOdontologo();
                    this.setVisible(false);
                    miPrincipalOdonto.setExtendedState(JFrame.MAXIMIZED_BOTH);
                    miPrincipalOdonto.setVisible(true);
                    JOptionPane.showMessageDialog(rootPane, "Bienvenid@: "+registro[1]);*/
                    PrincipalOdontologo odontologo = new PrincipalOdontologo();
                    this.setVisible(false);
                    odontologo.setVisible(true);
                    JOptionPane.showMessageDialog(rootPane, "Bienvenid@: "+registro[1]);
                }



                if (registro[4].equals("Administrador")) {
                   /* frmPrincipalAdmin miPrincipalAdmin = new frmPrincipalAdmin();
                    this.setVisible(false);
                    miPrincipalAdmin.setExtendedState(JFrame.MAXIMIZED_BOTH);
                    miPrincipalAdmin.setVisible(true);
                    JOptionPane.showMessageDialog(rootPane, "Bienvenid@: "+registro[1]);
                    */
                    
                    PrincipalAdministradora administradora = new PrincipalAdministradora();
                    this.setVisible(false);
                    administradora.setVisible(true);
                    JOptionPane.showMessageDialog(rootPane, "Bienvenid@: "+registro[1]);
                }
                 ced_usuario=""+txtcedula.getText();
            } else {
                JOptionPane.showMessageDialog(null, "Error, por favor asegurese de que el usuario este activo,tambien de que el usuario y/o contraseña"
                        + "sean correctos");
            }

        } catch (SQLException ex) {
            Logger.getLogger(frmIngresar.class.getName()).log(Level.SEVERE, null, ex);

        }

    }//GEN-LAST:event_btnIngresarActionPerformed

    private void btnIngresar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresar1ActionPerformed
        ced_usuario=""+txtcedula.getText();
        this.setVisible(false);
        this.dispose();
    }//GEN-LAST:event_btnIngresar1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(frmIngresar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmIngresar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmIngresar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmIngresar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmIngresar().setVisible(true);
            }
        });
    }
    
    public static String obtener_usuario(){
        System.out.println("Ingreso al metodo obtener_usuario y retorno "+ced_usuario);
        return ced_usuario;
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnIngresar;
    private javax.swing.JButton btnIngresar1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel lblcontrasena;
    private javax.swing.JLabel lblusuario;
    public static javax.swing.JTextField txtcedula;
    private javax.swing.JPasswordField txtcontrasena;
    // End of variables declaration//GEN-END:variables

private void SLetras(JTextField a) {
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
     * Metodo que no deja ingresar otro tipo de datos diferentes a numero en un
     * campo de texto
     *
     */
    private void SNumeros(JTextField a) {
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
}
