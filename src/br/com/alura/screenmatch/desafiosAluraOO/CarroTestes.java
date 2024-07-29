package br.com.alura.screenmatch.desafiosAluraOO;

public class CarroTestes {
    public static void main(String[] args) {
        ModeloCarro modeloCarro = new ModeloCarro();
        modeloCarro.modelo = "Up";
        modeloCarro.definirPrecos(10000, 20000, 30000);
        System.out.println(modeloCarro);

        System.out.println("O preço menor, entre os ultimos 3 anos foi de : R$" + modeloCarro.calculaMenorPreco());


    }
}
