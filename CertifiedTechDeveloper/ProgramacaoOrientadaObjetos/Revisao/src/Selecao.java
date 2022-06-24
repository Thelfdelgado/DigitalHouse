import java.util.Set;
import java.util.TreeSet;

public class Selecao {

    private final String nome;
    private final Set<Jogador> jogadores;

    public Selecao(Set<Jogador> jogadores) {
        this.jogadores = jogadores;
        this.nome = "Selecao fantasma";
    }

    public Selecao(String nome) {
        this.nome = nome;
        this.jogadores = new TreeSet<>();
    }

    public void addJogadores(Jogador jogador) {
        jogadores.add(jogador);
    }
}
