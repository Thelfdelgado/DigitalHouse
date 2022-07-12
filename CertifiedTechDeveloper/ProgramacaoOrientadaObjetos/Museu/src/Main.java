public class Main {
    public static void main(String[] args) {
        Leilao leilao = new Leilao(10.0, 5.0, "Pitu");
        Licitante luiz = new Licitante("Luiz", "Delgado", 123123, 100.0);
        Licitante luiz1 = new Licitante("Luiz1", "Delgado1", 321321, 200.0);

        leilao.notificar();
    }
}
