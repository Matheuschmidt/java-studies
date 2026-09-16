package exercicioGson;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class MainVeiculo {
    public static void main(String[] args) {
        Gson gson = new GsonBuilder().setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
                .setPrettyPrinting()
                .create();
        Veiculo veiculo = new Veiculo("Ford KA", 2012);
        System.out.println(gson.toJson(veiculo));
    }
}
