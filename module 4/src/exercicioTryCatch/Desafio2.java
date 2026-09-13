package exercicioTryCatch;

import java.util.Scanner;

public class Desafio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Crie sua senha: ");
        String senha = scanner.nextLine();

        try {
            SenhaDesafio2 senhaDesafio2 = new SenhaDesafio2(senha);
            System.out.println("Senha criada com sucesso!");
        }catch (SenhaInvalidaException  e){
            System.out.println(e.getMessage());
        }
    }
}
