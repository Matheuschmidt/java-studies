package exerciciosDeInterfaces;

import exerciciosDeInterfaces.Modelos.CalculadoraSalaRetangular;

public class PrincipalCalculadoraSalaRetangular {
    public static void main(String[] args) {
        CalculadoraSalaRetangular calculadoraSalaRetangular = new CalculadoraSalaRetangular();

        System.out.println(calculadoraSalaRetangular.calcularArea(23,10));
        System.out.println(calculadoraSalaRetangular.calcularPerimetro(50, 34));
    }
}
