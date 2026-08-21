import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class MainTitulo {
    public static void main(String[] args) {
        Titulo titulo0 = new Titulo("Matheus");
        Titulo titulo1 = new Titulo("Thayna");
        Titulo titulo2 = new Titulo("Theo");
        Titulo titulo3 = new Titulo("Alice");

        List<Titulo> listaNomes = new LinkedList<>();
        listaNomes.add(titulo0);
        listaNomes.add(titulo1);
        listaNomes.add(titulo2);
        listaNomes.add(titulo3);
        Collections.sort(listaNomes);
        System.out.println(listaNomes);
    }
}
