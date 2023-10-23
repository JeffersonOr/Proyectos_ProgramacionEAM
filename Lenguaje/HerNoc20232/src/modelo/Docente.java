/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author briantafur
 */
public class Docente extends Persona{
    
    private String profesion;

    public Docente(String profesion, String nombre, int edad) {
        super(nombre, edad);
        this.profesion = profesion;
    }
    
    @Override
    public void presentar(){
        System.out.println("Soy un Docente");
    }
    
    @Override
    public void imprimirDatos(){
        super.imprimirDatos();
        System.out.println("Profesión: " + profesion);
    }

    public String getProfesion() {
        return profesion;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }
    
    
}
