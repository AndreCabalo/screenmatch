package br.com.alura.screenmatch.desafioAluraPolEInt;

public class TesteTemperatura {
    public static void main(String[] args) {
        ConversorTemperaturaPadrao conversorTemperaturaPadrao = new ConversorTemperaturaPadrao();
        conversorTemperaturaPadrao.converterFahrenheitParaCelsius(100);
        System.out.println("");
        conversorTemperaturaPadrao.converterCelsiusParaFahrenheit(37.7);
    }
}
