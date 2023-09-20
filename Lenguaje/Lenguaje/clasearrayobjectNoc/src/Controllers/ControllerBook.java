/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controllers;

import Model.Book;
import java.util.ArrayList;

/**
 *
 * @author sebas
 */
public class ControllerBook {

/////Agrupar las acciones de la clase, en este caso, la clase book
////////////El controlador se encarga de almacenar los datos, controlar los datos
    private Book[] books;   //Se crea el array que va a contenedor la informacion de los libros 
    private ArrayList<Book> listaLibros;////ArrayList

    public ControllerBook() {

        books = new Book[2]; // Se inicializa el array con la cantidad de libros que contendra
        listaLibros = new ArrayList<>();//////Se inicializa el arrayList 

    }

    public boolean guardarLibroLista(Book book) {

        Book aux = buscarLibroLista(book.getIsbn());
        if (aux == null) {
            listaLibros.add(book);
            return true;
        }
        
        return false;

    }

    public boolean saveBook(Book book) {///////Metodo para asignar libro en un espacion disponible en el array

        Book aux = buscarLibro(book.getIsbn());
        if (aux == null) {////Validacion para guardar un libro si es null se ejecuta el for si no, 

            for (int i = 0; i < books.length; i++) {
                if (books[i] == null) {
                    books[i] = book;
                    return true;

                }

            }

        }

        return false;

    }

    public Book buscarLibroLista(int code) {

        for (int i = 0; i < listaLibros.size(); i++) {///en este caso se usa "Size" para recorrer el tamaño del arraylist
            if (code == listaLibros.get(i).getIsbn()) {/////Se obtiene el atributo isbn del objeto que lanzo i
                return listaLibros.get(i);////Se obtinenen todos los objetos de la clase book
            }
        }

        return null;

    }

    public boolean modificarLibro(Book book) {///////////Metodo para modificar libro (Esta reemplazando todo el libro mas no sus atributos

        Book respuesta = buscarLibro(book.getIsbn());

        for (int i = 0; i < books.length; i++) {

            if (respuesta == books[i]) {

                books[i] = book;

                return true;

            }

        }

        return false;
    }

    public Book buscarLibro(int code) {////////Metodo para buscar libro en el array

        for (int i = 0; i < books.length; i++) {
            if (books[i] != null && code == books[i].getIsbn()) {
                return books[i];
            }
        }

        return null;

    }

    public boolean eliminarlibro2(Book book) {///////////Metodo para eliminar libro

        Book respuesta = buscarLibro(book.getIsbn());

        for (int i = 0; i < books.length; i++) {

            if (respuesta.equals(books[i])) {

                books[i] = null;

                return true;

            }

        }

        return false;
    }

}
