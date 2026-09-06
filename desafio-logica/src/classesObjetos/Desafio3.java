package classesObjetos;

public class Desafio3 {
    public static void main(String[] args) {

        Produto produto = new Produto("Teclado", 150);
        Produto produto1 = new Produto("Mouse", 80);
        Produto produto2 = new Produto("Headset", 200);

        Carrinho carrinho = new Carrinho();
        carrinho.adicionarProduto(produto);
        carrinho.adicionarProduto(produto2);
        carrinho.adicionarProduto(produto1);

        produto.exibirInformacoes();
        produto1.exibirInformacoes();
        produto2.exibirInformacoes();

        System.out.println("Total: " + carrinho.calcularTotal());



    }
}
