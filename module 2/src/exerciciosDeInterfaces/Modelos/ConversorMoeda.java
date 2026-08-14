package exerciciosDeInterfaces.Modelos;

import exerciciosDeInterfaces.interfaces.ConversaoFinanceira;

public class ConversorMoeda implements ConversaoFinanceira {
    @Override
    public double converterDolarParaReal(double valorEmDolar) {
        return valorEmDolar * 5.16;
    }
}
