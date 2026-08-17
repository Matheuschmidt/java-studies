import java.util.ArrayList;

public class MainPessoa {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa();
        pessoa1.setNome("Matheus");
        pessoa1.setIdade(21);

        Pessoa pessoa2 = new Pessoa();
        pessoa2.setNome("Thayna");
        pessoa2.setIdade(21);

        Pessoa pessoa3 = new Pessoa();
        pessoa3.setNome("Mel");
        pessoa3.setIdade(40);

        Pessoa pessoa4 = new Pessoa();
        pessoa4.setNome("Rodolfo");
        pessoa4.setIdade(38);

        Pessoa pessoa5 = new Pessoa();
        pessoa5.setNome("Marcelo");
        pessoa5.setIdade(43);

        ArrayList<Pessoa> listaDePessoas = new ArrayList<>();
        listaDePessoas.add(pessoa1);
        listaDePessoas.add(pessoa2);
        listaDePessoas.add(pessoa3);
        listaDePessoas.add(pessoa4);
        listaDePessoas.add(pessoa5);
        System.out.println("Tamanho Lista: "+ listaDePessoas.size());
        System.out.println("Primeira pessoa da lista: "+ listaDePessoas.get(0).getNome());
        System.out.println(listaDePessoas);

    }
}
