package br.com.alura.screenmatch.principal;

import com.sun.net.httpserver.Request;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class PrincipalComBusca {
    public static void main(String[] args) throws IOException, InterruptedException {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um filme para busca:  ");
        var buscaFilme = scanner.nextLine();

        // client é o objeto que faz a requisição
        HttpClient client = HttpClient.newHttpClient();

        String endereco = "https://www.omdbapi.com/?t=" + buscaFilme + "&apikey=863cb7d4";

        // request é o objeto que representa a requisição
        HttpRequest request = HttpRequest.newBuilder()
                // URI da API do OMDB, com endereço dinamico
                .uri(URI.create(endereco))
                // .build monta a requisição
                .build();

        // response é o objeto que representa a resposta
        HttpResponse<String> response = client
                // client.send envia a requisição e recebe a resposta
                .send(request, HttpResponse.BodyHandlers.ofString());

        System.out.println(response.body());
    }
}
