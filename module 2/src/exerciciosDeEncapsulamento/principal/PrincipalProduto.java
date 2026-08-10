package exerciciosDeEncapsulamento.principal;

import exerciciosDeEncapsulamento.classesEncapsuladas.Produto;

public class PrincipalProduto {
    public static void main(String[] args) {
        Produto produto = new Produto();
        produto.setNome("Site");
        produto.setPreco(990);

        System.out.println("O produto é: "+produto.getNome());
        System.out.println("O preço original é: "+produto.getPreco());
        produto.aplicarDesconto(35);
        System.out.println("O valor com desconto é: "+produto.getPreco());

    }
}
