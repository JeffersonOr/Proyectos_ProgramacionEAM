/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jeffjavaapplication;

import java.util.Scanner;

/**
 *
 * @author 319pc05
 */
public class JeffJavaApplication {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        /*int numero1 = 1;
        int numero2= 6;
        
        int operacion = numero1+numero2;
        
        String message = "El resultado es: "+operacion;
        
        System.out.println(message);
              
        System.out.printin("Hello world"); //imprimir*/

        //System.out.println("Ingrese su mensaje: ");
        //String consoleMessage = scanner.nextLine();
        //System.out.println("Ingrese el valor: ");
        //int valor = scanner.nextInt();
        //String message = "Hola mundo!";
        //int valor = 10;
        //System.out.println("Mi mensaje fue: " + consoleMessage + "\nvalor: " + valor);
        //System.out.println("Ingrese su edad:");
        //int edad = scanner.nextInt();
        //boolean respuesta = validarMayor(edad);
        /*if(respuesta){
         System.out.println("Es mayor de edad");
        }else{
         System.out.println("No es mayor de edad");   
        }*/
        //String mensaje = respuesta ? "Es mayor" : "NO es mayor";
        //System.out.println(mensaje);
        
        System.out.println("Digite su numero");
        int inputNumero = scanner.nextInt();
        int Numero = validarAbsoluto(inputNumero);
        System.out.println(Numero);
    }

    /*static boolean validarMayor(int edad) {

        boolean respuesta = edad >= 18;
        return respuesta;
    }*/

    static int validarAbsoluto(int numero) {
        int verificarNumero = numero < 0 ? -(numero) : numero;
        return verificarNumero; 
    }
    
    
}
