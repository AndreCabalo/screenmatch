package br.com.alura.screenmatch.desafioListasEColecoes;

public class TesteAnimal {
    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro("Thor", "Vira-lata");

        if(cachorro instanceof Cachorro){
            System.out.println("É um cachorro");
        } else {
            System.out.println("Não é um cachorro");
        }

        Animal animalCachorro = cachorro;

        if(animalCachorro instanceof Animal){
            System.out.println("É um animal");
        } else {
            System.out.println("Não é um animal");
        }

    }
}
