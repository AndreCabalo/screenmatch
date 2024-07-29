package DesafioAlura1;

import java.time.LocalDate;
import java.util.Date;

public class Carro {
    String modelo;
    int ano;
    String cor;

    @Override
    public String toString() {
        return "Carro{" +
                "modelo='" + modelo + '\'' +
                ", ano=" + ano +
                ", cor='" + cor + '\'' +
                '}';
    }

    public String calcularIdade() {
        int anoAtual = LocalDate.now().getYear();
        int idade = anoAtual - ano;

        return "O carro tem " + idade + " anos de idade";

    }
}
