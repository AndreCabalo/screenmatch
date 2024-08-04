package br.com.alura.screenmatch.desafioAluraExceptions;

import java.util.Scanner;

public class TestExceptionsDivZero {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um numero a ser dividido: ");
        int numeroASerDividido = scanner.nextInt();
        System.out.println("Digite um numero divisor: ");
        int numeroDivisor = scanner.nextInt();

        try{
            int resultado = numeroASerDividido/numeroDivisor;
            System.out.println("O resultado da divisão é: " + resultado);
        }catch (ArithmeticException e){
            System.out.println("Não é possível dividir por zero");
        }finally {
            System.out.println("Fim do programa");
        }
    }
}
