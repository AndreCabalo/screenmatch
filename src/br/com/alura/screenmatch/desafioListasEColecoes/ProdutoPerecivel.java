package br.com.alura.screenmatch.desafioListasEColecoes;

import java.time.LocalDate;

public class ProdutoPerecivel extends Produto {

    LocalDate dataValidade;

    public ProdutoPerecivel(String nome, double preco, int quantidade, LocalDate dataValidade) {
        super(nome, preco, quantidade);
        this.dataValidade = dataValidade;
    }

    @Override
    public String toString() {
        return " Produto { " +
                "nome =' "+ super.getNome() + '\'' +
                ", preco = "  + super.getPreco() +
                ", quantidade = " + super.getQuantidade() +
                ", dataValidade = " + dataValidade +
                " }";
    }



    public LocalDate getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(LocalDate dataValidade) {
        this.dataValidade = dataValidade;
    }


}
