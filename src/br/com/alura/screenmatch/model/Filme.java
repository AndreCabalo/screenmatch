package br.com.alura.screenmatch.model;

import br.com.alura.screenmatch.calculos.Classificavel;

//Filme extende de Titulo
public class Filme extends Titulo implements Classificavel {

    private String diretor;

    public String getDiretor() {
        return diretor;
    }

//    Construtores vazio (xuxu)
    public Filme() {
    }

//    Construtor com nome e ano de lançamento da classe pai
    public Filme(String nome, int anoDeLancamento){
        super(nome, anoDeLancamento);
    }

//    Construtor com nome, ano de lançamento e duração em minutos
    public Filme(String nome, int anoDeLancamento, int duracaoEmMinutos) {
        this.setNome(nome);
        this.setAnoDeLancamento(anoDeLancamento);
        this.setDuracaoEmMinutos(duracaoEmMinutos);
    }

//    Construtor com nome, ano de lançamento e diretor
    public Filme(String nome, int anoDeLancamento, String diretor) {
        this.setNome(nome);
        this.setDiretor(diretor);
    }


    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }





    @Override
    public void exibeFichaTecnica() {
        System.out.println("O Filme " + super.getNome() + " foi lançado em " + super.getAnoDeLancamento() + " e dirigido por " + diretor);
    }

    @Override
    public int getClassificacao() {
       return (int)pegaMedia()/2;
    }

    @Override
    public String toString() {
        return "Filme: " + this.getNome() + " (" + this.getAnoDeLancamento() + ")";
    }
}

