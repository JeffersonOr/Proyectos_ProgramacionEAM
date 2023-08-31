/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lenguaje.de.programacion;

import modelo.Curso;///Importamos la clase con import - El asterisco quiere decir que toma todos los recursos
import modelo.Estudiante;

/**
 *
 * @author jeff
 */
public class LenguajeDeProgramacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int id = 1;
        String nombre = "Lenguaje";
        double notaUno = 1.5;
        double notaDos = 2;
        double notaTres = 3.5;
        
            
        
        Curso curso = new Curso(id,nombre, notaUno, notaDos, notaTres);
        Estudiante estudiante = new Estudiante(2, "Jeff", curso);
        
        System.out.println(estudiante.calcularNota());
        estudiante.setNombre("Carlos");
        System.out.println("----------------");
        System.out.println(estudiante.getNombre());
        
        
        
        
        
    }
    
}
