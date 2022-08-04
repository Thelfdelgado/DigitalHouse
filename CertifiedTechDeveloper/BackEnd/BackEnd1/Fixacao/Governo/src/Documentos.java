public abstract class Documentos {
    protected String conteudo;
    protected Integer tipoDocumento;
    protected Documentos seguinteFuncionario;

    public Documentos setSeguinteFuncionario(Documentos seguinteFuncionario) {
        this.seguinteFuncionario = seguinteFuncionario;
        return this;
    }

    public abstract void processarTipo(Integer tipo);
}
