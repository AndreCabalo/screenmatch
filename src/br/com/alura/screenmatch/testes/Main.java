package br.com.alura.screenmatch.testes;

import br.com.alura.screenmatch.calculos.CalculadoraDeTempo;
import br.com.alura.screenmatch.calculos.FiltroRecomendacao;
import br.com.alura.screenmatch.model.Episodio;
import br.com.alura.screenmatch.model.Filme;
import br.com.alura.screenmatch.model.Serie;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

//      Instanciar objeto sem construtor
        Filme meuFilme = new Filme("Deadpool", 2016, 108);

//      método que printa infos
        meuFilme.exibeFichaTecnica();

        meuFilme.avalia(8);
        meuFilme.avalia(5);
        meuFilme.avalia(9);
        meuFilme.avalia(10);

        System.out.println(meuFilme.getTotalDeAvaliacoes());
        System.out.println(meuFilme.getSomaDasAvaliacoes());
        System.out.println("A nota média de avaliação é de :" + meuFilme.pegaMedia());

        // lastindexOF retorna a última ocorrência de um caractere
        System.out.println(meuFilme.getNome().lastIndexOf("W"));

//        Instanciando serie
        Serie theBoys = new Serie("The boys", 2019);


        System.out.println("Duração da serie em minutos: " + theBoys.getDuracaoEmMinutos());

//        Instanciar calculadora tempo filme
        CalculadoraDeTempo calculadoraDeTempo = new CalculadoraDeTempo();
        calculadoraDeTempo.inclui(meuFilme);
        System.out.println("Tempo total de filmes inclusos na calculadora de tempo " + calculadoraDeTempo.getTempoTotal() + " Min");calculadoraDeTempo.inclui(meuFilme);
        calculadoraDeTempo.inclui(theBoys);
        System.out.println("Tempo total de filmes  + serie inclusos na calculadora de tempo " + calculadoraDeTempo.getTempoTotal() + " Min");

//        Testando classificação
        FiltroRecomendacao filtroRecomendacao = new FiltroRecomendacao();
        filtroRecomendacao.filtra(meuFilme);

//        Testando episodio
        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setSerie(theBoys);
        episodio.setTotalVisualizacoes(300);

        filtroRecomendacao.filtra(episodio);

//        Criando 3 filme
        var filmeDoPaulo = new Filme( "O Poderoso Chefão", 1972, "Francis Ford Coppola");

        //ArrayList - Lista de filmes
        ArrayList<Filme> listaDeFilmes = new ArrayList<>();
        listaDeFilmes.add(meuFilme);
        listaDeFilmes.add(filmeDoPaulo);

        //Imprime tamanho da lista
        System.out.println("Tamanho da lista: " + listaDeFilmes.size());

        //Laço para pegar os filmes da lista
        for (int i = 0; i < listaDeFilmes.size(); i++) {
        System.out.println("Filme nº:" + (i+1) + " da lista: " + listaDeFilmes.get(i).getNome());

        }
        System.out.println(meuFilme);
    }
}
