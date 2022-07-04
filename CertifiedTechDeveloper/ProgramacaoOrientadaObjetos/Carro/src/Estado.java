public abstract class Estado {
    private Carro carro;
    public Estado(Carro carro) {
        this.carro = carro;
    }

    public Carro getCarro() {
        return carro;
    }

    abstract void startStop();
}
