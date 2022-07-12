public class CalcularTaxa {
    private StrategyTaxa taxa;

    public CalcularTaxa(StrategyTaxa taxa) {
        this.taxa = taxa;
    }

    public double valorTaxa(Pedido pedido) {
        return taxa.calculataxa(pedido);
    }
}
