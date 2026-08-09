import java.util.Scanner;

public class DesafioAlura {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        String nome = "Matheus";
        String tipoConta = "Corrente";
        double valorNaConta = 2000.00;
        int opcoes = 0;

        System.out.println("Dados iniciais do cliente:\n" +
                "\nNome:                "+nome+
                "\nTipo Conta:          "+tipoConta+
                "\nSaldo Inicial:       R$ "+valorNaConta);

        while (opcoes != 4){
            System.out.println("Operaçoes\n" +
                    "\n1- Consultar saldos"+
                    "\n2- Depositar valor"+
                    "\n3- Transferir valor"+
                    "\n4- Sair\n"+
                    "\nDigite a opção desejada:");
            opcoes = leitura.nextInt();

            switch (opcoes){
                case 1:
                    System.out.println("O saldo é: "+valorNaConta);
                    break;
                case 2:
                    System.out.println("Informe o valor a depositar: ");
                    double valorDepositado = leitura.nextDouble();
                    valorNaConta += valorDepositado;
                    System.out.println("Saldo atualizado R$"+valorNaConta);
                    break;
                case 3:
                    System.out.println("Informe o valor a sacar: ");
                    double valorSacar = leitura.nextDouble();
                    if (valorSacar > valorNaConta){
                        System.out.println("Não há saldo suficiente para fazer esse saque.");
                        break;
                    }else {
                        valorNaConta -= valorSacar;
                        System.out.println("Saldo atualizado R$"+(valorNaConta));
                    }
                    break;
                case 4:
                    System.out.println("Programa encerrado.");
                    break;
                default:
                    System.out.println("Opção Inválida.");
            }
        }
    }
}
