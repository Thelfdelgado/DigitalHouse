public class Jogador implements Comparable<Jogador>{
    private final String nome;
    private final int numCamisa;
    private String posicao;
    private Escalacao escalacao;

    public Jogador(
            String nome,
            int numCamisa,
            String posicao,
            Escalacao escalacao
    ) {
        this(nome, numCamisa, posicao);
        this.escalacao = escalacao;
    }

    public Jogador(
            String nome,
            int numCamisa,
            String posicao
    ) {
        this.nome = nome;
        this.numCamisa = numCamisa;
        this.posicao = posicao;
    }

    public String getNome() {
        return nome;
    }

    public Escalacao getEscalacao() {
        return escalacao;
    }

    public int getNumCamisa() {
        return numCamisa;
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
                ", numCamisa=" + numCamisa +
                ", posicao='" + posicao + '\'' +
                ", escalacao=" + escalacao +
                '}';
    }

    @Override
    public int compareTo(Jogador o) {
        if (this.numCamisa > o.numCamisa) return 1;
        if (this.numCamisa < o.numCamisa) return -1;
        return 0;
    }
}
