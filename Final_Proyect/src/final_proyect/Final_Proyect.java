/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package final_proyect;

import java.util.Scanner;

/**
 *
 * @author jeff
 */
public class Final_Proyect {

    //////Arrays
    ////UsuariosAtributos
    static String[] nombres;
    static String[] cedulas;
    static int[] edad;
    static String[] estrato;
    static String[] direccion;
    static String[] telefono;
    static String[] genero;
    static String[] correo;
    ////Fin usuariosAtributos

    public static void main(String[] args) {

        ////Creacion concursos (3)
        /////nombre, cedula, edad, estrato, direccion, telefono, genero y correo
        Scanner sc = new Scanner(System.in);

        System.out.println("Bienvenido al manager de concursos");

        int inputOptionUser;//Entrada del usuario para selecionar opcion del menu principal

        do {//////Do while para repetir el menu

            System.out.println("1.Para registrar concurso\n"
                    + "2.Registrar usuario\n"
                    + "0.Para terminar ejecucion");

            inputOptionUser = sc.nextInt();

            switch (inputOptionUser) {//////Validacion opciones Menu principal

                case 1://///Registrar concurso////////

                    boolean repetirRegistroConcurso = true;
                    int contador = 1;//Se declara este contador para validar las repeticiones del ciclo
                    do { //Do while para el registro de usuarios

                        int i = contador++;

                        System.out.println("Digite las caracteristicas del concurso");
                        System.out.println("Recuerde que solo puede digitar 3 concursos");
                        System.out.println("Especifique la cantidad maxima de participantes del concurso " + i);
                        int inputCantidadUsers = sc.nextInt();
                        int CantidadMaximaUsers = inputCantidadUsers;
                        if (i < 3) {
                            System.out.println("Usted ha registrado " + CantidadMaximaUsers + " cupos de participantes en el concurso " + i
                                    + "\nDesea registrar mas concursos?\n"
                                    + "1.Si\n"
                                    + "2.No");

                            int inputOptionContinuar = sc.nextInt();
                            if (inputOptionContinuar == 2) {////////Validar si desea continuar con el registro de concursos
                                repetirRegistroConcurso = false;
                                System.out.println(i + " Concurso(s) registrado(s) correctamente :)\n");
                            }
                        } else if (i == 3) {
                            repetirRegistroConcurso = false;
                            System.out.println(i + " Concurso(s) registrado(s) correctamente :)\n");
                        }

                    } while (repetirRegistroConcurso);
                    break;

                default:
                    System.out.println("Opcion invalida :c");
                    break;

            }

        } while (inputOptionUser != 0);

    }

    /////////Metodos////////////
    static boolean registrarParticipante(String nombre, String cedula, int edad) {////////////////Registrar participante

        for (int i = 0; i < cedulas.length; i++) {
            if (cedulas[i] == null) {

            }

        }

        return false;
    }

}
