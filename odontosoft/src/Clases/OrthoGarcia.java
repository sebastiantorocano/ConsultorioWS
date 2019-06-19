/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import formularios.frmIngresar;
//import formularios.frmProveedores;

/**
 *
 * @author Sebastian Toro Cano
 * @author Sebastian Galeano Bolivar
 * @version 1
 */
public class OrthoGarcia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
           java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmIngresar().setVisible(true);
            }
        });
        // TODO code application logic here
    }
}

