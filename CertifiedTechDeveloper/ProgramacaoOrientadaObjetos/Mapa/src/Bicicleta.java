public class Bicicleta implements StrategyTempo{

    @Override
    public double calculaTempo(Viagem viagem) {
        return (viagem.calcularDistancia() / 0.050366) * 1.5;
    }
}
