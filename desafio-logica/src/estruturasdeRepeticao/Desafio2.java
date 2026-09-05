package estruturasdeRepeticao;

import java.util.Scanner;

public class Desafio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();


        for (int i = 1; i <= numero; i++){
            int resto = i % 2;
            if (resto == 0){
                System.out.println(i);
            }
        }
    }
}
