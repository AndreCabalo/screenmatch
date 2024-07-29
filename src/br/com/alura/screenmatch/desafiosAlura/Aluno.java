package br.com.alura.screenmatch.desafiosAlura;

public class Aluno {
    private String nome;
    private double notas ;
    private int quantidadeNotas;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getNotas() {
        return notas;
    }

    public void setNotas(double nota) {
        this.notas += nota;
        quantidadeNotas++;
    }

    public void calcularMediaNotas(){
        System.out.println("A média do aluno " + nome + " é: " + notas / quantidadeNotas);
    }
}
