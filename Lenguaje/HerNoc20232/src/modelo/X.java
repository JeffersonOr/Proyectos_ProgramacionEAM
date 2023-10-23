/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author briantafur
 */
public class X extends Estudiante {

    private String uno;
    private int dos;

    public X(String uno, int dos, int codigo,
             String nombre, int edad) {
        super(codigo, nombre, edad);
        this.uno = uno;
        this.dos = dos;

    }

}
