/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package serializadora;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import modelo.Persona;

/**
 *
 * @author briantafur
 */
public class Serializadora {

    public Serializadora() {
    }

    public void escribirObjeto(ArrayList<Persona> lista) {
        try {
            FileOutputStream archivo
                    = new FileOutputStream("personas.dat");
            ObjectOutputStream escritor
                    = new ObjectOutputStream(archivo);
            escritor.writeObject(lista);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public ArrayList<Persona> leer() {
        try {
            FileInputStream archivo
                    = new FileInputStream("personas.dat");
            ObjectInputStream lector
                    = new ObjectInputStream(archivo);
            return (ArrayList<Persona>) lector.readObject();
        } catch (IOException | ClassNotFoundException ex) {
            ex.printStackTrace();
            return new ArrayList<>();
        }
    }

}
