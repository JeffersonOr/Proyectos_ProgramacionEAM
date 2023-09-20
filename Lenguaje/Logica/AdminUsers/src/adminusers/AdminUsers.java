/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package adminusers;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author jeff
 */
public class AdminUsers {

    static String[] nombres;
    static String[] cedulas;
    static String[] telefonos;
    static String[] direcciones;

    public static void main(String[] args) {
        // TODO code application logic here
        /*boolean o = true;
        do{
        
        }while(o);*/

        Scanner scanner = new Scanner(System.in);

        nombres = new String[4];
        cedulas = new String[4];
        telefonos = new String[4];
        direcciones = new String[4];

        int inputPrincipalMain;

        do {

            System.out.println("Bienvenido al sistema usuarios\n\n"
                    + "Que deseas hacer?\n\n"
                    + "1.Registrar\n"
                    + "2.Buscar usuario\n"
                    + "3.Detener ejecucion.");
            inputPrincipalMain = scanner.nextInt();
            switch (inputPrincipalMain) {////Menu principal

                case 1://Registrar

                    System.out.println("Bienvenido al sistema de registro de usuario\n\n"
                            + "solo debes agregar 4 personas\n\n");
                    
                    
                    for (int i = 0; i < 4; i++) {

                        System.out.println("Digite el nombre de la persona" + i + 1);
                        String registrarNombre1 = scanner.nextLine();
                        String registrarNombre = scanner.nextLine();

                        System.out.println("Digite la cedula" + i + 1);
                        String registrarCedula = scanner.nextLine();

                        System.out.println("Digite el telefono" + i + 1);
                        String registrarTelefono = scanner.nextLine();

                        System.out.println("Digite la direccion" + i + 1);
                        String registrarDireccion = scanner.nextLine();

                        boolean registro = registrarPersona(registrarNombre, registrarCedula, registrarTelefono, registrarDireccion);
                        if (registro) {
                            System.out.println("Usuario registrado :)" + registrarNombre);
                        } else {
                            System.out.println("Hubo un error :(");
                        }

                    }

                    System.out.println("Usuarios registrados correctamente ;)");
                    break;
                case 2:
                    String inputCedula1 = scanner.nextLine();
                    System.out.println("Digita la cedula de la persona");
                    String inputCedula = scanner.nextLine();
                    String resultadoBusqueda = buscarPersona(inputCedula);
                    System.out.println(resultadoBusqueda);
                    break;

                default:
                case 3:
                    System.out.println("Datos: "+Arrays.toString(cedulas));
                    break;

            }

        } while (inputPrincipalMain != 4);

    }

    ////////////Methots
    public static boolean registrarPersona(String nombre, String cedula, String telefono, String direccion) {//registrarUsuario
        String respuesta = buscarPersona(cedula);

        for (int i = 0; i < 4; i++) {
            if (respuesta == null&&cedulas[i]==null) {

                nombres[i] = nombre;
                cedulas[i] = cedula;
                telefonos[i] = telefono;
                direcciones[i] = direccion;

                return true;

            }
        }

        return false;
    }

    public static String buscarPersona(String cedula) {//buscarPersona
        for (int i = 0; i < cedulas.length; i++) {
            if (cedulas[i] != null && cedulas[i].equals(cedula)) {
                return "Nombres: " + nombres[i]
                        + "Cedula: " + cedulas[i]
                        + "telefono: " + telefonos[i]
                        + "Direccion: " + direcciones[i];

            }

        }

        return null;
    }

}
