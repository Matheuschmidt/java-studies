public class Numeros implements Comparable<Numeros>{
    private int numero;

    public Numeros(int numero) {
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }

    @Override
    public String toString() {
        return "Numero: " + getNumero();
    }

    @Override
    public int compareTo(Numeros outrosNumeros) {
        if (this.getNumero() > outrosNumeros.getNumero()){
            return 1;
        } else if (this.getNumero() < outrosNumeros.getNumero()) {
            return -1;
        }else{
            return 0;
        }
    }

    // Como Numeros é uma classe criada por nós,
    // precisamos definir como dois objetos Numeros
    // devem ser comparados.
    //@Override
    //public int compareTo(Numeros outrosNumeros) {
    //    return Integer.compare(this.numero, outrosNumeros.numero);
    //}
}
