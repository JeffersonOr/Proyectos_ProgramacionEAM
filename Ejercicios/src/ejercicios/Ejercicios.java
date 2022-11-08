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

        System.out.println("Bienvenido!\n\n"
                + "Menu de seleccion\n\n"
                + "1.Condicionales\n"
                + "2.Bucles\n"
                + "3.Taller de repaso Modulo 3");//Principal main
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

            case 3: //Taller de repaso Modulo 3

                System.out.println("\nTaller de repaso Modulo 3\n\n"
                        + "Selecciona una opcion:\n\n"
                        + "1.Cree un método que dado un número entero positivo y mayor que 1\n"
                        + "determine si es este un número perfecto o no.\n\n"
                        + "2.Construya un programa que permita al usuario ingresar una palabra como si\n"
                        + "fuese su contraseña, después de esto, el programa debe pedir de manera\n"
                        + "consecutiva al usuario que ingrese nuevamente la contraseña hasta que esta\n"
                        + "coincida con la primera palabra ingresada.\n\n"
                        + "3.Construya un método que permita determinar si un número es primo, si es\n"
                        + "así que calcule su tabla de multiplicar desde el 1 hasta el 20.\n\n"
                        + "4.Construya un programa tipo menú que le permita realizar cualquiera de los\n"
                        + "ejercicios del 1 al 3, una última opción que le permita dar por finalizada la\n"
                        + "ejecución, si la opción elegida es diferente a cualquiera de estas le debe\n"
                        + "solicitar nuevamente el ingreso de una opción del menú. (Siempre que\n"
                        + "termine una de las tareas del menú, regresará a dar las opciones del menú\n"
                        + "hasta que elija la opción salir).");
                int inputOption3_MainTallerDeRepasoModulo3 = scanner.nextInt();

                switch (inputOption3_MainTallerDeRepasoModulo3) {

                    case 1:

                        System.out.println("Has eligido la opcion 1\nPor favor digita un numero:");
                        int inputNumber1_MainTallerDeRepasoModulo3Option1 = scanner.nextInt();
                        String resultCase1_MainTallerDeRepasoModulo3 = validarNumeroPefecto(inputNumber1_MainTallerDeRepasoModulo3Option1);
                        System.out.println(resultCase1_MainTallerDeRepasoModulo3);
                        break;

                    case 2:
                        System.out.println("Has eligido la opcion 1\nPor favor crea una contraseña:");
                        String inputPassword_MainTallerDeRepasoModulo3Option2 = scanner.nextLine();
                        System.out.println("Contraseña creada satisfactoriamente ;D\n"
                                + "Verifica tu contraseña:");
                        String inputVerificPassword_MainTallerDeRepasoModulo3Option2 = scanner.nextLine();
                        boolean resultValidation;

                        if (inputPassword_MainTallerDeRepasoModulo3Option2 == inputVerificPassword_MainTallerDeRepasoModulo3Option2) {

                            resultValidation = false;
                            System.out.println("Contraseña valida :D");

                        } else {

                            resultValidation = true;
                            while (resultValidation) {
                                System.out.println("Contraseña invalida D:\n"
                                        + "Digite nuevamente su contraseña:");
                                inputVerificPassword_MainTallerDeRepasoModulo3Option2 = scanner.nextLine();
                                if (inputPassword_MainTallerDeRepasoModulo3Option2 == inputVerificPassword_MainTallerDeRepasoModulo3Option2) {
                                    resultValidation = false;
                                }

                            }
                        }

                        break;

                    default:

                        break;

                }

                break;

        }
    }

    ///////////////////////////////////methots
    ///////Condicionales
    static String verifiNumbers(int number1, int number2) {//option1ValidarNumeroMayor

        String numberValidation = number1 > number2 ? "El numero " + number1 + " es mayor" : "El numero " + number2 + " es mayor";

        return numberValidation;
    }
    ///////Fin condicionales

    ///////Bucles
    static void rangodeNumeros(int number) {
        while (number > 0) {
            number = number - 1;
            System.out.println(number);
        }
    }
    ///////Fin blucles

    //////Taller de repaso Modulo 3
    static String validarNumeroPefecto(int number) {//option1

        String message = number % 2 == 0 ? "Es perfecto" : "No es perfecto";

        return message;

    }

    //////Fin taller de repaso Modulo 3
}
