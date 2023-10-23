/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hernoc20232;

import controladores.ControladorPersona;
import modelo.Circulo;
import modelo.Cuadrado;
import modelo.Docente;
import modelo.Estudiante;
import modelo.Forma;
import modelo.Persona;

/**
 *
 * @author briantafur
 */
public class HerNoc20232 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ControladorPersona controlador = new ControladorPersona();
        Persona persona = new Persona("nombre", 0);
        Estudiante estudiante = new Estudiante(123, "Pepito", 15);
        Docente docente = new Docente("Vago", "jj", 11);

        controlador.agregar(persona);
        controlador.agregar(estudiante);
        controlador.agregar(docente);
//        controlador.presentarTodos();
        controlador.presentarDocentes();

//        Circulo circulo = new Circulo("Rojo");
//        circulo.dibujar();
//        System.out.println("----------------");
//        Cuadrado cuadrado = new Cuadrado("Verde");
//        cuadrado.dibujar();
//        System.out.println("----------------");
//        Forma forma = new Forma("Azul") {
//            @Override
//            public void dibujar() {
//                System.out.println("Se dibuja una forma");
//            }
//        };
    }

}
