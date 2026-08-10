public class PrincipalMusica {
    public static void main(String[] args) {
        Musica musica = new Musica();
        musica.titulo = "I Wanna Be Adored";
        musica.artista = "The Stone Roses";
        musica.anoLancamento = 2009;
        musica.exibeFicha();

        musica.pegaAvaliacao(9.2);
        musica.pegaAvaliacao(3);
        musica.pegaAvaliacao(8);

        System.out.println(musica.fazMedia());
    }
}
