/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Usuario
 */
public class AirlineEmployee extends Person {
    
    private String availability;
    private String position;

    public AirlineEmployee(int idPerson, String namePerson, String lastNamePerson) {
        super(idPerson, namePerson, lastNamePerson );
    }

    public AirlineEmployee(String availability, String position, int idPerson, String namePerson, String lastNamePerson) {
        super(idPerson, namePerson, lastNamePerson);
        this.availability = availability;
        this.position = position;
    }

    public String getAvailability() {
        return availability;
    }

    public void setAvailability(String availability) {
        this.availability = availability;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
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
