/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author briantafur
 */
public class Cuadrado extends Rectangulo{

    public Cuadrado(String color) {
        super(color);
    }
    
    @Override
    public void dibujar(){
        System.out.println("Se dibuja un Cuadrado de color " + color);
    }
    
}
