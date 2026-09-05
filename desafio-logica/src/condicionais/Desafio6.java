package condicionais;

import java.util.Scanner;

public class Desafio6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Insira o valor de uma compra: ");
        double valor = scanner.nextDouble();

        double porcentagemDesconto;

        if (valor >= 500) {
            porcentagemDesconto = 0.20;
        } else if (valor >= 200) {
            porcentagemDesconto = 0.10;
        } else if (valor >= 100) {
            porcentagemDesconto = 0.05;
        } else {
            porcentagemDesconto = 0;
        }

        double valorDesconto = valor * porcentagemDesconto;
        double valorFinal = valor - valorDesconto;

        System.out.println("Valor original: R$" + valor);
        System.out.println("Desconto: " + porcentagemDesconto * 100 + "%");
        System.out.println("Valor do desconto: R$" + valorDesconto);
        System.out.println("Valor final: R$" + valorFinal);
    }
}
