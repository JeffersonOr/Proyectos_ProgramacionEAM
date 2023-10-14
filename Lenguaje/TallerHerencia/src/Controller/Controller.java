/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

/**
 *
 * @author Usuario
 */
public class Controller {
    
    
    
    
    /////////BuscarVehiculo
    public Mascota buscarMascota(int code) {

        for (int i = 0; i < listaMascotas.size(); i++) {
            if (code == listaMascotas.get(i).getCodigo()) {
                return listaMascotas.get(i);
            }
        }

        return null;

    }
}
