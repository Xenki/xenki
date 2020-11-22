
package CONTROLLER;

//import GUIS.menuCU;

import VIEW.Registro;
import VIEW.inicioSesion;

import VIEW.menuCU;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import java.awt.event.ActionListener;

public class OyenteAutentificacion implements ActionListener{
     inicioSesion is;
     Registro miRegistro;
     menuCU miCU;
     JButton registrarse, datosTarjeta;
     JButton guardarRegistro,regresar;
    
     
    //constructor 
   
    //para la gui registro

    public OyenteAutentificacion(Registro guiRegistro,JButton regresar,JButton guardarRegistro) {
        miRegistro = guiRegistro;
        this.guardarRegistro = guardarRegistro;
    }
    public OyenteAutentificacion(menuCU guimenu,JButton guardarRegistro,JButton datosTarjeta) {
        miCU = guimenu;
        this.datosTarjeta = datosTarjeta;
        this.guardarRegistro = guardarRegistro;
    }
    //para regresar

    public OyenteAutentificacion(Registro guiRegistro, JButton regresar) {
        miRegistro = guiRegistro;
        this.regresar = regresar;
    }
    
  
    public void actionPerformed(ActionEvent ae) {    
        Object botonPresionado = ae.getSource();
               
        /*if(botonPresionado==guardarRegistro){ //boton cuando le oprime registrarse, gui registro
            new menuCU().setVisible(true);
            //miCU.setLocation(Center);
            miRegistro.setVisible(false);
        }*/
         if(botonPresionado==regresar){
           new inicioSesion().setVisible(true);
           miRegistro.setVisible(false);
         }
        }      
    
   
}
