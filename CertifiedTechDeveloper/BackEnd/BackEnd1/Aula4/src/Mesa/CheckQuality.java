package Mesa;

public class CheckQuality {
    Controle inicial;

    public CheckQuality(){
        this.inicial = new ControleAceito();
        Controle rejeitado = new ControleRejeitado();

        inicial.setSeguinte(rejeitado);
    }

    public void verificar(Artigo artigo){ inicial.verificar(artigo); }

    @Override
    public String toString() {
        return "CheckQuality{" +
                "inicial=" + inicial +
                '}';
    }
}
