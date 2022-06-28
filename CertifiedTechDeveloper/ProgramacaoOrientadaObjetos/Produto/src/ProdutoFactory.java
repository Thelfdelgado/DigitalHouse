public class ProdutoFactory {
    private static ProdutoFactory instance;
    private ProdutoFactory() {}
    public Produto criarProduto(
            Double peso,
            String tipo) {
        switch (tipo) {
            case "CAIXA10X10":
                return new Caixa(peso, 10.00, 10.00, 10.00);
            case "FUTEBOL":
                return new Bola(peso, 11.0);
            case "BOLATENIS":
                return new Bola(peso, 0.32);
        }

        throw new RuntimeException("O produto nao existe!");
    }

    public static ProdutoFactory getInstance() {
        if (instance == null) {
            instance = new ProdutoFactory();
        }
        return instance;
    }
}
