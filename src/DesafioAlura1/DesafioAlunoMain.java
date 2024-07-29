package DesafioAlura1;

public class DesafioAlunoMain {

    public static void main(String[] args) {
        Aluno aluno = new Aluno();
        aluno.nome = "Andre";
        aluno.idade = 33;

        System.out.println(aluno.exibirInfos());
    }
}
