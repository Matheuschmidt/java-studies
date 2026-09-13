package exercicioTryCatch;

public class DivisaoDesafio1 {
    private double dividendo;
    private double divisor;

    public DivisaoDesafio1(double dividendo, double divisor) {
        if (divisor <= 0){
            throw new DivisorInvalidoException("O divisor precisa ser maior que 0.");
        }
        this.dividendo = dividendo;
        this.divisor = divisor;
    }

    public void divisao(){
        double resultado = dividendo / divisor;
        System.out.println(dividendo + " / " + divisor + " = " + resultado);
    }
}
