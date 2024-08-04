package br.com.alura.screenmatch.desafioAluraManipulandoArq;

import java.io.FileWriter;
import java.io.IOException;

public class ManipulandoArquivos {
    public static void main(String[] args) throws IOException {

        String mensagem = "Conteúdo a ser gravado no arquivo";

        FileWriter fileWriter = new FileWriter("arquivo.txt");
        fileWriter.write(mensagem);
        fileWriter.close();


    }
}
