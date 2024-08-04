package br.com.alura.screenmatch.desafioAluraManipulandoArq;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class TestandoVeiculo {
    public static void main(String[] args) {
        Veiculo veiculo = new Veiculo("Chevrolet", "Onix", 2021);
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String jsonVeiculo = gson.toJson(veiculo);
        System.out.println(jsonVeiculo);
    }
}
