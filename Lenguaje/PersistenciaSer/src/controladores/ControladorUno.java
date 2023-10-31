/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controladores;

import java.util.ArrayList;
import modelo.Persona;
import singleton.Singleton;

/**
 *
 * @author briantafur
 */
public class ControladorUno {
    
    ArrayList<Persona> lista;

    public ControladorUno() {
        lista = Singleton.getInstancia().getLista();
    }
    
    public void agregar(Persona persona){
        lista.add(persona);
        Singleton.getInstancia().escribirObjeto(lista);
    }
    
}
