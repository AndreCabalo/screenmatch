package br.com.alura.screenmatch.model;

//Filme extende de Titulo
public class Filme extends Titulo {

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
}

