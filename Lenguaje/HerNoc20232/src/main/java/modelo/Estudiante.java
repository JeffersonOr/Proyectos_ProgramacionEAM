/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author USUARIO
 */
public class Estudiante extends Persona{
    
    private int codigo;
    
    public Estudiante(int codigo, String nombre, int edad){
        
        super(nombre, edad);
        this.codigo = codigo;
        
    }
    
    @Override
    public void presentar(){
        System.out.println("Soy un cacahuate");
    }
    
    @Override
    public void imprimirDatos(){
        super.imprimirDatos();
        System.out.println("Codigo: "+ codigo);
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    
}
