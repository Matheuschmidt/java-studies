package exerciciosDeEncapsulamento.classesModelos;

public class ContaBancaria {
    protected double saldo;
    public void depositar(double valor){

        if (valor >= 0.01){
            saldo += valor;
            System.out.println("Deposito de "+valor+" realizado. Saldo Atual: "+saldo);
        }else{
            System.out.println("valor incorreto para deposito");
        }
    }

    public void sacar(double valor){
        if (valor <= saldo){
            saldo -= valor;
            System.out.println("Saque de "+valor+" realizado. Saldo Atual: "+saldo);
        }else {
            System.out.println("Saldo Insuficiente para saque.");
        }

    }

    public void exibirSaldo(){
        System.out.println("O Saldo atual é: "+saldo);
    }
}
