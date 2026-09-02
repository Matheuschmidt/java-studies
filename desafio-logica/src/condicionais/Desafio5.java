package condicionais;

import java.util.Scanner;

public class Desafio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("DIGITE 3 LADOS DE UM TRIANGULO");
        System.out.print("Primeiro lado: ");
        int lado1 = scanner.nextInt();
        System.out.print("Segundo lado: ");
        int lado2 = scanner.nextInt();
        System.out.print("Terceiro lado: ");
        int lado3 = scanner.nextInt();

        if (lado1 + lado2 > lado3 && lado1 + lado3 > lado2 && lado2 + lado3 > lado1){
            if (lado1 != lado2 && lado1 != lado3 && lado2 != lado3){
                System.out.println("Triângulo escaleno");
            }else if (lado1 == lado2 && lado2 == lado3 ){
                System.out.println("Triângulo Equilátero");
            }else{
                System.out.println("Triângulo Isósceles");
            }
        }else {
            System.out.println("Os numeros pedidos não formam um triângulo.");
        }
    }
}
