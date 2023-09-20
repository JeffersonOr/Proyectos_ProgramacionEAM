/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import java.util.ArrayList;
import Model.Estudiante;

/**
 *
 * @author jeff
 */
public class ControllerEstudiante {

    private ArrayList<Estudiante> listEstudiante; ///////////Se crea el array que contendrá los estudiantes

    public ControllerEstudiante() {////////////Contructor
        listEstudiante = new ArrayList<>();
    }

    //////////////////////Metodos///////////////////////////////
    ///////////////BuscarEstudiante
    public Estudiante buscarEstudiante(int id) {

        for (int i = 0; i < listEstudiante.size(); i++) {
            if (id == listEstudiante.get(i).getId()) {

                return listEstudiante.get(i);

            }
        }

        return null;
    }

    //////////////GuardarEstudiante
    public boolean guardarEstudiante(Estudiante estudiante) {
        Estudiante aux = buscarEstudiante(estudiante.getId());
        if (aux == null) {
            listEstudiante.add(estudiante);
            return true;

        }

        return false;
    }

}
