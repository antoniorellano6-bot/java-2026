package Selectiva;

import java.util.Scanner;

public class EjercicoSelectiva {
    public static void main(String[] args) {
        Scanner entradaDatos= new Scanner(System.in);
        System.out.println("ingrese precio del producto");
        double costo = entradaDatos.nextDouble();

        if (costo>200){
            System.out.printf("Se paga en efectivo");
        }else {
            System.out.printf("se pagara en tarjeta");
        }

    }



}
