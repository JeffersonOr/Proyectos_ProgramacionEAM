/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.hernoc20232;

import modelo.Docente;
import modelo.Estudiante;
import modelo.Persona;

/**
 *
 * @author USUARIO
 */
public class HerNoc20232 {

    public static void main(String[] args) {
        Persona persona = new Persona("persona", 0);
        Estudiante estudiante = new Estudiante(123, "pepito", 15);
        Docente docente = new Docente("vago", "sda", 123);
        persona.presentar();
        persona.imprimirDatos();
        System.out.println("----------");
        estudiante.presentar();
        estudiante.imprimirDatos();
        System.out.println("----------");
        docente.presentar();
        docente.imprimirDatos();
        System.out.println("----------");
        
    }
}
