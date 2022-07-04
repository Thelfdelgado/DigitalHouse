import java.util.List;

public class Finalizado implements Estado {
    private Reparo reparo;
    public Finalizado(Reparo reparo) {
        this.reparo = reparo;
        System.out.println(reparo);
    }
    @Override
    public void valorOrcamento(double valor) {
        throw new IllegalStateException("Voce nao pode mudar o valor");
    }

    @Override
    public void somaPecaReposicao(List<PecaReposicao> pecas) {
        throw new IllegalStateException("Voce nao pode mudar a soma das pecas");
    }

    @Override
    public void mudarEndereco(String endereco) {
        throw new IllegalStateException("Voce nao pode mudar o endereco");
    }

    @Override
    public void mudarEstado() {
        throw new IllegalStateException("Acabou voce nao pode mudar de estado");
    }

    @Override
    public String toString() {
        return "Finalizado";
    }
}
