package br.com.alura.screenmatch.desafioListasEColecoes;

public class ContaBancaria {
    private int numeroDaConta;
    private double saldoDaConta;

    public ContaBancaria(int numeroDaConta, double saldoDaConta) {
        this.numeroDaConta = numeroDaConta;
        this.saldoDaConta = saldoDaConta;
    }

    public int getNumeroDaConta() {
        return numeroDaConta;
    }

    public void setNumeroDaConta(int numeroDaConta) {
        this.numeroDaConta = numeroDaConta;
    }

    public double getSaldoDaConta() {
        return saldoDaConta;
    }

    public void setSaldoDaConta(double saldoDaConta) {
        this.saldoDaConta = saldoDaConta;
    }
}
