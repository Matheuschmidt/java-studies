public class ProdutoEstoque {
    String nome;
    double preco;
    int totalEstoque;

    void exibeFicha(){
        System.out.println("Produto: "+nome+
                "\nPreço: "+preco);
    }

    void adicionaEstoque(int produto){
        totalEstoque += produto;
    }

    void removeEstoque(int produto){
        totalEstoque -= produto;
    }

}
