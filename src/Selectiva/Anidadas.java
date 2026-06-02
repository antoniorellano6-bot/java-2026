package Selectiva;

import java.util.Scanner;

public class Anidadas {
    public static void main(String[] args) {
        Scanner entradaDatos = new Scanner(System.in);
        System.out.printf("ingrese una calificacion ");
        int calificacion = entradaDatos.nextInt();

        if (calificacion >= 13){
            System.out.printf("has aprobado");
            if (calificacion >= 15){
                System.out.printf("Obtubistes una buena calificacion");
            }
        }else{
            System.out.printf("has reprobado el curso sigue estudiando");
        }

    }
}
