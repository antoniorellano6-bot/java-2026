package arreglo;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ejercicio01 {
    public static void main(String[] args) {
        // creando mi arreglo de numeros
        //  int[Nombre del arreglo]numeros = new int[Cantidad de elementos];
        int[] numeros = new int[5];
        numeros[0] = 10;
        numeros[1] = 8;
        numeros[2] = 15;
        numeros[3] = 0;
        numeros[4] = 20;
        System.out.println(Arrays.toString(numeros));

        //arreglo con inicializacion
        int[] notas = {10, 18, 13, 15, 20, 16, 18, 14,15};
        System.out.println(Arrays.toString(notas));
        for (int iterador = 0; iterador <= 10; iterador++) {
            System.out.println(notas[iterador]);


            String[] frutas = new String[5];
            frutas[0] = "fresa";
            frutas[1] = "platano";
            frutas[2] = "Manzana";
            frutas[3] = "pera";
            frutas[4] = "sandia";
            System.out.println(Arrays.toString(frutas));


        }
    }
}

