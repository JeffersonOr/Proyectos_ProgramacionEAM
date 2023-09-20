/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author jeff
 */
public class Curso {

    private int id;
    private String nombre;
    private double notaUno;
    private double notaDos;
    private double notaTres;

    public Curso(int id, String nombre, double notaUno, double notaDos, double notaTres) {////Contructor
        this.id = id;
        this.nombre = nombre;
        this.notaUno = notaUno;
        this.notaDos = notaDos;
        this.notaTres = notaTres;
    }

    public double calcularNotaFinal() {

        return (notaUno + notaDos + notaTres / 3);

    }
    
    public int getid(){///////Se crea la limitacion para poder leer el atributo con Get
    
        return id;
    
    }
    
    public int setid(int id){//////Se crea la orden para poder modificarel atributo con set
    
    this.id=id;
    
    return id;
    
    }

}
