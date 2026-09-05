package estruturasdeRepeticao;

import java.util.Scanner;

public class Desafio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um numero: ");
        int numero = scanner.nextInt();
        int contador = 0;
        System.out.println("Múltiplos de 3: ");

        for (int i = 1; i <= numero; i++) {
            if (i % 3 == 0){
                System.out.println(i);
                contador++;

            }
        }
        System.out.println("Quantidade: " + contador);
    }
}
