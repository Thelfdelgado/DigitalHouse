// Tanto funcionários quanto afiliados são vendedores;
// O objetivo dos afiliados é realizar vendas (vender), mas o cálculo dos pontos é diferente:
// eles ganham 15 pontos a cada nova venda.

public class Afiliados extends Vendedores{

    public Afiliados(String nome, int vendas) {
        super(nome, vendas, 15);
    }

    @Override
    public int calcularPontos() {
        return pontos = this.vendas * pontos;
    }
}
