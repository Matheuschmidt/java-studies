import java.util.ArrayList;

public class MainForma {
    public static void main(String[] args) {
        Forma forma1 = new Circulo(10);
        Forma forma2 = new Quadrado(5);
        Forma forma3 = new Circulo(6);
        Forma forma4 = new Quadrado(7);
        Forma forma5 = new Circulo(3);
        Forma forma6 = new Quadrado(4);

        ArrayList<Forma> listaFormas = new ArrayList<>();
        listaFormas.add(forma1);
        listaFormas.add(forma2);
        listaFormas.add(forma3);
        listaFormas.add(forma4);
        listaFormas.add(forma5);
        listaFormas.add(forma6);
        for (Forma forma : listaFormas) {
            System.out.println(forma.calcularArea());
        }
    }
}
