package bucles;

import java.net.http.HttpResponse;
import java.util.Scanner;

public class App_gasto {

    public static void main(String[] args) {
        Scanner entradaDatos = new Scanner(System.in);
        double gasto = 0, totalgastos = 0;
        System.out.println("ingrese su gasto si no tiene ingrese 0");
        gasto = entradaDatos.nextDouble();
        if (gasto == 0) {
            System.out.println("no tienes ningun gasto");
        } else {
            while (gasto != 0) {
                totalgastos = totalgastos + gasto;
                System.out.println("mis gastos son:" + totalgastos);
                System.out.println("ingrese su gasto");
                System.out.println("-----------------------------------------------------");
                gasto=entradaDatos.nextDouble();
            }
            entradaDatos.close();
        }
    }
    }
