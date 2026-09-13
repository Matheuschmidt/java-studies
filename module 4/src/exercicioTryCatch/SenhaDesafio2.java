package exercicioTryCatch;

public class SenhaDesafio2 {
    private String senha;

    public SenhaDesafio2(String senha) {
        if (senha.length() < 8){
            throw new SenhaInvalidaException("A senha precisa ter pelo menos 8 caracteres.");
        }
        this.senha = senha;
    }
}
