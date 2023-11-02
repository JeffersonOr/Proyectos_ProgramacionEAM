/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controllers;

import Model.User;
import Singleton.Singleton;
import java.util.ArrayList;

/**
 *
 * @author jeff
 */
public class ControllerUsers {

    ArrayList<User> listUsers;

    public ControllerUsers() {

        listUsers = Singleton.getInstance().getListUser();

    }

    /////////////////Create users
    public boolean createUsers(User user) {
        User aux = readUsers(user.getIdPerson());

        if (aux == null) {
            listUsers.add(user);
            Singleton.getInstance().writeObject(listUsers);
            return true;
        }

        return false;
    }

    ///////////////Read Users
    public User readUsers(int code) {

        for (int i = 0; i < listUsers.size(); i++) {
            if (code == listUsers.get(i).getIdPerson()) {
                return listUsers.get(i);

            }
        }
        return null;
    }

    /////////////Update Users
    public boolean updateUsers(User user) {
        User aux = readUsers(user.getIdPerson());
        for (int i = 0; i < listUsers.size(); i++) {
            if (aux != null) {
                listUsers.get(i).setIdPerson(user.getIdPerson());
                listUsers.get(i).setLastNamePerson(user.getLastNamePerson());
                listUsers.get(i).setNamePerson(user.getNamePerson());
                listUsers.get(i).setRole(user.getRole());
                listUsers.get(i).setPassword(user.getPassword());
                listUsers.get(i).setNameUser(user.getNameUser());
                Singleton.getInstance().writeObject(listUsers);
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
                Singleton.getInstance().writeObject(listUsers);
                return true;
            }
        }
        return false;
    }

    ///////////Confirm sign in
    public boolean confirmSignIn(String nameUser, String password, String role) {
        for (int i = 0; i < listUsers.size(); i++) {
            if(listUsers.get(i).getNameUser().equals(nameUser) && listUsers.get(i).getPassword().equals(password) && listUsers.get(i).getRole().equals(role)){
            
            return true;
            }
        }
        return false;
    }

}
