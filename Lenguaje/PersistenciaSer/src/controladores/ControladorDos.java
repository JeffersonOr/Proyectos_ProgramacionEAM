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
public class ControladorDos {
    
    ArrayList<Persona> lista;

    public ControladorDos() {
        lista = Singleton.getInstancia().getLista();
    }
    
    public void recorrer(){
        for (Persona persona : lista) {
            System.out.println(persona.getNombre());
        }
    }
    
}
