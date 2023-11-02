/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Singleton;

import Controllers.ControllerAirlines;
import Controllers.ControllerFlights;
import Controllers.ControllerPlanes;
import Controllers.ControllerUsers;
import Model.Airline;
import Model.AirlineEmployee;
import Model.Maintenance;
import Model.Plane;
import Model.User;
import Model.flight;
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
    private ArrayList<flight> listflights;
    private ArrayList<Plane> listPlanes;
    private ArrayList<Maintenance> listMaintenances;
    private ArrayList<AirlineEmployee> airlineEmployees;
    //////////////////////////////////////////Lists
    
    //////////////////////////////////////////Controllers
    private ControllerUsers controllerUsers;
    private ControllerAirlines controllerAirlines;
    private ControllerFlights controllerFlights;
    private ControllerPlanes controllerPlanes;
    /////////////////////////////////////////Controllers
    
    public Singleton() {
        listUsers = read();
        airlineEmployees = readlistAirlineEmployees();
        listPlanes = readListPlanes();
//        controllerUsers = readControllerUsers();
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
    

//    public ControllerUsers getControllerUser() {
//
//        return this.controllerUsers;
//    }

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
    
    

    ////////////////////////////////////////////////////////////////////////////////////////////////////////ListaUsuarios
    ////////////////////////////////////////////////////////////////////////////////////////////////////////ControladorUsuarios
//    public void writeObject(ControllerUsers controllerUsers) {//////////Metodo para hacer cambios
//        try {
//            FileOutputStream file
//                    = new FileOutputStream("controllerUsers.dat");
//            ObjectOutputStream writer
//                    = new ObjectOutputStream(file);
//            writer.writeObject(controllerUsers);
//        } catch (IOException ex) {
//            //ex.printStackTrace();
//        }
//    }
//
//    public ControllerUsers readControllerUsers() {///////////////Metodo para actualizar
//        try {
//            FileInputStream file
//                    = new FileInputStream("controllerUsers.dat");
//            ObjectInputStream reader
//                    = new ObjectInputStream(file);
//            return (ControllerUsers) reader.readObject();
//        } catch (IOException | ClassNotFoundException ex) {
//            //ex.printStackTrace();
//            return new ControllerUsers();
//        }
//    }

    ////////////////////////////////////////////////////////////////////////////////////////////////////////ControladorUsuarios
}
