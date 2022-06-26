enum Escalacao {
    TITULAR("Jogador titular"),
    RESERVA("Jogador reserva"),
    SUPLENTE("Jogador suplente");

    private String descricao;

    Escalacao(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    @Override
    public String toString() {
        return "Escalacao{" +
                "descricao='" + descricao + '\'' +
                '}';
    }
}
