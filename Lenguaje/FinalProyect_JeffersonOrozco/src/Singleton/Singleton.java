/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Singleton;

import Model.Airline;
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

    private ArrayList<User> listUsers;
    private ArrayList<Airline> listAirlines;
    private ArrayList<flight> listflights;
    private ArrayList<Plane> listPlanes;
    private ArrayList<Maintenance> listMaintenance;

    public Singleton() {
        listUsers = read();
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

}
