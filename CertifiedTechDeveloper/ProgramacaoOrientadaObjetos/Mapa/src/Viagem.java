public class Viagem {
    private double longitude1, longitude2;
    private double latitude1, latitude2;
    private double distancia;

    public Viagem(double longitude1, double longitude2, double latitude1, double latitude2) {
        this.longitude1 = longitude1;
        this.longitude2 = longitude2;
        this.latitude1 = latitude1;
        this.latitude2 = latitude2;
    }

    public double getDistancia() {
        return distancia;
    }

    public double calcularDistancia() {
        distancia = Math.abs(latitude1 - latitude2) + Math.abs(longitude1 - longitude2);
        return distancia;
    }
}
