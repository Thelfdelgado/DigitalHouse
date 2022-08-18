package Mesa;

public class ServicoDownloadProxy implements Download{
    @Override
    public void baixarMusica(String assinatura, String id) {
        if (assinatura.equals("Premium")){
            ServicoDownload servicoDownload = new ServicoDownload();
            servicoDownload.baixarMusica(assinatura, id);
            System.out.println("Download liberado.");
        } else {
            System.out.println("Usuario: " + id + ", assine ja o Premium.");
        }
    }
}
