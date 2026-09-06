package classesObjetos;

public class Desafio4 {
    public static void main(String[] args) {
        Livro livro = new Livro(1, "O Hobbit", "J.R.R. Tolkien", true);
        Livro livro1 = new Livro(2, "1984", "George Orwell", true);
        Livro livro2 = new Livro(3, "Clean Code", "Robert C. Martin", true);


        Biblioteca biblioteca = new Biblioteca();
        biblioteca.adicionarLivro(livro);
        biblioteca.adicionarLivro(livro1);
        biblioteca.adicionarLivro(livro2);

        System.out.println("=== BIBLIOTECA ===");
        livro.exibirInformacoes();
        livro1.exibirInformacoes();
        livro2.exibirInformacoes();
        System.out.println("==================");
        livro.emprestar();
        livro.exibirInformacoes();
        System.out.println("==================");
        livro1.emprestar();
        livro1.exibirInformacoes();
        System.out.println("==================");
        livro1.devolver();
        livro1.exibirInformacoes();
        System.out.println("==================");


        System.out.println(biblioteca.buscarPorId(2));

    }
}
