/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Usuario
 */
public class Vehiculo {
    protected int Numeroplaca;
    protected String marca;
    protected String modelo;

    public Vehiculo(int Numeroplaca, String marca, String modelo) {
        this.Numeroplaca = Numeroplaca;
        this.marca = marca;
        this.modelo = modelo;
    }

    public int getNumeroplaca() {
        return Numeroplaca;
    }

    public void setNumeroplaca(int Numeroplaca) {
        this.Numeroplaca = Numeroplaca;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    
    
    
}
