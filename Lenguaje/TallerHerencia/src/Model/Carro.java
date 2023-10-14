/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Usuario
 */
public class Carro extends Vehiculo{
    private String tipoVechiculo = "Carro";

    public Carro(int Numeroplaca, String marca, String modelo, String tipoVehiculo) {
        super(Numeroplaca, marca, modelo);
        this.tipoVechiculo = tipoVehiculo;
        
    }

    public String getTipoVechiculo() {
        return tipoVechiculo;
    }

    public void setTipoVechiculo(String tipoVechiculo) {
        this.tipoVechiculo = tipoVechiculo;
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
