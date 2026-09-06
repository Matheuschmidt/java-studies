package classesObjetos;

import java.util.ArrayList;
import java.util.List;

public class Carrinho {

    private List<Produto> produtos;


    public Carrinho(){
        this.produtos = new ArrayList<>();
    }

    public void adicionarProduto(Produto produto) {
        this.produtos.add(produto);
    }

    public double calcularTotal(){
        double total = 0;
        for (Produto p : produtos){
            total += p.getPreco();
        }
        return total;
    }
}
