package exerciciosDeInterfaces.Modelos;

import exerciciosDeInterfaces.interfaces.Calculavel;

public class ProdutoFisico implements Calculavel {
    private double preco;
    private int frete  = 15;

    public void setPreco(double preco) {
        this.preco = preco;
    }

    @Override
    public double calcularPrecoFinal() {
        return preco + frete;
    }
}
