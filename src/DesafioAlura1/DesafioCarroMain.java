package DesafioAlura1;

public class DesafioCarroMain {
    public static void main(String[] args) {
        Carro carro = new Carro();
        carro.modelo = "Fusca";
        carro.ano = 2022;
        carro.cor = "Preto";


        System.out.println(carro);
        System.out.println(carro.calcularIdade());
    }
}
