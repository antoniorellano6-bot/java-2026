package arreglo;

import java.util.ArrayList;
import java.util.List;

public class Listas {
    public static void main(String[] args) {
        // lista de arreglos- mutables o que puedan ser manipulables al momento
        //List<tipoDato> nombreLista = new ArrayList<>();

        List<String>frutas = new ArrayList<>();
        frutas.add("piña");
        frutas.add("lima");
        frutas.add("Papaya");
        frutas.add("Limon");
        frutas.add("Manzana");
        frutas.add("Palta");
        for (int iterador = 0; iterador <=frutas.size(); iterador++)
         System.out.println(frutas.get(iterador));
    }
}
