package Mesa;

public class ControleAceito extends Controle{
    @Override
    public void verificar(Artigo artigo) {
        if ((artigo.getLote() >= 1000 && artigo.getLote() <= 2000) && (artigo.getPeso() >= 1200 && artigo.getPeso() <= 1300) && (artigo.getEmbalagem().equalsIgnoreCase("Saudavel") || (artigo.getEmbalagem().equalsIgnoreCase("Quase saudavel")))){
            System.out.println("Produto Aceito");
        }
        else {
            if (this.getSeguinte() != null){
                this.getSeguinte().verificar(artigo);
            }
        }
    }
}
