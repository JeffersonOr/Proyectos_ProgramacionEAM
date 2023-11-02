/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controllers;

import Model.AirlineEmployee;
import Singleton.Singleton;
import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public class ControllerAirlineEmployee {
        ArrayList<AirlineEmployee> listairlineEmployees;

    public ControllerAirlineEmployee() {

        listairlineEmployees = Singleton.getInstance().getListAirlineEmployee();

    }

    /////////////////Create users
    public boolean createUsers(AirlineEmployee airlineEmployee) {
        AirlineEmployee aux = readUsers(airlineEmployee.getIdPerson());

        if (aux == null) {
            listairlineEmployees.add(airlineEmployee);
            Singleton.getInstance().writeObjectairlineEmployees(listairlineEmployees);
            return true;
        }

        return false;
    }

    ///////////////Read Users
    public AirlineEmployee readUsers(int code) {

        for (int i = 0; i < listairlineEmployees.size(); i++) {
            if (code == listairlineEmployees.get(i).getIdPerson()) {
                return listairlineEmployees.get(i);

            }
        }
        return null;
    }

    /////////////Update Users
    public boolean updateUsers(AirlineEmployee airlineEmployee) {
        AirlineEmployee aux = readUsers(airlineEmployee.getIdPerson());
        for (int i = 0; i < listairlineEmployees.size(); i++) {
            if (aux != null) {
                listairlineEmployees.get(i).setIdPerson(airlineEmployee.getIdPerson());
                listairlineEmployees.get(i).setLastNamePerson(airlineEmployee.getLastNamePerson());
                listairlineEmployees.get(i).setNamePerson(airlineEmployee.getNamePerson());
                

                Singleton.getInstance().writeObjectairlineEmployees(listairlineEmployees);
                return true;
            }
        }
        return false;
    }

    /////////////Delete Users
    public boolean deleteUsers(AirlineEmployee airlineEmployee) {
        AirlineEmployee aux = readUsers(airlineEmployee.getIdPerson());
        for (int i = 0; i < listairlineEmployees.size(); i++) {
            if (aux != null) {
                listairlineEmployees.remove(i);
                Singleton.getInstance().writeObjectairlineEmployees(listairlineEmployees);
                return true;
            }
        }
        return false;
    }
}
