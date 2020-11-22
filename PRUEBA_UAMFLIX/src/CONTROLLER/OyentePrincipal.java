package CONTROLLER;

import GUIS.menuAdministrador;
import GUIS.menuReclutador;
import VIEW.Registro;
import VIEW.inicioSesion;
import VIEW.menuCU;
import VIEW.menuGerente;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import java.awt.event.ActionListener;

public class OyentePrincipal implements ActionListener{
     inicioSesion miInicio;
     menuCU menuCliente;
     menuAdministrador ma;
     menuGerente mg;
     menuReclutador mr;
     Registro miRegistro;
     JButton registrarse, inicioSesion;
     JButton guardarRegistro;
    
     
    //constructor 
    
    public OyentePrincipal(inicioSesion guiInicio,JButton registrarse,JButton isesion) {
        miInicio = guiInicio;
        this.registrarse = registrarse;
        this.inicioSesion= isesion;
    }
    //para la gui registro
   
    
    public void actionPerformed(ActionEvent ae) {    
        Object botonPresionado = ae.getSource();
        
        //boton registrarse. si se registra regresar a la gui inicio sesion
        if (botonPresionado==registrarse){
            //new Prueba().setVisible(true);
            new Registro().setVisible(true);   //gui registro
            miInicio.setVisible(false);  //gui inicio sesion no se abra
            
        }
        //boton iniciar sesion//
        if(botonPresionado==inicioSesion){
            new menuCU().setVisible(true);
            miRegistro.setVisible(false);
        }
    }
   
}
