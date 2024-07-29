package br.com.alura.screenmatch.desafiosAluraOO;

public class ContaBancaria {

    protected double saldo;

    public void depositar(double valor) {
        saldo += valor;
    }

    public void sacar(double valor) {
        saldo -= valor;
    }

    public void consultarSaldo() {
        System.out.println("Saldo: " + saldo);
    }

}
