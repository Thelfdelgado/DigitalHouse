public class Automovel implements StrategyTempo{

    @Override
    public double calculaTempo(Viagem viagem) {
        return (viagem.calcularDistancia() / 0.40366) * 4;
    }
}
