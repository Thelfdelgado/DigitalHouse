package Mesa;

public class ControleRejeitado extends Controle{
    @Override
    public void verificar(Artigo artigo) {
        System.out.println("Produto Rejeitado");
    }
}
