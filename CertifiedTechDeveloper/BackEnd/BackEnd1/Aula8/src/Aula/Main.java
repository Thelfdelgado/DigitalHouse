package Aula;

public class Main {
    public static void main(String[] args) {
        FacadeDesconto facadeDesconto = new FacadeDesconto();
        Cartao cartao = new Cartao("1234567891234567", "Star Bank");
        Produto produto = new Produto("Ervilha", "Lata");

        System.out.println("Desconto: " + facadeDesconto.desconto(cartao, produto, 1));
    }
}
