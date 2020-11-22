/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MODEL.GestorAutentificacion;

import VIEW.*;
import MODEL.GestorPersonalCliente.Cliente;
import MODEL.gestorBD.*;
import com.mysql.cj.protocol.Resultset;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class gestorAutentificacion {
    //metodo registrar
   public boolean registrar(Cliente cliente){
        //int resultado=0;
      conexion con = new conexion();
      PreparedStatement ps;
       String sql = "insert into proyectouamflix.cliente_cu(IdCliente,Nombre,Correo,Telefono,"
                  + "Nickname,password,EstatusCliente,EstatusBeca )values(?,?,?,?,?,?,?,?,?)";
      try{
          Connection conexion = con.getConnection();
         
          ps = conexion.prepareStatement(sql);
          ps.setString(1,cliente.getIdCliente());      
          ps.setString(2,cliente.getNombre());
          ps.setString(4,cliente.getCorreo());
          ps.setString(5,cliente.getTelefono());
          ps.setString(6,cliente.getNickname());
          ps.setString(7,cliente.getContraseña());
          ps.setBoolean(8, cliente.getEstatusCliente());
          ps.setBoolean(9, cliente.getEstatusBeca());
            //ps.setString(10, cliente.getTarjeta().getNumeroTarjeta());
          ps.executeUpdate();
          //System.out.println("ps: "+ps);
            //ps.close();
            return true;
            
        }catch(Exception ex){
            return false;
        }
    }
    
   
   public boolean iniciarSesion(Cliente cliente) {
       conexion con =  new conexion();
       PreparedStatement ps;
       ResultSet rs = null;
       

       String sql = " select IdCliente,Nombre,Correo,Telefono,"
               + "Nickname,password,EstatusCliente,EstatusBeca from cliente_cu where IdCliente=?";
       try {
           Connection conexion = con.getConnection();
           ps = conexion.prepareStatement(sql);
           //ps.setString(1, cliente);
           rs = ps.executeQuery();
           if (rs.next()) {
               if(cliente.getContraseña().equals(rs.getString("contraseña"))){
                   ps.setString(1,cliente.getIdCliente());      
                   cliente.setIdCliente("IdCliente");
                   cliente.setNombre("Nombre");
                   cliente.setCorreo("Correo");
                   cliente.setTelefono("Telefono");
                   cliente.setNickname("Nickname");
                   cliente.setEstatusCliente(true);
                   cliente.setEstatusBeca(true);
                   return true;
              }
               else{
                   return false;
               }

           }
         return false;

       }catch(SQLException ex){
            return false;    
       }
      
       
   }
}
