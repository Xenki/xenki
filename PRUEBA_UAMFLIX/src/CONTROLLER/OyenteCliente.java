//abre crear proyecto
//serie//
//pelicula//
//documental//
//consultar pagos//
package CONTROLLER;

import GUIS.Cliente_contenidoMultimedia;
import VIEW.Documental;
import VIEW.Pelicula;
import VIEW.Serie;
import VIEW.menuCU;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

/**
 *
 * @author alan bc
 */
public class OyenteCliente implements ActionListener{
    //atributos//
    menuCU miCU;
    Documental GUIdoc;
    Serie GUIserie;
    Pelicula GUIpelicula;
    JButton serie,pelicula,documental;
    JButton crearProyecto;
    JButton conPago;
    //constructor

    public OyenteCliente(menuCU miCU, JButton serie) {
        this.miCU = miCU;
        this.serie = serie;
    }
    
    public void actionPerformed(ActionEvent ae) {    
        Object botonPresionado = ae.getSource();
                
         if(botonPresionado==serie){ //boton cuando le oprime registrarse, gui registro
            new Serie().setVisible(true);
            miCU.setVisible(false);
        }
        if(botonPresionado==documental){
            new Documental().setVisible(true);
        }
        if(botonPresionado==pelicula){
             new Pelicula().setVisible(true);
        }
        if(botonPresionado==crearProyecto){
            
        }
        if(botonPresionado==conPago){
            
        }
    
}
}
