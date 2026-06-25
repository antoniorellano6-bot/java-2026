package arreglo;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ejercicio01 {
    public static void main(String[] args) {
        // creando mi arreglo de numeros
        //  int[Nombre del arreglo]numeros = new int[Cantidad de elementos];
        int[]numeros = new int[5];
        numeros[0] = 10;
        numeros[1] = 8;
        numeros[2] = 15;
        numeros[3] = 0;
        numeros[4] = 20;
        System.out.println(Arrays.toString(numeros));

        //arreglo con inicializacion
        int[] notas = {10,18,13,15,20,16,18,14};
        System.out.println(Arrays.toString(notas));

        String[] frutas = new String[5];
        frutas[1] = "fresa";
        frutas[2] = "platano";
        frutas[3] = "Manzana";
        frutas[4] = "pera";
        frutas[5] = "sandia";
        System.out.println(Arrays.toString(frutas));






    }
}
