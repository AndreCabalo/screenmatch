package br.com.alura.screenmatch.desafioListasEColecoes;

import java.util.ArrayList;

public class TestePessoa {

    public static void main(String[] args) {

        ArrayList<Pessoa> pessoas = new ArrayList<>();

        Pessoa andre = new Pessoa();
        andre.setNome("André");
        andre.setIdade(32);
        pessoas.add(andre);

        Pessoa lohana = new Pessoa();
        lohana.setNome("Lohana");
        lohana.setIdade(30);
        pessoas.add(lohana);

        Pessoa maria = new Pessoa();
        maria.setNome("Maria");
        maria.setIdade(55);
        pessoas.add(maria);

        System.out.println("Na lista de pessoas, atualmente temos: "+ pessoas.size() + " pessoas");
        System.out.println("O " + pessoas.get(0).getNome() + " tem " + pessoas.get(0).getIdade() + " anos");

        for (int i = 0; i < pessoas.size(); i++) {
            System.out.println("Pessoa no indice " + (i+1) + " é: " + pessoas.get(i).getNome());
        }

        Aluno aluno = new Aluno("João", 20, 1234, "Engenharia");
        System.out.println("O aluno " + aluno.getNome() + " tem " + aluno.getIdade() + " anos e está matriculado no curso de " + aluno.getCurso());



    }
}
