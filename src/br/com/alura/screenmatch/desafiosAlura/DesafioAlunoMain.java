package br.com.alura.screenmatch.desafiosAlura;

public class DesafioAlunoMain {

    public static void main(String[] args) {
        Aluno aluno = new Aluno();
        aluno.setNome("Andre");
        aluno.setNotas(10);
        aluno.calcularMediaNotas();
        aluno.setNotas(5);
        aluno.calcularMediaNotas();
    }
}
