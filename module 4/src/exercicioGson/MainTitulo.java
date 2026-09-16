package exercicioGson;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class MainTitulo {
    public static void main(String[] args) {
        Gson gson = new GsonBuilder().setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
                .setPrettyPrinting()
                .create();

        try {
            Titulo titulo = new Titulo("Olhar de mil jardas",
                    "expressão que descreve um olhar vazio, " +
                            "distante e sem foco," +
                            " típico de pessoas que sofreram um trauma extremo ou choque emocional.", 1945);
            System.out.println(gson.toJson(titulo));

        }catch (Exception e){
            System.out.println("ERRO");
            System.out.println(e.getMessage());
        }finally {
            System.out.println("Finalizado");
        }
    }
}
