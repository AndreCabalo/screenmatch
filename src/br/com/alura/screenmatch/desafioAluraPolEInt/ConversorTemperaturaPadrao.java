package br.com.alura.screenmatch.desafioAluraPolEInt;

public class ConversorTemperaturaPadrao implements ConversorTemperatura {

    @Override
    public void converterCelsiusParaFahrenheit(double temperaturaCelsius) {
        double temperaturaFahrenheit = (temperaturaCelsius*9/5)+32;
        System.out.printf( "%.2f C é igual a %.2f F", temperaturaCelsius,temperaturaFahrenheit);

    }

    @Override
    public void converterFahrenheitParaCelsius(double temperaturaFahrenheit) {
        double temperaturaCelsius = (temperaturaFahrenheit-32)*5/9;
        System.out.printf("%.2f F é igual a %.2f C ", temperaturaFahrenheit,temperaturaCelsius);

    }
}

