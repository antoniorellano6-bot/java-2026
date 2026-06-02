package Selectiva;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner entradaDatos = new Scanner(System.in);

        double compra, dscto = 0, total;
        String menbresia;

        System.out.printf("ingrese el monto de la compra");
        compra = entradaDatos.nextDouble();

        System.out.printf("tiene menbresia: (si/no) ");
        menbresia = entradaDatos.nextLine();

        if (compra >= 500) {
             if (menbresia.equalsIgnoreCase("SI")) {
                 dscto = compra * 0.20;
             }else {
                 dscto=compra* 0.10;
             }
        }else {
            dscto=0;
        }
        total = compra - dscto;

        System.out.println("Monto de compra: S/ " + compra);
        System.out.println("Descuento: S/ " + dscto);
        System.out.println("Total a pagar: S/ " + total);

    }
}
