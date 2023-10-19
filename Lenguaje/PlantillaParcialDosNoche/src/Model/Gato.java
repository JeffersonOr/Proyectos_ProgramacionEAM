/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Usuario
 */
public class Gato extends Mascota{
    private int cantidadVacuna;

    public Gato(int cantidadVacuna, String nombre, int edad, String genero, int codigo_unico) {
        super(nombre, edad, genero, codigo_unico);
        this.cantidadVacuna = cantidadVacuna;
    }

    public int getCantidadVacuna() {
        return cantidadVacuna;
    }

    public void setCantidadVacuna(int cantidadVacuna) {
        this.cantidadVacuna = cantidadVacuna;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getCodigo_unico() {
        return codigo_unico;
    }

    public void setCodigo_unico(int codigo_unico) {
        this.codigo_unico = codigo_unico;
    }
    
}
