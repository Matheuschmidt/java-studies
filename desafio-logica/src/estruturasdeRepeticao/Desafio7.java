package estruturasdeRepeticao;

import java.util.Scanner;

public class Desafio7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);




            while (true){
                System.out.print("Digite o valor do saque: ");
                int valor = scanner.nextInt();
                if (valor % 10 != 0) {
                    System.out.println("Saque inválido: o valor deve ser múltiplo de 10.");
                    break;
                }else if (valor <= 0) {
                    System.out.println("Valor deve ser positivo!");
                    break;
                }
                int nota100 = 0;
                int nota50 = 0;
                int nota20 = 0;
                int nota10 = 0;

                if (valor >= 100) {
                    nota100 = valor /  100;
                    System.out.println("Notas de 100: " + nota100);
                    valor -=  (nota100 * 100);
                }
                if (valor >= 50) {
                    nota50 = valor / 50;
                    System.out.println("Notas de 50: " + nota50);
                    valor -= (nota50  * 50);
                }
                if (valor >= 20){
                    nota20 = valor / 20;
                    System.out.println("Notas de 20: " + nota20);
                    valor -= (nota20 * 20);
                }
                if (valor >= 10){
                    nota10 = valor / 10;
                    System.out.println("Notas de 10: " + nota10);
                    valor -= (nota10 * 10);

            }
        }

    }
}
