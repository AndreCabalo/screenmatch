package br.com.alura.screenmatch.desafiosAluraOO;

public class Gato extends Animal {

    public void arranharMoveis() {
        System.out.println("Arranhando móveis");
    }

    @Override
    public void emitirSom() {
        System.out.println("Miau");
    }
}
