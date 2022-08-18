package Mesa;

public class Serie implements ISerie{
    private String nome;

    public Serie(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String getSerie(String nome) {
        return "Link: www.digitalhouse.com/series/" + nome;
    }

    @Override
    public String toString() {
        return getSerie(nome);
    }
}
