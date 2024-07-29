package br.com.alura.screenmatch.DesafiosAlura;

public class DesafioProduto {
    public static void main(String[] args) {

        Produto produto = new Produto();

        produto.setPrice(5000);
        System.out.println(produto.getPrice());
        produto.aplicarDesconto(10);
        System.out.println(produto.getPrice());
    }
}
