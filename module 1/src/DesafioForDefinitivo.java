import java.util.Scanner;

public class DesafioForDefinitivo {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        int n = 0;
        int resultado = 0;
        int totalDivisivel = 0;
        System.out.println("imprima um numero: ");
        n = leitura.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println(i);

            if (i % 3 == 0){
                System.out.println(i);
                resultado += i;
                totalDivisivel++;
            }
        }

        System.out.println("a soma dos numeros divisiveis por 3: "+ resultado);
        System.out.println("a quantidade de numeros disiveis por 3 encontradas foi: "+ totalDivisivel);
    }
}
