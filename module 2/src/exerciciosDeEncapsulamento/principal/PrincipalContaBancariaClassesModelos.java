package exerciciosDeEncapsulamento.principal;

import exerciciosDeEncapsulamento.classesModelos.ContaBancaria;
import exerciciosDeEncapsulamento.classesModelos.ContaCorrente;

public class PrincipalContaBancariaClassesModelos {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria();

        conta.exibirSaldo();
        conta.depositar(1000);
        conta.sacar(140);
        conta.exibirSaldo();

        ContaCorrente contaCorrente = new ContaCorrente();
        contaCorrente.depositar(200);
        contaCorrente.cobrarTarifaMensal();
        contaCorrente.sacar(100);

    }
}
