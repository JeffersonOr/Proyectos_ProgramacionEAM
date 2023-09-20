/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author jeff
 */
public class Programa {
    private String nombre;
    private int codigo;
    private String fechaCreacion;
    private String facultad;
    private String Pre_Requisitos;
    private int duracion_Meses;

    public Programa(String nombre, int codigo, String fechaCreacion, String facultad) {/////PREGRADO
        this.nombre = nombre;
        this.codigo = codigo;
        this.fechaCreacion = fechaCreacion;
        this.facultad = facultad;
    }

    public Programa(String nombre, int codigo, String fechaCreacion, String Pre_Requisitos, int duracion_Meses) {////POSTGRADO
        this.nombre = nombre;
        this.codigo = codigo;
        this.fechaCreacion = fechaCreacion;
        this.Pre_Requisitos = Pre_Requisitos;
        this.duracion_Meses = duracion_Meses;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(String fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public String getFacultad() {
        return facultad;
    }

    public void setFacultad(String facultad) {
        this.facultad = facultad;
    }

    public String getPre_Requisitos() {
        return Pre_Requisitos;
    }

    public void setPre_Requisitos(String Pre_Requisitos) {
        this.Pre_Requisitos = Pre_Requisitos;
    }

    public int getDuracion_Meses() {
        return duracion_Meses;
    }

    public void setDuracion_Meses(int duracion_Meses) {
        this.duracion_Meses = duracion_Meses;
    }
    
    
    
    
    
    
            
}
