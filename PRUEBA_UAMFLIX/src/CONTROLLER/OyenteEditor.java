/*
 boton de regresar
 5 botones editor sitio
 */
package CONTROLLER;
import VIEW.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

public class OyenteEditor implements ActionListener{
    //atributos//
    menuCU miCU;
    Editor_agregarHerramienta GUIeah;
    Editor_eliminarHerramienta GUIeeh;
    Editor_eliminarProyecto GUIeep;
    Editor_modificarProyecto GUIemp;
    Editor_agregarProyecto GUIeap;
    
    JButton eah,eeh,eep,emp,eap;
    JButton regresar;

    public OyenteEditor(Editor_agregarHerramienta GUIeah, JButton eah) {
        this.GUIeah = GUIeah;
        this.eah = eah;
    }
    //para regresar

    public OyenteEditor(menuCU miCU, JButton regresar) {
        this.miCU = miCU;
        this.regresar = regresar;
    }
    
    
    public void actionPerformed(ActionEvent ae) {    
        Object botonPresionado = ae.getSource();
         //gui agregarcontenido       
         if(botonPresionado==eah){ //boton cuando le oprime registrarse, gui registro
            new Editor_agregarHerramienta().setVisible(true);
            miCU.setVisible(false);
        }
        if(botonPresionado==eeh){
           new Editor_eliminarHerramienta().setVisible(true);
            miCU.setVisible(false);
        }
        if(botonPresionado==eep){
             new Editor_eliminarProyecto().setVisible(true);
            miCU.setVisible(false);
        }
        if(botonPresionado==emp){
            new Editor_modificarProyecto().setVisible(true);
            miCU.setVisible(false);
        }
        if(botonPresionado==eap){
            new Editor_agregarProyecto().setVisible(true);
            miCU.setVisible(false);
        }
        if(botonPresionado==regresar){
           new inicioSesion().setVisible(true);
           miCU.setVisible(false);
        }
    
}
    
    
}
