package Aula;

public class GerenciadorTecnico extends Gerenciador{
    @Override
    public void verificar(Mail email) {
        if ((email.getDestino().equalsIgnoreCase("tecnica@colmeia.com")) || (email.getAssunto().equalsIgnoreCase("Tecnico"))){
            System.out.println("Enviando ao departamento Tecnico");
        }
        else {
            if (this.getSeguinte() != null){
                this.getSeguinte().verificar(email);
            }
        }
    }
}
