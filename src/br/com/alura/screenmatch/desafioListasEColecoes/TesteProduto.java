package br.com.alura.screenmatch.desafioListasEColecoes;

import java.time.LocalDate;
import java.util.ArrayList;

public class TesteProduto {
    public static void main(String[] args) {

        ArrayList<Produto> produtos = new ArrayList<>();

        Produto produto1 = new Produto("Café", 100.0, 5);
        produtos.add(produto1);
        Produto produto2 = new Produto("Leite", 50.0, 5);
        produtos.add(produto2);
        Produto produto3 = new Produto("Arroz", 10.0, 5);
        produtos.add(produto3);

        for (int i = 0; i < produtos.size(); i++) {
            System.out.println("O produto no indice " + (i+1) + "é :" + produtos.get(i));
        }

        ProdutoPerecivel produtoPerecivel = new ProdutoPerecivel("Peixe", 10.0, 5, LocalDate.now());
        System.out.println(produtoPerecivel);

        double precoAcumulado = 0;

        //criando calculo mediaprecos
        for (int i = 0; i < produtos.size(); i++) {
            double precoProduto = produtos.get(i).getPreco();
            System.out.println("O preço do produto é: " + precoProduto);
            precoAcumulado += precoProduto;
            System.out.println("O preço acumulado é: " + precoAcumulado);
            double mediaPreco = precoAcumulado / produtos.size();
            System.out.println("A média de preço é: " + mediaPreco);
        };


    }
}
