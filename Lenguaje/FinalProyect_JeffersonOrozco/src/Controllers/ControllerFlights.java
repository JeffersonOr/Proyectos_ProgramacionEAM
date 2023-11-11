/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controllers;

import Model.AirlineEmployee;
import Model.Flight;
import Singleton.Singleton;
import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public class ControllerFlights {

    ArrayList<Flight> listFlights;
    ArrayList<AirlineEmployee> listAirlineEmployee;

    public ControllerFlights() {

        listFlights = Singleton.getInstance().getListFlight();
        listAirlineEmployee = Singleton.getInstance().getListAirlineEmployee();

    }

    /////////////////Create Flights
    public boolean createFlights(Flight flight) {
        Flight aux = readFlights(flight.getIdFlight());

        if (aux == null) {
            listFlights.add(flight);
            Singleton.getInstance().writeObjectListFlights(listFlights);
            return true;
        }

        return false;
    }

    ///////////////Read Flights
    public Flight readFlights(int code) {

        for (int i = 0; i < listFlights.size(); i++) {
            if (code == listFlights.get(i).getIdFlight()) {
                return listFlights.get(i);

            }
        }
        return null;
    }

    /////////////Update Flights
    public boolean updateFlights(Flight flight) {
        Flight aux = readFlights(flight.getIdFlight());
        for (int i = 0; i < listFlights.size(); i++) {
            if (aux != null) {
                listFlights.get(i).setOriginFlight(flight.getOriginFlight());
                listFlights.get(i).setDestineFlight(flight.getDestineFlight());
                listFlights.get(i).setNamePlane(flight.getNamePlane());
                listFlights.get(i).setNameCaptain(flight.getNameCaptain());
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

    /////////////Delete Flights
    public boolean deleteFlights(Flight flight) {
        Flight aux = readFlights(flight.getIdFlight());
        for (int i = 0; i < listFlights.size(); i++) {
            if (aux != null) {
                listFlights.remove(i);
                Singleton.getInstance().writeObjectListFlights(listFlights);
                return true;
            }
        }
        return false;
    }

    public boolean verificAvailability(Flight flight) {
        boolean aux = false;
        for (int i = 0; i < listFlights.size(); i++) {
            if (flight.getNameCaptain() == listAirlineEmployee.get(i).getNamePerson()) {
                aux=true;
            }
        }
        return false;

    }

}
