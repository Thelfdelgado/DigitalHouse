public class Andando implements StrategyTempo{

    @Override
    public double calculaTempo(Viagem viagem) {
        return (viagem.calcularDistancia() / 0.20366) * 13;
    }
}
