import java.util.ArrayList;

public class MainContaBancaria {
    public static void main(String[] args) {
        ContaBancaria contaBancaria = new ContaBancaria(0,250);
        ContaBancaria contaBancaria1 = new ContaBancaria(1,2200);
        ContaBancaria contaBancaria2 = new ContaBancaria(2,560);

        ArrayList<ContaBancaria> listaContaBancaria = new ArrayList<>();
        listaContaBancaria.add(contaBancaria);
        listaContaBancaria.add(contaBancaria1);
        listaContaBancaria.add(contaBancaria2);

        ContaBancaria contaMaiorSaldo = listaContaBancaria.get(0);

        for (ContaBancaria contaBancaria3 : listaContaBancaria){
            if (contaBancaria3.getSaldo() > contaMaiorSaldo.getSaldo()){
                contaMaiorSaldo = contaBancaria3;
            }
        }
        System.out.println("Conta com o maior saldo - Número: " + contaMaiorSaldo.getNumeroConta() +
                ", Saldo: " + contaMaiorSaldo.getSaldo());
    }
}
