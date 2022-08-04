package Aula;

public class GerenciadorSpam extends Gerenciador{
    @Override
    public void verificar(Mail elMail) {
        System.out.println("Marcado como SPAM");
    }
}
