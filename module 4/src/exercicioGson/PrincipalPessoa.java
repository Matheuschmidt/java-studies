package exercicioGson;
import com.google.gson.Gson;

public class PrincipalPessoa {
    public static void main(String[] args) {
        String json = """
                {
                "nome" : "Matheus",
                "idade" : 21,
                "cidade" : "Porto Alegre",
                "profissao" : "Desenvolvedor"
                }
                """;

        Gson gson =  new Gson();
        PessoaGson pessoaGson = gson.fromJson(json, PessoaGson.class);
        System.out.println(pessoaGson);
    }
}
