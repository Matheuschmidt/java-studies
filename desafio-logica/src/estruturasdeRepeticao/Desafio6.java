package estruturasdeRepeticao;

import java.util.Scanner;

public class Desafio6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int maiorNumero = 0;
        int menorNumero = 0;
        int somaPositivos = 0;
        int somaNegativos = 0;
        int positivo = 0;
        int negativo = 0;
        boolean primeiro = true;

        while (true){
            System.out.print("Digite um número: ");
            int numero = scanner.nextInt();
            if (numero == 0){
                System.out.println("Encerrado.");
                break;
            }
            if (primeiro){
                maiorNumero = numero;
                menorNumero = numero;
                primeiro = false;
            } else {
                if (numero > maiorNumero) {
                    maiorNumero = numero;
                }
                if (numero < menorNumero){
                    menorNumero = numero;
                }
            }

            if (numero > 0){
                positivo ++;
                somaPositivos += numero;
            } else if (numero < 0) {
                negativo ++;
                somaNegativos += numero;
            }
        }
        if (primeiro) {
            System.out.println("Nenhum número foi digitado.");
        } else {
            System.out.println("Quantidade de positivos: " + positivo);
            System.out.println("Quantidade de negativos: " + negativo);
            System.out.println("Soma dos positivos: " + somaPositivos);
            System.out.println("Soma dos negativos: " + somaNegativos);
            System.out.println("Maior: " + maiorNumero);
            System.out.println("Menor: " + menorNumero);
        }
    }
}
