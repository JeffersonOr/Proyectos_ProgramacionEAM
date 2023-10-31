/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controllers;


import Model.User;
import java.util.ArrayList;



/**
 *
 * @author jeff
 */
public class ControllerUsers {

    ArrayList<User> listUsers;

    public ControllerUsers() {

        listUsers = new ArrayList<>();
        

    }

    /////////////////Create users
    public boolean createUsers(User user) {
        User aux = readUsers(user.getIdPerson());

        if (aux == null) {
            listUsers.add(user);
            return true;
        }

        return false;
    }

    ///////////////Read Users
    public User readUsers(int code) {
        
        for (int i = 0; i < listUsers.size(); i++) {
            if (code==listUsers.get(i).getIdPerson()) {
                return listUsers.get(i);
            }
        }
        return null;
    }

    /////////////Update Users
    public boolean updateUsers(User user) {
        User aux = readUsers(user.getIdPerson());
        for (int i = 0; i < 10; i++) {
            if (aux != null) {
                listUsers.get(i).setIdPerson(user.getIdPerson());
                listUsers.get(i).setLastNamePerson(user.getLastNamePerson());
                listUsers.get(i).setNamePerson(user.getNamePerson());
                listUsers.get(i).setRole(user.getRole());
                listUsers.get(i).setPassword(user.getPassword());
                listUsers.get(i).setNameUser(user.getNameUser());
                return true;
            }
        }
        return false;
    }

    /////////////Delete Users
    public boolean deleteUsers(User user) {
        User aux = readUsers(user.getIdPerson());
        for (int i = 0; i < listUsers.size(); i++) {
            if (aux != null) {
                listUsers.remove(i);
            }
        }
        return false;
    }



   

}
