public class Main {
    public static void main(String[] args) {
        Viagem viagem = new Viagem(43, 42, 92, 52);

        Andando andando = new Andando();
        Automovel automovel = new Automovel();
        Bicicleta bicicleta = new Bicicleta();

        CalcularTempo calcularTempo = new CalcularTempo(bicicleta);
        System.out.println("O tempo: " + (calcularTempo.valorTempo(viagem)));
    }
}
