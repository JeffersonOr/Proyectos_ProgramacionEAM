/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.Scanner;

/**
 *
 * @author 319pc12
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Aplicaccion que nos permita hacer 1 de 3 tareas
        esto segun la opcion que elija el usuario
        1.Multiplicacion de dos numeros (Sin *)
        2.Calcular el exponente de un numero
        3.Imprimir los divisores de un numero entero
         */

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite una opcion del 1 al 3");
        int numeroDigitado = scanner.nextInt();

        switch (numeroDigitado) {

            case 1:

                System.out.println("Ha eligido la opcion 1: Multiplicar sin Signo *");
                System.out.println("¿Que numero deseas multiplicar?");
                int numeroMultiplicando = scanner.nextInt();
                System.out.println("¿Por cuanto lo quieres multiplicar?");
                int numeroMultiplicador = scanner.nextInt();
                int resultadoCase1 = multiplicacionConSuma(numeroMultiplicando, numeroMultiplicador);
                System.out.println("El resultado es: " + resultadoCase1);

                break;

            case 2:

                System.out.println("Ha eligido la opcion 2: calcular exponente ");
                System.out.println("Digita el numero base");
                int numeroBase = scanner.nextInt();
                System.out.println("¿Por cuanto lo quieres elevar?");
                int numeroPotencia = scanner.nextInt();
                int resultadoCase2 = CalcularPotencia(numeroBase, numeroPotencia);
                System.out.println("El resultado es: " + resultadoCase2);
                break;
            case 3:

                System.out.println("Ha eligido la opcion 3: imprimir divisores de un entero ");
                System.out.println("Digita el numero entero");
                int numeroEntero = scanner.nextInt();
                calcularDivisores(numeroEntero);
                break;

            default:

                System.out.println("Numero invalido, digite una opcion del 1 al 3");
                break;

        }

    }

    static int multiplicacionConSuma(int multiplicando, int multiplicador) { //Opcion 1
        int total = 0;

        for (int i = 0; i < multiplicador; i++) {
            total = total + multiplicando;

        }

        return total;

    }

    static int CalcularPotencia(int base, int potencia) { //Opcion 2
        int total = 1;

        for (int i = 0; i < potencia; i++) {
            total = total * base;

        }

        return total;

    }

    static void calcularDivisores(int numeroEntero) { //Opcion 3

        for (int i = 1; i <= numeroEntero; i++) {
            if (numeroEntero % i == 0) {

                System.out.println(i);

            }
        }

    }
}
