package exerciciosDeInterfaces;


import exerciciosDeInterfaces.Modelos.Produto;
import exerciciosDeInterfaces.Modelos.Servico;

public class PrincipalVendavel {
    public static void main(String[] args) {
        Produto produto = new Produto();
        produto.setNome("Boné");
        produto.setPreco(50);
        System.out.println(produto.calcularPrecoTotal(3));
        System.out.println(produto.aplicarDesconto(10));

        Servico servico = new Servico();
        servico.setNome("Cortar Grama");
        servico.setPreco(100);
        System.out.println(servico.calcularPrecoTotal(3));
        System.out.println(servico.aplicarDesconto(10));
    }
}
