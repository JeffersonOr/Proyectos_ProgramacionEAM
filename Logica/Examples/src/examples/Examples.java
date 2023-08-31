/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examples;

import java.util.Scanner;

/**
 *
 * @author jeff
 */
public class Examples {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int inputOptionMain = sc.nextInt();

        do {

            System.out.println("Ejemplos programacion");

            switch (inputOptionMain) {////////Menu principal

                case 1://///////Menu Bucles

                    int inputOptionBucles = sc.nextInt();
                    switch (inputOptionBucles) {
                        case 1:
                            System.out.println("Has seleccinado 1000 a 1");
                            System.out.println("Digita un numero");
                            int inputNumber1_BucleOption1 = sc.nextInt();
                            rangodeNumeros(inputNumber1_BucleOption1);

                            break;

                    }

                    break;
            }

        } while (inputOptionMain != 0);

    }
    
    
    
    

}
