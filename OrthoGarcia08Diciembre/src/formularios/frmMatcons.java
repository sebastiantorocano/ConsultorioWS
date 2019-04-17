package formularios;

import groovy.inspect.swingui.TableSorter;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import javax.swing.text.TableView;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author Sebastian Galeano Bolivar
 * @author Sebastian Toro Cano
 * @version 1
 */
public class frmMatcons extends javax.swing.JFrame {

    String cedula_usuario = frmIngresar.obtener_usuario();
    DefaultTableModel modelo;
    ArrayList<String> codigos_materiales = new ArrayList<String>();
    public TableRowSorter tsrfiltro;

    /**
     * Creacion nuevo formulario frmMatcons
     */
    public frmMatcons() {
        initComponents();
        Limpiar();
        iniciar_tabla();
        jcmbProveedores.setEnabled(true);

        cargar_proveedores();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFrame1 = new javax.swing.JFrame();
        jFrame2 = new javax.swing.JFrame();
        jFrame3 = new javax.swing.JFrame();
        lblnombre = new javax.swing.JLabel();
        lblnomcomercial = new javax.swing.JLabel();
        lblgeneralidades = new javax.swing.JLabel();
        lblmatsconsul = new javax.swing.JLabel();
        txtnombre = new javax.swing.JTextField();
        txtcantidad = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        btnGuardar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        jbreporte = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jcmbProveedores = new javax.swing.JComboBox();
        jLabel8 = new javax.swing.JLabel();

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jFrame2Layout = new javax.swing.GroupLayout(jFrame2.getContentPane());
        jFrame2.getContentPane().setLayout(jFrame2Layout);
        jFrame2Layout.setHorizontalGroup(
            jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame2Layout.setVerticalGroup(
            jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jFrame3Layout = new javax.swing.GroupLayout(jFrame3.getContentPane());
        jFrame3.getContentPane().setLayout(jFrame3Layout);
        jFrame3Layout.setHorizontalGroup(
            jFrame3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame3Layout.setVerticalGroup(
            jFrame3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        lblnombre.setText("* Nombre");
        lblnombre.setToolTipText("Nombre del producto");

        lblnomcomercial.setText("* Cantidad");
        lblnomcomercial.setToolTipText("Nombre comercial del producto");

        lblgeneralidades.setText("* Nombre Proveedor");
        lblgeneralidades.setToolTipText("Generalidades del producto");

        lblmatsconsul.setText("Materiales de consultorio");

        txtnombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtnombreKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtnombreKeyTyped(evt);
            }
        });

        txtcantidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcantidadActionPerformed(evt);
            }
        });
        txtcantidad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtcantidadKeyPressed(evt);
            }
        });

        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/guardar.png"))); // NOI18N
        btnGuardar.setText("Guardar");
        btnGuardar.setToolTipText("Guardar material de consultorio");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/modificar.png"))); // NOI18N
        btnModificar.setText("Modificar");
        btnModificar.setToolTipText("Modificar material de consultorio");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/borrar.png"))); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.setToolTipText("Eliminar material de consultorio");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/buscar.png"))); // NOI18N
        btnBuscar.setText("Consultar");
        btnBuscar.setToolTipText("Buscar material de consultorio");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
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

        jbreporte.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/nuevo.png"))); // NOI18N
        jbreporte.setText("Reporte");
        jbreporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbreporteActionPerformed(evt);
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
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnGuardar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnModificar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnEliminar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnBuscar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(btnCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbreporte, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(btnGuardar)
                .addGap(18, 18, 18)
                .addComponent(btnModificar)
                .addGap(18, 18, 18)
                .addComponent(btnEliminar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnBuscar)
                .addGap(18, 18, 18)
                .addComponent(btnCancelar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addComponent(jbreporte, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jcmbProveedores.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccione un proveedor." }));

        jLabel8.setText("Todos los campos marcados con (*) son obligatorios.");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblmatsconsul)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblgeneralidades)
                            .addComponent(lblnomcomercial)
                            .addComponent(lblnombre))
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtnombre)
                            .addComponent(txtcantidad)
                            .addComponent(jcmbProveedores, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(41, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblmatsconsul)
                        .addGap(73, 73, 73)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblnombre, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtnombre, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblgeneralidades, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jcmbProveedores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblnomcomercial)
                            .addComponent(txtcantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(75, 75, 75)
                        .addComponent(jLabel8))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed

        /*
         * Valida que cada uno de los campos no este vacio
         */
       // if (buscarMaterial() == true) {
        //   JOptionPane.showMessageDialog(rootPane, "Existe un material de consultorio con esa referencia, por favor cambiarlo");
        // return;
        //}
        String nombre_pr = (String) jcmbProveedores.getSelectedItem();
        if (txtnombre.getText().equals("")) {
            JOptionPane.showMessageDialog(rootPane, "Debe digitar el nombre del producto");
            txtnombre.requestFocusInWindow();
            return;
        }

        if (nombre_pr.equals("Seleccione un proveedor.")) {
            JOptionPane.showMessageDialog(rootPane, "Debe seleccionar el proveedor del producto");
            jcmbProveedores.requestFocusInWindow();
            return;
        }

        if (txtcantidad.getText().equals("")) {
            JOptionPane.showMessageDialog(rootPane, "Debe digitar la cantidad que hay del producto");
            txtcantidad.requestFocusInWindow();
            return;
        }

        //Validaciones del limite de caracteres
        if (txtnombre.getText().length() > 20) {
            JOptionPane.showMessageDialog(rootPane, "El limite de caracteres del campo nombre es 20");
            return;
        }

        /*
         if (txtnombreproveedor.getText().length() > 50) {
         JOptionPane.showMessageDialog(rootPane, "El limite de caracteres del campo proveedor es 50");
         return;
         }
         */
        if (txtcantidad.getText().length() > 10) {
            JOptionPane.showMessageDialog(rootPane, "El limite de caracteres del campo cantidad es 20");
            return;
        }

        SLetras(txtnombre);
//        SLetras(txtnombreproveedor);
        SNumeros(txtcantidad);
//        SLetras(txtobservaciones);

        conectar cc = new conectar(); //Se crea una instancia de la clase conectar
        Connection cn = cc.conexion(); //se crea una instancia de la clase Connection y se concatena el objeto cc
        String codigo_material, nombre, nombre_proveedor, cantidad, usuario, codigo_proveedor = null, siguiente;
        String sql = "";
        String sql2 = "";
        String sql3 = "";

        nombre = txtnombre.getText();
        nombre_proveedor = (String) jcmbProveedores.getSelectedItem();
        cantidad = txtcantidad.getText();
        usuario = frmIngresar.txtcedula.getText();
        siguiente = Integer.toString(Nuevo_Codigo());

        sql = "INSERT INTO materiales_consultorio(id_matcon,nombre_matcon,id_usuario_matcon) VALUES (?,?,?)";

        try {

            PreparedStatement st = cn.prepareStatement(sql);
            st.setString(1, siguiente);
            st.setString(2, nombre);
            st.setString(3, usuario);

            int R = st.executeUpdate();
            if (R > 0) {
                JOptionPane.showMessageDialog(null, "Material de consultorio guardado con éxito");

                Limpiar();
            }

        } catch (SQLException ex) {
            Logger.getLogger(frmMatcons.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            sql2 = "SELECT id_proveedor FROM proveedores Where nombre_proveedor= '" + nombre_proveedor + "'";
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql2);

            while (rs.next()) {
                codigo_proveedor = rs.getString("id_proveedor");

            }

        } catch (Exception e) {
        }

        sql3 = "INSERT INTO proveedor_materiales (id_proveedor_pm,id_mat_pm,cantidad_inventario) VALUES (?,?,?)";

        try {

            PreparedStatement st = cn.prepareStatement(sql3);
            st.setString(1, codigo_proveedor);
            st.setString(2, siguiente);
            st.setString(3, cantidad);

            int R = st.executeUpdate();
            if (R > 0) {
                JOptionPane.showMessageDialog(null, "Material de consultorio guardado con éxito en intersección");

                Limpiar();
            }

        } catch (SQLException ex) {
            Logger.getLogger(frmMatcons.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed

        conectar cc = new conectar(); //Se crea una instancia de la clase conectar
        Connection cn = cc.conexion(); //se crea una instancia de la clase Connection y se concatena el objeto cc
        String codigo_material = null, nombre, proveedor, cantidad, usuario = null, codigo_proveedor = null;
        String sql = "";
        String sql2 = "";
        String sql3 = "";

//        SLetras(txtnombreproveedor);
        SLetras(txtnombre);
        SNumeros(txtcantidad);

        nombre = txtnombre.getText();
        proveedor = (String) jcmbProveedores.getSelectedItem();
        cantidad = txtcantidad.getText();

        usuario = frmIngresar.txtcedula.getText();

        int rta = JOptionPane.showConfirmDialog(rootPane, "¿Esta seguro de modificar la información?");
        if (rta != 0) {
            return;
        }

        try {
            sql2 = "SELECT id_matcon FROM materiales_consultorio Where nombre_matcon= '" + txtnombre.getText() + "'";
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql2);

            while (rs.next()) {
                codigo_material = rs.getString("id_matcon");
            }

        } catch (Exception e) {
        }

        try {
            PreparedStatement pst = cn.prepareStatement(" UPDATE materiales_consultorio "
                    + "SET nombre_matcon='" + txtnombre.getText()
                    + "', id_usuario_matcon='" + cedula_usuario
                    + "'  WHERE nombre_matcon='" + txtnombre.getText() + "'");

            pst.executeUpdate();
            if (pst.executeUpdate() == 1) {
                JOptionPane.showMessageDialog(null, "Modificado con éxito");
            } else {
                JOptionPane.showMessageDialog(null, "Error al modificar");
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {

            sql3 = "SELECT id_proveedor_pm FROM proveedor_materiales Where id_mat_pm=" + codigo_material;
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql3);

            while (rs.next()) {
                codigo_proveedor = rs.getString("id_proveedor_pm");

            }

        } catch (Exception e) {
        }

        try {
            PreparedStatement pst = cn.prepareStatement("UPDATE proveedor_materiales SET id_mat_pm='" + codigo_material
                    + "',id_proveedor_pm='" + codigo_proveedor
                    + "',cantidad_inventario='" + cantidad
                    + "'  WHERE id_mat_pm='" + codigo_material + "'");

            pst.executeUpdate();
            if (pst.executeUpdate() == 1) {
                JOptionPane.showMessageDialog(null, "Modificado con éxito");
            } else {
                JOptionPane.showMessageDialog(null, "Error al modificar");
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        Limpiar();

    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        conectar cc = new conectar(); //Se crea una instancia de la clase conectar
        Connection cn = cc.conexion(); //se crea una instancia de la clase Connection y se concatena el objeto cc
        String sql = "";
        String sql2 = "";
        String sql3 = "";
        String codigo_material = "";

        int rta = JOptionPane.showConfirmDialog(rootPane, "¿Esta seguro de eliminar el registro?");
        if (rta != 0) {
            return;
        }

        try {
            sql = "SELECT id_matcon FROM materiales_consultorio Where nombre_matcon='" + txtnombre.getText() + "'";
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {
                codigo_material = rs.getString("id_matcon");

            }

        } catch (Exception e) {
        }

        try {
            sql3 = " DELETE  FROM proveedor_materiales WHERE id_mat_pm= '" + codigo_material + "'";
            PreparedStatement st = cn.prepareStatement(sql3);
            st.executeUpdate();

            JOptionPane.showMessageDialog(null, "Eliminado con éxito");
            Limpiar();

        } catch (Exception e) {
        }

        try {
            sql2 = " DELETE  FROM materiales_consultorio WHERE id_matcon = '" + codigo_material + "'";
            PreparedStatement st = cn.prepareStatement(sql2);
            st.executeUpdate();

            JOptionPane.showMessageDialog(null, "Eliminado con éxito");
            Limpiar();

        } catch (Exception e) {
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed

        if (txtnombre.getText().equals("")) {
            JOptionPane.showMessageDialog(rootPane, "Debe digitar una referencia");
            txtnombre.requestFocusInWindow();
        }

        String sql2, sql3;

        conectar cc = new conectar();
        Connection cn = cc.conexion();

        String sql = "";

        String codigo_material = null, nombre_material = null, nombre_proveedor = null, codigo_proveedor = null;
        int cantidad = 0;
        try {

            sql = "SELECT id_matcon,nombre_matcon FROM materiales_consultorio Where nombre_matcon= '" + txtnombre.getText() + "'";
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {
                codigo_material = rs.getString("id_matcon");
                nombre_material = rs.getString("nombre_matcon");

            }

        } catch (Exception e) {
        }

        try {
            sql2 = "SELECT * FROM proveedor_materiales Where id_mat_pm='" + codigo_material + "'";
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql2);

            while (rs.next()) {
                codigo_proveedor = rs.getString("id_proveedor_pm");
                cantidad = rs.getInt("cantidad_inventario");

            }

        } catch (Exception e) {
        }

        try {
            sql3 = "SELECT nombre_proveedor FROM proveedores Where id_proveedor='" + codigo_proveedor + "'";
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql3);

            while (rs.next()) {
                nombre_proveedor = rs.getString("nombre_proveedor");

            }

        } catch (Exception e) {
        }

        txtnombre.setText(nombre_material);
        jcmbProveedores.setSelectedItem(nombre_proveedor);
        txtcantidad.setText(Integer.toString(cantidad));


    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        Limpiar();
        txtnombre.setEnabled(true);


    }//GEN-LAST:event_btnCancelarActionPerformed

    private void txtcantidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcantidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcantidadActionPerformed

    private void txtcantidadKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcantidadKeyPressed
        SNumeros(txtcantidad);
    }//GEN-LAST:event_txtcantidadKeyPressed

    private void txtnombreKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnombreKeyPressed
        SLetras(txtnombre);
    }//GEN-LAST:event_txtnombreKeyPressed

    private void jbreporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbreporteActionPerformed
        try {

            conectar cc = new conectar();
            Connection cn = cc.conexion();
            //con.conectar();
            String dir = "C:\\Users\\Usuario\\Documents\\2016-1\\Implantar\\OrthoGarcia\\Orthogarcia 02052016\\OrthoGarcia08Diciembre\\src\\reportes\\reporte_matcons.jrxml";
            JasperReport reporteJasper = JasperCompileManager.compileReport(dir);
            JasperPrint mostrarReporte = JasperFillManager.fillReport(reporteJasper, null, cn);
            JasperViewer.viewReport(mostrarReporte, false);

        } catch (JRException ex) {
            Logger.getLogger(frmMatcons.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_jbreporteActionPerformed

    private void txtnombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnombreKeyTyped
        txtnombre.addKeyListener(new KeyAdapter() {
            public void keyReleased(final KeyEvent e) {
                String cadena = (txtnombre.getText()).toLowerCase();
                txtnombre.setText(cadena);
                repaint();
                filtro();
            }
        });
        tsrfiltro = new TableRowSorter(jTable1.getModel());
        jTable1.setRowSorter(tsrfiltro);
    }//GEN-LAST:event_txtnombreKeyTyped

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
            java.util.logging.Logger.getLogger(frmMatcons.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmMatcons.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmMatcons.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmMatcons.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmMatcons().setVisible(true);
            }
        });
    }

    /**
     * Metodo para limpiar todos los campos de la ventana
     */
    private void Limpiar() {

        jcmbProveedores.setSelectedIndex(0);
        txtnombre.setText("");
        txtcantidad.setText("");

    }

    /**
     * Funcion privada que trae el ultimo codigo de la base de datos
     *
     *
     * @return el numero del ultimo codigo que halla en la base de datos
     */
    private int Nuevo_Codigo() {
        conectar cc = new conectar();
        Connection cn = cc.conexion();
        String sql = "";
        String registro[] = new String[1];
        String numerocodigo = "";

        try {
            sql = "SELECT id_matcon FROM materiales_consultorio ORDER BY id_matcon ASC";
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                registro[0] = rs.getString("id_matcon");

            }

        } catch (SQLException ex) {
            Logger.getLogger(frmMatcons.class.getName()).log(Level.SEVERE, null, ex);
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
     * Función privada que valida si un codigo existe en la base de datos
     *
     * @return Un entero que indica si existe o no el codigo a buscar, si
     * retorna 0 no existe
     */
    public boolean buscarMaterial() {

        boolean si = false;
        try {
            conectar cc = new conectar();
            Connection cn = cc.conexion();

            String sql = "";

            sql = "SELECT nombre_matcon FROM materiales_consultorio  Where nombre_matcon='" + txtnombre.getText() + "'";
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);

            if (rs.next()) {
                si = true;
            }

        } catch (SQLException ex) {
            Logger.getLogger(frmUsuarios.class.getName()).log(Level.SEVERE, null, ex);
        }

        return si;

    }

    public void iniciar_tabla() {

        try {
            conectar cc = new conectar();
            Connection cn = cc.conexion();
            String[] titulos = new String[3];

            String codigo_material = "";
            String nombre_material = "";
            int cantidad = 0;

            titulos[0] = "Código Material";
            titulos[1] = "Nombre Material";
            titulos[2] = "Cantidad";

            String[] registro = new String[3];

            modelo = new DefaultTableModel(null, titulos);

            try {

                String sql2 = "SELECT id_mat_pm  FROM proveedor_materiales";
                Statement st = cn.createStatement();
                ResultSet rs = st.executeQuery(sql2);

                while (rs.next()) {
                    codigo_material = rs.getString("id_mat_pm");

                    codigos_materiales.add(codigo_material);

                }

            } catch (Exception e) {
            }
            for (int i = 0; i < codigos_materiales.size(); i++) {

                String sql = "select nombre_matcon from materiales_consultorio where id_matcon='" + codigos_materiales.get(i) + "'";
                String sql2 = "select cantidad_inventario from proveedor_materiales where id_mat_pm='" + codigos_materiales.get(i) + "'";

                Statement state = cn.createStatement();
                ResultSet resul = state.executeQuery(sql2);

                while (resul.next()) {
                    cantidad = resul.getInt("cantidad_inventario");

                }

                Statement st = cn.createStatement();
                ResultSet rs = st.executeQuery(sql);

                while (rs.next()) {
                    registro[0] = codigos_materiales.get(i);
                    registro[1] = rs.getString("nombre_matcon");
                    registro[2] = Integer.toString(cantidad);

                    modelo.addRow(registro);
                }
            }
            jTable1.setModel(modelo);
        } catch (SQLException ex) {
            Logger.getLogger(frmProveedores_1.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Funcion que carga los proveedores de la base de datos
     *
     */
    private void cargar_proveedores() {
        try {
            conectar cc = new conectar();
            Connection cn = cc.conexion();
            String proveedor_combo;

            ResultSet rs;
            String sql = "select * from proveedores";
            PreparedStatement pst = cn.prepareStatement(sql);
            rs = pst.executeQuery();
            while (rs.next()) {
                proveedor_combo = rs.getString("nombre_proveedor");
                jcmbProveedores.addItem(proveedor_combo);
            }

        } catch (SQLException ex) {
            Logger.getLogger(frmMatcons.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /*
     * Metodo para habilitar los campos de la ventana
     */
    /**
     *
     * Metodo que no deja ingresar otro tipo de datos diferentes a letras en un
     * campo de texto
     *
     */
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

    public void filtro() {
        tsrfiltro.setRowFilter(RowFilter.regexFilter(txtnombre.getText(), 1));
    }

    /**
     * Metodo que atravez del codigo ingresado, busca la informacion relacionada
     * con dicho codigo
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JFrame jFrame2;
    private javax.swing.JFrame jFrame3;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton jbreporte;
    private javax.swing.JComboBox jcmbProveedores;
    private javax.swing.JLabel lblgeneralidades;
    private javax.swing.JLabel lblmatsconsul;
    private javax.swing.JLabel lblnombre;
    private javax.swing.JLabel lblnomcomercial;
    private javax.swing.JTextField txtcantidad;
    private javax.swing.JTextField txtnombre;
    // End of variables declaration//GEN-END:variables
}
