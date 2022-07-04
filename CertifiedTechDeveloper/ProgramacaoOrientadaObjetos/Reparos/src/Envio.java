import java.util.List;

public class Envio implements Estado {
    private Reparo reparo;

    public Envio(Reparo reparo) {
        this.reparo = reparo;
        System.out.println(reparo);
    }
    @Override
    public void valorOrcamento(double valor) {
        throw new IllegalStateException("Orcamento ja foi informado");
    }

    @Override
    public void somaPecaReposicao(List<PecaReposicao> pecas) {
        throw new IllegalStateException("Soma de pecas ja foi informado");
    }

    @Override
    public void mudarEndereco(String endereco) {
        reparo.setEndereco(endereco);
    }

    @Override
    public void mudarEstado() {
        reparo.setEstado(new Finalizado(reparo));
    }

    @Override
    public String toString() {
        return "Envio";
    }
}
