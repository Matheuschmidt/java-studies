public class Quadrado implements Forma{
    double lado;

    public Quadrado(double lado) {
        this.lado = lado;
    }

    @Override
    public double calcularArea() {
        double area = lado * lado;
        return area;
    }

    @Override
    public String toString() {
        return "Quadrado";
    }
}
