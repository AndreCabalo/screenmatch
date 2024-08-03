package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.exception.ErroDeConversaoDeAnoException;
import br.com.alura.screenmatch.model.Titulo;
import br.com.alura.screenmatch.model.TituloOmdb;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
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


        try{
            // client é o objeto que faz a requisição
            HttpClient client = HttpClient.newHttpClient();

            String endereco = "https://www.omdbapi.com/?t=" + buscaFilme.replace(" ", "+") + "&apikey=863cb7d4";

            // request é o objeto que representa a requisição
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(endereco))            // URI da API do OMDB, com endereço dinamico
                    .build();               // .build monta a requisição

            // response é o objeto que representa a resposta
            HttpResponse<String> response = client
                    // client.send envia a requisição e recebe a resposta
                    .send(request, HttpResponse.BodyHandlers.ofString());

//Colocando json em uma string
            String json = response.body();

            System.out.println(json);

//Construindo um objeto gson para fazer a conversão do json para objeto ignorando o case
            Gson gson = new GsonBuilder().setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE).create();

//Criando um titulo, e passando o json e passando a classe que ele deve ser convertido
            TituloOmdb meuTituloOmdb = gson.fromJson(json, TituloOmdb.class);


            Titulo meuTitulo = new Titulo(meuTituloOmdb);
            System.out.println("Titulo já convertido");
            System.out.println(meuTitulo);
        } catch (NullPointerException | IllegalArgumentException | ErroDeConversaoDeAnoException e) {          //multi catch
            System.out.println("Aconteceu um erro: ");
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("Finalizando o programa");
        }

    }
}
