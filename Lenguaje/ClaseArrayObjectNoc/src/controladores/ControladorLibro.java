/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controladores;

import excepciones.CodigoDuplicadoException;
import excepciones.NoNombreAException;
import modelo.Libro;
import java.util.ArrayList;

/**
 *
 * @author briantafur
 */
public class ControladorLibro {

    private Libro[] libros;
    private ArrayList<Libro> listaLibros;

    public ControladorLibro() {
        libros = new Libro[2];
        listaLibros = new ArrayList<>();
    }

    public void guardarLibroLista(Libro libro) throws CodigoDuplicadoException, NoNombreAException{
        Libro aux = buscarLibroLista(libro.getIsbn());
        if (aux == null) {
            if(libro.getNombre().equals("a")){
                throw new NoNombreAException();
            }
            listaLibros.add(libro);
        } else {
            throw new CodigoDuplicadoException();
        }
        
    }
    
    public boolean guardarLibro(Libro libro) {
        Libro aux = buscarLibro(libro.getIsbn());
        if (aux == null) {
            for (int i = 0; i < libros.length; i++) {
                if (libros[i] == null) {
                    libros[i] = libro;
                    return true;
                }
            }
        }

        return false;
    }

    public Libro buscarLibroLista(int codigo){
        for (int i = 0; i < listaLibros.size(); i++) {
            if(codigo == listaLibros.get(i).getIsbn()){
                return listaLibros.get(i);
            }
        }
        return null;
    }
    
    public Libro buscarLibro(int codigo) {
        for (int i = 0; i < libros.length; i++) {
            if (libros[i] != null && codigo == libros[i].getIsbn()) {
                return libros[i];
            }
        }
        return null;
    }

}
