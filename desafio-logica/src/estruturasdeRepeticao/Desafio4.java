package estruturasdeRepeticao;
import java.util.Scanner;

public class Desafio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int maiorNumero = 0;
        int menorNumero = 0;
        int soma = 0;
        int contador = 0;
        boolean primeiro = true;
        for (int i = 1; i <= 5; i++) {
            System.out.print("Digite o " + i + "º número: ");
             int numero = scanner.nextInt();

            contador++;
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


            soma += numero;
        }
        double media = (double) soma / contador;
        System.out.println("Maior: " + maiorNumero);
        System.out.println("Menor: " + menorNumero);
        System.out.println("Soma: " + soma);
        System.out.println("Média: " + media);
    }
}
