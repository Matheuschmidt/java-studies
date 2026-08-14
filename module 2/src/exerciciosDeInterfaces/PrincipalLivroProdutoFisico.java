package exerciciosDeInterfaces;

import exerciciosDeInterfaces.Modelos.Livro;
import exerciciosDeInterfaces.Modelos.ProdutoFisico;

public class PrincipalLivroProdutoFisico {
    public static void main(String[] args) {
        Livro livro = new Livro();
        livro.setPercentualDesconto(10);
        livro.setPreco(100);
        System.out.println(livro.calcularPrecoFinal());


        ProdutoFisico produtoFisico = new ProdutoFisico();
        produtoFisico.setPreco(100);
        System.out.println(produtoFisico.calcularPrecoFinal());


    }
}
