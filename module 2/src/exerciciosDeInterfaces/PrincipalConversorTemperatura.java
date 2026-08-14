package exerciciosDeInterfaces;

import exerciciosDeInterfaces.Modelos.ConversorTemperaturaPadrao;

public class PrincipalConversorTemperatura {
    public static void main(String[] args) {
        ConversorTemperaturaPadrao conversorTemperaturaPadrao = new ConversorTemperaturaPadrao();
        System.out.println(conversorTemperaturaPadrao.celsiusParaFahrenheit(30));
        System.out.println(conversorTemperaturaPadrao.fahrenheitParaCelsius(77));

    }
}
