package Aulas;

public class UsuarioJogo {
    private String nome;
    private String nickname;
    private int pontuacao = 0;
    private int nivel = 0;

    public UsuarioJogo(String nome, String nickname) {
        this.nome = nome;
        this.nickname = nickname;
    }

    public void aumentarPontuacao() {
        pontuacao++;
    }

    public void subirNivel() {
        nivel++;
    }

    public void bonus(int valor) {
        pontuacao += valor;
    }

    public int getPontuacao() {
        return pontuacao;
    }

    public int getNivel() {
        return nivel;
    }

    @Override
    public String toString() {
        return "Jogador" +
                "\n nome='" + nome +
                "\n nickname='" + nickname +
                "\n pontuacao=" + pontuacao +
                "\n nivel=" + nivel;
    }

    public static void main(String[] args) {
        UsuarioJogo jogador1 = new UsuarioJogo("Luiz", "Thelfdelgado");
        jogador1.aumentarPontuacao();
        jogador1.bonus(3);
        jogador1.subirNivel();
        System.out.println(jogador1);

        UsuarioJogo jogador2 = new UsuarioJogo("Maju", "chuchu");
        jogador2.aumentarPontuacao();
        jogador2.bonus(5);
        jogador2.subirNivel();
        System.out.println(jogador2);

    }
}