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
public class ControllerBook {/////Agrupar las acciones de la clase, en este caso, la clase book

    private Book[] books;

    public ControllerBook() {

        books = new Book[2];

    }

    public boolean saveBook(Book book) {///////Asignar libro

        for (int i = 0; i < books.length; i++) {
            if (books[i] == null) {
                books[i] = book;
                return true;
            }

        }

        return false;

    }

}
