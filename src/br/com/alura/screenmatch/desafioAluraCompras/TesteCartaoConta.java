package br.com.alura.screenmatch.desafioAluraCompras;

import java.util.Collections;
import java.util.Scanner;

public class TesteCartaoConta {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o limite do cartão de crédito: ");
        double limite = scanner.nextDouble();
        CartaoDeCredito cartao = new CartaoDeCredito(limite);

        boolean continuar = true;
        while (continuar) {

            System.out.println("Digite a descrição da compra: ");
            String descricao = scanner.next();
            System.out.println("Digite o valor da compra: ");
            double valor = scanner.nextDouble();

            Compra compra = new Compra(descricao, valor);

            boolean compraEfetuada = cartao.lancaComra(compra);

            if (compraEfetuada) {
                System.out.println("Compra efetuada com sucesso!");
            } else {
                System.out.println("Saldo insuficiente!");
                System.out.println("Saldo disponivel: " + cartao.getSaldo());
            }

            System.out.println("Deseja continuar? Digite 'S' para continuar e 'N' para sair!");

            String resposta = scanner.next();

            if (resposta.equalsIgnoreCase("N")) {

                continuar = false;
            }
        }

            System.out.println("***************************************");

        Collections.sort(cartao.getCompras());

            for (Compra c : cartao.getCompras()) {
                System.out.println(c);
            }

            System.out.println("***************************************");
            System.out.println("Saldo disponível: " + cartao.getSaldo());
    }



}
