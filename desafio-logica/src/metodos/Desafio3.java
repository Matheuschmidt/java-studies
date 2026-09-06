package metodos;

public class Desafio3 {
    public static int maiorNumero(int a, int b){
       return (a > b) ? a : b;
    }

    public static void main(String[] args) {
        int resultado = maiorNumero(900, 77);
        System.out.println(resultado);
    }
}
