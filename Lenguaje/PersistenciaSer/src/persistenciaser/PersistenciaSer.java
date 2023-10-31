/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package persistenciaser;

import controladores.ControladorDos;
import controladores.ControladorUno;
import modelo.Persona;

/**
 *
 * @author briantafur
 */
public class PersistenciaSer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        ControladorUno controladorUno = new ControladorUno();
//        Persona personaUno = new Persona("Juan");
//        Persona personaDos = new Persona("Lina");
//        controladorUno.agregar(personaUno);
//        controladorUno.agregar(personaDos);
        
        ControladorDos controladorDos = new ControladorDos();
        controladorDos.recorrer();
        
        
    }
    
}
