/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clasearrayobjectnoc;

import Controllers.ControllerBook;
import Model.Book;

/**
 *
 * @author sebas
 */
public class ClasearrayobjectNoc {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        ControllerBook controller = new ControllerBook();
        Book bookOne = new Book(1, "Libro uno", "Nombre uno");
        Book bookTwo = new Book(2, "Libro dos", "Nombre dos");
        Book bookThree = new Book(3, "Libro tres", "Nombre tres");
        
        
        boolean answerOne = controller.saveBook(bookOne);
        boolean answerTwo = controller.saveBook(bookTwo);
        boolean answerThree = controller.saveBook(bookThree);
        
        
        
        System.out.println(answerOne);
        System.out.println(answerTwo);
        System.out.println(answerThree);
        
        
    }

}
