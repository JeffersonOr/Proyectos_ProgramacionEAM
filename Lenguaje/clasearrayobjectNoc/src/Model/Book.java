/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author sebas
 */
public class Book {
    private int isbn;
    private String nombre;
    private String nombreAutor;

    public Book(int isbn, String nombre, String nombreAutor) {
        this.isbn = isbn;
        this.nombre = nombre;
        this.nombreAutor = nombreAutor;
    }

    public Book(int isbn) {
        this.isbn = isbn;
    }
    
    

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
    
    
}
