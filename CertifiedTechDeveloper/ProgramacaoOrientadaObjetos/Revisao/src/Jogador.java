public class Jogador implements Comparable {
    private final String nome;
    private final int numeroCamisa;
    private String posicao;
    private Escalacao escalacao;

    public Jogador(String nome, int numeroCamisa, String posicao, Escalacao escalacao) {
        this.nome = nome;
        this.numeroCamisa = numeroCamisa;
        this.posicao = posicao;
        this.escalacao = escalacao;
    }

    public String getNome() {
        return nome;
    }

    public Escalacao getEscalacao() {
        return escalacao;
    }

    public String getPosicao() {
        return posicao;
    }

    public void setPosicao(String posicao) {
        this.posicao = posicao;
    }

    public void setEscalacao(Escalacao escalacao) {
        this.escalacao = escalacao;
    }

    @Override
    public String toString() {
        return "Jogador{" +
                "nome='" + nome + '\'' +
                ", numeroCamisa=" + numeroCamisa +
                ", posicao='" + posicao + '\'' +
                ", escalacao=" + escalacao +
                '}';
    }

    @Override
    public int compareTo(Jogador o) {
        if (this.numeroCamisa > o.numeroCamisa) return 1;
        if (this.numeroCamisa < o.numeroCamisa) return -1;
        return 0;
    }
}
