package metodos;

import java.util.Scanner;

public class Desafio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o primeiro número: ");
        int num1 = scanner.nextInt();
        System.out.print("Digite o segundo número: ");
        int num2 = scanner.nextInt();

        Calculos calculos = new Calculos(num1, num2);
        calculos.somar();
        System.out.println("Resultado: " + calculos.somar());
    }

}
