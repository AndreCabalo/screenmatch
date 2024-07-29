package br.com.alura.screenmatch.Testes;

import br.com.alura.screenmatch.Model.Filme;

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
    }
}
