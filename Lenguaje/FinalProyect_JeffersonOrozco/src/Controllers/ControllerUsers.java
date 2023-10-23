/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controllers;

import Model.Person;
import java.util.ArrayList;

/**
 *
 * @author jeff
 */
public class ControllerUsers {

    ArrayList<Person> People = new ArrayList<>();

    /////////////////Add users
    public boolean addUsers(Person person) {
        Person aux = searchUsers(person.getIdPerson());
        for (int i = 0; i < People.size(); i++) {
            if (aux != null) {
                People.add(person);
                return true;
            }
        }
        return false;
    }

    ///////////////Search Users
    public Person searchUsers(int code) {
        int aux = code;
        for (int i = 0; i < People.size(); i++) {
            if (aux == People.get(i).getIdPerson()) {
                return People.get(i);
            }
        }
        return null;
    }

    /////////////Edit Users
    public boolean editUsers(Person person) {
        Person aux = searchUsers(person.getIdPerson());
        for (int i = 0; i < 10; i++) {
            if (aux != null) {
                People.get(i).setIdPerson(person.getIdPerson());
                People.get(i).setLastNamePerson(person.getLastNamePerson());
                People.get(i).setNamePerson(person.getNamePerson());
                People.get(i).setRole(person.getRole());
                People.get(i).setPassword(person.getPassword());
                return true;
            }
        }
        return false;
    }

    /////////////Delete Users
    public boolean deleteUsers(Person person) {
        Person aux = searchUsers(person.getIdPerson());
        for (int i = 0; i < People.size(); i++) {
            if (aux != null) {
                People.remove(i);
            }
        }
        return false;
    }
}
