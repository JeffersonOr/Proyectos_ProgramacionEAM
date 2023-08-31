/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author jeff
 */
public class Estudiante {
    
    private int codigo;
    private String nombre;
    private Curso curso;

    public Estudiante(int codigo, String nombre, Curso curso) {//////Contructor
        this.codigo = codigo;
        this.nombre = nombre;
        this.curso = curso;
        curso.setid(1);
        int identificador = curso.getid();
    }
    
    public double calcularNota(){
    
    return curso.calcularNotaFinal();
        
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }
    
    
    
}
