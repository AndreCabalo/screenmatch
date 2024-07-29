//Construindo classe Filme com seus atributos
public class Filme {
    String nome;
    int anoDeLancamento;
    boolean incluidoNoPlano;
    double somaDasAvaliacoes;
    int totalDeAvaliacoes;
    int duracaoEmMinutos;

    //Criando métodos
    void exibeFichaTecnica(){
        System.out.println("O Filme " + nome  + " foi lançado em " + anoDeLancamento);
    }
    void avalia(double notaAvaliacao){
        somaDasAvaliacoes += notaAvaliacao;
        totalDeAvaliacoes++;
    }
    double pegaMedia(){
        return somaDasAvaliacoes/totalDeAvaliacoes;
    }
}
