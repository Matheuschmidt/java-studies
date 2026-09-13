package exercicioTryCatch;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class ConsultaGithub {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o nome do usuario desejado para busca:");
        var busca = scanner.nextLine();

        String endereco = "https://api.github.com/users/" + busca;
        try {
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder().uri(URI.create(endereco)).build();
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            String json = response.body();
            System.out.println(json);
            if (response.statusCode() == 404){
                throw new ErroConsultaGitHubException("Usuário não encontrado.");
            }

        }catch (ErroConsultaGitHubException e){
            System.out.println(e.getMessage());
        }catch (IOException e) {
            System.out.println("Erro ao realizar a consulta.");
        } catch (InterruptedException e) {
            System.out.println("A requisição foi interrompida.");
        }
    }
}
