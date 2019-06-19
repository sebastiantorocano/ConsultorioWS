/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formularios;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import javax.swing.JDialog;
import javax.swing.JOptionPane;

/**
 *
 * @author GALEANO
 */
public class PrincipalAdministradora extends javax.swing.JFrame {

    /**
     * Creates new form PrincipalOdontologo
     */
    public PrincipalAdministradora() {
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

        btnacercade = new javax.swing.JButton();
        btnayuda = new javax.swing.JButton();
        btnsalir = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnusuarios1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnacercade.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/contactos.png"))); // NOI18N
        btnacercade.setText("Acerca de");
        btnacercade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnacercadeActionPerformed(evt);
            }
        });

        btnayuda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ayuda1.png"))); // NOI18N
        btnayuda.setText("Ayuda");
        btnayuda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnayudaActionPerformed(evt);
            }
        });

        btnsalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/salir.png"))); // NOI18N
        btnsalir.setText("Salir");
        btnsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsalirActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logo2.png"))); // NOI18N

        btnusuarios1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/usuario.png"))); // NOI18N
        btnusuarios1.setText("Usuarios");
        btnusuarios1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnusuarios1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnayuda, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnacercade, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnsalir, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(84, 84, 84)
                    .addComponent(btnusuarios1, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(123, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(116, 116, 116)
                .addComponent(btnacercade, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnayuda, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnsalir, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(251, 251, 251)
                    .addComponent(btnusuarios1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(282, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnacercadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnacercadeActionPerformed
        // TODO add your handling code here:
        acerca_de acerca = new acerca_de();
        acerca.setVisible(true);
    }//GEN-LAST:event_btnacercadeActionPerformed

    private void btnayudaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnayudaActionPerformed
        // TODO add your handling code here:
        String opcion = JOptionPane.showInputDialog("Digite 1 si desea ver el manual de usuario, 2 si desea ver el manual del sistema");
        if (opcion.equalsIgnoreCase("1")) {
            try {
                File path = new File("C:/Users/Usuario/Documents/2016-1/Implantar/OrthoGarcia/Orthogarcia 02052016/OrthoGarcia08Diciembre/Manual-de-usuario-orthogarcia.docx");
                Desktop.getDesktop().open(path);
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
       else if (opcion.equalsIgnoreCase("2")) {
            try {
                File path = new File("C:/Users/Usuario/Documents/2016-1/Implantar/OrthoGarcia/Orthogarcia 02052016/OrthoGarcia08Diciembre/MANUAL TÉCNICO  DEL SOFTWARE ORTHOGARCIA.docx");
                Desktop.getDesktop().open(path);
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }else{
       JOptionPane.showMessageDialog(rootPane, "Opción Incorrecta");
       }
    }//GEN-LAST:event_btnayudaActionPerformed

    private void btnsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsalirActionPerformed
        // TODO add your handling code here:
        int rta = JOptionPane.showConfirmDialog(rootPane, "¿Estas seguro que deseas salir?");
        if (rta != 0) {
            return;
        }
        frmIngresar ingresar = new frmIngresar();
        ingresar.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnsalirActionPerformed

    private void btnusuarios1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnusuarios1ActionPerformed
        // TODO add your handling code here:
        frmUsuarios usuario = new frmUsuarios();
        usuario.setVisible(true);
    }//GEN-LAST:event_btnusuarios1ActionPerformed

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
            java.util.logging.Logger.getLogger(PrincipalAdministradora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PrincipalAdministradora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PrincipalAdministradora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PrincipalAdministradora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PrincipalAdministradora().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnacercade;
    private javax.swing.JButton btnayuda;
    private javax.swing.JButton btnsalir;
    private javax.swing.JButton btnusuarios1;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}