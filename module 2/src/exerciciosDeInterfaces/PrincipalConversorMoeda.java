package exerciciosDeInterfaces;
import exerciciosDeInterfaces.Modelos.ConversorMoeda;

public class PrincipalConversorMoeda {
    public static void main(String[] args) {
        ConversorMoeda conversorMoeda = new ConversorMoeda();

        System.out.println(conversorMoeda.converterDolarParaReal(100));
    }
}
