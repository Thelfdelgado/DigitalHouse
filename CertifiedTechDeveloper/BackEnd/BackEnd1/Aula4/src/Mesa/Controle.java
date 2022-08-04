package Mesa;

public abstract class Controle {
    protected Controle controleSeguinte;

    public Controle getSeguinte(){ return this.controleSeguinte; }

    public void setSeguinte(Controle a){ this.controleSeguinte = a; }

    public abstract void verificar(Artigo arTigo);
}
