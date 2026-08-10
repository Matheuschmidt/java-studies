package exercicios;

public class PrincipalCarro {
    public static void main(String[] args) {
        Carro carro = new Carro();
        carro.modelo = "Astra";
        carro.ano = 2004;
        carro.cor = "Branco";
        carro.exibeFicha();
        System.out.println(carro.calculaAnoCarro(2026));
    }
}
