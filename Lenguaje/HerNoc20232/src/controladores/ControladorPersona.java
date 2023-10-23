/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controladores;

import java.util.ArrayList;
import modelo.Docente;
import modelo.Persona;

/**
 *
 * @author briantafur
 */
public class ControladorPersona {

    ArrayList<Persona> personas;

    public ControladorPersona() {
        personas = new ArrayList<>();
    }

    public void agregar(Persona persona) {
        personas.add(persona);
    }

    public void presentarTodos() {
        for (int i = 0; i < personas.size(); i++) {
            personas.get(i).imprimirDatos();
            System.out.println("-------------------");
        }
    }

    public void presentarDocentes() {
        for (int i = 0; i < personas.size(); i++) {
            if (personas.get(i) instanceof Docente) {
                Docente doc = (Docente) personas.get(i);
                System.out.println(doc.getNombre());
                System.out.println(doc.getEdad());
                System.out.println(doc.getProfesion());
            }
        }
    }

}
