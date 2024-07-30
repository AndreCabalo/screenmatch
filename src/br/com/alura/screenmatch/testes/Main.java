package br.com.alura.screenmatch.testes;

import br.com.alura.screenmatch.calculos.CalculadoraDeTempo;
import br.com.alura.screenmatch.calculos.FiltroRecomendacao;
import br.com.alura.screenmatch.model.Episodio;
import br.com.alura.screenmatch.model.Filme;
import br.com.alura.screenmatch.model.Serie;

public class Main {
    public static void main(String[] args) {

//      Instanciar objeto sem construtor
        Filme meuFilme = new Filme();
        meuFilme.setNome("Deadpool & Wolverine");
        meuFilme.setAnoDeLancamento(2024);
        meuFilme.setDuracaoEmMinutos(127);

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
        Serie theBoys = new Serie();
        theBoys.setNome("The Boys");
        theBoys.setAnoDeLancamento(2019);
        theBoys.setTemporadas(2);
        theBoys.setEpisodiosPorTemporada(8);
        theBoys.setMinutosPorEpisodio(60);

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

    }
}
