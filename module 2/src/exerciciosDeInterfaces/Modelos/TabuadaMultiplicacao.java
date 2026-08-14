package exerciciosDeInterfaces.Modelos;

import exerciciosDeInterfaces.interfaces.Tabuada;

public class TabuadaMultiplicacao implements Tabuada {

    @Override
    public void mostrarTabuada(int numero) {
        for (int i = 1; i <= 10; i++) {
            System.out.print(numero +" * "+ i+ " = ");
            System.out.println(numero * i);
        }
    }
}
