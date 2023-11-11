/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package excepciones;

/**
 *
 * @author briantafur
 */
public class CodigoDuplicadoException extends Exception{

    public CodigoDuplicadoException() {
        super("El código ya se encuentra en uso");
    }
    
    
    
}
