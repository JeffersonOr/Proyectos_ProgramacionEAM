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
    ////Concursos
    static int[] cantidadesMax = new int[3];//Se crea este array para almacenar los limites de usuarios de cada concurso
    static String[] concursosActivos = new String[]{"Inactivo", "Inactivo", "Inactivo"};
    static String[] nombresConcursos = new String[]{"Sin nombre", "Sin nombre", "Sin nombre"};
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
    static String[] concursosUser1 = new String[]{null};
    ////Fin usuariosAtributosConcurso1

    ////UsuariosAtributosConcurso2
    static String[] nombresUserConcurso2 = new String[]{null};
    static String[] cedulasUserConcurso2;
    static int[] edadesUserConcurso2;
    static int[] estratosUserConcurso2;
    static String[] direccionesUserConcurso2;
    static String[] telefonosUserConcurso2;
    static String[] generosUserConcurso2;
    static String[] correosUserConcurso2;
    static String[] concursosUser2;
    ////Fin usuariosAtributosConcurso2

    ////UsuariosAtributosConcurso3
    static String[] nombresUserConcurso3 = new String[]{null};
    static String[] cedulasUserConcurso3;
    static int[] edadesUserConcurso3;
    static int[] estratosUserConcurso3;
    static String[] direccionesUserConcurso3;
    static String[] telefonosUserConcurso3;
    static String[] generosUserConcurso3;
    static String[] correosUserConcurso3;
    static String[] concursosUser3;
    ////Fin usuariosAtributosConcurso3

    public static void main(String[] args) {

        ////Creacion concursos (3)
        /////nombre, cedula, edad, estrato, direccion, telefono, genero y correo
        Scanner sc = new Scanner(System.in);

        System.out.println("Bienvenido al manager de concursos");

        int inputOptionUser;//Entrada del usuario para selecionar opcion del menu principal

        do {//////Do while para repetir el menu

            System.out.println("1.Para registrar concurso\n"
                    + "2.Registrar usuario\n"
                    + "3.Status concursos\n"
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
                        concursosActivos[i] = "Activo";////Activar concurso en el Array
                        nombresConcursos[i] = inputnombreConcurso;////Registrar nombre del concurso en el Array

                        ///////////////////////////////////////////////////////////////Inicializamos los atributos del usuario para determinar el tamaño de cada Array a corde al concurso 
                        ///////////////////////////////////////////////////////////////Esto con el fin de saber la cantidad de usuarios registrados en el concurso
                        nombresUserConcurso1 = new String[cantidadesMax[i]];
                        cedulasUserConcurso1 = new String[cantidadesMax[i]];
                        edadesUserConcurso1 = new int[cantidadesMax[i]];
                        estratosUserConcurso1 = new int[cantidadesMax[i]];
                        direccionesUserConcurso1 = new String[cantidadesMax[i]];
                        telefonosUserConcurso1 = new String[cantidadesMax[i]];
                        generosUserConcurso1 = new String[cantidadesMax[i]];
                        correosUserConcurso1 = new String[cantidadesMax[i]];

                        //////////////////////////////////////////////////////////////
                        /////////////////////////////////////////////////////////////
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

                                        System.out.println("Este concurso no esta disponible >:c");

                                    } else {///Si esta disponible se procede al siguiente paso

                                        if (cantidadesMax[0] <= 0) {/////Segundo se valida si hay cupos disponibles con esta condicional

                                            System.out.println("Lo sentimos, no quedan cupos disponibles en el concurso: " + nombresConcursos[0] + "\n"
                                                    + ":(");

                                        } else {///Si hay cupos se procede al registro de participantes

                                            System.out.println("Iniciando registro de usuario en concurso: " + nombresConcursos[0] + "...");
                                            int contadorRegistroConcurso1 = 0;
                                            boolean repetirRegistroParticipantes = true;

                                            do {

                                                System.out.println("Cupos maximos: " + (cantidadesMax[0] - contadorRegistroConcurso1));
                                                boolean validar = true;

                                                System.out.println("Digita la cedula");///////////////////CedulaPersona
                                                String inputCedulaPersona1 = sc.nextLine();
                                                String inputCedulaPersonaConcurso1 = sc.nextLine();

                                                System.out.println("Digita el nombre");////////////////NombrePersona
                                                String inputNombrePersona1 = sc.nextLine();
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
                                                String inputTefonoPersona1 = sc.nextLine();
                                                String inputTefonoPersonaConcurso1 = sc.nextLine();

                                                System.out.println("Digita el genero");//////////GeneroPersona
                                                String inputGeneroPersona1 = sc.nextLine();
                                                String inputGeneroPersonaConcurso1 = sc.nextLine();

                                                System.out.println("Digita el correo de la persona");///////CorreoPersona
                                                String inputCorreoPersona1 = sc.nextLine();
                                                String inputCorreoPersonaConcurso1 = sc.nextLine();

                                                validar = true;
                                                System.out.println("Participante registrado correctamente :)");

                                              
                                                int i = contadorRegistroConcurso1++;///Contador para controlar la veces en que se repite el ciclo do while
                                                int validarCantidadConcurso1 = cantidadesMax[0] - i;////Con esta variable validamos si se alcanza el limite de cupos o no
                                                cantidadesMax[0] = validarCantidadConcurso1;/////Se procede a agregar el cupo disponible al array del concurso
                                                concursosUser1 = new String[]{nombresConcursos[0]};/////Se registra el concurso a la persona
                                                
                                                
                                                
                                                ////////////////////////////////////////////////////////Se procede a registrar los datos en los arrays
                                                nombresUserConcurso1[i] = inputNombrePersonaConcurso1;
                                                cedulasUserConcurso1[i] = inputCedulaPersonaConcurso1;
                                                edadesUserConcurso1[i] = inputEdadPersonaConcurso1;
                                                estratosUserConcurso1[i] = inputEstratoPersonaConcurso1;
                                                direccionesUserConcurso1[i] = inputDireccionPersona1;
                                                telefonosUserConcurso1[i] = inputTefonoPersonaConcurso1;
                                                generosUserConcurso1[i] = inputGeneroPersonaConcurso1;
                                                correosUserConcurso1[i] = inputCorreoPersonaConcurso1;
                                                ///////////////////////////////////////////////////////

                                                if (validarCantidadConcurso1 <= 0) {
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

                                        System.out.println("Este concurso no esta disponible >:c");

                                    } else {///Si esta disponible se procede al siguiente paso

                                        if (cantidadesMax[1] <= 0) {/////Primero se valida si hay cupos disponibles con esta condicional

                                            System.out.println("Lo sentimos, no quedan cupos disponibles en el concurso: " + nombresConcursos[1] + "\n"
                                                    + ":(");

                                        } else {///Si hay cupos se procede al registro de participantes

                                            System.out.println("Iniciando registro de usuario en concurso: " + nombresConcursos[1] + "...");
                                            int contadorRegistroConcurso2 = 1;
                                            boolean repetirRegistroParticipantes = true;

                                            do {

                                                System.out.println("Cupos maximos: " + (cantidadesMax[1] - contadorRegistroConcurso2));

                                                System.out.println("Digita la cedula");///////////////////CedulaPersona
                                                String inputCedulaPersona1 = sc.nextLine();
                                                String inputCedulaPersonaConcurso2 = sc.nextLine();

                                                System.out.println("Digita el nombre");////////////////NombrePersona
                                                String inputNombrePersona1 = sc.nextLine();
                                                String inputNombrePersonaConcurso2 = sc.nextLine();

                                                System.out.println("Por favor digita la edad de la persona");/////////////EdadPersona
                                                boolean validar = true;
                                                int inputEdadPersonaConcurso2;

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
                                                int inputEstratoPersonaConcurso2;
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
                                                String inputTefonoPersona1 = sc.nextLine();
                                                String inputTefonoPersonaConcurso2 = sc.nextLine();

                                                System.out.println("Digita el genero");//////////GeneroPersona
                                                String inputGeneroPersona1 = sc.nextLine();
                                                String inputGeneroPersonaConcurso2 = sc.nextLine();

                                                System.out.println("Digita el correo de la persona");///////CorreoPersona
                                                String inputCorreoPersona1 = sc.nextLine();
                                                String inputCorreoPersonaConcurso2 = sc.nextLine();

                                                /////Con esta declaracion se le asigna el concurso al particiante
                                                validar = true;
                                                System.out.println("Participante registrado correctamente :)");

                                                int i = contadorRegistroConcurso2++;///Contador para controlar la veces en que se repite el ciclo do while
                                                int validarCantidadConcurso2 = cantidadesMax[1] - i;////Con esta variable validamos si se alcanza el limite de cupos o no
                                                cantidadesMax[1] = validarCantidadConcurso2;/////Se procede a agregar el cupo disponible al array

                                                if (validarCantidadConcurso2 <= 0) {
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

                                        System.out.println("Este concurso no esta disponible >:c");

                                    } else {///Si esta disponible se procede al siguiente paso

                                        if (cantidadesMax[2] <= 0) {/////Primero se valida si hay cupos disponibles con esta condicional

                                            System.out.println("Lo sentimos, no quedan cupos disponibles en el concurso: " + nombresConcursos[2] + "\n"
                                                    + ":(");

                                        } else {///Si hay cupos se procede al registro de participantes

                                            System.out.println("Iniciando registro de usuario en concurso: " + nombresConcursos[2] + "...");
                                            int contadorRegistroConcurso2 = 1;
                                            boolean repetirRegistroParticipantes = true;

                                            do {

                                                System.out.println("Cupos maximos: " + (cantidadesMax[2] - contadorRegistroConcurso2));

                                                System.out.println("Digita la cedula");///////////////////CedulaPersona
                                                String inputCedulaPersona1 = sc.nextLine();
                                                String inputCedulaPersonaConcurso3 = sc.nextLine();

                                                System.out.println("Digita el nombre");////////////////NombrePersona
                                                String inputNombrePersona1 = sc.nextLine();
                                                String inputNombrePersonaConcurso3 = sc.nextLine();

                                                System.out.println("Por favor digita la edad de la persona");/////////////EdadPersona
                                                boolean validar = true;
                                                int inputEdadPersonaConcurso3;

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
                                                int inputEstratoPersonaConcurso2;
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
                                                String inputTefonoPersona1 = sc.nextLine();
                                                String inputTefonoPersonaConcurso2 = sc.nextLine();

                                                System.out.println("Digita el genero");//////////GeneroPersona
                                                String inputGeneroPersona1 = sc.nextLine();
                                                String inputGeneroPersonaConcurso2 = sc.nextLine();

                                                System.out.println("Digita el correo de la persona");///////CorreoPersona
                                                String inputCorreoPersona1 = sc.nextLine();
                                                String inputCorreoPersonaConcurso2 = sc.nextLine();

                                                /////Con esta declaracion se le asigna el concurso al particiante
                                                validar = true;
                                                System.out.println("Participante registrado correctamente :)");

                                                int i = contadorRegistroConcurso2++;///Contador para controlar la veces en que se repite el ciclo do while
                                                int validarCantidadConcurso2 = cantidadesMax[2] - i;////Con esta variable validamos si se alcanza el limite de cupos o no
                                                cantidadesMax[2] = validarCantidadConcurso2;/////Se procede a agregar el cupo disponible al array

                                                if (validarCantidadConcurso2 <= 0) {
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

                case 3:

                    System.out.println("Concurso 1\n"
                            + "Cupos: " + cantidadesMax[0]
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

        return false;
    }
    ///////////////

}
