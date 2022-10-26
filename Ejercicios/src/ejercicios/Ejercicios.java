/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicios;

import java.util.Scanner;

/**
 *
 * @author jeff
 */
public class Ejercicios {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Bienvenido! \n\nMenu de seleccion\n1.Verificar numero mayor");
        int inputOption1 = scanner.nextInt();

        switch (inputOption1) {

            case 1://Validar numero mayor

                System.out.println("Has seleccionado verificar numero mayor");
                System.out.println("Digita el primer numero");
                int number1 = scanner.nextInt();
                System.out.println("Digita el segundo numero");
                int number2 = scanner.nextInt();
                String resultCase1 = verifiNumbers(number1, number2);
                System.out.println(resultCase1);
                break;

            default:
                
                System.out.println("Numero fuera de rango x)");
                break;

        }
    }

    //methots
    static String verifiNumbers(int number1, int number2) {//option1

        String numberValidation = number1 > number2 ? "El numero " + number1 + " es mayor" : "El numero " + number2 + " es mayor";

        return numberValidation;
    }

}
