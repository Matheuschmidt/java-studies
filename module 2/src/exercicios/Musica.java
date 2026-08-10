package exercicios;

public class Musica {
    String titulo;
    String artista;
    int anoLancamento;
    double avaliacaoTotal;
    int numAvaliacoes;

    void exibeFicha(){
        System.out.println("Nome da musica: "+titulo+
                "\nNome do artista: "+artista+
                "\nAno de laçamento: "+anoLancamento);
    }

    void pegaAvaliacao(double avaliacao){
         avaliacaoTotal+=avaliacao;
         numAvaliacoes++;
    }

    double fazMedia(){
        return avaliacaoTotal / numAvaliacoes;
    }
}
