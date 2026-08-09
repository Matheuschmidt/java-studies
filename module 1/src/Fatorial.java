import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        int numero = 0;


        System.out.println("Escolha um numero para ver o fatorial do mesmo: ");
        numero = leitura.nextInt();

        for (int i = numero - 1; i > 0 ; i--) {
            System.out.println(numero *= i);




        }
    }
}
