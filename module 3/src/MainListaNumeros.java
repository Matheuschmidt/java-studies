import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class MainListaNumeros {
    public static void main(String[] args) {
        Numeros n1 = new Numeros(4);
        Numeros n2 = new Numeros(34);
        Numeros n3 = new Numeros(42);
        Numeros n4 = new Numeros(21);

        List<Numeros> listaNumeros = new LinkedList<>();
        listaNumeros.add(n1);
        listaNumeros.add(n2);
        listaNumeros.add(n3);
        listaNumeros.add(n4);
        Collections.sort(listaNumeros);
        System.out.println(listaNumeros);


        // Integer já implementa Comparable<Integer>,
        // por isso Collections.sort() consegue ordenar
        // uma List<Integer> sem precisarmos criar compareTo().
        //List<Integer> numeros = new LinkedList<>();
        //numeros.add(4);
        //numeros.add(34);
        //numeros.add(42);
        //numeros.add(21);
        //Collections.sort(numeros);
        //System.out.println(numeros);
    }
}
