package bucles;

import java.util.Scanner;

public class Ejemplo01 {
    public static void main(String[] args) {
        Scanner entradaDatos=new Scanner(System.in);
       String nombreUsuario= "";
       String clave = "";
        while (!nombreUsuario.equals("juan") || !clave.equals("12345")){
            System.out.printf("ingrese nombre del usuario");
            nombreUsuario = entradaDatos.nextLine();

            System.out.printf("ingrese su clave");
            clave= entradaDatos.nextLine();

            if (nombreUsuario== "juan"||clave== "12345");
            System.out.println("Datos incorrectos, no puedes ingresar");

        }
        System.out.println("bienvenido al sistema");
        entradaDatos.close();
    }


}
