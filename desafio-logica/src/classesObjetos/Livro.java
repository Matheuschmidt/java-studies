package classesObjetos;

public class Livro {
    private int id;
    private String titulo;
    private String autor;
    private boolean disponivel;

    public Livro(int id, String titulo, String autor, boolean disponivel) {
        this.id = id;
        this.titulo = titulo;
        this.autor = autor;
        this.disponivel = disponivel;
    }

    public int getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void exibirInformacoes(){
        if (isDisponivel() == true){
            System.out.println(getTitulo() + " - " + getAutor() + " - Disponível");
        }else {
            System.out.println(getTitulo() + " - " + getAutor() + " - Indisponível");
        }

    }

    public void emprestar(){
        if (disponivel == true){
            disponivel = false;
        }else {
            System.out.println("Livro já está emprestado.");
        }
    }

    public void devolver(){
        if (disponivel == false){
            disponivel = true;
        }else {
            System.out.println("Este livro já foi devolvido.");
        }
    }

    @Override
    public String toString() {
        return "Livro{" +
                "id=" + id +
                ", titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", disponivel=" + disponivel +
                '}';
    }
}
