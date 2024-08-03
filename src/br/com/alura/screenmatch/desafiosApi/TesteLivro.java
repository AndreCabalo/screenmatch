package br.com.alura.screenmatch.desafiosApi;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class TesteLivro {
    public static void main(String[] args) {

        String json = """
                {"titulo": "Java 11",
                    "autor": "Deitel",
                    "editora": {
                        "nome": "Alura",
                        "cidade": "São Paulo"
                    }
                }
                """;

        Gson gson = new Gson();
        Livro livro = gson.fromJson(json, Livro.class);
        System.out.println("Objeto Livro: " + livro);
    }
}
