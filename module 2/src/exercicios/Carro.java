package exercicios;

public class Carro {
    String modelo;
    int ano;
    String cor;

    void exibeFicha(){
        System.out.println("O modelo do carro é: "+modelo+
                "\nO ano do carro é: "+ ano +
                "\nA cor do carro é: "+cor);
    }

    int calculaAnoCarro(int anoAtual){
        return anoAtual - ano;
    }
}
