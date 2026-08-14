package exerciciosDeInterfaces.Modelos;

import exerciciosDeInterfaces.interfaces.CalculoGeometrico;

public class CalculadoraSalaRetangular implements CalculoGeometrico {

    @Override
    public int calcularArea(int altura, int largura) {
        return largura * altura;
    }

    @Override
    public int calcularPerimetro(int altura, int largura) {
        return 2 * (altura + largura);
    }
}
