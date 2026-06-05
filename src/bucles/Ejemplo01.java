package bucles;

import java.util.Scanner;

public class Ejemplo01 {
    public static void main(String[] args) {
        Scanner entradaDatos=new Scanner(System.in);
       String nombreUsuario= "";
       String clave = "";
        while (nombreUsuario == "juan"|| clave== "12345"){
            System.out.printf("ingrese nombre del usuario");
            nombreUsuario = entradaDatos.nextLine();

            System.out.printf("ingrese su clave");
            clave= entradaDatos.nextLine();

            if (nombreUsuario== "juan"||clave== "12345");
            System.out.println("Datos incorrectos, no puedes ingresar");
        }


    }


}
