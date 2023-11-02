/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controllers;

import Model.Plane;
import Singleton.Singleton;
import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public class ControllerPlanes {
    
        ArrayList<Plane> listPlanes;

    public ControllerPlanes() {

        listPlanes = Singleton.getInstance().getListPlane();

    }

    /////////////////Create users
    public boolean createPlane(Plane Plane) {
        Plane aux = readPlane(Plane.getIdPlane());

        if (aux == null) {
            listPlanes.add(Plane);
            Singleton.getInstance().writeObjectListPlanes(listPlanes);
            return true;
        }

        return false;
    }

    ///////////////Read Users
    public Plane readPlane(int code) {

        for (int i = 0; i < listPlanes.size(); i++) {
            if (code == listPlanes.get(i).getIdPlane()) {
                return listPlanes.get(i);

            }
        }
        return null;
    }

    /////////////Update Users
    public boolean updateUsers(Plane plane) {
        Plane aux = readPlane(plane.getIdPlane());
        for (int i = 0; i < listPlanes.size(); i++) {
            if (aux != null) {
                listPlanes.get(i).setIdPlane(plane.getIdPlane());
                listPlanes.get(i).setNamePlane(plane.getNamePlane());
                listPlanes.get(i).setStatusPlane(plane.getStatusPlane());
                listPlanes.get(i).setStatusPlane(plane.getStatusPlane());
                

                Singleton.getInstance().writeObjectListPlanes(listPlanes);
                return true;
            }
        }
        return false;
    }

    /////////////Delete Users
    public boolean deleteUsers(Plane plane) {
        Plane aux = readPlane(plane.getIdPlane());
        for (int i = 0; i < listPlanes.size(); i++) {
            if (aux != null) {
                listPlanes.remove(i);
                Singleton.getInstance().writeObjectListPlanes(listPlanes);
                return true;
            }
        }
        return false;
    }
}
