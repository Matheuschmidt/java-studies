import java.util.Scanner;

public class Atividade3 {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        int opcoesCalcularArea = 0;





        while (opcoesCalcularArea != -1){
            System.out.println("insira 1 para calcular a area do quadrado\ninsira 2 para calcular a area do circulo\ninsira qualquer outro valor para encerrar o programa");
            opcoesCalcularArea = leitura.nextInt();

            if (opcoesCalcularArea != 1 && opcoesCalcularArea != 2){
                System.out.println("programa encerrado...");
                break;
            }

            double ladoQuadrado = 0;
            double raioCirculo = 0;

            switch (opcoesCalcularArea){
                case 1:
                    System.out.println("digite o lado do quadrado.");
                    ladoQuadrado = leitura.nextDouble();
                    double areaQuadrado = ladoQuadrado * ladoQuadrado;
                    System.out.println(areaQuadrado);
                    break;
                case 2:
                    System.out.println("digite o raio do circulo.");
                    raioCirculo = leitura.nextDouble();
                    double areaCirculo = Math.PI * (raioCirculo * raioCirculo);
                    System.out.println(areaCirculo);
                    break;
                default:
                    System.out.println("ERRO");
                    break;
            }
        }
    }
}
