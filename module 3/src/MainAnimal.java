public class MainAnimal {
    public static void main(String[] args) {
        Animal animal = new Cachorro();

        if (animal instanceof Cachorro){
            Cachorro cachorro = (Cachorro) animal;
            System.out.println("O animal é um cachorro");
        }else{
            System.out.println("Nao é");
        }
    }
}
