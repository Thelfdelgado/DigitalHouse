public class Cartao implements StrategyTaxa{
    private int qtdMaxParcelas;

    public Cartao(int qtdMaxParcelas) {
        this.qtdMaxParcelas = qtdMaxParcelas;
    }

    @Override
    public double calculataxa(Pedido pedido) {
        return pedido.getQtdParcelas() > qtdMaxParcelas ? pedido.getValor() * 0.08 : 0;
    }
}
