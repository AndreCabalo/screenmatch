package br.com.alura.screenmatch.Model;

//Construindo classe br.com.alura.screenmatch.Model.Filme com seus atributos
public class Filme {
    private String nome;
    private int anoDeLancamento;
    private boolean incluidoNoPlano;
    private double somaDasAvaliacoes;
    private int totalDeAvaliacoes;
    private int duracaoEmMinutos;

//    GETTERS E SETTERS
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setAnoDeLancamento(int anoDeLancamento) {
        this.anoDeLancamento = anoDeLancamento;
    }
    public void setIncluidoNoPlano(boolean incluidoNoPlano) {
        this.incluidoNoPlano = incluidoNoPlano;
    }
    public void setDuracaoEmMinutos(int duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }
    public String getNome() {
        return nome;
    }
    public int getAnoDeLancamento() {
        return anoDeLancamento;
    }
    public int getTotalDeAvaliacoes (){
        return totalDeAvaliacoes;
    }
    public double getSomaDasAvaliacoes (){
        return somaDasAvaliacoes;
    }

    //Criando métodos
    public void exibeFichaTecnica(){
        System.out.println("O br.com.alura.screenmatch.Model.Filme " + nome  + " foi lançado em " + anoDeLancamento);
    }
    public void avalia(double notaAvaliacao){
        somaDasAvaliacoes += notaAvaliacao;
        totalDeAvaliacoes++;
    }
    public double pegaMedia(){
        return somaDasAvaliacoes/totalDeAvaliacoes;
    }
}
