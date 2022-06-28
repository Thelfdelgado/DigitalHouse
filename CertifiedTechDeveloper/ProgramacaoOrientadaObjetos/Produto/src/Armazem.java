import java.util.ArrayList;
import java.util.List;

public class Armazem {
    private List<Produto> produtos;

    public Armazem() {
        this.produtos = new ArrayList<>();
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(List<Produto> produtos) {
        this.produtos = produtos;
    }
}
