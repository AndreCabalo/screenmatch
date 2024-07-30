package br.com.alura.screenmatch.calculos;

public class FiltroRecomendacao {

    public void filtra(Classificavel classificavel){
        if(classificavel.getClassificacao() >= 4){
            System.out.println( "Altamente recomendado");
        } else if (classificavel.getClassificacao() >= 2){
            System.out.println("Acima da média em recomendações");
        } else {
            System.out.println("Recomendação neutra");
        }
    }
}
