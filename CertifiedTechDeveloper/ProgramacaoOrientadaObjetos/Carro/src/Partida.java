public class Partida extends Estado{
    private Carro carro;

    public Partida(Carro carro) {
        super(carro);
        System.out.println(this.getClass().getName());
    }

    @Override
    public void startStop() {
        carro.setEstado(new Desligado(getCarro()));
        carro.setEstado(false);
    }
}
