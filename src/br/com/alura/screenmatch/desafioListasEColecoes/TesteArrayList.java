package br.com.alura.screenmatch.desafioListasEColecoes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class TesteArrayList {
    public static void main(String[] args) {
        ArrayList<String> listaDeStrings = new ArrayList<>();

        listaDeStrings.add("Café");
        listaDeStrings.add("Leite");
        listaDeStrings.add("Arroz");

        listaDeStrings.forEach(System.out::println);


        ArrayList numerosInteiros = new ArrayList();

        numerosInteiros.add(1);
        numerosInteiros.add(20);
        numerosInteiros.add(3);
        numerosInteiros.add(14);
        numerosInteiros.add(5);

        Collections.sort(numerosInteiros);

        System.out.println(numerosInteiros);



    }
}
