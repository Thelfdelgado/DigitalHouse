public class Liga extends Estado{
    private Carro carro;

    public Liga(Carro carro) {
        super(carro);
        System.out.println(this.getClass().getName());
    }

    @Override
    public void startStop() {
        if (carro.getFreioAcionado()) {
            carro.setEstado(new Partida(getCarro()));
        } else {
            carro.setEstado(new Desligado(getCarro()));
        }
    }
}
