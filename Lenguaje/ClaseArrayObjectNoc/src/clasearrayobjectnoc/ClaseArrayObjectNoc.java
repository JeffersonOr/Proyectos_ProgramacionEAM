/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clasearrayobjectnoc;

import controladores.ControladorLibro;
import modelo.Libro;

/**
 *
 * @author briantafur
 */
public class ClaseArrayObjectNoc {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ControladorLibro controlador = new ControladorLibro();
        ControladorLibro controladorDos = new ControladorLibro();
        Libro libroUno = new Libro(1, "Libro Uno", "Nombre Uno");
        Libro libroDos = new Libro(2, "Libro Dos", "Nombre Dos");
        Libro libroTres = new Libro(3, "Libro Tres", "Nombre Tres");
        boolean respUno = controlador.guardarLibro(libroUno);
        boolean respDos = controlador.guardarLibro(libroDos);
        boolean respTres = controladorDos.guardarLibro(libroTres);
        System.out.println(respUno);
        System.out.println(respDos);
        System.out.println(respTres);
    }
    
}
