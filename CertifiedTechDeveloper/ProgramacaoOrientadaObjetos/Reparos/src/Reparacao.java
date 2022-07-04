import java.util.List;

public class Reparacao implements Estado{
    private Reparo reparo;

    public Reparacao(Reparo reparo) {
        this.reparo = reparo;
        System.out.println(reparo);
    }
    @Override
    public void valorOrcamento(double valor) {
        throw new IllegalStateException("Valor ja informado");
    }

    @Override
    public void somaPecaReposicao(List<PecaReposicao> pecas) {
        double soma = 0;
        for (PecaReposicao peca: pecas) {
            soma += peca.getValor();
        }

        reparo.setCusto(reparo.getCusto() + soma);
    }

    @Override
    public void mudarEndereco(String endereco) {
        throw new IllegalStateException("Nao pode mudar endereco");
    }

    @Override
    public void mudarEstado() {
        reparo.setEstado(new Envio(reparo));
    }

    @Override
    public String toString() {
        return "Reparacao";
    }
}
