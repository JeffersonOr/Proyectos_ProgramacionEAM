/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package adminusers;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author jeff
 */
public class RunApp {

    /*boolean o = true;
        do{
        
        }while(o);*/
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Boolean parar = true;
        List<Usuario> usuarios = new ArrayList<>();
        do {
            
            System.out.println("Digite el nombre de la persona");
            String registrarNombre1 = scanner.nextLine();
            System.out.println("Digite la cedula" );
            String registrarCedula = scanner.nextLine();

            System.out.println("Digite el telefono" );
            Integer registrarTelefono = scanner.nextInt();

            System.out.println("Digite la direccion" );
            String registrarDireccion = scanner.nextLine();
            registrarDireccion = scanner.nextLine();

            usuarios.add(new Usuario(registrarNombre1, registrarCedula, registrarDireccion, registrarTelefono));
            
            System.out.println("quieres ingresar otro usuario");
            String opcion = scanner.nextLine();
            if(opcion.equalsIgnoreCase("n")){
                System.out.println(usuarios.size());
                
            }
            if(opcion.equalsIgnoreCase("b")){
               
                    System.out.println("ingrese la cedula");
                    String cedulaBucar = scanner.nextLine();

                    Usuario usuarioEncontrado = buscarusuario(usuarios, cedulaBucar);
                    if(usuarioEncontrado!= null){
                        System.out.println("nombre "+usuarioEncontrado.getNombre());
                        System.out.println("telefono "+usuarioEncontrado.getTelefono());
                        
                    }else{
                        System.out.println("No se encontro el usuario ");      
                    }
                
            }

        } while (parar);

    }
    public static Usuario buscarusuario(List<Usuario>usuarios, String cedulaBucar){
        
        for (int i = 0; i < usuarios.size(); i++) {
            if(usuarios.get(i).getCedula().equals(cedulaBucar)){
                return usuarios.get(i);
            }
            
        }
         return null;
    }
}
 