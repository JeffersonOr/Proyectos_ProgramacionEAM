/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controllers;

import Model.Book;

/**
 *
 * @author sebas
 */
public class ControllerBook {

/////Agrupar las acciones de la clase, en este caso, la clase book
////////////El controlador se encarga de almacenar los datos, controlar los datos
    private Book[] books;   //Se crea el array que va a contenedor la informacion de los libros 

    public ControllerBook() {

        books = new Book[2]; // Se inicializa el array con la cantidad de libros que contendra

    }
    

    public boolean saveBook(Book book) {///////Metodo para asignar libro en un espacion disponible en el array

        for (int i = 0; i < books.length; i++) {
            if (books[i] == null) {
                books[i] = book;
                return true;

            }

        }

        return false;

    }

    public boolean modificarLibro(Book book) {///////////Metodo para modificar libro

        Book respuesta = buscarLibro(book.getIsbn());

        for (int i = 0; i < books.length; i++) {

            if (respuesta==books[i]) {

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