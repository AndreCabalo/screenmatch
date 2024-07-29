package br.com.alura.screenmatch.desafiosAluraOO;

public class AnimalTestes {
    public static void main(String[] args) {
        Gato gato = new Gato();
        gato.setNome("Bichano");
        gato.emitirSom();
        gato.arranharMoveis();

        Cachorro cachorro = new Cachorro();
        cachorro.setNome("Totó");
        cachorro.emitirSom();
        cachorro.abanarRabo();


    }
}
