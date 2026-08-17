import java.util.ArrayList;

public class mainProduto {
    public static void main(String[] args) {
        Produto produto = new Produto("Mouse", 250.50, 4);
        Produto produto1 = new Produto("Teclado", 320, 2);
        Produto produto2 = new Produto("Fone De Ouvido", 140, 5);

        ProdutoPerecivel produtoPerecivel = new ProdutoPerecivel("Barrinha de Cereal", 4.5, 340, "12/05");
        produtoPerecivel.exibirProdutoPerecivel();



        ArrayList<Produto> listaDeProdutos = new ArrayList<>();
        listaDeProdutos.add(produto);
        listaDeProdutos.add(produto1);
        listaDeProdutos.add(produto2);
        System.out.println(listaDeProdutos.size());
        System.out.println(listaDeProdutos.get(0).getNome());
        System.out.println(listaDeProdutos);
    }
}
