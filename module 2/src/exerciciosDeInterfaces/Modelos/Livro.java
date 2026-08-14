package exerciciosDeInterfaces.Modelos;

import exerciciosDeInterfaces.interfaces.Calculavel;

public class Livro implements Calculavel {
    private double preco;
    private int percentualDesconto;

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void setPercentualDesconto(int percentualDesconto) {
        this.percentualDesconto = percentualDesconto;
    }

    @Override
    public double calcularPrecoFinal() {
        double converterPorcentagemParaValor = (preco * percentualDesconto) / 100;
        return preco - converterPorcentagemParaValor;
    }
}
