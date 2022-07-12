public class Circulo extends Trem {
    private double raio;

    public Circulo(String nome, double raio) {
        super(nome);
        this.raio = raio;
    }

    @Override
    public double calcularArea() {
        return (Math.pow(raio, raio)) * Math.PI;
    }
}
