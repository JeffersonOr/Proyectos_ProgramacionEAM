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

        System.out.println("Bienvenido! \n\nMenu de seleccion\n1.Condicionales\n2.Bucles");//Principal main
        int inputOptionMain = scanner.nextInt();

        switch (inputOptionMain) {

            case 1://main condicionales

                System.out.println("Condicionales\n1.Para validar numero mayor");
                int inputOption1_MainCondicionales = scanner.nextInt();

                switch (inputOption1_MainCondicionales) {

                    case 1://Validar numero mayor

                        System.out.println("Has seleccionado verificar numero mayor");
                        System.out.println("Digita el primer numero");
                        int inputNumber1 = scanner.nextInt();
                        System.out.println("Digita el segundo numero");
                        int inputNumber2 = scanner.nextInt();
                        String resultCase1 = verifiNumbers(inputNumber1, inputNumber2);
                        System.out.println(resultCase1);
                        break;

                    default:

                        System.out.println("Numero fuera de rango x)");
                        break;

                }

                break;

            case 2://Main bucles

                System.out.println("Bucles\n1.Imprimir 1000 al 1");
                int inputOption2_MainBucles = scanner.nextInt();

                switch (inputOption2_MainBucles) {

                    case 1://1000 al 1

                        System.out.println("Has seleccinado 1000 a 1");
                        System.out.println("Digita un numero");
                        int inputNumber1_BucleOption1 = scanner.nextInt();
                        rangodeNumeros(inputNumber1_BucleOption1);
                        
                }

                break;

        }
    }

    //methots
    ///////Condicionales
    static String verifiNumbers(int number1, int number2) {//option1ValidarNumeroMayor

        String numberValidation = number1 > number2 ? "El numero " + number1 + " es mayor" : "El numero " + number2 + " es mayor";

        return numberValidation;
    }
    ///////Fin condicionales

    ///////Bucles
    
    static void rangodeNumeros(int number) {
        while (number>0) {
            number = number - 1;
            System.out.println(number);
        }
    }
    ///////Fin blucles

}
