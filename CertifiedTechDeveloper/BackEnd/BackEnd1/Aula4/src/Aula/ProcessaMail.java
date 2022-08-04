package Aula;

public class ProcessaMail{
    public static void main(String[] args) {
        CheckMail processo = new CheckMail();

        processo.verificar(new Mail("email@email.com", "tecnica@digitalhouse.com", "Reclamacao"));
        processo.verificar(new Mail("email@email.com", "sds@digitalhouse.com", "Gerencia"));
        processo.verificar(new Mail("email@email.com", "juan@pepelegal.com", "Comercial"));
        processo.verificar(new Mail("email@email.com", "tecnica@colmeia.com", "Reclamacao"));
    }
}
