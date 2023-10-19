/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.Gato;
import Model.Perro;
import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public class Controller_Mascota {

    ArrayList<Gato> listaGatos = new ArrayList<>();
    ArrayList<Perro> listaPerros = new ArrayList<>();

    ////////////BuscarGato
    public Gato buscarGato(int codigo) {

        for (int i = 0; i < listaGatos.size(); i++) {

            if (codigo == listaGatos.get(i).getCodigo_unico()) {
                return listaGatos.get(i);
            }

        }

        return null;
    }

    ////////////GuardarGato
    public boolean guardarGato(Gato gato) {

        Gato aux = buscarGato(gato.getCodigo_unico());
        if (aux == null) {

            listaGatos.add(gato);
            return true;

        }

        return false;
    }

    //////////ModificarGato
    public boolean modificarGato(Gato gato) {
        Gato aux = buscarGato(gato.getCodigo_unico());

        for (int i = 0; i < listaGatos.size(); i++) {
            if (aux != null) {
                listaGatos.get(i).setNombre(gato.getNombre());
                listaGatos.get(i).setEdad(gato.getEdad());
                listaGatos.get(i).setGenero(gato.getGenero());
                listaGatos.get(i).setCantidadVacuna(gato.getCantidadVacuna());
                return true;
            }
        }
        return false;
    }

    /////////EliminarGato
    public boolean eliminarGato(Gato gato) {
        Gato aux = buscarGato(gato.getCodigo_unico());
        for (int i = 0; i < listaGatos.size(); i++) {
            if (aux != null) {
                listaGatos.remove(i);
               
            }
            
            return true;
        }

        return false;
    }
    
    
    

}
