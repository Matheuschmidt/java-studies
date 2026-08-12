package exerciciosDeEncapsulamento.classesModelos;

public class ContaCorrente extends ContaBancaria{
    private double tarifaMensal = 50;

    public void cobrarTarifaMensal(){
        saldo -= tarifaMensal;
        System.out.println("Tarifa mensal de "+tarifaMensal+" cobrada. Saldo atual: "+saldo);
    }
}
