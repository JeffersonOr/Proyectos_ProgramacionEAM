/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package adminusers;

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

        System.out.println("Bienvenido al sistema usuarios\n\n"
                + "Que deseas hacer?\n\n"
                + "1.Registrar\n"
                + "2.Buscar usuario\n"
                + "3.Detener ejecucion.");

        int inputPrincipalMain;

        do {

            inputPrincipalMain = scanner.nextInt();
            switch (inputPrincipalMain) {////Menu principal

                case 1://Registrar

                    System.out.println("Bienvenido al sistema de registro de usuario\n\n"
                            + "solo debes agregar 4 personas\n\n");
                    for (int i = 0; i <= 4; i++) {

                        System.out.println("Digite el nombre de la persona" + i);
                        String registrarNombre = scanner.nextLine();

                        System.out.println("Digite la cedula" + i);
                        String registrarCedula = scanner.nextLine();

                        System.out.println("Digite el telefono" + i);
                        String registrarTelefono = scanner.nextLine();

                        System.out.println("Digite la direccion" + i);
                        String registrarDireccion = scanner.nextLine();

                        boolean registro = registrarPersona(registrarNombre, registrarCedula, registrarTelefono, registrarDireccion);
                        System.out.println(registro);
                    }
                    
                    System.out.println("Usuarios registrados correctamente ;)");
                    break;
                case 2:
                    String inputCedula = scanner.nextLine();
                    String resultadoBusqueda = buscarPersona(inputCedula);
                    System.out.println(resultadoBusqueda);
                    break;

                default:
                    break;

            }

        } while (inputPrincipalMain != 3);

        

    }

    ////////////Methots
    public static boolean registrarPersona(String nombre, String cedula, String telefono, String direccion) {//registrarUsuario
        String respuesta = buscarPersona(cedula);
        if (respuesta == null) {

            for (int i = 0; i < 10; i++) {
                if (nombre.equals(nombres[i])) {
                    return false;
                } else {

                    nombres[i] = nombre;
                    cedulas[i] = cedula;
                    telefonos[i] = telefono;
                    direcciones[i] = direccion;

                }
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
