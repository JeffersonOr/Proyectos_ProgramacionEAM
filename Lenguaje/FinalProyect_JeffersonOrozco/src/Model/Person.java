/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Usuario
 */
abstract public class Person {

    protected int idPerson;
    protected String namePerson;
    protected String lastNamePerson;
    protected String role;

    public Person(int idPerson, String namePerson, String lastNamePerson, String role) {
        this.idPerson = idPerson;
        this.namePerson = namePerson;
        this.lastNamePerson = lastNamePerson;
        this.role = role;
    }

}
