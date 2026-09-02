package condicionais;

import java.util.Scanner;

public class Desafio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um numero inteiro: ");
        int i = scanner.nextInt();

        if (i > 0){
            System.out.println("Numero positivo");
        } else if (i < 0) {
            System.out.println("Numero negativo");
        } else {
            System.out.println("O numero é zero");
        }
    }
}
