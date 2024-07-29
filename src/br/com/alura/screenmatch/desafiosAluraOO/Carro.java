package br.com.alura.screenmatch.desafiosAluraOO;

public class Carro {

    protected String modelo;
    protected double precoAno1;
    protected double precoAno2;
    protected double precoAno3;

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void definirPrecos(double precoAno1, double precoAno2, double precoAno3) {
        this.precoAno1 = precoAno1;
        this.precoAno2 = precoAno2;
        this.precoAno3 = precoAno3;
    }

    public double calculaMenorPreco() {
        double precoMenor = precoAno1;
        if (precoAno2 < precoMenor) {
            precoMenor = precoAno2;
        }
        if (precoAno3 < precoMenor) {
            precoMenor = precoAno3;
        }
        return precoMenor;
    }

    @Override
    public String toString() {
        return "Carro{" +
                "modelo='" + modelo + '\'' +
                ", precoAno1=" + precoAno1 +
                ", precoAno2=" + precoAno2 +
                ", precoAno3=" + precoAno3 +
                '}';
    }
}







