package br.com.alura.screenmatch.desafioListasEColecoes;

import java.util.ArrayList;

public class TesteContaBancaria {
    public static void main(String[] args) {

        ArrayList<ContaBancaria> listaDeContas = new ArrayList<>();

        ContaBancaria contaBancaria1 = new ContaBancaria(123, 1000);
        ContaBancaria contaBancaria2 = new ContaBancaria(456, 11000);
        ContaBancaria contaBancaria3 = new ContaBancaria(789, 3000);
        ContaBancaria contaBancaria4 = new ContaBancaria(790, 5000);
        ContaBancaria contaBancaria5 = new ContaBancaria(799, 10000);

        listaDeContas.add(contaBancaria1);
        listaDeContas.add(contaBancaria2);
        listaDeContas.add(contaBancaria3);
        listaDeContas.add(contaBancaria4);
        listaDeContas.add(contaBancaria5);


        //Loop para buscar maior conta

        ContaBancaria contaMaisGorda = new ContaBancaria(0, 0);

        for (int i = 0; i < listaDeContas.size(); i++) {
            if (listaDeContas.get(i).getSaldoDaConta()> contaMaisGorda.getSaldoDaConta()){
                contaMaisGorda.setSaldoDaConta(listaDeContas.get(i).getSaldoDaConta());
                contaMaisGorda.setNumeroDaConta((listaDeContas.get(i).getNumeroDaConta()));
            }
        }

        //Resultado
        System.out.println("A conta mais gorda tem: " + contaMaisGorda.getSaldoDaConta() + " e é a conta de número: " + contaMaisGorda.getNumeroDaConta());

    }
}
