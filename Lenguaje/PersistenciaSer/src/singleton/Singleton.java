/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package singleton;

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
public class Singleton {

    private static Singleton INSTANCIA = new Singleton();

    private ArrayList<Persona> lista;

    private Singleton() {
        lista = leer();
    }

    public static Singleton getInstancia() {
        return INSTANCIA;
    }

    public ArrayList<Persona> getLista() {
        return this.lista;
    }

    public void escribirObjeto(ArrayList<Persona> lista) {//////////Metodo para hacer cambios
        try {
            FileOutputStream archivo
                    = new FileOutputStream("personas.dat");/////////Salida del archivo
            ObjectOutputStream escritor/////////Salida de objeto serializado
                    = new ObjectOutputStream(archivo);
            escritor.writeObject(lista);////////se recibe el objeto para sobreescribirlo
        } catch (IOException ex) {
            //ex.printStackTrace();
        }
    }

    private ArrayList<Persona> leer() {///////////////Metodo para actualizar
        try {
            FileInputStream archivo
                    = new FileInputStream("personas.dat");
            ObjectInputStream lector
                    = new ObjectInputStream(archivo);
            return (ArrayList<Persona>) lector.readObject();
        } catch (IOException | ClassNotFoundException ex) {
            //ex.printStackTrace();
            return new ArrayList<>();
        }
    }

}
