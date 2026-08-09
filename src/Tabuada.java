import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        int numero = 0;

        System.out.println("Digite um numero para apresentar a tabuada: ");
        numero = leitura.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.print(numero +" * "+ i+ " = ");
            System.out.println(numero * i);
        }

    }
}
