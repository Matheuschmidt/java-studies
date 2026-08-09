import java.util.Scanner;

public class DesafioChat {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
         int n = 0;
         int resultado = 0;

        System.out.println(" Digite um numero para fazer sua soma acumulativa ate o numero desejado: ");
        n = leitura.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println(resultado += i);
        }
    }
}
