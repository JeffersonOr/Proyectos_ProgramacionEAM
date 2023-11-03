/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Singleton;

import Model.Airline;
import Model.AirlineEmployee;
import Model.Maintenance;
import Model.Plane;
import Model.User;
import Model.Flight;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public class Singleton {

    private static Singleton INSTANCE = new Singleton();

    //////////////////////////////////////////Lists
    private ArrayList<User> listUsers;
    private ArrayList<Airline> listAirlines;
    private ArrayList<Flight> listFlights;
    private ArrayList<Plane> listPlanes;
    private ArrayList<Maintenance> listMaintenances;
    private ArrayList<AirlineEmployee> airlineEmployees;
    //////////////////////////////////////////Lists

    public Singleton() {
        listUsers = read();
        airlineEmployees = readlistAirlineEmployees();
        listPlanes = readListPlanes();
        listFlights = readListFlights();

    }

    public static Singleton getInstance() {
        return INSTANCE;
    }

    public ArrayList<User> getListUser() {
        return this.listUsers;
    }

    public ArrayList<Airline> getListAirline() {
        return this.listAirlines;
    }

    public ArrayList<AirlineEmployee> getListAirlineEmployee() {
        return this.airlineEmployees;
    }

    public ArrayList<Plane> getListPlane() {
        return this.listPlanes;
    }

    public ArrayList<Flight> getListFlight() {

        return this.listFlights;
    }

///////////////////////////////////////////////////////////////////////////////////////////////////////ListaUsuarios
    public void writeObject(ArrayList<User> listUsers) {//////////Metodo para hacer cambios
        try {
            FileOutputStream file
                    = new FileOutputStream("users.dat");
            ObjectOutputStream writer
                    = new ObjectOutputStream(file);
            writer.writeObject(listUsers);
        } catch (IOException ex) {
            //ex.printStackTrace();
        }
    }

    private ArrayList<User> read() {///////////////Metodo para actualizar
        try {
            FileInputStream file
                    = new FileInputStream("users.dat");
            ObjectInputStream reader
                    = new ObjectInputStream(file);
            return (ArrayList<User>) reader.readObject();
        } catch (IOException | ClassNotFoundException ex) {
            //ex.printStackTrace();
            return new ArrayList<>();
        }
    }

    public void writeObjectairlineEmployees(ArrayList<AirlineEmployee> airlineEmployees) {//////////Metodo para hacer cambios
        try {
            FileOutputStream file
                    = new FileOutputStream("airlineEmployees.dat");
            ObjectOutputStream writer
                    = new ObjectOutputStream(file);
            writer.writeObject(airlineEmployees);
        } catch (IOException ex) {
            //ex.printStackTrace();
        }
    }

    private ArrayList<AirlineEmployee> readlistAirlineEmployees() {///////////////Metodo para actualizar
        try {
            FileInputStream file
                    = new FileInputStream("airlineEmployees.dat");
            ObjectInputStream reader
                    = new ObjectInputStream(file);
            return (ArrayList<AirlineEmployee>) reader.readObject();
        } catch (IOException | ClassNotFoundException ex) {
            //ex.printStackTrace();
            return new ArrayList<>();
        }
    }

    public void writeObjectListPlanes(ArrayList<Plane> listPlanes) {//////////Metodo para hacer cambios
        try {
            FileOutputStream file
                    = new FileOutputStream("Planes.dat");
            ObjectOutputStream writer
                    = new ObjectOutputStream(file);
            writer.writeObject(listPlanes);
        } catch (IOException ex) {
            //ex.printStackTrace();
        }
    }

    private ArrayList<Plane> readListPlanes() {///////////////Metodo para actualizar
        try {
            FileInputStream file
                    = new FileInputStream("Planes.dat");
            ObjectInputStream reader
                    = new ObjectInputStream(file);
            return (ArrayList<Plane>) reader.readObject();
        } catch (IOException | ClassNotFoundException ex) {
            //ex.printStackTrace();
            return new ArrayList<>();
        }
    }

    public void writeObjectListFlights(ArrayList<Flight> listFlights) {//////////Metodo para hacer cambios
        try {
            FileOutputStream file
                    = new FileOutputStream("Flights.dat");
            ObjectOutputStream writer
                    = new ObjectOutputStream(file);
            writer.writeObject(listFlights);
        } catch (IOException ex) {
            //ex.printStackTrace();
        }
    }

    private ArrayList<Flight> readListFlights() {///////////////Metodo para actualizar
        try {
            FileInputStream file
                    = new FileInputStream("Flights.dat");
            ObjectInputStream reader
                    = new ObjectInputStream(file);
            return (ArrayList<Flight>) reader.readObject();
        } catch (IOException | ClassNotFoundException ex) {
            //ex.printStackTrace();
            return new ArrayList<>();
        }
    }

}
