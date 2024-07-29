package br.com.alura.screenmatch.desafiosAluraOO;

public class Cachorro extends Animal {

    public void abanarRabo() {
        System.out.println("Abanando o rabo");
    }

    @Override
    public void emitirSom() {
        System.out.println("Au au");
    }

}
