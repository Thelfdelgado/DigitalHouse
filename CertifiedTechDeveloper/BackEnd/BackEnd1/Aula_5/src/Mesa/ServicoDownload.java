package Mesa;

public class ServicoDownload implements Download{
    @Override
    public void baixarMusica(String assinatura, String id) {
        System.out.println("Usuario: " + id + " possui assinatura " + assinatura);
    }
}
