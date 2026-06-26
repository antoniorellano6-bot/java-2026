package arreglo;

import java.util.Arrays;

public class Ejercicio03 {
    public static void main(String[] args) {
        String [] frutas = {"fresa", "Manzana", "Piña", "Mandarina", "Papaya", "Lima", "Pera", "Palta"};
        System.out.println(Arrays.toString(frutas));
        for (int iterador = 0; iterador <=frutas.length; iterador++) {
            System.out.println(frutas[iterador]);
        }

    }
}
