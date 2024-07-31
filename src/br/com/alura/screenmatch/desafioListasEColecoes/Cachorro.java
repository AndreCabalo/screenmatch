package br.com.alura.screenmatch.desafioListasEColecoes;

public class Cachorro extends Animal{
    private String raca;

    public Cachorro(String nome, String raca) {
        super(nome);
        this.raca = raca;
    }

    public Cachorro(String raca) {
        this.raca = raca;
    }

}
