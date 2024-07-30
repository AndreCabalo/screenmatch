package br.com.alura.screenmatch.desafioAluraPolEInt;

public class CalculadoraSalaRetangular implements CalculoGeometrico {


    @Override
    public void calcularArea(double largura, double comprimento) {
        System.out.println(largura*comprimento);
    }

    @Override
    public void calcularPerimetro(double largura, double comprimento) {
        System.out.println(largura*2 + comprimento*2);
    }
}
