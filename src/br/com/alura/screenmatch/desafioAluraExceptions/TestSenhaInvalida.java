package br.com.alura.screenmatch.desafioAluraExceptions;

import java.util.Scanner;

public class TestSenhaInvalida {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a senha:");
        String senhaDigitada = scanner.nextLine();

        try{
            if (senhaDigitada.length()<8){
                throw new SenhaInvalidaException("Senha inválida, a senha deve ter no mínimo 8 caracteres");
            }else {
                System.out.println("Senha válida");
            }
        }catch(SenhaInvalidaException e){
            System.out.println(e.getMessage());
        }finally {
            System.out.println("Fim do programa");
        }
    }
}
