/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author sebas
 */
public class Book {//////Inicializamos la clase
    
    private int isbn; ////Se declara la entidad isbn
    private String nombre;////Se declara la entidad nombre
    private String nombreAutor;////Se declara la entidad nombreAutor

    public Book(int isbn, String nombre, String nombreAutor) {/////////////////Se crea el constructor
        this.isbn = isbn;
        this.nombre = nombre;
        this.nombreAutor = nombreAutor;
    }

    public Book(int isbn) {//////Se sobrecarga el metodo para realizar el metodo eliminar libro
        this.isbn = isbn;
    }
    
    
/////////////////////////////////////////////////Se crean los Getters and Setters para darle acceso exclusivos en otros paquetes
    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombreAutor() {
        return nombreAutor;
    }

    public void setNombreAutor(String nombreAutor) {
        this.nombreAutor = nombreAutor;
    }
    
    /////////////////////////////////////////////////////////////////////////
    
    
}
