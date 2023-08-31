/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bucles;

import java.util.Scanner;

/**
 *
 * @author jeff
 */
public class Bucles {

    /*
        
        while(Condicion){
        
        //Se repite siempre y cuando sea true
        
        }
        
        flags?
        
     */
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        /*boolean bandera = true;
        while (bandera) {
            System.out.println("Ingresamos al bucle while");
            System.out.println("1.Para finalizar");
            int valor = scanner.nextInt();
            if (valor == 1) {
                bandera = false;
            }
        }*/
        System.out.println("Ingrese el numero");
        int inputNumero = scanner.nextInt();
        String resultado = contarDivisionesPorDos(inputNumero);
        System.out.println(resultado);

    }

    static void pruebaWhile() {
        int contador = 0;

        while (contador < 10) {
            System.out.println(contador);
            contador++;
        }
    }

    static String contarDivisionesPorDos(int numero) {
        int contador = 0;

        while (numero % 2 == 0) {

            numero = numero / 2;
            contador++;

        }
        
        if(contador>1){
        return "Se realizo la division " + contador + " veces para que sea exacta";    
        }else{
        return "Se realizo la division " + contador + " vez para que sea exacta";
        }

        
    }

}
