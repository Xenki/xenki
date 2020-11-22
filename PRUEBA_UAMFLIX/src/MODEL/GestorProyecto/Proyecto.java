/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MODEL.GestorProyecto;

/**
 *
 * @author alan bc
 */
public class Proyecto {
  String id_Personal;
  String idElenco; 
  String nombreElenco;
  String nombreProy;
  String categoriaProyecto;
  
  //constructor//

    public Proyecto(String id_Personal, String idElenco, String nombreElenco, String nombreProy, String categoriaProyecto) {
        this.id_Personal = id_Personal;
        this.idElenco = idElenco;
        this.nombreElenco = nombreElenco;
        this.nombreProy = nombreProy;
        this.categoriaProyecto = categoriaProyecto;
    }
    //metodos//
    public String getId_Personal() {
        return id_Personal;
    }

    public void setId_Personal(String id_Personal) {
        this.id_Personal = id_Personal;
    }

    public String getIdElenco() {
        return idElenco;
    }

    public void setIdElenco(String idElenco) {
        this.idElenco = idElenco;
    }

    public String getNombreElenco() {
        return nombreElenco;
    }

    public void setNombreElenco(String nombreElenco) {
        this.nombreElenco = nombreElenco;
    }

    public String getNombreProy() {
        return nombreProy;
    }

    public void setNombreProy(String nombreProy) {
        this.nombreProy = nombreProy;
    }

    public String getCategoriaProyecto() {
        return categoriaProyecto;
    }

    public void setCategoriaProyecto(String categoriaProyecto) {
        this.categoriaProyecto = categoriaProyecto;
    }
  
}
