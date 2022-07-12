public class Main {
    public static void main(String[] args) {
        Pedido pedido = new Pedido(100, 10);

        Dinheiro dinheiro = new Dinheiro();
        Cartao cartao = new Cartao(6);

        CalcularTaxa calcularTaxa = new CalcularTaxa(dinheiro);
        System.out.println("O valor da taxa e de: " + calcularTaxa.valorTaxa(pedido));

    }
}
