package DesafioAlura1;

public class Musica {
    String titulo;
    String artista;
    int anoLancamento;
    double avaliacao;
    int numeroAvaliacoes;

    double mediaAvaliacoes;

    @Override
    public String toString() {
        return "Musica{" +
                "titulo='" + titulo + '\'' +
                ", artista='" + artista + '\'' +
                ", anoLancamento=" + anoLancamento +
                ", avaliacao=" + avaliacao +
                ", numeroAvaliacoes=" + numeroAvaliacoes +
                ", mediaAvaliacoes=" + mediaAvaliacoes +
                '}';
    }

    void avaliar(double novaAvaliacao){
        avaliacao += novaAvaliacao;
        numeroAvaliacoes++;
        mediaAvaliacoes = avaliacao / numeroAvaliacoes;
    }


}
