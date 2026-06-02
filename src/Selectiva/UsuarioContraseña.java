package Selectiva;

import java.util.Scanner;

public class UsuarioContraseña {

    public static void main(String[] args) {
        Scanner ingresoDatos = new Scanner(System.in);

        String usuario = "antoniorellano";
        String contrasena = "antoni12345";

        System.out.println("Ingrese usuario ");
        String caracteristica = ingresoDatos.nextLine();

        System.out.printf("Ingrese  la contraseña ");
        String contra = ingresoDatos.nextLine();

        if (usuario.equalsIgnoreCase(caracteristica) && contrasena.equals(contra)) {
            System.out.println("Acceso permitido");
            if (usuario.equalsIgnoreCase(caracteristica) && contrasena.equals(contra)) {
                System.out.println("Bienvenido al sistema.");
            }else{
                System.out.printf("usuario incorrecto");
            }
        } else {
            System.out.println("contraseña incorrecta.");
            ingresoDatos.close();

        }
    }
}