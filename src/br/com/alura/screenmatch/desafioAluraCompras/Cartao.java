package br.com.alura.screenmatch.desafioAluraCompras;

import java.util.*;

public class Cartao {

    Scanner scanner = new Scanner(System.in);

    private double saldo;
    private HashMap<String, Double > compras = new HashMap<>();

    public Cartao(double saldo) {
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void menu() {
        System.out.println("1 - Passar cartão");
        System.out.println("2 - Imprimir fatura");
        System.out.println("3 - Sair");

        int opcao = scanner.nextInt();
        scanner.nextLine();

        if(opcao == 1) {
            passarCartao();
        } else if (opcao == 2) {
            imprimirFatura();
        } else if (opcao == 3) {
            System.out.println("Saindo...");
        } else {
            System.out.println("Opção inválida!");
        }
    }

    public void passarCartao() {

        System.out.println("Passando o cartão... descreva a compra: ");

        String descricao = scanner.nextLine();
        System.out.println(descricao);
        System.out.println("Informe o valor da compra: ");
        double valor = scanner.nextDouble();
        System.out.println(valor);

        if(saldo >= valor){
            saldo -= valor;
            System.out.println("Compra realizada com sucesso!");
            compras.put(descricao, valor);
            menu();

        }else {
            System.out.println("Saldo insuficiente!");
            menu();
        }
    }

    public void imprimirFatura() {
        System.out.println("Fatura do cartão: ");

        compras.forEach((descricao, valor) -> {
            System.out.println(descricao + " - R$ " + valor);
        });
    }

}

