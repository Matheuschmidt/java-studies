package exercicioGson;

import com.google.gson.Gson;

public class PrincipalLivroEditora {
    public static void main(String[] args) {
        String json = """
                {
                "titulo": "Dom Casmurro",
                "autor": "Machado de Assis",
                "editora": {
                "nome": "Editora Exemplo",
                    "cidade": "São Paulo"
                }
}
""";
        Gson gson = new Gson();
        LivroGson livroGson = gson.fromJson(json, LivroGson.class);
        System.out.println(livroGson);
    }
}
