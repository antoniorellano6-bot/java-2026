package arreglo;

import java.util.Arrays;

public class Ejercicio02 {
    public static void main(String[] args) {
        int[] notas = { 10,18,13,15,20,16,18,14,15,15,20,18,17,16};
        System.out.println(Arrays.toString(notas));
        for (int iterador = 0; iterador<= notas.length; iterador++ ){
            System.out.println(notas[iterador]);
        }


    }
}
