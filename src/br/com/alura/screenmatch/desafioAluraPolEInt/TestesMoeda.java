package br.com.alura.screenmatch.desafioAluraPolEInt;

public class TestesMoeda {
    public static void main(String[] args) {
        ConversorMoeda conversorMoeda = new ConversorMoeda();
        conversorMoeda.setQuantidadeDeReais(10);
        System.out.println("Quantidade em reais: " + conversorMoeda.getQuantidadeDeReais());
        System.out.println("Quantidade em dolar, antes de converter: " + conversorMoeda.getQuantidadeEmDolar());
        conversorMoeda.converterDolarParaReal();
        System.out.println("Quantidade em dolar depois de converter: " + conversorMoeda.getQuantidadeEmDolar());
    }
}
