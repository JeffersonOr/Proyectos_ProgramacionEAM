/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controllers;

import Model.Flight;
import Singleton.Singleton;
import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public class ControllerFlights {

    ArrayList<Flight> listFlights;

    public ControllerFlights() {

        listFlights = Singleton.getInstance().getListFlight();

    }

    /////////////////Create users
    public boolean createUsers(Flight flight) {
        Flight aux = readUsers(flight.getIdFlight());

        if (aux == null) {
            listFlights.add(flight);
            Singleton.getInstance().writeObjectListFlights(listFlights);
            return true;
        }

        return false;
    }

    ///////////////Read Users
    public Flight readUsers(int code) {

        for (int i = 0; i < listFlights.size(); i++) {
            if (code == listFlights.get(i).getIdFlight()) {
                return listFlights.get(i);

            }
        }
        return null;
    }

    /////////////Update Users
    public boolean updateUsers(Flight flight) {
        Flight aux = readUsers(flight.getIdFlight());
        for (int i = 0; i < listFlights.size(); i++) {
            if (aux != null) {
                listFlights.get(i).setOriginFlight(flight.getOriginFlight());
                listFlights.get(i).setDestineFlight(flight.getDestineFlight());
                listFlights.get(i).getPlane().setNamePlane(flight.getPlane().getNamePlane());
                listFlights.get(i).getAirlineEmployee().setNamePerson(flight.getAirlineEmployee().getNamePerson());
                listFlights.get(i).setDay(flight.getDay());
                listFlights.get(i).setMonth(flight.getMonth());
                listFlights.get(i).setYear(flight.getYear());
                listFlights.get(i).setHour(flight.getHour());
                listFlights.get(i).setEstimateFlight(flight.getEstimateFlight());
                Singleton.getInstance().writeObjectListFlights(listFlights);
                return true;
            }
        }
        return false;
    }

    /////////////Delete Users
    public boolean deleteUsers(Flight flight) {
        Flight aux = readUsers(flight.getIdFlight());
        for (int i = 0; i < listFlights.size(); i++) {
            if (aux != null) {
                listFlights.remove(i);
                Singleton.getInstance().writeObjectListFlights(listFlights);
                return true;
            }
        }
        return false;
    }

}
