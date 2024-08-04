package br.com.alura.screenmatch.desafioAluraExceptions;

public class ErroConsultaHGitHubException extends RuntimeException{

    private String mensagem;

   public ErroConsultaHGitHubException(String mensagem){
       this.mensagem = mensagem;
   }

    @Override
    public String getMessage() {
        return this.mensagem;
    }

}
