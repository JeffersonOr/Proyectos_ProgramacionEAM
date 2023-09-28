/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author Usuario
 */
public class Estudiante extends Persona {////// extends[Padre] Para realizar la abstracion de la clase padre

    private int codigo;

    public Estudiante(int codigo, String nombre, int edad) {
        super(nombre, edad);////////Super es la forma de referenciar la clase padre
        this.codigo = codigo;

    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    
    
}
