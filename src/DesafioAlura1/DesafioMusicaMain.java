package DesafioAlura1;

public class DesafioMusicaMain {

    public static void main(String[] args) {

        Musica musica = new Musica();

        musica.titulo = "Bohemian Rhapsody";
        musica.artista = "Queen";
        musica.anoLancamento = 1975;
        musica.avaliacao = 0;
        musica.numeroAvaliacoes = 0;
        musica.mediaAvaliacoes = 0;


        System.out.println(musica);
        musica.avaliar(10);
        System.out.println(musica);
        musica.avaliar(5);
        System.out.println(musica);


    }
}
