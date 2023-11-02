/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Usuario
 */
public abstract class  Person {

    protected int idPerson;
    protected String namePerson;
    protected String lastNamePerson;

    public Person(int idPerson, String namePerson, String lastNamePerson) {
        this.idPerson = idPerson;
        this.namePerson = namePerson;
        this.lastNamePerson = lastNamePerson;
    }
    
    



    public int getIdPerson() {
        return idPerson;
    }

    public void setIdPerson(int idPerson) {
        this.idPerson = idPerson;
    }

    public String getNamePerson() {
        return namePerson;
    }

    public void setNamePerson(String namePerson) {
        this.namePerson = namePerson;
    }

    public String getLastNamePerson() {
        return lastNamePerson;
    }

    public void setLastNamePerson(String lastNamePerson) {
        this.lastNamePerson = lastNamePerson;
    }


    
    

}
