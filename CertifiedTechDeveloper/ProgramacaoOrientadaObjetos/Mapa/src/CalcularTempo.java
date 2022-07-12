public class CalcularTempo {
    private StrategyTempo tempo;

    public CalcularTempo(StrategyTempo tempo) {
        this.tempo = tempo;
    }

    public double valorTempo(Viagem viagem) {
        return tempo.calculaTempo(viagem);
    }
}