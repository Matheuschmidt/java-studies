package exercicioTryCatch;

import java.util.Scanner;

public class Desafio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o numero do dividendo: ");
        double dividendo = scanner.nextDouble();
        System.out.print("Digite o numero do divisor: ");
        double divisor = scanner.nextDouble();

        try {
            DivisaoDesafio1 divisaoDesafio1 = new DivisaoDesafio1(dividendo, divisor);
            divisaoDesafio1.divisao();
        }catch (DivisorInvalidoException  e){
            System.out.println(e.getMessage());
        }

    }

}
