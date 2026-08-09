import java.util.Scanner;

public class ExercicioFor {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        
        int n = 0;
        int resultado = 0;

        System.out.println("Insira qualquer numero para fazer o registro dos numeros pares ate ele. ");
        n = leitura.nextInt();

        for (int i = 1; i <= n; i++){
            System.out.println(i);
            if (i % 2 == 0){
                resultado += i;
            }

        }
        System.out.println("a soma dos pares é: "+ resultado);
    }
}
