/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyectoherencia;

import Modelo.Docente;
import Modelo.Estudiante;
import Modelo.Persona;

/**
 *
 * @author Usuario
 */
public class ProyectoHerencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Persona persona = new Persona("xd", 12);
        Estudiante estudiante = new Estudiante(1, "Jeff", 12);
        Docente docente = new Docente("XD", "Jose", 50);
        persona.presentar();
        
    }

}
