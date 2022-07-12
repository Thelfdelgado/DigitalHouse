public abstract class OfertaAcademica {
    private final String nome;
    private String descricao;

    public OfertaAcademica(String nome, String descricao) {
        this.nome = nome;
        this.descricao = descricao;
    }

    public OfertaAcademica(String nome) {
        this.nome = nome;
    }

    abstract double calcularPreco();

    @Override
    public String toString() {
        return "OfertaAcademica{" +
                "nome='" + nome + '\'' +
                ", descricao='" + descricao + '\'' +
                "preco='" + calcularPreco() + '\'' +
                '}';
    }
}
