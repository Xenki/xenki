/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MODEL.gestorBD;


import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;


public class conexion {
    public static final String user = "root";
    public static final String password = "Chicharito1000";
    private static final String url = "jdbc:mysql://localhost:3306/proyectouamflix"
            + "?useUnicode=true&useJDBCCompliant"
            + "TimezoneShift=true&useLegacyDatetime"
            + "Code=false&serverTimezone=UTC";
    
      public Connection getConnection(){
        Connection conexion=null;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            conexion=(Connection) DriverManager.getConnection(url, user, password);
            if(conexion!=null)
                  JOptionPane.showMessageDialog(null,"Conexion exitosa");
             //System.out.println("Conexion exitosa");
        }catch(Exception ex){
            System.out.println("HAY UN Error, "+ex);
        }
        return conexion;
    }
}
