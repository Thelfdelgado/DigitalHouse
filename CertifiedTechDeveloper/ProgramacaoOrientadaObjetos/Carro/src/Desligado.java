public class Desligado extends Estado {

    private Carro carro;

    public Desligado(Carro carro) {
        super(carro);
        System.out.println(this.getClass().getName());
    }

    @Override
    public void startStop() {
        if (carro.getFreioAcionado()) {
            carro.setEstado(new Partida(getCarro()));
        } else {
            carro.setEstado(new Liga(getCarro()));
        }
    }
}
