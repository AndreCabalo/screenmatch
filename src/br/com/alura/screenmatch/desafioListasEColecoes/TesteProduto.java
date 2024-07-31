package br.com.alura.screenmatch.desafioListasEColecoes;

import java.time.LocalDate;
import java.util.ArrayList;

public class TesteProduto {
    public static void main(String[] args) {

        ArrayList<Produto> produtos = new ArrayList<>();

        Produto produto1 = new Produto("Café", 10.0, 5);
        produtos.add(produto1);
        Produto produto2 = new Produto("Leite", 10.0, 5);
        produtos.add(produto2);
        Produto produto3 = new Produto("Arroz", 10.0, 5);
        produtos.add(produto3);

        for (int i = 0; i < produtos.size(); i++) {
            System.out.println("O produto no indice " + (i+1) + "é :" + produtos.get(i));

        }

        ProdutoPerecivel produtoPerecivel = new ProdutoPerecivel("Peixe", 10.0, 5, LocalDate.now());
        System.out.println(produtoPerecivel);


    }
}
