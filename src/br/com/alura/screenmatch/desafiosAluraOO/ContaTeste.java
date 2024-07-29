package br.com.alura.screenmatch.desafiosAluraOO;

public class ContaTeste {
    public static void main(String[] args) {

        ContaBancaria contaBancaria = new ContaBancaria();
        contaBancaria.depositar(1000);
        contaBancaria.consultarSaldo();
        contaBancaria.sacar(100);
        contaBancaria.consultarSaldo();

        ContaCorrente contaCorrente = new ContaCorrente();
        contaCorrente.depositar(1000);
        contaCorrente.sacar(100);
        contaCorrente.consultarSaldo();
        contaCorrente.cobrarTarifaMensal();
        contaCorrente.consultarSaldo();



    }
}
