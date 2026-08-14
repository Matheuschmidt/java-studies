package exerciciosDeInterfaces.Modelos;

import exerciciosDeInterfaces.interfaces.ConversorTemperatura;

public class ConversorTemperaturaPadrao implements ConversorTemperatura {

    @Override
    public double celsiusParaFahrenheit(int celsius) {
        System.out.print("A conversão para fahrenheit é: ");
        return celsius * 1.8 + 32;
    }

    @Override
    public double fahrenheitParaCelsius(int fahrenheit) {
        System.out.print("A conversão para celsius é: ");
       return (fahrenheit - 32) / 1.8;
    }
}
