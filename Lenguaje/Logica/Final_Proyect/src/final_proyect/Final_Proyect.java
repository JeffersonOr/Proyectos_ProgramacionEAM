/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package final_proyect;

import java.text.DecimalFormat;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author jeff
 */
public class Final_Proyect {

    //////Arrays
    ////Concursos
    static int[] cantidadesMax = new int[3];//Se crea este array para almacenar los limites de usuarios de cada concurso
    static String[] concursosActivos = new String[]{"Inactivo", "Inactivo", "Inactivo"};
    static String[] nombresConcursos = new String[]{"Sin nombre", "Sin nombre", "Sin nombre"};
    static int[] cupos = new int[3];
    static double[] porcentajeOcupacion = new double[]{0, 0, 0};
    ////Concursos

    ////UsuariosAtributosConcurso1
    static String[] nombresUserConcurso1 = new String[]{null};
    static String[] cedulasUserConcurso1 = new String[]{null};
    static int[] edadesUserConcurso1 = new int[]{0};
    static int[] estratosUserConcurso1 = new int[]{0};
    static String[] direccionesUserConcurso1 = new String[]{null};
    static String[] telefonosUserConcurso1 = new String[]{null};
    static String[] generosUserConcurso1 = new String[]{null};
    static String[] correosUserConcurso1 = new String[]{null};
    static int[] numerosUserAleatorioConcurso1 = new int[]{0};
    static String[] concursosUser1 = new String[]{null};
    ////Fin usuariosAtributosConcurso1

    ////UsuariosAtributosConcurso2
    static String[] nombresUserConcurso2 = new String[]{null};
    static String[] cedulasUserConcurso2 = new String[]{null};
    static int[] edadesUserConcurso2 = new int[]{0};
    static int[] estratosUserConcurso2 = new int[]{0};
    static String[] direccionesUserConcurso2 = new String[]{null};
    static String[] telefonosUserConcurso2 = new String[]{null};
    static String[] generosUserConcurso2 = new String[]{null};
    static String[] correosUserConcurso2 = new String[]{null};
    static int[] numerosUserAleatorioConcurso2 = new int[]{0};
    static String[] concursosUser2 = new String[]{null};
    ////Fin usuariosAtributosConcurso2

    ////UsuariosAtributosConcurso3
    static String[] nombresUserConcurso3 = new String[]{null};
    static String[] cedulasUserConcurso3 = new String[]{null};
    static int[] edadesUserConcurso3 = new int[]{0};
    static int[] estratosUserConcurso3 = new int[]{0};
    static String[] direccionesUserConcurso3 = new String[]{null};
    static String[] telefonosUserConcurso3 = new String[]{null};
    static String[] generosUserConcurso3 = new String[]{null};
    static String[] correosUserConcurso3 = new String[]{null};
    static int[] numerosUserAleatorioConcurso3 = new int[]{0};
    static String[] concursosUser3 = new String[]{null};
    ////Fin usuariosAtributosConcurso3

    public static void main(String[] args) {

        ////Creacion concursos (3)
        /////nombre, cedula, edad, estrato, direccion, telefono, genero y correo
        Scanner sc = new Scanner(System.in);
        Random ra = new Random();
        DecimalFormat DecimalFormat = new DecimalFormat(" #% ");

        System.out.println("Bienvenido al manager de concursos");

        int inputOptionUser;//Entrada del usuario para selecionar opcion del menu principal

        do {//////Do while para repetir el menu

            System.out.println("1.Para registrar concurso\n"
                    + "2.Registrar usuario\n"
                    + "3.Status\n"
                    + "4.Administrar usuario\n"
                    + "5.Para determinar ganador\n"
                    + "0.Para terminar ejecucion");

            inputOptionUser = sc.nextInt();

            switch (inputOptionUser) {//////Validacion opciones Menu principal

                case 1:////////////////Registrar concurso//////////////////

                    boolean repetirRegistroConcurso = true;
                    int contador = 0;//Se declara este contador para validar las repeticiones del ciclo
                    int numeroConcurso = 1;//Se declara para mostrar en pantalla el numero de concurso

                    do { //Do while para el registro de usuarios

                        int i = contador++;
                        int concursoNumero = numeroConcurso++;

                        System.out.println("Digite las caracteristicas del concurso");
                        System.out.println("Recuerde que solo puede digitar 3 concursos");
                        System.out.println("Especifique la cantidad maxima de participantes del concurso " + concursoNumero);
                        int inputCantidadUsers = sc.nextInt();
                        System.out.println("Digite el nombre del concurso");
                        String nombreConcurso1 = sc.nextLine();
                        String inputnombreConcurso = sc.nextLine();

                        cantidadesMax[i] = inputCantidadUsers;//////Resgistrar Cantidad Maxima en el Array
                        cupos[i] = inputCantidadUsers;/////Se registra los cupos (Esto con el fin de calcular el porcentaje de ocupacion)
                        concursosActivos[i] = "Activo";////Activar concurso en el Array
                        nombresConcursos[i] = inputnombreConcurso;////Registrar nombre del concurso en el Array

                        if (i < 2) {////////Validar si desea continuar con el registro de concursos
                            System.out.println("Usted ha registrado " + inputCantidadUsers + " cupos de participantes en el concurso " + concursoNumero + "(" + inputnombreConcurso + ")"
                                    + "\nDesea registrar mas concursos?\n"
                                    + "1.Si\n"
                                    + "2.No");

                            int inputOptionContinuar = sc.nextInt();

                            if (inputOptionContinuar == 2) {
                                repetirRegistroConcurso = false;
                                System.out.println(concursoNumero + " Concurso(s) registrado(s) correctamente :)\n");
                            }
                        } else if (i == 2) {
                            repetirRegistroConcurso = false;
                            System.out.println(concursoNumero + " Concurso(s) registrado(s) correctamente :)\n");
                        }

                    } while (repetirRegistroConcurso);
                    break;

                /////////////////Fin registro concurso///////////////////////////
                case 2://///////////////////Registro de usuarios en concursos////////////////////////////////

                    if (concursosActivos[0] == "Inactivo" && concursosActivos[1] == "Inactivo" && concursosActivos[2] == "Inactivo") {
                        System.out.println("Lo sentimos, no hay concursos activos :(");

                    } else {

                        int inputOptionConcurso;

                        do {

                            System.out.println("Bienvenido al registro de usuarios\n"
                                    + "A que concurso lo deseas registrar?\n"
                                    + "1.Concurso " + nombresConcursos[0] + "(" + concursosActivos[0] + ")\n"
                                    + "2.Concurso " + nombresConcursos[1] + "(" + concursosActivos[1] + ")\n"
                                    + "3.Concurso " + nombresConcursos[2] + "(" + concursosActivos[2] + ")\n"
                                    + "0.Para regresar al menu principal");

                            inputOptionConcurso = sc.nextInt();

                            switch (inputOptionConcurso) {/////////////////////SubMenu Registro de participantes en concurso

                                case 1:////////Registro de usuario en concurso 1

                                    if (concursosActivos[0] == "Inactivo") {////Primero validamos si esta disponible

                                        System.out.println("\nEste concurso no esta disponible >:c\n");

                                    } else {///Si esta disponible se procede al siguiente paso

                                        if (cantidadesMax[0] <= 0) {/////Segundo se valida si hay cupos disponibles con esta condicional

                                            System.out.println("Lo sentimos, no quedan cupos disponibles en el concurso: " + nombresConcursos[0] + "\n"
                                                    + ":(");

                                        } else {///Si hay cupos se procede al registro de participantes

                                            ///////////////////////////////////////////////////////////////Inicializamos los atributos del usuario para determinar el tamaño de cada Array a corde al concurso 
                                            ///////////////////////////////////////////////////////////////Esto con el fin de saber la cantidad de usuarios registrados en el concurso
                                            nombresUserConcurso1 = new String[cantidadesMax[0]];
                                            cedulasUserConcurso1 = new String[cantidadesMax[0]];
                                            edadesUserConcurso1 = new int[cantidadesMax[0]];
                                            estratosUserConcurso1 = new int[cantidadesMax[0]];
                                            direccionesUserConcurso1 = new String[cantidadesMax[0]];
                                            telefonosUserConcurso1 = new String[cantidadesMax[0]];
                                            generosUserConcurso1 = new String[cantidadesMax[0]];
                                            correosUserConcurso1 = new String[cantidadesMax[0]];
                                            numerosUserAleatorioConcurso1 = new int[cantidadesMax[0]];

                                            //////////////////////////////////////////////////////////////
                                            /////////////////////////////////////////////////////////////
                                            System.out.println("Iniciando registro de usuario en concurso: " + nombresConcursos[0] + "...");
                                            int contadorRegistroConcurso1 = 1;
                                            int asignacionNumeroConcurso1 = 1;
                                            boolean repetirRegistroParticipantes = true;

                                            int i = 0;///Contador para controlar la veces en que se repite el ciclo do while
                                            int numeroUsuario = 1;

                                            do {

                                                System.out.println("Cupos maximos: " + (cantidadesMax[0] - 1));
                                                boolean validar = true;

                                                System.out.println("Digita la cedula");///////////////////CedulaPersona
                                                String inputCedulaPersona1 = sc.nextLine();
                                                String inputCedulaPersonaConcurso1 = sc.nextLine();

                                                System.out.println("Digita el nombre");////////////////NombrePersona

                                                String inputNombrePersonaConcurso1 = sc.nextLine();

                                                System.out.println("Por favor digita la edad de la persona");/////////////EdadPersona
                                                validar = true;
                                                int inputEdadPersonaConcurso1 = 0;

                                                while (validar) {//////While para validar si es mayor de edad
                                                    inputEdadPersonaConcurso1 = sc.nextInt();
                                                    if (inputEdadPersonaConcurso1 >= 18) {
                                                        validar = false;
                                                    } else {
                                                        System.out.println("La persona no es mayor de edad >:o\n"
                                                                + "Digita nuevamente la edad");
                                                    }

                                                }

                                                System.out.println("Digita el estrato\n"
                                                        + "Solo puede digitar un numero del 1 al 6");/////////////estratoPersona
                                                int inputEstratoPersonaConcurso1 = 0;
                                                validar = true;

                                                while (validar) {//////While para validar si el estrato esta entre 1 y 6
                                                    inputEstratoPersonaConcurso1 = sc.nextInt();
                                                    if (inputEstratoPersonaConcurso1 >= 1 && inputEstratoPersonaConcurso1 <= 6) {
                                                        validar = false;
                                                    } else {
                                                        System.out.println("Numero fuera de rango >:c\n"
                                                                + "Digita nuevamente el estrato");
                                                    }

                                                }

                                                System.out.println("Digita la direccion");//////////DireccionPersona
                                                String inputDireccionPersona1 = sc.nextLine();
                                                String inputDireccionPersonaConcurso1 = sc.nextLine();

                                                System.out.println("Digita el telefono");//////////TelefonoPersona

                                                String inputTefonoPersonaConcurso1 = sc.nextLine();

                                                System.out.println("Digita el genero");//////////GeneroPersona

                                                String inputGeneroPersonaConcurso1 = sc.nextLine();

                                                System.out.println("Digita el correo de la persona");///////CorreoPersona

                                                String inputCorreoPersonaConcurso1 = sc.nextLine();

                                                ////////////////////////////////////////////////////////Se procede a registrar los datos en los arrays
                                                nombresUserConcurso1[i] = inputNombrePersonaConcurso1;
                                                cedulasUserConcurso1[i] = inputCedulaPersonaConcurso1;
                                                edadesUserConcurso1[i] = inputEdadPersonaConcurso1;
                                                estratosUserConcurso1[i] = inputEstratoPersonaConcurso1;
                                                direccionesUserConcurso1[i] = inputDireccionPersonaConcurso1;
                                                telefonosUserConcurso1[i] = inputTefonoPersonaConcurso1;
                                                generosUserConcurso1[i] = inputGeneroPersonaConcurso1;
                                                correosUserConcurso1[i] = inputCorreoPersonaConcurso1;
                                                concursosUser1 = new String[]{nombresConcursos[0]};/////Se registra el concurso a la persona

                                                numerosUserAleatorioConcurso1[i] = numeroUsuario;
                                                ///////////////////////////////////////////////////////

                                                System.out.println("Participante registrado correctamente :)");

                                                i = contadorRegistroConcurso1++;/////Se procede a sumar al contador
                                                numeroUsuario = asignacionNumeroConcurso1 + 1;///////Variable para asignar un numero al participante
                                                int validarCantidadConcurso1 = cantidadesMax[0] - 1;////Con esta variable validamos si se alcanza el limite de cupos o no
                                                cantidadesMax[0] = validarCantidadConcurso1;/////Se procede a agregar el cupo disponible al array del concurso

                                                validar = true;
                                                if (validarCantidadConcurso1 == 0) {
                                                    System.out.println("Se ha alcanzado el limite de cupos");
                                                    repetirRegistroParticipantes = false;
                                                } else {

                                                    while (validar) {////////While para validar si desea agregar mas y verificar las opciones que se ingresan

                                                        System.out.println("Deseas agregar mas participantes?\n"
                                                                + "S.Para si\nN.para no");

                                                        String inputValiregistar = sc.next();
                                                        switch (inputValiregistar) {////////SubMenu para que lea lo que el usuario digito (Si digita N o S)

                                                            case "N":
                                                                repetirRegistroParticipantes = false;
                                                                validar = false;
                                                                break;

                                                            case "S":
                                                                repetirRegistroParticipantes = true;
                                                                validar = false;
                                                                break;
                                                            default:
                                                                System.out.println("Opcion invalida >:c");
                                                                break;
                                                        }

                                                    }
                                                }

                                            } while (repetirRegistroParticipantes);
                                        }
                                    }
                                    break;

                                case 2:////////Registro de usuario en concurso 2
                                    if (concursosActivos[1] == "Inactivo") {////Primero validamos si esta disponible

                                        System.out.println("\nEste concurso no esta disponible >:c\n");

                                    } else {///Si esta disponible se procede al siguiente paso

                                        if (cantidadesMax[1] <= 0) {/////Segundo se valida si hay cupos disponibles con esta condicional

                                            System.out.println("Lo sentimos, no quedan cupos disponibles en el concurso: " + nombresConcursos[1] + "\n"
                                                    + ":(");

                                        } else {///Si hay cupos se procede al registro de participantes

                                            ///////////////////////////////////////////////////////////////Inicializamos los atributos del usuario para determinar el tamaño de cada Array a corde al concurso 
                                            ///////////////////////////////////////////////////////////////Esto con el fin de saber la cantidad de usuarios registrados en el concurso
                                            nombresUserConcurso2 = new String[cantidadesMax[1]];
                                            cedulasUserConcurso2 = new String[cantidadesMax[1]];
                                            edadesUserConcurso2 = new int[cantidadesMax[1]];
                                            estratosUserConcurso2 = new int[cantidadesMax[1]];
                                            direccionesUserConcurso2 = new String[cantidadesMax[1]];
                                            telefonosUserConcurso2 = new String[cantidadesMax[1]];
                                            generosUserConcurso2 = new String[cantidadesMax[1]];
                                            correosUserConcurso2 = new String[cantidadesMax[1]];
                                            numerosUserAleatorioConcurso2 = new int[cantidadesMax[1]];

                                            //////////////////////////////////////////////////////////////
                                            /////////////////////////////////////////////////////////////
                                            System.out.println("Iniciando registro de usuario en concurso: " + nombresConcursos[1] + "...");
                                            int contadorRegistroConcurso2 = 1;
                                            boolean repetirRegistroParticipantes = true;

                                            int i = 0;///Contador para controlar la veces en que se repite el ciclo do while
                                            int numeroUsuario = 1;

                                            do {

                                                System.out.println("Cupos maximos: " + (cantidadesMax[1] - 1));
                                                boolean validar = true;

                                                System.out.println("Digita la cedula");///////////////////CedulaPersona
                                                String inputCedulaPersona1 = sc.nextLine();
                                                String inputCedulaPersonaConcurso2 = sc.nextLine();

                                                System.out.println("Digita el nombre");////////////////NombrePersona

                                                String inputNombrePersonaConcurso2 = sc.nextLine();

                                                System.out.println("Por favor digita la edad de la persona");/////////////EdadPersona
                                                validar = true;
                                                int inputEdadPersonaConcurso2 = 0;

                                                while (validar) {//////While para validar si es mayor de edad
                                                    inputEdadPersonaConcurso2 = sc.nextInt();
                                                    if (inputEdadPersonaConcurso2 >= 18) {
                                                        validar = false;
                                                    } else {
                                                        System.out.println("La persona no es mayor de edad >:o\n"
                                                                + "Digita nuevamente la edad");
                                                    }

                                                }

                                                System.out.println("Digita el estrato\n"
                                                        + "Solo puede digitar un numero del 1 al 6");/////////////estratoPersona
                                                int inputEstratoPersonaConcurso2 = 0;
                                                validar = true;

                                                while (validar) {//////While para validar si el estrato esta entre 1 y 6
                                                    inputEstratoPersonaConcurso2 = sc.nextInt();
                                                    if (inputEstratoPersonaConcurso2 >= 1 && inputEstratoPersonaConcurso2 <= 6) {
                                                        validar = false;
                                                    } else {
                                                        System.out.println("Numero fuera de rango >:c\n"
                                                                + "Digita nuevamente el estrato");
                                                    }

                                                }

                                                System.out.println("Digita la direccion");//////////DireccionPersona
                                                String inputDireccionPersona1 = sc.nextLine();
                                                String inputDireccionPersonaConcurso2 = sc.nextLine();

                                                System.out.println("Digita el telefono");//////////TelefonoPersona

                                                String inputTefonoPersonaConcurso2 = sc.nextLine();

                                                System.out.println("Digita el genero");//////////GeneroPersona

                                                String inputGeneroPersonaConcurso2 = sc.nextLine();

                                                System.out.println("Digita el correo de la persona");///////CorreoPersona

                                                String inputCorreoPersonaConcurso2 = sc.nextLine();

                                                ////////////////////////////////////////////////////////Se procede a registrar los datos en los arrays
                                                nombresUserConcurso2[i] = inputNombrePersonaConcurso2;
                                                cedulasUserConcurso2[i] = inputCedulaPersonaConcurso2;
                                                edadesUserConcurso2[i] = inputEdadPersonaConcurso2;
                                                estratosUserConcurso2[i] = inputEstratoPersonaConcurso2;
                                                direccionesUserConcurso2[i] = inputDireccionPersonaConcurso2;
                                                telefonosUserConcurso2[i] = inputTefonoPersonaConcurso2;
                                                generosUserConcurso2[i] = inputGeneroPersonaConcurso2;
                                                correosUserConcurso2[i] = inputCorreoPersonaConcurso2;
                                                concursosUser2 = new String[]{nombresConcursos[1]};/////Se registra el concurso a la persona

                                                numerosUserAleatorioConcurso2[i] = numeroUsuario;
                                                ///////////////////////////////////////////////////////

                                                System.out.println("Participante registrado correctamente :)");

                                                i = contadorRegistroConcurso2++;/////Se procede a sumar al contador
                                                numeroUsuario = numeroUsuario++;///////Variable para asignar un numero al participante
                                                int validarCantidadConcurso2 = cantidadesMax[1] - 1;////Con esta variable validamos si se alcanza el limite de cupos o no
                                                cantidadesMax[1] = validarCantidadConcurso2;/////Se procede a agregar el cupo disponible al array del concurso

                                                validar = true;
                                                if (validarCantidadConcurso2 == 0) {
                                                    System.out.println("Se ha alcanzado el limite de cupos");
                                                    repetirRegistroParticipantes = false;
                                                } else {

                                                    while (validar) {////////While para validar si desea agregar mas y verificar las opciones que se ingresan

                                                        System.out.println("Deseas agregar mas participantes?\n"
                                                                + "S.Para si\nN.para no");

                                                        String inputValiregistar = sc.next();
                                                        switch (inputValiregistar) {////////SubMenu para que lea lo que el usuario digito (Si digita N o S)

                                                            case "N":
                                                                repetirRegistroParticipantes = false;
                                                                validar = false;
                                                                break;

                                                            case "S":
                                                                repetirRegistroParticipantes = true;
                                                                validar = false;
                                                                break;
                                                            default:
                                                                System.out.println("Opcion invalida >:c");
                                                                break;
                                                        }

                                                    }
                                                }

                                            } while (repetirRegistroParticipantes);
                                        }
                                    }

                                    break;

                                case 3:
                                    if (concursosActivos[2] == "Inactivo") {////Primero validamos si esta disponible

                                        System.out.println("\nEste concurso no esta disponible >:c\n");

                                    } else {///Si esta disponible se procede al siguiente paso

                                        if (cantidadesMax[2] <= 0) {/////Segundo se valida si hay cupos disponibles con esta condicional

                                            System.out.println("Lo sentimos, no quedan cupos disponibles en el concurso: " + nombresConcursos[2] + "\n"
                                                    + ":(");

                                        } else {///Si hay cupos se procede al registro de participantes

                                            ///////////////////////////////////////////////////////////////Inicializamos los atributos del usuario para determinar el tamaño de cada Array a corde al concurso 
                                            ///////////////////////////////////////////////////////////////Esto con el fin de saber la cantidad de usuarios registrados en el concurso
                                            nombresUserConcurso3 = new String[cantidadesMax[2]];
                                            cedulasUserConcurso3 = new String[cantidadesMax[2]];
                                            edadesUserConcurso3 = new int[cantidadesMax[2]];
                                            estratosUserConcurso3 = new int[cantidadesMax[2]];
                                            direccionesUserConcurso3 = new String[cantidadesMax[2]];
                                            telefonosUserConcurso3 = new String[cantidadesMax[2]];
                                            generosUserConcurso3 = new String[cantidadesMax[2]];
                                            correosUserConcurso3 = new String[cantidadesMax[2]];
                                            numerosUserAleatorioConcurso3 = new int[cantidadesMax[2]];

                                            //////////////////////////////////////////////////////////////
                                            /////////////////////////////////////////////////////////////
                                            System.out.println("Iniciando registro de usuario en concurso: " + nombresConcursos[2] + "...");
                                            int contadorRegistroConcurso3 = 1;
                                            boolean repetirRegistroParticipantes = true;

                                            int i = 0;///Contador para controlar la veces en que se repite el ciclo do while
                                            int numeroUsuario = 1;

                                            do {

                                                System.out.println("Cupos maximos: " + (cantidadesMax[2] - 1));
                                                boolean validar = true;

                                                System.out.println("Digita la cedula");///////////////////CedulaPersona
                                                String inputCedulaPersona1 = sc.nextLine();
                                                String inputCedulaPersonaConcurso3 = sc.nextLine();

                                                System.out.println("Digita el nombre");////////////////NombrePersona

                                                String inputNombrePersonaConcurso3 = sc.nextLine();

                                                System.out.println("Por favor digita la edad de la persona");/////////////EdadPersona
                                                validar = true;
                                                int inputEdadPersonaConcurso3 = 0;

                                                while (validar) {//////While para validar si es mayor de edad
                                                    inputEdadPersonaConcurso3 = sc.nextInt();
                                                    if (inputEdadPersonaConcurso3 >= 18) {
                                                        validar = false;
                                                    } else {
                                                        System.out.println("La persona no es mayor de edad >:o\n"
                                                                + "Digita nuevamente la edad");
                                                    }

                                                }

                                                System.out.println("Digita el estrato\n"
                                                        + "Solo puede digitar un numero del 1 al 6");/////////////estratoPersona
                                                int inputEstratoPersonaConcurso3 = 0;
                                                validar = true;

                                                while (validar) {//////While para validar si el estrato esta entre 1 y 6
                                                    inputEstratoPersonaConcurso3 = sc.nextInt();
                                                    if (inputEstratoPersonaConcurso3 >= 1 && inputEstratoPersonaConcurso3 <= 6) {
                                                        validar = false;
                                                    } else {
                                                        System.out.println("Numero fuera de rango >:c\n"
                                                                + "Digita nuevamente el estrato");
                                                    }

                                                }

                                                System.out.println("Digita la direccion");//////////DireccionPersona
                                                String inputDireccionPersona1 = sc.nextLine();
                                                String inputDireccionPersonaConcurso3 = sc.nextLine();

                                                System.out.println("Digita el telefono");//////////TelefonoPersona

                                                String inputTefonoPersonaConcurso3 = sc.nextLine();

                                                System.out.println("Digita el genero");//////////GeneroPersona

                                                String inputGeneroPersonaConcurso3 = sc.nextLine();

                                                System.out.println("Digita el correo de la persona");///////CorreoPersona

                                                String inputCorreoPersonaConcurso3 = sc.nextLine();

                                                ////////////////////////////////////////////////////////Se procede a registrar los datos en los arrays
                                                nombresUserConcurso3[i] = inputNombrePersonaConcurso3;
                                                cedulasUserConcurso3[i] = inputCedulaPersonaConcurso3;
                                                edadesUserConcurso3[i] = inputEdadPersonaConcurso3;
                                                estratosUserConcurso3[i] = inputEstratoPersonaConcurso3;
                                                direccionesUserConcurso3[i] = inputDireccionPersonaConcurso3;
                                                telefonosUserConcurso3[i] = inputTefonoPersonaConcurso3;
                                                generosUserConcurso3[i] = inputGeneroPersonaConcurso3;
                                                correosUserConcurso3[i] = inputCorreoPersonaConcurso3;
                                                concursosUser3 = new String[]{nombresConcursos[2]};/////Se registra el concurso a la persona

                                                numerosUserAleatorioConcurso3[i] = numeroUsuario;
                                                ///////////////////////////////////////////////////////

                                                System.out.println("Participante registrado correctamente :)");

                                                i = contadorRegistroConcurso3++;/////Se procede a sumar al contador
                                                numeroUsuario = numeroUsuario++;///////Variable para asignar un numero al participante
                                                int validarCantidadConcurso3 = cantidadesMax[2] - 1;////Con esta variable validamos si se alcanza el limite de cupos o no
                                                cantidadesMax[2] = validarCantidadConcurso3;/////Se procede a agregar el cupo disponible al array del concurso

                                                validar = true;
                                                if (validarCantidadConcurso3 == 0) {
                                                    System.out.println("Se ha alcanzado el limite de cupos");
                                                    repetirRegistroParticipantes = false;
                                                } else {

                                                    while (validar) {////////While para validar si desea agregar mas y verificar las opciones que se ingresan

                                                        System.out.println("Deseas agregar mas participantes?\n"
                                                                + "S.Para si\nN.para no");

                                                        String inputValiregistar = sc.next();
                                                        switch (inputValiregistar) {////////SubMenu para que lea lo que el usuario digito (Si digita N o S)

                                                            case "N":
                                                                repetirRegistroParticipantes = false;
                                                                validar = false;
                                                                break;

                                                            case "S":
                                                                repetirRegistroParticipantes = true;
                                                                validar = false;
                                                                break;
                                                            default:
                                                                System.out.println("Opcion invalida >:c");
                                                                break;
                                                        }

                                                    }
                                                }

                                            } while (repetirRegistroParticipantes);
                                        }
                                    }

                                    break;

                                default:
                                    break;

                            }
                        } while (inputOptionConcurso != 0);///////Do while para decidir si repetir el SubMenu o no
                    }
                    break;
                ///////////////////////////Fin registro usuario en concurso////////////////////////////

                case 3://////////////////////////Status///////////////////////

                    int inputOptionAdvanced;

                    do {
                        System.out.println("1.Status concurses\n"
                                + "2.Status users arrays\n"
                                + "0.Back to main");

                        inputOptionAdvanced = sc.nextInt();

                        switch (inputOptionAdvanced) {

                            case 1:///Status concurses

                                double ocupacionConcurso1 = cantidadesMax[0] / cupos[0];
                                System.out.println("Concurso 1\n"
                                        + "\nCupos maximos: " + cupos[0]
                                        + "\nCupos disponibles: " + cantidadesMax[0]
                                        + "\nPorcentaje de ocupacion: " + ocupacionConcurso1
                                        + "\nNombre: " + nombresConcursos[0]
                                        + "\nEstado: " + concursosActivos[0]
                                        + "\nParticipantes " + nombresUserConcurso1.length + "\n\n");

                                System.out.println("Concurso 2\n"
                                        + "Cupos: " + cantidadesMax[1]
                                        + "\nNombre: " + nombresConcursos[1]
                                        + "\nEstado: " + concursosActivos[1]
                                        + "\nParticipantes " + nombresUserConcurso2.length + "\n\n");

                                System.out.println("Concurso 3\n"
                                        + "Cupos: " + cantidadesMax[2]
                                        + "\nNombre: " + nombresConcursos[2]
                                        + "\nEstado: " + concursosActivos[2]
                                        + "\nParticipantes " + nombresUserConcurso3.length + "\n\n");

                                break;

                            case 2:

                                System.out.println("\nConcurso1");
                                for (int i = 0; i < cedulasUserConcurso1.length; i++) {

                                    System.out.println("Cedula: " + cedulasUserConcurso1[i] + " Nombre: " + nombresUserConcurso1[i] + " Numero: " + numerosUserAleatorioConcurso1[i]);

                                }

                                System.out.println("\nConcurso2");
                                for (int i = 0; i < cedulasUserConcurso2.length; i++) {

                                    System.out.println("Cedula: " + cedulasUserConcurso2[i] + " Nombre: " + nombresUserConcurso2[i]);

                                }

                                System.out.println("\nConcurso3");
                                for (int i = 0; i < cedulasUserConcurso3.length; i++) {

                                    System.out.println("Cedula: " + cedulasUserConcurso3[i] + " Nombre: " + nombresUserConcurso3[i]);

                                }

                                break;
                            default:
                                System.out.println("\nInvalid Option >:o\n");
                                break;

                        }
                    } while (inputOptionAdvanced != 0);
                    break;
                ///////////////////////////////////////////////Fin Status/////////////////////////////////////////////

                case 4:

                    System.out.println("\nDigita la cedula del participante\n");
                    String inputBuscarCedula1 = sc.nextLine();
                    String inputBuscarCedula = sc.nextLine();
                    String resultadoBusqueda = buscarParticipante(inputBuscarCedula);
                    System.out.println(resultadoBusqueda);

                    if (resultadoBusqueda != "No se encontró el participante :c") {

                        System.out.println("\nQue deseas hacer?\n"
                                + "1.Editar informacion del participante\n"
                                + "2.Eliminar participante\n");

                        int inputOptionEdit = sc.nextInt();

                        switch (inputOptionEdit) {

                            case 1:

                                System.out.println("Modifica el nombre: ");/////////Modificar el nombre
                                String inputModifUser1 = sc.nextLine();
                                String inputModifUserNombre = sc.nextLine();

                                boolean validar = true;
                                System.out.println("Modifica la edad");/////////////Modificar la edad

                                int inputModifUserEdad = 0;

                                while (validar) {//////While para validar si es mayor de edad
                                    inputModifUserEdad = sc.nextInt();
                                    if (inputModifUserEdad >= 18) {
                                        validar = false;
                                    } else {
                                        System.out.println("La persona no es mayor de edad >:o\n"
                                                + "Digita nuevamente la edad");
                                    }

                                }

                                System.out.println("Modifica el estrato\n"
                                        + "Solo puede digitar un numero del 1 al 6");/////////////Modificar el estratoPersona
                                int inputModifUserEstrato = 0;
                                validar = true;

                                while (validar) {//////While para validar si el estrato esta entre 1 y 6
                                    inputModifUserEstrato = sc.nextInt();
                                    if (inputModifUserEstrato >= 1 && inputModifUserEstrato <= 6) {
                                        validar = false;
                                    } else {
                                        System.out.println("Numero fuera de rango >:c\n"
                                                + "Digita nuevamente el estrato");
                                    }

                                }

                                System.out.println("Modifica la direccion");//////////Modificar DireccionPersona
                                String inputModifUserDireccion1 = sc.nextLine();
                                String inputModifUserDireccion = sc.nextLine();

                                System.out.println("Modifica el telefono");//////////Modificar TelefonoPersona

                                String inputModifUserTefono = sc.nextLine();

                                System.out.println("Modifica el genero");//////////Modificar GeneroPersona

                                String inputModifUserGenero = sc.nextLine();

                                System.out.println("Modifica el correo de la persona");///////Modificar CorreoPersona

                                String inputModifUserCorreo = sc.nextLine();

                                editarUsuario(inputModifUserNombre, inputBuscarCedula, inputModifUserEdad, inputModifUserEstrato, inputModifUserDireccion, inputModifUserTefono, inputModifUserGenero, inputModifUserCorreo);

                                break;

                            case 2:

                                EliminarParticipante(inputBuscarCedula);

                                break;

                        }

                    }
                    break;

                case 5:///////////////////Determinar ganador en un concurso

                    int inputGanador;
                    do {

                        System.out.println("Determinar ganador\n"
                                + "A que concurso desea generar el ganador?\n"
                                + "1.Concurso " + nombresConcursos[0] + "(" + concursosActivos[0] + ")\n"
                                + "2.Concurso " + nombresConcursos[1] + "(" + concursosActivos[1] + ")\n"
                                + "3.Concurso " + nombresConcursos[2] + "(" + concursosActivos[2] + ")\n"
                                + "0.Para regresar al menu principal");

                        inputGanador = sc.nextInt();

                        switch (inputGanador) {

                            case 1:

                                if (concursosActivos[0] == "Inactivo") {////Primero validamos si esta disponible

                                    System.out.println("\nEste concurso no esta disponible >:c\n");

                                } else {///Si esta disponible se procede al siguiente paso
                                    System.out.println("Determinado ganador del concurso: " + nombresConcursos[0] + "...");
                                    int numeroRandomConcurso1 = ra.nextInt(1 - cantidadesMax[0]);

                                    detereminarGanadorConcurso1(numeroRandomConcurso1);

                                }

                                break;

                            case 2:
                                
                                if (concursosActivos[1] == "Inactivo") {////Primero validamos si esta disponible

                                    System.out.println("\nEste concurso no esta disponible >:c\n");

                                } else {///Si esta disponible se procede al siguiente paso
                                    System.out.println("Determinado ganador del concurso: " + nombresConcursos[1] + "...");
                                    int numeroRandomConcurso2 = ra.nextInt(1 - cantidadesMax[1]);

                                    detereminarGanadorConcurso1(numeroRandomConcurso2);

                                }

                                break;

                            case 3:
                                
                                if (concursosActivos[2] == "Inactivo") {////Primero validamos si esta disponible

                                    System.out.println("\nEste concurso no esta disponible >:c\n");

                                } else {///Si esta disponible se procede al siguiente paso
                                    System.out.println("Determinado ganador del concurso: " + nombresConcursos[2] + "...");
                                    int numeroRandomConcurso3 = ra.nextInt(1 - cantidadesMax[2]);

                                    detereminarGanadorConcurso1(numeroRandomConcurso3);

                                }

                                break;

                        }

                    } while (inputGanador != 0);
                    break;

                default:
                    System.out.println("Opcion invalida :c");
                    break;

            }

        } while (inputOptionUser != 0); ////////Do while para decidir si repetir el menu principal o no

    }

    /////////Metodos////////////
    ////////////////Metodo para activar el concurso
    /*
    static String activarConcurso(){
        for (int i = 0; i < concursos.length; i++) {
            concursosActivos[i] = "Activo";
        }
        
        return "Activo";
    }
     */
    ////////////////Metodo para registrar la cantidad maxima de usuarios de cada concurso
    /*
    static boolean registarCantidadParticipantes(int cantidadMaxima) {

        for (int i = 0; i < cantidadesMax.length; i++) {
            cantidadesMax[i] = cantidadMaxima;

            return true;
        }

        return false;
    }
     */
    ////////////////Metodo Registrar participante al concurso1
    static boolean registrarParticipanteConcurso1(String nombre, String cedula, int edad, int estrato, String direccion, String telefono, String genero, String correo, String concurso) {

        for (int i = 0; i < cedulasUserConcurso1.length; i++) {
            if (cedulasUserConcurso1[i] == null) {

                nombresUserConcurso1[i] = nombre;
                cedulasUserConcurso1[i] = cedula;
                edadesUserConcurso1[i] = edad;
                estratosUserConcurso1[i] = estrato;
                direccionesUserConcurso1[i] = direccion;
                telefonosUserConcurso1[i] = telefono;
                generosUserConcurso1[i] = genero;
                correosUserConcurso1[i] = correo;
                concursosUser1[i] = concurso;

                return true;
            }

        }

        return false;
    }

    static boolean validarRepetidosConcurso1(String cedula) {
        for (int i = 0; i < cedulasUserConcurso1.length; i++) {

            return false;
        }
        ///////////////
        return false;
    }

    static String buscarParticipante(String cedula) {/////////////////////Metodo para buscar los participantes en los concursos

        boolean resultado = false;

        for (int i = 0; i < cedulasUserConcurso1.length; i++) {

            if (cedula.equals(cedulasUserConcurso1[i])) {

                resultado = true;
                return "Usuario encontrado :D\n"
                        + "\nNombre: " + nombresUserConcurso1[i]
                        + "\nEdad: " + edadesUserConcurso1[i]
                        + "\nEstrato: " + estratosUserConcurso1[i]
                        + "\nDireccion: " + direccionesUserConcurso1[i]
                        + "\nTelefono:" + telefonosUserConcurso1[i]
                        + "\nGenero: " + generosUserConcurso1[i]
                        + "\nCorreo :" + correosUserConcurso1[i]
                        + "\n\nEl participante se encuentra inscrito en el concurso: " + concursosUser1[0];

            } else {

                resultado = false;

            }

        }

        for (int i = 0; i < cedulasUserConcurso2.length; i++) {

            if (cedula.equals(cedulasUserConcurso2[i])) {

                resultado = true;
                return "Usuario encontrado :D\n"
                        + "\nNombre: " + nombresUserConcurso2[i]
                        + "\nEdad: " + edadesUserConcurso2[i]
                        + "\nEstrato: " + estratosUserConcurso2[i]
                        + "\nDireccion: " + direccionesUserConcurso2[i]
                        + "\nTelefono:" + telefonosUserConcurso2[i]
                        + "\nGenero: " + generosUserConcurso2[i]
                        + "\nCorreo :" + correosUserConcurso2[i]
                        + "\n\nEl participante se encuentra inscrito en el concurso: " + concursosUser2[0];

            } else {

                resultado = false;

            }

        }

        for (int i = 0; i < cedulasUserConcurso3.length; i++) {

            if (cedula.equals(cedulasUserConcurso3[i])) {

                resultado = true;
                return "Usuario encontrado :D\n"
                        + "\nNombre: " + nombresUserConcurso3[i]
                        + "\nEdad: " + edadesUserConcurso3[i]
                        + "\nEstrato: " + estratosUserConcurso3[i]
                        + "\nDireccion: " + direccionesUserConcurso3[i]
                        + "\nTelefono:" + telefonosUserConcurso3[i]
                        + "\nGenero: " + generosUserConcurso3[i]
                        + "\nCorreo :" + correosUserConcurso3[i]
                        + "\n\nEl participante se encuentra inscrito en el concurso: " + concursosUser3[0];

            } else {

                resultado = false;

            }

        }

        if (resultado == false) {
            return "No se encontró el participante :c";
        }

        return "No se encontró el participante :c";

    }

    ////////////////////////Metodo para eliminar el participante
    static void EliminarParticipante(String cedula) {/////////////////////Metodo para buscar los participantes en los concursos

        boolean resultado = false;

        for (int i = 0; i < cedulasUserConcurso1.length; i++) {

            if (cedula.equals(cedulasUserConcurso1[i])) {

                resultado = true;

                cedulasUserConcurso1[i] = null;
                nombresUserConcurso1[i] = null;
                edadesUserConcurso1[i] = 0;
                estratosUserConcurso1[i] = 0;
                telefonosUserConcurso1[i] = null;
                generosUserConcurso1[i] = null;
                correosUserConcurso1[i] = null;
                concursosUser1[0] = null;

                System.out.println("Eliminado correctamente");

            } else {

                resultado = false;

            }

        }

        for (int i = 0; i < cedulasUserConcurso2.length; i++) {

            if (cedula.equals(cedulasUserConcurso2[i])) {

                resultado = true;

                cedulasUserConcurso2[i] = null;
                nombresUserConcurso2[i] = null;
                edadesUserConcurso2[i] = 0;
                estratosUserConcurso2[i] = 0;
                telefonosUserConcurso2[i] = null;
                generosUserConcurso2[i] = null;
                correosUserConcurso2[i] = null;
                concursosUser2[0] = null;

                System.out.println("Eliminado correctamente");

            } else {

                resultado = false;

            }

        }

        for (int i = 0; i < cedulasUserConcurso3.length; i++) {

            if (cedula.equals(cedulasUserConcurso3[i])) {

                resultado = true;

                cedulasUserConcurso3[i] = null;
                nombresUserConcurso3[i] = null;
                edadesUserConcurso3[i] = 0;
                estratosUserConcurso3[i] = 0;
                telefonosUserConcurso3[i] = null;
                generosUserConcurso3[i] = null;
                correosUserConcurso3[i] = null;
                concursosUser3[0] = null;

                System.out.println("Eliminado correctamente");

            } else {

                resultado = false;

            }

        }

        if (resultado == false) {

        }

    }

    static String editarUsuario(String nombre, String cedula, int edad, int estrato, String direccion, String telefono, String genero, String correo) {

        boolean resultado = false;

        for (int i = 0; i < cedulasUserConcurso1.length; i++) {

            if (cedula.equals(cedulasUserConcurso1[i])) {

                resultado = true;

                nombresUserConcurso1[i] = nombre;
                edadesUserConcurso1[i] = edad;
                estratosUserConcurso1[i] = estrato;
                telefonosUserConcurso1[i] = telefono;
                generosUserConcurso1[i] = genero;
                correosUserConcurso1[i] = correo;

                System.out.println("Informacion editada correctamente :D");

            } else {

                resultado = false;

            }

        }

        for (int i = 0; i < cedulasUserConcurso2.length; i++) {

            if (cedula.equals(cedulasUserConcurso2[i])) {

                resultado = true;

                nombresUserConcurso2[i] = nombre;
                edadesUserConcurso2[i] = edad;
                estratosUserConcurso2[i] = estrato;
                telefonosUserConcurso2[i] = telefono;
                generosUserConcurso2[i] = genero;
                correosUserConcurso2[i] = correo;

                System.out.println("Informacion editada correctamente :D");

            } else {

                resultado = false;

            }

        }

        for (int i = 0; i < cedulasUserConcurso3.length; i++) {

            if (cedula.equals(cedulasUserConcurso3[i])) {

                resultado = true;

                nombresUserConcurso3[i] = nombre;
                edadesUserConcurso3[i] = edad;
                estratosUserConcurso3[i] = estrato;
                telefonosUserConcurso3[i] = telefono;
                generosUserConcurso3[i] = genero;
                correosUserConcurso3[i] = correo;

                return ("Informacion editada correctamente :D");

            } else {

                resultado = false;

            }

        }

        if (resultado == false) {

        }

        return ":c?";

    }
    /*
    static void Elminarconcurso1() {
        for (int i = 0; i < nombresConcursos.length; i++) {
            if(nombresConcursos){
            
                
            
            
            }
        }
        
    }*/

    static void detereminarGanadorConcurso1(int numeroRandom) {

        for (int i = 0; i < cedulasUserConcurso1.length; i++) {
            if (numerosUserAleatorioConcurso1[i] == 1) {
                System.out.println("Felicidades al ganador! :D\n"
                        + "\nNumero: " + numerosUserAleatorioConcurso1[i]
                        + "\nNombre: " + nombresUserConcurso1[i]
                        + "\nEdad: " + edadesUserConcurso1[i]
                        + "\nEstrato: " + estratosUserConcurso1[i]
                        + "\nDireccion: " + direccionesUserConcurso1[i]
                        + "\nTelefono:" + telefonosUserConcurso1[i]
                        + "\nGenero: " + generosUserConcurso1[i]
                        + "\nCorreo :" + correosUserConcurso1[i]
                );

            }
        }

    }


    static void detereminarGanadorConcurso2(int numeroRandom) {

        for (int i = 0; i < cedulasUserConcurso2.length; i++) {
            if (numerosUserAleatorioConcurso2[i] == 1) {
                System.out.println("Felicidades al ganador! :D\n"
                        + "\nNumero: " + numerosUserAleatorioConcurso2[i]
                        + "\nNombre: " + nombresUserConcurso2[i]
                        + "\nEdad: " + edadesUserConcurso2[i]
                        + "\nEstrato: " + estratosUserConcurso2[i]
                        + "\nDireccion: " + direccionesUserConcurso2[i]
                        + "\nTelefono:" + telefonosUserConcurso2[i]
                        + "\nGenero: " + generosUserConcurso2[i]
                        + "\nCorreo :" + correosUserConcurso2[i]
                );

            }
        }

    }

    static void detereminarGanadorConcurso3(int numeroRandom) {

        for (int i = 0; i < cedulasUserConcurso3.length; i++) {
            if (numerosUserAleatorioConcurso3[i] == 1) {
                System.out.println("Felicidades al ganador! :D\n"
                        + "\nNumero: " + numerosUserAleatorioConcurso3[i]
                        + "\nNombre: " + nombresUserConcurso3[i]
                        + "\nEdad: " + edadesUserConcurso3[i]
                        + "\nEstrato: " + estratosUserConcurso3[i]
                        + "\nDireccion: " + direccionesUserConcurso3[i]
                        + "\nTelefono:" + telefonosUserConcurso3[i]
                        + "\nGenero: " + generosUserConcurso3[i]
                        + "\nCorreo :" + correosUserConcurso3[i]
                );

            }
        }

    }

}
