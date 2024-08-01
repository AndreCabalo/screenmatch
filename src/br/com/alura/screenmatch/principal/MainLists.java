package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.model.Filme;
import br.com.alura.screenmatch.model.Serie;
import br.com.alura.screenmatch.model.Titulo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class MainLists {
    public static void main(String[] args) {
        var filmeDeadpool = new Filme("Deadpool", 2016, 108);
        filmeDeadpool.avalia(10);
        var filmeAvenger = new Filme("Avengers", 2017, 108);
        filmeAvenger.avalia(9);
        var filmeStarWars = new Filme("Star Wars", 2022, 108);
        filmeStarWars.avalia(8);
        var serieLost = new Serie("Lost", 2004);
        var f1 = filmeAvenger;

        f1.setNome("Vingadores");





        ArrayList<Titulo> lista = new ArrayList<>();
        lista.add(filmeDeadpool);
        lista.add(filmeAvenger);
        lista.add(filmeStarWars);
        lista.add(serieLost);

        for (Titulo item: lista) {
            System.out.println(item);
            if (item instanceof Filme){
            Filme filme = (Filme) item;
            System.out.println("A classificação deste filme é nota: " + filme.getClassificacao() + "/5");
            }else {
                System.out.println("Não é um filme, por tanto não tem classificação");
            }
        }


        //Criando lista
       ArrayList<String> buscaPorArtista = new ArrayList<>();
        buscaPorArtista.add("Robert Downey Jr");
        buscaPorArtista.add("Chris Evans");
        buscaPorArtista.add("Mark Ruffalo");
        buscaPorArtista.add("Chris Hemsworth");
        buscaPorArtista.add("Scarlett Johansson");
        buscaPorArtista.add("Jeremy Renner");
        buscaPorArtista.add("Tom Hiddleston");

//        Imprimindo lista desordenada
        System.out.println(buscaPorArtista);

        //Ordenando lista
        Collections.sort(buscaPorArtista);

        //Imprimindo lista ordenada
        System.out.println("Despois da ordenação: " + buscaPorArtista);

        Collections.sort(lista);
        System.out.println("Lista ordenada por nome: " + lista);

        lista.sort(Comparator.comparing(Titulo::getAnoDeLancamento));
        System.out.println("Lista ordenada por ano: " + lista);





    }
}
