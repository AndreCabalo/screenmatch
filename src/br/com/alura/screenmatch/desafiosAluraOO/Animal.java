package br.com.alura.screenmatch.desafiosAluraOO;

public class Animal {
    protected String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void emitirSom() {
        System.out.println("Emitindo som de animal");
    }
}
