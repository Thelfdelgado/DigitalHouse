package Mesa;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UsuarioTest {
    Usuario u1 = new Usuario("Free", "12301");
    Usuario u2 = new Usuario("Premium", "12302");
    Usuario u3 = new Usuario("Free", "12303");
    Usuario u4 = new Usuario("Premium", "12304");

    Download download = new ServicoDownloadProxy();

    @Test
    public void mainTest(){
        download.baixarMusica(u1.getAssinatura(), u1.getId());
        download.baixarMusica(u2.getAssinatura(), u2.getId());
        download.baixarMusica(u3.getAssinatura(), u3.getId());
        download.baixarMusica(u4.getAssinatura(), u4.getId());
    }

}