package br.com.alura.screenmatch.desafioAluraPolEInt;

public class ConversorMoeda implements ConversaoFinanceira{

    private double quantidadeDeReais;
    private double quantidadeEmDolar;

    public double getQuantidadeDeReais() {
        return quantidadeDeReais;
    }

    public void setQuantidadeDeReais(double quantidadeDeReais) {
        this.quantidadeDeReais = quantidadeDeReais;
    }

    public double getQuantidadeEmDolar() {
        return quantidadeEmDolar;
    }

    public void setQuantidadeEmDolar(double quantidadeEmDolar) {
        this.quantidadeEmDolar = quantidadeEmDolar;
    }

    @Override
    public void converterDolarParaReal() {
        quantidadeEmDolar = quantidadeDeReais * 5.5;
    }
}
