public class Main {
    public static void main(String[] args) {

//      Instanciar objeto sem construtor
        Filme meuFilme = new Filme();
        meuFilme.nome = "Deadpool & Wolverine";
        meuFilme.anoDeLancamento = 2024;
        meuFilme.duracaoEmMinutos = 127;
        meuFilme.incluidoNoPlano = true;
        meuFilme.somaDasAvaliacoes = 0;
        meuFilme.totalDeAvaliacoes = 0;

//      método que printa infos
        meuFilme.exibeFichaTecnica();

        meuFilme.avalia(8);
        meuFilme.avalia(5);
        meuFilme.avalia(9);
        meuFilme.avalia(10);

        System.out.println(meuFilme.somaDasAvaliacoes);
        System.out.println(meuFilme.totalDeAvaliacoes);
        System.out.println("A nota média de avaliação é de :" + meuFilme.pegaMedia());
    }
}
