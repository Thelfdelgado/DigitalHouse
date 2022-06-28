import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat();
        df.setMaximumFractionDigits(2);

        ProdutoFactory pf = ProdutoFactory.getInstance();
        Produto produto = pf.criarProduto(2.0, "CAIXA10X10");
        Produto produto1 = pf.criarProduto(3.0, "FUTEBOL");
        Produto produto2 = pf.criarProduto(0.500, "BOLATENIS");

        System.out.println(df.format(produto.calcularEspaco()));
        System.out.println(df.format(produto1.calcularEspaco()));
        System.out.println(df.format(produto2.calcularEspaco()));
    }
}
