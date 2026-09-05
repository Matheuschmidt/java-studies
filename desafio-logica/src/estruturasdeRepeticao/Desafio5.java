package estruturasdeRepeticao;

import java.util.Scanner;

public class Desafio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int positivo = 0;
        int negativo = 0;
        while (true){
            System.out.print("Digite um número: ");
            int numero = scanner.nextInt();

            if (numero > 0){
                 positivo += numero;
            } else if (numero < 0) {
                negativo ++;
            }else {
                System.out.println("Soma dos positivos: " + positivo);
                System.out.println("Quantidade de negativos: " + negativo);
                break;
            }
        }
    }
}
