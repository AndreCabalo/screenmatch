package br.com.alura.screenmatch.desafioAluraExceptions;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class TestErroBuscaGitHub {
    public static void main(String[] args) throws IOException, InterruptedException {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome do usuário do GitHub: ");
        String nomeUsuario = scanner.nextLine();
        String endereco = "https://api.github.com/users/" + nomeUsuario;

        try {
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder().uri(URI.create(endereco)).build();
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            System.out.println(response.body());

            if (response.statusCode() == 404) {
                throw new ErroConsultaHGitHubException("Usuário não encontrado");
            }
        }
        catch(ErroConsultaHGitHubException e) {
            System.out.println(e.getMessage());
        }finally {
            scanner.close();
            System.out.println("Fim da execução");
        }
    }
}

