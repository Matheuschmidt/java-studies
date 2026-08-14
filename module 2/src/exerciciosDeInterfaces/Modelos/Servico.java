package exerciciosDeInterfaces.Modelos;

import exerciciosDeInterfaces.interfaces.Vendavel;

public class Servico implements Vendavel {
    private String nome;
    private double preco;
    private int quantidade;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    @Override
    public double calcularPrecoTotal(int quantidade) {
        this.quantidade = quantidade;
        return preco * quantidade;
    }

    @Override
    public double aplicarDesconto(int desconto) {
        double precoTotal = preco * quantidade;
        if (precoTotal >= 400){
            double converterPorcentagemPorValor = (precoTotal * desconto) / 100 ;
            return precoTotal - converterPorcentagemPorValor;
        } else {
            return precoTotal;
        }


    }
}
