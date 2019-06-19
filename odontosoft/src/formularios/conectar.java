package formularios;

import java.sql.*;
import javax.swing.*;
/**
 *Metodo usada para crear un objeto de clase Connection 
 * @author Sebastian Galeano Bolivar
 * @author Sebastian Toro Cano
 * @version 1
 */

public class conectar {
Connection conect = null;

/**
 * Funcion usada para cargar el driver de mysql
 * @return conect, que es el objeto donde se carga el driver
 */
   public Connection conexion()
    {
      try {
             
           //Cargamos el Driver MySQL
           Class.forName("org.gjt.mm.mysql.Driver");
           conect = DriverManager.getConnection("jdbc:mysql://localhost/odontosoft","root","");
           
           
           //Cargamos el Driver Access
           //Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
           //Conectar en red base 
           //String strConect = "jdbc:odbc:Driver=Microsoft Access Driver (*.mdb);DBQ=//servidor/bd_cw/cw.mdb";
           //Conectar Localmente
           //String strConect = "jdbc:odbc:Driver=Microsoft Access Driver (*.mdb);DBQ=D:/cwnetbeans/cw.mdb";
          //conect = DriverManager.getConnection(strConect,"",""); 
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Error "+e);
        }
        return conect;
     
}}
