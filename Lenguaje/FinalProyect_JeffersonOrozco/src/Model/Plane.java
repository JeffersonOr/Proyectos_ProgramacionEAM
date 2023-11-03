/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author jeff
 */
public class Plane {

    private int idPlane;
    private String namePlane;
    private String statusPlane;
    private int quantitySeat;

    public Plane(int idPlane, String namePlane, String statusPlane, int quantitySeat) {
        this.idPlane = idPlane;
        this.namePlane = namePlane;
        this.statusPlane = statusPlane;
        this.quantitySeat = quantitySeat;
    }

    public Plane(String namePlane) {
        this.namePlane = namePlane;

    }

    public int getIdPlane() {
        return idPlane;
    }

    public void setIdPlane(int idPlane) {
        this.idPlane = idPlane;
    }

    public String getNamePlane() {
        return namePlane;
    }

    public void setNamePlane(String namePlane) {
        this.namePlane = namePlane;
    }

    public String getStatusPlane() {
        return statusPlane;
    }

    public void setStatusPlane(String statusPlane) {
        this.statusPlane = statusPlane;
    }

    public int getQuantitySeat() {
        return quantitySeat;
    }

    public void setQuantitySeat(int quantitySeat) {
        this.quantitySeat = quantitySeat;
    }

}
