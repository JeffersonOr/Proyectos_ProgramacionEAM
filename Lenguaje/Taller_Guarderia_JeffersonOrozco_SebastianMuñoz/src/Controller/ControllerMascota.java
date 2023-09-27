/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.Mascota;
import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public class ControllerMascota {

    private ArrayList<Mascota> listaMascotas;

    public ControllerMascota() {

        listaMascotas = new ArrayList<>();

    }

    /////////BuscarMascota
    public Mascota buscarMascota(int code) {

        for (int i = 0; i < listaMascotas.size(); i++) {
            if (code == listaMascotas.get(i).getCodigo()) {
                return listaMascotas.get(i);
            }
        }

        return null;

    }

    /////////GuardarMascota
    public boolean guardarMascota(Mascota mascota) {

        Mascota aux = buscarMascota(mascota.getCodigo());
        if (aux == null) {
            listaMascotas.add(mascota);
            return true;
        }

        return false;

    }

    ////////ModificarMascota
    public boolean modificarMascota(Mascota mascota) {

        Mascota aux = buscarMascota(mascota.getCodigo());

        for (int i = 0; i < listaMascotas.size(); i++) {

            if (aux.equals(mascota.getCodigo())) {
                listaMascotas.get(i).setCodigo(mascota.getCodigo());
                listaMascotas.get(i).setEdadMeses(mascota.getEdadMeses());
                listaMascotas.get(i).setRaza(mascota.getRaza());
                listaMascotas.get(i).setNombreMascota(mascota.getNombreMascota());
                listaMascotas.get(i).setSexo(mascota.getSexo());

                return true;
            }

        }

        return false;

    }

    //////EliminarMascota
    public boolean eliminarMascota(Mascota mascota) {

        Mascota aux = buscarMascota(mascota.getCodigo());

        for (int i = 0; i < listaMascotas.size(); i++) {

            if (aux.equals(mascota.getCodigo())) {
                listaMascotas.remove(i);
                return true;
            }

        }

        return false;
    }

}
