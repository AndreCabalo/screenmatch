package br.com.alura.screenmatch.model;

import br.com.alura.screenmatch.calculos.Classificavel;

//Filme extende de Titulo
public class Filme extends Titulo implements Classificavel {

    private String diretor;

    public String getDiretor() {
        return diretor;
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
}

