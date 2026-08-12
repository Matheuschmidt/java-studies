package exerciciosDeEncapsulamento.principal;

import exerciciosDeEncapsulamento.classesModelos.Cachorro;
import exerciciosDeEncapsulamento.classesModelos.Gato;

public class PrincipalAnimal {
    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro();
        Gato gato = new Gato();

        cachorro.emitirSom();
        cachorro.abanarRabo();
        gato.emitirSom();
        gato.arranharMoveis();
    }
}
