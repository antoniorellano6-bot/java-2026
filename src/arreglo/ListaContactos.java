package arreglo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class ListaContactos {
    public static void main(String[] args) {
        Scanner entradaDatos = new Scanner(System.in);
        List<String> contacto = new ArrayList<>();
        System.out.println("cuantos contactos deseas ingresar");
        int cantidad = entradaDatos.nextInt();
        entradaDatos.nextLine();

        for (int iterador = 0; iterador<cantidad; iterador++){
            System.out.println("ingrese el contacto"+ iterador+1);
            String nombre = entradaDatos.nextLine();
            contacto.add(nombre);
        }

        System.out.println("lista de contactos");
        for (int iterador = 0; iterador < contacto.size();iterador++){
            System.out.println("el contacto "+ (iterador+1)+ "es " +contacto.get(iterador));
        }
        System.out.println("busqueda de contactos-------------------------------");
        System.out.println("ingrese el nombre del contacto a buscar ");
        String nombreContacto = entradaDatos.nextLine().toLowerCase();

        if (contacto.contains(nombreContacto)){
            System.out.println("el nombre es " + nombreContacto+ "si existe");
        }else {
            System.out.println("el nombre es " + nombreContacto+ "no existe");
        }

       entradaDatos.close();

    }
}
