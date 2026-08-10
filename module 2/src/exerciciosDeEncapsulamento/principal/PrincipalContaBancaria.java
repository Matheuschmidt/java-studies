package exerciciosDeEncapsulamento.principal;
import exerciciosDeEncapsulamento.classesEncapsuladas.ContaBancaria;

public class PrincipalContaBancaria {
    public static void main(String[] args) {

        ContaBancaria conta = new ContaBancaria();

        conta.titular = "Matheus";
        conta.setNumeroConta(12345);
        conta.setSaldo(1000.00);

        System.out.println("Titular: " + conta.titular);
        System.out.println("Número da conta: " + conta.getNumeroConta());
        System.out.println("Saldo: R$ " + conta.getSaldo());
    }
}
