package classesObjetos;

public class ContaBancaria {
    private String titular;
    private double saldo;

    public ContaBancaria(String titular, double saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }

    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double valor){
        if (valor > 0){
           this.saldo += valor;
        }else {
            throw new IllegalArgumentException("O valor não pode ser 0 ou negativo.");
        }
    }

    public void sacar(double valor){
        if (valor > saldo || valor <= 0){
            throw new IllegalArgumentException("O valor não pode ser 0, menor que 0 ou maior que o saldo.");
        }else {
            this.saldo -= valor;
        }
    }
}
