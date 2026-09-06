package classesObjetos;

public class Desafio2 {
    public static void main(String[] args) {
        ContaBancaria contaBancaria = new ContaBancaria("Matheus", 500);
        System.out.println("Titular: " + contaBancaria.getTitular() +
                "\nSaldo: " + contaBancaria.getSaldo());

        contaBancaria.depositar(200);
        System.out.println("Saldo: " + contaBancaria.getSaldo());
        contaBancaria.sacar(500);
        System.out.println("Saldo: " + contaBancaria.getSaldo());

    }
}
