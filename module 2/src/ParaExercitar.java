public class ParaExercitar {
    public static void main(String[] args) {
        ProdutoEstoque mercadoria = new ProdutoEstoque();
        mercadoria.nome = "Teclado";
        mercadoria.preco = 320.0;

        mercadoria.exibeFicha();
        mercadoria.adicionaEstoque(5);
        mercadoria.adicionaEstoque(3);
        System.out.println(mercadoria.totalEstoque);

        mercadoria.removeEstoque(2);
        System.out.println(mercadoria.totalEstoque);

    }
}
