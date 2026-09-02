package condicionais;

import java.util.Scanner;

public class Desafio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Imprima o primeiro numero: ");
        int numero1 = scanner.nextInt();
        System.out.print("Imprima o segundo numero ");
        int numero2 = scanner.nextInt();
        System.out.print("Imprima o terceiro numero ");
        int numero3 = scanner.nextInt();

        int maiorNumero = 0;
        if (numero1 > numero2 && numero1 > numero3){
            maiorNumero = numero1;
            System.out.print("O maior numero é o: " + maiorNumero);
        } else if (numero2 > numero1 && numero2 > numero3){
            maiorNumero = numero2;
            System.out.print("O maior numero é o: " + maiorNumero);
        } else {
            maiorNumero = numero3;
            System.out.print("O maior numero é o: " + maiorNumero);
        }
    }
}
