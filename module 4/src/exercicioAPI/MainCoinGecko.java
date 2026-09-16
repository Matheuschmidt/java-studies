package exercicioAPI;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class MainCoinGecko {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha uma criptomoeda para busca: ");
        var busca = scanner.nextLine();

        String endereco = "https://api.coingecko.com/api/v3/simple/price?vs_currencies=brl&ids=" + busca + "&x_cg_demo_api_key=CG-8csEWY7bZcW2hXhZBqGqVytF";

        HttpClient client = HttpClient.newHttpClient();

        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(endereco))
                .build();


        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());

        System.out.println(response.body());
    }
}
