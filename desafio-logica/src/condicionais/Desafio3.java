package condicionais;

import java.util.Scanner;

public class Desafio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a primeira nota: ");
        double nota1 = scanner.nextDouble();

        System.out.print("Digite a segunda nota: ");
        double nota2 = scanner.nextDouble();

        double media = (nota1 + nota2) / 2;
        System.out.println("A média é: " + media);
        if (media >= 7){
            System.out.println("Aprovado");
        }else if(media >= 5){
            System.out.println("Recuperação");
        }else {
            System.out.println("Reprovado");
        }
    }
}
