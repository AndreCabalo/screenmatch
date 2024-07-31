package br.com.alura.screenmatch.desafioListasEColecoes;

import java.util.ArrayList;

public class TesteArrayList {
    public static void main(String[] args) {
        ArrayList<String> listaDeStrings = new ArrayList<>();

        listaDeStrings.add("Café");
        listaDeStrings.add("Leite");
        listaDeStrings.add("Arroz");

        listaDeStrings.forEach(System.out::println);
    }
}
