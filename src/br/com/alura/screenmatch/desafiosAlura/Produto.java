package br.com.alura.screenmatch.desafiosAlura;

public class Produto {
    private String name;
    private double price;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void aplicarDesconto(double desconto){
        price -= price * (desconto/100);
    }
}
